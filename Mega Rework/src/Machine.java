
//���� ��� �̱���


import java.util.Scanner;
public class Machine  {
	int count;
	int choice;
	int i;


	Coffee coff =new Coffee(); //Ŀ�� �� ����Ǿ��ִ°�
	public Machine() { //������ 
		run();
	}

	void run() {    
		Machine();   // �޼ҵ� Machine(); ����

	}

	public void Machine() {
		Scanner sc = new Scanner(System.in);   //Ű���� ���� �Է¹ޱ����� ��ĳ�� 
		System.out.println("�����������������");
		System.out.println("�ް�Ŀ�ǿ� ���Ű� ȯ���մϴ�.");
		System.out.println("�����������������\n\n");




		System.out.println("                                                .,......                                                                       ");
		System.out.println("  ,,,,    ,,,,  ,,,,,,,  ,,,,,,,     ,,,    ,,,,      ,,,,   ......    .....,,,  &&&&&&&& &&&&&&& ,,,,,,,, ,,,,,,,,           ");
		System.out.println("  &&&&    &&&&  &&&&&&&* &&&&&&&&   &&&&&    ....      ....  %&&&&&&&, &&&&&&&&  &&&&&&&& &&&&&&& &&&&&&&& &&&&&&&&             ");
		System.out.println("  &&&&&  &&&&&  &&&.     &&&  &&&   &&&&&&   .....   .....   &&&& &&&& &&&  &&&  &&&&     &&&     &&&&     &&&&                 ");
		System.out.println("  &&&&&  &&&&&  &&&.     &&&       #&&&&&&    .. ..... ...   &&&&      &&&  &&&  &&&&     &&&     &&&&     &&&&                 ");
		System.out.println("  &&&&&&&&&&&&  &&&&&&&  &&& &&&&  &&& &&&#   ... ...  ..    &&&&      &&&  &&&  &&&&&&&  &&&&&&& &&&&&&&  &&&&&&%              ");
		System.out.println("  &&&&&&&&&&&&  &&&.     &&&  &&&  &&&&&&&&   ..... .....    &&&& &&&& &&&  &&&  &&&&     &&&     &&&&     &&&&                 ");
		System.out.println("  &&& &&&&.&&&  &&&.     &&&  &&& &&&&%&&&&   .. ..... ..    &&&% &&&& &&%  &&&  &&&&     &&&     &&&&     &&&&                 ");
		System.out.println("  &&& &&&&.&&&  &&&&&&&* &&&&&&&& &&&&  &&&%   .... ....      &&&&&&&  &&&&&&&&  &&&&     &&&     &&&&&&&& &&&&&&&&             ");

		while(true) {
			int choice;

			System.out.println("���������������������������������������������������������������������������������������������");
			System.out.println("				        ���Ͻô� ���񽺸� ����ּ���                                                      ");
			System.out.println("���������������������������������������������������������������������������������������������");
			System.out.println("1. ȸ����� ");
			System.out.println("2. �ֹ�");
			System.out.println("3. ȸ�������˻�");
			choice=sc.nextInt();


			if(choice ==1) { ///ȸ�����
				coff.useradd();
			}


			else if(choice ==2) { //�ֹ�

				System.out.println("===�޴�===");
				System.out.println("1. Ŀ��");
				System.out.println("2. ������");
				System.out.println("3. ����ũ");
				System.out.println("4. ���");
				choice=sc.nextInt();

				if(choice ==1) {

					System.out.println("===Ŀ��===");
					System.out.println("1. �Ƹ޸�ī��  1500��");
					System.out.println("2. ���̽� �Ƹ޸�ī�� 2000��");
					System.out.println("3. ��ī�� 3000�� ");
					System.out.println("4. ī��Ḷ���߶� 3000��");

					choice=sc.nextInt();


					i = (choice-1);  // Ŀ�� , ������ , ����ũ�� �������� �ʾ���..
					coff.buy(i); 
					System.out.println(coff.cof.get(i));  //�� Ŀ�ǿ����� ������ ����


				}else if(choice ==2) { //���������
					System.out.println("===������===");
					System.out.println("1. ���Ʈ ������ 4000��");
					System.out.println("2. ���� ������ 4500��");


					choice=sc.nextInt();
					i = (choice+4);
					coff.buy(i);
					System.out.println(coff.cof.get(i));



				}else if(choice ==3) { //����ũ����
					System.out.println("===����ũ===");
					System.out.println("1. ġ������ 5000��");
					System.out.println("2. �������� 5000��");
					choice=sc.nextInt();


					i = (choice+5);
					coff.buy(i);
					System.out.println(coff.cof.get(i));



				}else if(choice ==4) { //������ Ŀ�� �� ���
					coff.login();  

					System.out.println("�����Ͻ� Ŀ�� ������");
					for(int i=0;i<coff.cof.size();i++) 
					{
						coff.cof.get(i);
					}
					coff.allsum();  ///�Ѱ��� ��� �޼ҵ�
					coff. bill(); /// ���� ������



				}else{
					continue;}



			}
			else if(choice ==3) { //�� ���� ,���� ����
				coff.userprint();

			}









		}

	}

}
