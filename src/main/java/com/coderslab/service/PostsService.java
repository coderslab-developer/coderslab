/**
 * 
 */
package com.coderslab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderslab.entity.Posts;
import com.coderslab.repository.PostsRepository;

/**
 * @author Zubayer Ahamed
 *
 */
@Service
public class PostsService {

	@Autowired PostsRepository postsRepository;

	public Posts save(Posts posts) {
		return postsRepository.save(posts);
	}

	public List<Posts> findAll() {
		return postsRepository.findAll();
	}
}
