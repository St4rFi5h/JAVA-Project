import java.util.Scanner;
public class CoffeeData {
	int price;
	int count;
	int sum=0; 
	int allprice; //�Ѱ���
	int stamp; //����
	String name; //���� �̸�

	public CoffeeData() { //������
		Buy();
	}


	public CoffeeData(String name,int price) {  //���� �޾ƿ���
		this.name=name;
		this.price =price;


	}

	public CoffeeData(int count) { //����, ���������� ī��Ʈ 
		this.count=count;


	}
	void Buy() { //���Ÿ� �ϱ����� �޼ҵ�    //�����Ϳ��� �����͸� �־���ϴµ� �޼ҵ尡�ִ� 
		Scanner scan = new Scanner(System.in);	
		System.out.println("��ֹ��ϰڽ��ϱ�?");
		count=scan.nextInt();
		this.sum+=count;
		this.allprice=price*count;
		this.stamp+=count;

	}


	void totalprint(){  //������ ���ݿ����� ��¸޼ҵ�
		if(allprice !=0) 
			System.out.println(name+" "+(allprice/price)+"��  "+allprice+" ��");

	}



}