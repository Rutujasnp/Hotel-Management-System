package com.jbk.hms.Controller;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.hms.Entity.Manager;
import com.jbk.hms.Service.ManagerService;

public class StaffController {
	@RestController
	@RequestMapping("/managerDetails")
	public class ManagerController {
		@Autowired
		ManagerService ms;
		@Autowired
		SessionFactory sf;

		@GetMapping("AllManagerDetails")
		public List<Manager> getAllMAnagerDetails() {
			System.out.println(" getAll method running...");
			return ms.getAllMAnagerDetails();
		}

		@PostMapping("/insertNew")
		public String addNewManager(@RequestBody Manager mm) {
			System.out.println("details inserted..");
			return ms.addNewManager(mm);

		}

		@GetMapping("SalaryLessThan20K")
		public List<Manager> salLessThan20k() {
			return ms.salLessThan20k();
		}

		@GetMapping("SalaryMoreThan20K")
		public List<Manager> salMoreThan20k() {
			return ms.salMoreThan20k();
		}

		@GetMapping("nameStartsWith_S")
		public List<Manager> nameStartsWithS() {
			return ms.nameStartsWithS();
		}

		@GetMapping("id_Equal_To_3")
		public List<Manager> idEqualTo3() {
			return ms.idEqualTo3();
		}

		@GetMapping("id_Equal_To_4")
		public List<Manager> idEqualTo4() {
			return ms.idEqualTo4();
		}

		@PutMapping("updateManagerData")
		public boolean updateManager(@RequestBody Manager mm) {

			System.out.println("info updated...");
			return ms.updateManager(mm);
		}

		@GetMapping("ListByQuery")
		public List<Manager> listByQuery() {
			return ms.listByQuery();

		}

		@GetMapping("select_Id_FromManagers")
		public List<Manager> FromClauseByQuery() {
			return ms.FromClauseByQuery();

		}

		@GetMapping("ASClause ")
		public List<Manager> ASClauseHQL() {
			return ms.ASClauseHQL();
		}

		@GetMapping("SELECT_CLause")
		public List<Manager> SELECT_CLause() {
			return ms.SELECT_CLause();

		}
		
		@DeleteMapping("DELETE_Clause")
		public String DELETE_CLAUSE() {
			return ms.DELETE_CLAUSE();
		}

		@GetMapping("minSalaryManager")
		public List<Manager> minSalaryManager() {
			return ms.minSalaryManager();

		}

		@GetMapping("maxSalaryManager")
		public List<Manager> maxSalaryManager() {
			return ms.minSalaryManager();

		}

		@GetMapping("getAllNames")
		public List<Manager> getAllNames() {
			return ms.getAllNames();

		}

		@GetMapping("getAllNamesAndProfiles")
		public List<Manager> getAllNamesAndProfiles() {
			return ms.getAllNamesAndProfiles();

		}

		@PostMapping("saveOrUpdateManager")
		public String saveOrUpdateManager(Manager mm) {
			return ms.saveOrUpdateManager(mm);

		}
}}
