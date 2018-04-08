/**
 * 
 */
package com.coderslab.entity;

import java.util.List;

import lombok.Data;

/**
 * @author Zubayer Ahamed
 *
 */
@Data
public class Exam {
	private int id;
	private List<Question> questions;
}
