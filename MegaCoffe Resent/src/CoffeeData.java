public class CoffeeData {
	int price;
	int count;
	int sum=0; //����
	int allprice; //�Ѱ���
	int stamp; //����
	String name; //���� �̸�

	public CoffeeData() { //������
		
	}


	public CoffeeData(String name,int price) {  //���� �޾ƿ���
		this.name=name;
		this.price =price;


	}

	public CoffeeData(int count) { //����, ���������� ī��Ʈ 
		this.count=count;


	}


	@Override
	public String toString() {
		return name+" "+(allprice/price)+"��  "+allprice+" ��";
	}



}