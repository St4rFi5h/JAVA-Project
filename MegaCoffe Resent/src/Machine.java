import java.util.Scanner;

public class Machine  {
	int count;
	int choice;
	int allsum=0;
	int i;
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


						 i = (choice-1);
						coff.buy(i);
						coff.cof.get(i).toString();
					

				}else if(choice ==2) { //���������
				System.out.println("===������===");
				System.out.println("1. ���Ʈ ������");
				System.out.println("2. ���� ������");


				choice=sc.nextInt();
				 i = (choice+3);
				coff.buy(i);
				coff.cof.get(i).toString();


				
			}else if(choice ==3) { //����ũ����
				System.out.println("===����ũ===");
				System.out.println("1. ġ������");
				System.out.println("2. ��������");
				choice=sc.nextInt();


				 i = (choice+1);
				coff.buy(i);
				coff.cof.get(i).toString();
				
				
				
			}else if(choice ==4) { //������ Ŀ�� �� ���
				System.out.println("�����Ͻ� Ŀ�� ������");

				for(int i=0;i<coff.cof.size();i++) 
				{
					coff.cof.get(i).toString();
				}
				coff.allsum();
				coff.totalStamp();
				coff. sumStamp();



			}
		}
	}
}