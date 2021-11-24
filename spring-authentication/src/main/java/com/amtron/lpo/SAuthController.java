package com.amtron.lpo;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SAuthController {

	/*
	 * @GetMapping("/home") public String getHome() { Object principal =
	 * SecurityContextHolder.getContext().getAuthentication().getPrincipal(); String
	 * username=((UserDetails)principal).getUsername(); return
	 * "Welcome User-"+username ; }
	 * 
	 * @GetMapping("/admin") public String getAdmin() { Object principal =
	 * SecurityContextHolder.getContext().getAuthentication().getPrincipal(); String
	 * username=((UserDetails)principal).getUsername(); return
	 * "Welcome Admin-"+username ; }
	 * 
	 * 
	 * @GetMapping("test") public String viewAlert() { Object principal =
	 * SecurityContextHolder.getContext().getAuthentication().getPrincipal(); if (
	 * principal instanceof UserDetails) { String
	 * username=((UserDetails)principal).getUsername(); } else { String username =
	 * principal.toString(); } return username; }
	 */
}
