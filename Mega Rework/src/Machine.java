
import java.util.Scanner;
public class Machine  {
	int count;
	int choice;
	int i;


	Coffee coff =new Coffee(); //Ŀ�� �� ����Ǿ��ִ°�
	public Machine() { //������
		run();
	}

	void run() {     //���ο��� run(); �ϳ��� MegaMenu �� �����Ű�� ���� �޼ҵ�
		Machine();

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
					System.out.println("1. �Ƹ޸�ī�� ");
					System.out.println("2. ���̽� �Ƹ޸�ī��");
					System.out.println("3. ī���ī");
					System.out.println("4. ī��Ḷ���߶�");

					choice=sc.nextInt();


					i = (choice-1);
					coff.buy(i);
					System.out.println(coff.cof.get(i).toString());


				}else if(choice ==2) { //���������
					System.out.println("===������===");
					System.out.println("1. ���Ʈ ������");
					System.out.println("2. ���� ������");


					choice=sc.nextInt();
					i = (choice+5);
					coff.buy(i);
					System.out.println(coff.cof.get(i).toString());



				}else if(choice ==3) { //����ũ����
					System.out.println("===����ũ===");
					System.out.println("1. ġ������");
					System.out.println("2. ��������");
					choice=sc.nextInt();


					i = (choice+5);
					coff.buy(i);
					System.out.println(coff.cof.get(i).toString());



				}else if(choice ==4) { //������ Ŀ�� �� ���
					coff.login();  

					System.out.println("�����Ͻ� Ŀ�� ������");
					for(int i=0;i<coff.cof.size();i++) 
					{
						coff.cof.get(i).toString();
					}
					coff.allsum();  ///�Ѱ��� ��� �޼ҵ�
					coff. bill(); /// ���� ������



				}else{
					continue;}



			}
			else if(choice ==3) { //�� ��������
				coff.userprint();

			}









		}

	}

}
