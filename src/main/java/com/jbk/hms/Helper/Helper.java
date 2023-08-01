package com.jbk.hms.Helper;

import java.time.LocalDateTime;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class Helper {
	
	@Before(" execution(* com.jbk.hms.Controller.ManagerController.getAllMAnagerDetails())")
	public void checkBeforeuthorization() {
		System.out.println("Authenticating... " + LocalDateTime.now());
	}
	@After(" execution(* com.jbk.hms.Controller.ManagerController.getAllMAnagerDetails())")
	public void checkAfterAuthorization() {
		System.out.println("Authentication successful!"+ LocalDateTime.now());
	}
}
