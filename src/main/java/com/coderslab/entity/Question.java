/**
 * 
 */
package com.coderslab.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.coderslab.enums.AnswerType;
import com.coderslab.enums.QuestionType;

import lombok.Data;

/**
 * @author Zubayer Ahamed
 *
 */
@Entity
@Data
@Table(name = "question", catalog = "coderslab")
@XmlRootElement(name = "question")
@XmlAccessorType(XmlAccessType.FIELD)
public class Question implements Serializable {
	private static final long serialVersionUID = 6117799859307748637L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "questionId", unique = true, nullable = false)
	private int questionId;

	@Column(name = "content", nullable = false, columnDefinition = "TEXT")
	private String content;

	@Lob
	@Column(name = "questionImage", columnDefinition = "mediumblob")
	private byte[] questionImage;

	@Enumerated(EnumType.STRING)
	@Column(name = "questionType", length = 100)
	private QuestionType questionType;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "answerId")
	private List<Answer> answers;

	@Enumerated(EnumType.STRING)
	@Column(name = "answerType", length = 100)
	private AnswerType answerType;

	@Column(name = "numberOfSelect")
	private int numberOfSelect;

	@Column(name = "checkNumberOfSelect", columnDefinition = "BOOLEAN")
	private boolean checkNumberOfSelect;

	@Column(name = "complexity")
	private int complexity;

	@Column(name = "numberOfChoices")
	private int numberOfChoices;

	@OneToOne(cascade = CascadeType.ALL)
	private Explanation explanation;

	@Column(name = "correctAnswer")
	private int correctAnswer;

	@Column(name = "suffleChoice", columnDefinition = "BOOLEAN")
	private boolean suffleChoice;

	@Column(name = "exhibits", columnDefinition = "TEXT")
	private String exhibits;
}
