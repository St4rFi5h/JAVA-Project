import java.util.Scanner;
import java.util.ArrayList;
public class Coffee {
	int alsum;   //��� �޴��� �� ��
	int alStamp; //��� �޴��� ���尹���� 

	Scanner sc = new Scanner(System.in); 




	ArrayList<CoffeeData> cof = new ArrayList<CoffeeData>();  // Ŀ���������� ������ ���� 
	ArrayList<MegaUser> usr = new ArrayList<MegaUser>();  //ȸ���� ArrayList �� �ޱ����� ����
	MegaUser u;   // MegaUser ��üȭ
	
	
	//////������
	public Coffee() { 
		Coff();
	}


	///////�� �޴� �̸� , ���� ����
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





	///////�Ѱ��� ��� �޼ҵ�
	public void allsum() {  
		for(int i =0; i<cof.size(); i++) {
			alsum+=cof.get(i).allprice;
		}
	}







	/////���� ������	
	public void bill() { 
		for(int i=0; i<cof.size();i++) {
			if(cof.get(i).allprice !=0) {
				System.out.println(cof.get(i).toString());
			}
		}
		System.out.println("�����Ͻ� �ѱݾ���"+this.alsum+" �� �Դϴ�");
		System.out.println("������"+this.alStamp +" �� �Դϴ�");
	}



	//////������ ���� �ֹ� �޼ҵ� 
	public void buy(int i) {   

		System.out.println("��ֹ��ϰڽ��ϱ�?");
		int count =sc.nextInt();
		cof.get(i).allprice=(cof.get(i).price*count);
		alStamp+=count;



	}


	///////�α���, ������ ����
	public void login() { 
		  
		System.out.println("ȸ�� �̽Ű���?");
		System.out.println("1. ��  2. �ƴϿ�");
		int i =sc.nextInt();
		if(i ==1) {
			System.out.println("���̵� �Է����ּ���");
			String j = sc.next();
			System.out.println("��й�ȣ�� �Է����ּ���");
			String k = sc.next();
			for(i=0; i< usr.size();i++) {
				if(j.equals (usr.get(i).getId()) && k.equals(usr.get(i).getPass())) {
					System.out.println("�����Ǿ����ϴ�.");
					usr.get(i).setStamp(alStamp);
					System.out.println(alStamp);
					System.out.println(usr.get(i).getStamp());

				}else {
					System.out.println("������ �߸��Ǿ����ϴ�");
				}



			}


		}else if(i==2) {
			
		}



	}




	 ///////ȸ������
	public void useradd() { 
		u = new MegaUser();     // MegaUser �ʱ�ȭ
		System.out.println("Id�� �Է����ּ���.");
		u.setId(sc.next());   //setId(String id)  <== �Ķ���� �ȿ� �����־���ϴ� () �ȿ� scanner �� �־���
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		u.setPass(sc.next());
		usr.add(u);   //ArratList �� �����߰�
	}
	 ///////ȸ�� ��� ���
	public void userprint() { 
		for(int i=0; i<usr.size(); i++) {
			System.out.println(usr.get(i).toString());


		}
		
		System.out.println("����Ͻ÷��� �ƹ��ų� �����ּ���.");
		String i =sc.next();
	}

}