package org.hs.controller;


import org.hs.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/system/*")
@Log4j
public class SystemController {

	@Autowired
	private SystemService service;

	@GetMapping("/annualForm")
	public void annualForm(Model model) {
		log.info("헤헤 이동한다.");
	}

	@GetMapping("/annualLeave")
	public String annualList(
			 @RequestParam("leaveGrantDay") String leaveGrantDay,
	          @RequestParam("annualLeaveNum") int annualLeaveNum	   
			) {
		log.info("휴가 부여");
		log.info(leaveGrantDay);
		log.info(annualLeaveNum);
		service.updateLeaveAnnual(leaveGrantDay,annualLeaveNum);
		return "redirect:/system/annualForm";
	}   
}
