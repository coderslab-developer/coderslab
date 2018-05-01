/**
 * 
 */
package com.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coderslab.entity.Posts;
import com.coderslab.service.PostsService;

/**
 * @author Zubayer Ahamed
 *
 */
@Controller
@RequestMapping("/posts")
public class PostsController {

	@Autowired PostsService postsService;

	@GetMapping("/create")
	public String loadAddNewPosts(Model model) {
		model.addAttribute("posts", new Posts());
		return "views/dashboard/index";
	}

	@PostMapping("/save")
	public @ResponseBody String savePosts(Posts posts, Model model) {
		System.out.println("Value: " + posts.toString());
		return posts.getContent();
	}
}
