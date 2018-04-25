/**
 * 
 */
package com.coderslab.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Zubayer Ahamed
 *
 */
@Controller
@RequestMapping("/admin")
public class AdminDashboardController {

	@GetMapping
	public String loadAdminDashboardPage() {
		return "admin/dashboard/dashboard";
	}
	
}
