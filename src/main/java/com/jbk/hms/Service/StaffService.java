package com.jbk.hms.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.hms.Dao.ManagerDao;
import com.jbk.hms.Dao.StaffDao;
import com.jbk.hms.Entity.Manager;
import com.jbk.hms.Entity.Staff;
@Service
public class StaffService {

	@Autowired
 private StaffDao sd;

	public List<Staff> getAllMAnagerDetails() {
		return sd.getAllStaffDetails();

	}

	public String addNewManager(Staff mm) {
		return sd.addNewStaff(mm);
	}

	public List<Staff> salLessThan20k() {
	return sd.salLessThan20k();
	
	}

	public List<Staff> salMoreThan20k() {
		
		return sd.salMoreThan20k();
	}

	public List<Staff> nameStartsWithS() {
		return sd.nameStartsWithS();
		
	}

	public List<Staff> idEqualTo3() {
		return sd.idEqualTo3();
		
	}

	public List<Staff> idEqualTo4() {
		
		return sd.idEqualTo4();
	}

	public boolean updateStaff(Staff ss) {
		return sd.updateStaff(ss);
		
	}

	public List<Staff> listByQuery() {
		
		return sd.listByQuery();
	}

	public List<Staff> FromClauseByQuery() {
		 return sd.FromClauseByQuery();
		
	}

	public List<Staff> ASClauseHQL(){
		return sd.ASClauseHQL();
	}
	
	public List<Staff> SELECT_CLause() {
		return sd.SELECT_CLause();
	
	}
	public String DELETE_CLAUSE() {
		return sd.DELETE_CLAUSE();
	}
	public List<Staff> minSalaryStaff() {
		return sd.minSalaryStaff();
		
	}
	public List<Staff> maxSalaryStaff() {
		return sd.minSalaryStaff();
		
	}
	
	
	public List<Staff> getAllNames() {
		return sd.getAllNames();
		
	}

	public List<Staff> getAllNamesAndProfiles() {
		return sd.getAllNamesAndProfiles();
	}

	public String saveOrUpdateStaff(Staff ss) {
		return sd.saveOrUpdateStaff(ss);
	}


}
