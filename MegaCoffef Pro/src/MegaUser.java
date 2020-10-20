
public class MegaUser {
	private String id;  //아이디  private 
	private String pass; //패스워드  private
	private int stamp ; //적립도장  private
	
	public MegaUser() {  //생산자
		
	}
	///게터 세터 시작
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getStamp() {
		return stamp;
	}

	public void setStamp(int stamp) {
		stamp = stamp;
	}

	
	public String toString() {
		return id+"회원님의 도장갯수는 "+stamp+"개 입니다";
	}
}
