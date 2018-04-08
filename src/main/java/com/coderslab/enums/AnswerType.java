/**
 * 
 */
package com.coderslab.enums;

/**
 * @author Zubayer Ahamed
 *
 */
public enum AnswerType {
	SINGLE("Single"), MULTIPLE("Multiple");

	private String code;

	private AnswerType(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}
}
