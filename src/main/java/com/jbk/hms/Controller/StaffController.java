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
import com.jbk.hms.Entity.Staff;
import com.jbk.hms.Service.ManagerService;
import com.jbk.hms.Service.StaffService;
@RestController
@RequestMapping("/StaffDetails")
public class StaffController {
	
	
		@Autowired
		StaffService ss;
		@Autowired
		SessionFactory sf;

		@GetMapping("/AllStaffDetails")
		public List<Staff> getAllMAnagerDetails() {
			System.out.println(" getAll method running...");
			return ss.getAllMAnagerDetails();
		}

		@PostMapping("/insertNewStaff")
		public String addNewStaff(@RequestBody Staff staff) {
			System.out.println("details inserted..");
			return ss.addNewStaff(staff);

		}

		@PostMapping("saveOrUpdateManager")
		public String saveOrUpdateStaff(Staff staff) {
			return ss.saveOrUpdateStaff(staff);

		}

		@PutMapping("updateStaffData")
		public boolean updateStaff(@RequestBody Staff staff) {

			System.out.println("info updated...");
			return ss.updateStaff(staff);
		}

		@GetMapping("SalaryLessThan20K")
		public List<Staff> salLessThan20k() {
			return ss.salLessThan20k();
		}

		@GetMapping("SalaryMoreThan20K")
		public List<Staff> salMoreThan20k() {
			return ss.salMoreThan20k();
		}

		@GetMapping("nameStartsWith_S")
		public List<Staff> nameStartsWithS() {
			return ss.nameStartsWithS();
		}


		@GetMapping("getAllNamesAndProfiles")
		public List<Staff> getAllNamesAndProfiles() {
			return ss.getAllNamesAndProfiles();

		}

	}

