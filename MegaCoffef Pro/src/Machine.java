import java.util.Scanner;

public class Machine  {
	int count;
	int choice;
	int allsum=0;
	Coffee coff =new Coffee(); //Ŀ�� �� ����Ǿ��ִ°�
	public Machine() {

	}


	public void Machine() {
		Scanner sc = new Scanner(System.in); 
		while(true) { //�Ѹ޴� ����
			System.out.println("===�޴�===");
			System.out.println("1. Ŀ��");
			System.out.println("2. ������");
			System.out.println("3. ����ũ");
			System.out.println("4. ���");
			choice=sc.nextInt();

			if(choice ==1) {
		 
				System.out.println("===Ŀ��===");
				System.out.println("1. �Ƹ޸�ī��");
				System.out.println("2. ���̽� �Ƹ޸�ī��");
				System.out.println("3. ī���ī");
				System.out.println("4. ī��Ḷ���߶�");
				System.out.println("5. �ڷΰ���");

				choice=sc.nextInt();
				if(choice ==1) {
					coff.cof.get(0).Buy(); //�Ƹ޸�ī��
				}

				if(choice ==2) {
					coff.cof.get(1).Buy(); //���̽��Ƹ޸�ī��
				}

				if(choice ==3) {
					coff.cof.get(2).Buy();//��ī��
				}

				if(choice ==4) {
					coff.cof.get(3).Buy();//ī��� �����߶�
				} 
				
				
				
				
			}else if(choice ==2) { //���������
				System.out.println("===������===");
				System.out.println("1. ���Ʈ ������");
				System.out.println("2. ���� ������");
				choice=sc.nextInt();
				if(choice ==1) {
					coff.cof.get(4).Buy();
				}

				if(choice ==2) {
					coff.cof.get(5).Buy();
				}//������

				
				
			}else if(choice ==3) { //����ũ����
				System.out.println("===����ũ===");
				System.out.println("1. ġ������");
				System.out.println("2. ��������");
				choice=sc.nextInt();
			
				
				
				if(choice ==1) {
					coff.cof.get(6).Buy(); //ġ������

				}

				
				
				
				if(choice ==2) {
					coff.cof.get(7).Buy(); //��������
				}//���ͳ�

				
				
				
			}else if(choice ==4) { //������ Ŀ�� �� ���
				System.out.println("�����Ͻ� Ŀ�� ������");

				for(int i=0;i<coff.cof.size();i++) 
				{
					coff.cof.get(i).totalprint();
				}
				coff.Allsum();
				coff.TotalStamp();
				coff. SumStamp();

				
			
		}
	}
}
}