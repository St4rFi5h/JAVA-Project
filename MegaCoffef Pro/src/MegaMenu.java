import java.util.ArrayList;  
import java.util.Scanner;
public class MegaMenu {
	
	public MegaMenu() { //������
		run();
	}
	
	void run() {     //���ο��� run(); �ϳ��� MegaMenu �� �����Ű�� ���� �޼ҵ�
		MegaMenu();
		
	}

	public void MegaMenu() {
		Scanner sc = new Scanner(System.in);   //Ű���� ���� �Է¹ޱ����� ��ĳ�� 
		ArrayList<MegaUser> usr = new ArrayList<MegaUser>();  //ȸ���� ArrayList �� �ޱ����� ����
		
		while(true) {
			int choice;
			System.out.println("�����������������");
			System.out.println("�ް�Ŀ�ǿ� ���Ű� ȯ���մϴ�.");
			System.out.println("�����������������\n\n");
		

			
			System.out.println("�����������������");
			System.out.println("���Ͻô� ���񽺸� ����ּ���");
			System.out.println("�����������������");
			System.out.println("1. ȸ����� ");
			System.out.println("2. �ֹ�");
			System.out.println("3. ȸ�������˻�");
			choice=sc.nextInt();
			MegaUser u;   // MegaUser ��üȭ...��������
			if(choice ==1) { ///ȸ�����
				
				u = new MegaUser();     // MegaUser �ʱ�ȭ
				System.out.println("Id�� �Է����ּ���.");
				u.id= sc.next();
				System.out.println("��й�ȣ�� �Է��ϼ���.");
				u.pass = sc.next();
				usr.add(u);   //ArratList �� �����߰�
				
			}
			
			
			else if(choice ==2) { //�ֹ�
				
				
			}
			
			
			else if(choice ==3) { //ȸ�� �����˻�
				
				
			}
			
			
			
			
			
		}
		
		
		
	}

}
