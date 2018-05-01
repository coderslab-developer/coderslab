/**
 * 
 */
package com.coderslab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Zubayer Ahamed
 *
 */
@Entity
@Table(name = "posts")
@Data
public class Posts {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "postId", nullable = false, unique = true)
	private Integer postId;

	@Column(name = "content", length = 254)
	private String content;
}
