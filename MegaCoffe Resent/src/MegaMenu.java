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
		

		while(true) {
			int choice;
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
			System.out.println("���������������������������������������������������������������������������������������������");
			System.out.println("				        ���Ͻô� ���񽺸� ����ּ���                                                      ");
			System.out.println("���������������������������������������������������������������������������������������������");
			System.out.println("1. ȸ����� ");
			System.out.println("2. �ֹ�");
			System.out.println("3. ȸ�������˻�");
			choice=sc.nextInt();
	

			if(choice ==1) { ///ȸ�����
				
			}


			else if(choice ==2) { //�ֹ�
				Machine m =new Machine();
				m.Machine(); //������ ����

			}


			else if(choice ==3) { //�� ��������
				for(int i=0; i<usr.size(); i++) {
					System.out.println(usr.get(i).toString());


				}
				System.out.println("����Ͻ÷��� �ƹ��ų� �����ּ���.");

			}





		}



	}

}