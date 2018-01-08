package ca.ghildas.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
public  class Question  implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idQuestion;
	private String title;
	private String content;
	@Temporal(TemporalType.DATE)
	private Date dateCration;
	private String explanations;
	private String comment;
	private String correctAnswerText;
	@OneToMany(mappedBy="question")
	public Collection <Answer> answers;
	@ManyToOne
	@JoinColumn(name="idQuizz")
	private Quizz quizz;
	public Question() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Question [idQuestion=" + idQuestion + ", title=" + title + ", content=" + content + ", dateCration="
				+ dateCration + ", explanations=" + explanations + ", comment=" + comment + ", correctAnswerText="
				+ correctAnswerText + ", choices=" + answers + ", quizz=" + quizz + "]";
	}


	public Question(String title, String content, Date dateCration, String explanations, String comment,
			String correctAnswerText, Collection<Answer> choices, Quizz quizz) {
		super();
		this.title = title;
		this.content = content;
		this.dateCration = dateCration;
		this.explanations = explanations;
		this.comment = comment;
		this.correctAnswerText = correctAnswerText;
		this.answers = choices;
		this.quizz = quizz;
	}

	@JsonIgnore
	public Quizz getQuizz() {
		return quizz;
	}

	public void setQuizz(Quizz quizz) {
		this.quizz = quizz;
	}

	



public int getIdQuestion() {
	return idQuestion;
}

public void setIdQuestion(int idQuestion) {
	this.idQuestion = idQuestion;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}

public Date getDateCration() {
	return dateCration;
}

public void setDateCration(Date dateCration) {
	this.dateCration = dateCration;
}

public String getExplanations() {
	return explanations;
}

public void setExplanations(String explanations) {
	this.explanations = explanations;
}

public String getComment() {
	return comment;
}

public void setComment(String comment) {
	this.comment = comment;
}

public String getCorrectAnswerText() {
	return correctAnswerText;
}

public void setCorrectAnswerText(String correctAnswerText) {
	this.correctAnswerText = correctAnswerText;
}
//@JsonIgnore
@JsonInclude
public Collection<Answer> getAnswers() {
	return answers;
}

public void setAnswers(Collection<Answer> answers) {
	this.answers = answers;
}










	

	




}

