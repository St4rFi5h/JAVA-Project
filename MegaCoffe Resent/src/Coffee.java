import java.util.Scanner;

import Shop.CoffeeData;

import java.util.ArrayList;
public class Coffee {
	int alsum=0;
	int alStamp=0;
	
	Scanner sc = new Scanner(System.in); 


	ArrayList<CoffeeData> cof = new ArrayList<CoffeeData>();
	ArrayList<MegaUser> usr = new ArrayList<MegaUser>();  //ȸ���� ArrayList �� �ޱ����� ����
	MegaUser u;   // MegaUser ��üȭ...��������
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

	public void allsum() {
		for(int i =0; i<cof.size(); i++) {
			alsum+=cof.get(i).allprice;
		}
	}

	public void totalStamp() { 
		for(int i =0; i<cof.size(); i++) {
			alStamp+=cof.get(i).stamp;
		}
	}
	public void sumStamp() {
		for(int i=0; i<cof.size();i++) {
			if(cof.get(i).allprice !=0) {
			System.out.println(cof.get(i).toString());
			}
		}
		System.out.println("�����Ͻ� �ѱݾ���"+this.alsum+" �� �Դϴ�");
		System.out.println("������"+this.alStamp +" �� �Դϴ�");
	}
	
	public void login() {
		u = new MegaUser();     // MegaUser �ʱ�ȭ
		System.out.println("Id�� �Է����ּ���.");
		u.setId(sc.next());   //setId(String id)  <== �Ķ���� �ȿ� �����־���ϴ� () �ȿ� scanner �� �־���
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		u.setPass(sc.next());
		usr.add(u);   //ArratList �� �����߰�

		
	}
	

	
	
	public void buy(int i) { //���Ÿ� �ϱ����� �޼ҵ�  
	
		System.out.println("��ֹ��ϰڽ��ϱ�?");
		int count =sc.nextInt();
		cof.get(i).sum+=count;
		cof.get(i).allprice=(cof.get(i).price*count);
		cof.get(i).stamp+=count;
		

	}

}
