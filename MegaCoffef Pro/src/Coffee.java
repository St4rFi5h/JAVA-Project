import java.util.Scanner;

import Shop.CoffeeData;

import java.util.ArrayList;
public class Coffee {
	int alsum=0;
	int alStamp=0;
	Scanner sc = new Scanner(System.in); 

	/// Ŭ�����迭�� ������ 
	ArrayList<CoffeeData> cof = new ArrayList<CoffeeData>();


	public Coffee() { //������
		Coff();

	}

	public void Coff() {
		cof.add(0, new CoffeeData("�Ƹ޸�ī��", 1500));
		cof.add(1, new CoffeeData("ICE �Ƹ޸�ī��", 2000));
		cof.add(2, new CoffeeData("��ī��", 3000));
		cof.add(3, new CoffeeData("ī��� �����߶�", 3000));
		//0~3 Ŀ��

		cof.add(4, new CoffeeData("���Ʈ ������", 4000));
		cof.add(5, new CoffeeData("���⽺����", 4500));
		//4~5 ������

		cof.add(6, new CoffeeData("ġ������", 5000));
		cof.add(7, new CoffeeData("��������", 5000));
		//6~7 ����ũ
	}

	public void Allsum() {
		for(int i =0; i<cof.size(); i++) {
			alsum+=cof.get(i).allprice;
		}
	}

	public void TotalStamp() { 
		for(int i =0; i<cof.size(); i++) {
			alStamp+=cof.get(i).stamp;
		}
	}
	public void SumStamp() {
		System.out.println("�����Ͻ� �ѱݾ���"+this.alsum+" �� �Դϴ�");
		System.out.println("������"+this.alStamp +" �� �Դϴ�");

	}


}
