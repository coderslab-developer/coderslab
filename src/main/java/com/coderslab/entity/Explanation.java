/**
 * 
 */
package com.coderslab.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "explanation")
@XmlRootElement(name = "explanation")
@XmlAccessorType(XmlAccessType.FIELD)
public class Explanation implements Serializable {

	private static final long serialVersionUID = 8779116854163391471L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "explanationId", unique = true, nullable = false)
	private int explanationId;

	@Column(name = "explanationText", nullable = false, columnDefinition = "TEXT")
	private String explanationText;

	@Lob
	@Column(name = "explanationImage", columnDefinition = "mediumblob")
	private byte[] explanationImage;

	@Column(name = "explanationVideoLink", columnDefinition = "TEXT")
	private String explanationVideoLink;

	@Lob
	@Column(name = "explanationVideo", columnDefinition = "mediumblob")
	private byte[] explanationVideo;
}
