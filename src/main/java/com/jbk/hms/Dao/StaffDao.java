package com.jbk.hms.Dao;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.hms.Entity.Staff;

@Repository
public class StaffDao {
	@Autowired
	private SessionFactory sf;

	public List<Staff> getAllStaffDetails() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		List<Staff> al = criteria.list();

		return al;
	}

	Staff ss = null;

	public String addNewStaff(Staff ss) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(ss);
		tr.commit();

		return "Staff details inserted.. ";
	}

	public List<Staff> salLessThan20k() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.add(Restrictions.le("salary", 20000.00));
		List<Staff> al = criteria.list();
		return al;

	}

	public List<Staff> salMoreThan20k() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.add(Restrictions.gt("salary", 20000.00));
		List<Staff> al = criteria.list();

		return al;
	}

	public List<Staff> nameStartsWithS() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.add(Restrictions.like("name", "s%"));
		List<Staff> al = criteria.list();
		return al;
	}

	public List<Staff> idEqualTo3() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.add(Restrictions.eq("id", 3));
		List<Staff> al = criteria.list();
		return al;
	}

	@SuppressWarnings("deprecation")
	public List<Staff> idEqualTo4() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Staff.class);
		cr.add(Restrictions.idEq(4));
		List<Staff> al = cr.list();
		return al;

	}

	public boolean updateStaff(Staff mm) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(mm);
		tr.commit();
		return true;

	}

	// all objects from persistent class using query
	public List<Staff> listByQuery() {
		Session session = sf.openSession();
		Query query = session.createQuery("From com.jbk.hms.Entity.Staff");
		@SuppressWarnings("unchecked")
		List<Staff> al = query.list();
		return al;
	}

	// desired object from persistent class using query(id=2)
	public List<Staff> FromClauseByQuery() {
		Session session = sf.openSession();

		Query query = session.createQuery("FROM Staff mm WHERE mm.id=2 ");
		List<Staff> al = query.list();
		return al;

	}
		// AS clause from HQL
	public List<Staff> ASClauseHQL() {
		Session session = sf.openSession();
		String hql = "From Staff AS ss";
		Query query = session.createQuery(hql);
		List<Staff> al = query.list();
		return al;
	}
	
	public List<Staff> SELECT_CLause() {
		Session session= sf.openSession();
		String hql= "SELECT ss.getName FROM Staff ss";
		Query query= session.createQuery(hql);
		List<Staff> al= query.list();
		return al;
	}

	public String DELETE_CLAUSE() {
		Session session=sf.openSession();
		String hql="SELECT FROM Staff" +" WHERE id=:id";
		Query query=session.createQuery(hql);
		query.setParameter("id", 0);
		int result = query.executeUpdate();
		System.out.println("Rows affected:"+ result); ;
		return "Rows affected:"+ result;
	}

	public List<Staff> minSalaryStaff() {
		Session session = sf.openSession();

		Criteria cr = session.createCriteria(Staff.class);
		cr.setProjection(Projections.min("age"));
		List<Staff> al = cr.list();
		return al;

	}

	public List<Staff> maxSalaryStaff() {
		Session session = sf.openSession();

		Criteria cr = session.createCriteria(Staff.class);
		cr.setProjection(Projections.max("age"));
		List<Staff> al = cr.list();
		return al;

	}

	public List<Staff> getAllNames() {
		Session session = sf.openSession();

		Criteria cr = session.createCriteria(Staff.class);
		cr.setProjection(Projections.property("name"));
		List<Staff> al = cr.list();
		return al;

	}

	public List<Staff> getAllNamesAndProfiles() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Staff.class);
		cr.setProjection(Projections.groupProperty("age"));
		List<Staff> al = cr.list();
		return null;
	}

	public String saveOrUpdateStaff(Staff mm) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(ss);
		tr.commit();
		return "info saved..";
	}

}
