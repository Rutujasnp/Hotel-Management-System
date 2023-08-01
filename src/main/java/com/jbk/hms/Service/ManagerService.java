package com.jbk.hms.Service;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.hms.Dao.ManagerDao;
import com.jbk.hms.Entity.Manager;

@Service
public class ManagerService {
	@Autowired
 private ManagerDao md;

	public List<Manager> getAllMAnagerDetails() {
		return md.getAllMAnagerDetails();

	}

	public String addNewManager(Manager mm) {
		return md.addNewManager(mm);
	}

	public List<Manager> salLessThan20k() {
	return md.salLessThan20k();
	
	}

	public List<Manager> salMoreThan20k() {
		
		return md.salMoreThan20k();
	}

	public List<Manager> nameStartsWithS() {
		return md.nameStartsWithS();
		
	}

	public List<Manager> idEqualTo3() {
		return md.idEqualTo3();
		
	}

	public List<Manager> idEqualTo4() {
		
		return md.idEqualTo4();
	}

	public boolean updateManager(Manager mm) {
		return md.updateManager(mm);
		
	}

	public List<Manager> listByQuery() {
		
		return md.listByQuery();
	}

	public List<Manager> FromClauseByQuery() {
		 return md.FromClauseByQuery();
		
	}

	public List<Manager> ASClauseHQL(){
		return md.ASClauseHQL();
	}
	
	public List<Manager> SELECT_CLause() {
		return md.SELECT_CLause();
	
	}
	public String DELETE_CLAUSE() {
		return md.DELETE_CLAUSE();
	}
	public List<Manager> minSalaryManager() {
		return md.minSalaryManager();
		
	}
	public List<Manager> maxSalaryManager() {
		return md.minSalaryManager();
		
	}
	
	
	public List<Manager> getAllNames() {
		return md.getAllNames();
		
	}

	public List<Manager> getAllNamesAndProfiles() {
		return md.getAllNamesAndProfiles();
	}

	public String saveOrUpdateManager(Manager mm) {
		return md.saveOrUpdateManager(mm);
	}

	
}