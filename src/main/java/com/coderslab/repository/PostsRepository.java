/**
 * 
 */
package com.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderslab.entity.Posts;

/**
 * @author Zubayer Ahamed
 *
 */
@Repository
public interface PostsRepository extends JpaRepository<Posts, Integer> {

}
