package Mapping.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	
	
	@Id
	@Column(name="answer_Id")
	private int answerId;
	private String answer;
	
	@OneToOne
	private Question que;
	
	
	 
	
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

	public Answer(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}

	
	
	public Question getQue() {
		return que;
	}

	public void setQue(Question que) {
		this.que = que;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
