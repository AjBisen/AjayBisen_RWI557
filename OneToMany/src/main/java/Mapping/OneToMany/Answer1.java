package Mapping.OneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import Mapping.OneToMany.Question1;
@Entity
public class Answer1 {
	@Id
	@Column(name="answer_Id")
	private int answerId;
	private String answer;
	
	
@ManyToOne	
	private Question1 que;
	
	
	 
	
	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Answer1(int answerId, String answer) {
		super();
		
		
		this.answerId = answerId;
		this.answer = answer;
	}

	
	
	public Question1 getQue() {
		return que;
	}

	public void setQue(Question1 que) {
		this.que = que;
	}

	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}

}

