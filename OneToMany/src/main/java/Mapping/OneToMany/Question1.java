package Mapping.OneToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
	
@Entity
public class Question1 {
	
	@Id
	@Column(name="Question_Id")
		private int queid;
		private String que;
		
		@OneToMany    
		private List<Answer1>ans;

		
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
	

           public Question1(int queid, String que, List<Answer1> ans) {
			super();
			this.queid = queid;
			this.que = que;
			this.ans = ans;
		}

           public List<Answer1> getAns() {
			return ans;
		}

		public void setAns(List<Answer1> ans) {
			this.ans = ans;
		}

		public Question1() {
			super();
			// TODO Auto-generated constructor stub
		}

      }
