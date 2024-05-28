package Mapping.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
@Id
@Column(name="Question_Id")
	private int queid;
	private String que;
	
	@OneToOne
	@JoinColumn(name= "A_Id")
	private Answer ans;


	
	
	
	
	public int getQueid() {
		return queid;
	}

	public void setQueid(int queid) {
		this.queid = queid;
	}

	public String getQue() {
		return que;
	}

	public void setQue(String que) {
		this.que = que;
	}

	public Answer getAns() {
		return ans;
	}

	public void setAns(Answer ans) {
		this.ans = ans;
	}

	public Question(int queid, String que, Answer ans) {
		super();
		this.queid = queid;
		this.que = que;
		this.ans = ans;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

}
