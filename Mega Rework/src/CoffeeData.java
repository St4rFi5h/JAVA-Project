public class CoffeeData {    //�� �ֹ� �޴� ������ Ŭ���� 
	int price; //���� ����
	int allprice; //�Ѱ���  (��Ŭ�������� �������ϴ� ���� ������ ��������)
	String name; //���� �̸�

	public CoffeeData() { //������
		
	}


	public CoffeeData(String name,int price) {  //���� �޾ƿ���
		this.name=name;
		this.price =price;


	}




	@Override
	public String toString() {
		return name+" �ֹ����� "+(allprice/price)+" ���� "+allprice+" ��";
	}



}