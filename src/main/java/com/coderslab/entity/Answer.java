/**
 * 
 */
package com.coderslab.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

/**
 * @author Zubayer Ahamed
 *
 */
@Entity
@Data
@Table(name = "answer")
@XmlRootElement(name = "answer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Answer implements Serializable {

	private static final long serialVersionUID = -6128190253470848396L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "answerId", unique = true, nullable = false)
	private int answerId;

	@Column(name = "content", nullable = false, columnDefinition = "TEXT")
	private String content;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "questionId")
	private Question question;
}
