public class MegaUser {
	private String id;  //���̵�  private 
	private String pass; //�н�����  private
	private int stamp ; //��������  private
	
	public MegaUser() {  //������
		
	}
	///���� ���� ����
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
		this.stamp = stamp;
	}
	public String toString() {
		return this.id+"ȸ������ ���尹���� "+this.stamp+"�� �Դϴ�";
	}
}