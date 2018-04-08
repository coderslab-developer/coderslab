/**
 * 
 */
package com.coderslab.enums;

/**
 * @author Zubayer Ahamed
 *
 */
public enum QuestionType {
	MULTIPLE_CHOICE("Multiple Choice"), FILL_IN_THE_BLANKS("Fill in the blanks"), QUESTION_ANSWER("Question answer"), REARRANGE("Rearrange");

	private String code;

	private QuestionType(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}
}
