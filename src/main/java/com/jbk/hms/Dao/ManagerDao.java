package com.jbk.hms.Dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.catalina.Cluster;
import org.apache.logging.log4j.util.StringBuilders;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.hms.Entity.Manager;
import com.jbk.hms.Service.ManagerService;

@Repository
public class ManagerDao {
	@Autowired
	private SessionFactory sf;

	public List<Manager> getAllMAnagerDetails() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Manager.class);
		List<Manager> al = criteria.list();

		return al;
	}

	Manager mm = null;

	public String addNewManager(Manager mm) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(mm);
		tr.commit();

		return "Manager details inserted.. ";
	}

	public List<Manager> salLessThan20k() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Manager.class);
		criteria.add(Restrictions.le("salary", 20000.00));
		List<Manager> al = criteria.list();
		return al;

	}

	public List<Manager> salMoreThan20k() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Manager.class);
		criteria.add(Restrictions.gt("salary", 20000.00));
		List<Manager> al = criteria.list();

		return al;
	}

	public List<Manager> nameStartsWithS() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Manager.class);
		criteria.add(Restrictions.like("name", "s%"));
		List<Manager> al = criteria.list();
		return al;
	}

	public List<Manager> idEqualTo3() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Manager.class);
		criteria.add(Restrictions.eq("id", 3));
		List<Manager> al = criteria.list();
		return al;
	}

	public List<Manager> idEqualTo4() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Manager.class);
		cr.add(Restrictions.idEq(4));
		List<Manager> al = cr.list();
		return al;

	}

	public boolean updateManager(Manager mm) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(mm);
		tr.commit();
		return true;

	}

	// all objects from persistent class using query
	public List<Manager> listByQuery() {
		Session session = sf.openSession();
		Query query = session.createQuery("From com.jbk.hms.Entity.Manager");
		List<Manager> al = query.list();
		return al;
	}

	// desired object from persistent class using query(id=2)
	public List<Manager> FromClauseByQuery() {
		Session session = sf.openSession();
		Manager mm = new Manager();
		Query query = session.createQuery("FROM Manager mm WHERE mm.id=2 ");
		List<Manager> al = query.list();
		return al;

	}
		// AS clause from HQL
	public List<Manager> ASClauseHQL() {
		Session session = sf.openSession();
		String hql = "From Manager AS mm";
		Query query = session.createQuery(hql);
		List<Manager> al = query.list();
		return al;
	}
	
	public List<Manager> SELECT_CLause() {
		Session session= sf.openSession();
		String hql= "SELECT mm.getName FROM Manager mm";
		Query query= session.createQuery(hql);
		List<Manager> al= query.list();
		return al;
	}

	public String DELETE_CLAUSE() {
		Session session=sf.openSession();
		String hql="SELECT FROM Manager" +" WHERE id=:id";
		Query query=session.createQuery(hql);
		query.setParameter("id", 0);
		int result = query.executeUpdate();
		System.out.println("Rows affected:"+ result); ;
		return "Rows affected:"+ result;
	}

	public List<Manager> minSalaryManager() {
		Session session = sf.openSession();

		Criteria cr = session.createCriteria(Manager.class);
		cr.setProjection(Projections.min("age"));
		List<Manager> al = cr.list();
		return al;

	}

	public List<Manager> maxSalaryManager() {
		Session session = sf.openSession();

		Criteria cr = session.createCriteria(Manager.class);
		cr.setProjection(Projections.max("age"));
		List<Manager> al = cr.list();
		return al;

	}

	public List<Manager> getAllNames() {
		Session session = sf.openSession();

		Criteria cr = session.createCriteria(Manager.class);
		cr.setProjection(Projections.property("name"));
		List<Manager> al = cr.list();
		return al;

	}

	public List<Manager> getAllNamesAndProfiles() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Manager.class);
		cr.setProjection(Projections.groupProperty("age"));
		List<Manager> al = cr.list();
		return null;
	}

	public String saveOrUpdateManager(Manager mm) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(mm);
		tr.commit();
		return "info saved..";
	}


}
