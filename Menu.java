import java.util.Scanner;  
class Menu {

	Scanner s = new Scanner (System.in);
	User [] use = new User [2];


	public Menu() 
	{
		start();
	}
	////����2��

	int choose;
	void start() 
	{

		for(;;)
		{
			System.out.println( "�����������������������������������������������������������\n");
			System.out.println( "1�� : ������� ");
			System.out.println( "2�� : ���ӽ���");
			System.out.println( "�����������������������������������������������������������\n");
			this.choose = s.nextInt( );

			if(this.choose == 1 ) {
				for(int i = 0 ; i <2; i++) 
				{
					use[i] = new User();
					System.out.println( (i+1 )+"�� ������ �̸��� �Է����ּ���");
					use[i].name = s.next( );
				}

			}
			if(this.choose == 2 ) 
			{
				for(;;) 
				{

					System.out.println( "������ �����մϴ�");
					System.out.println( "�����������������������������������������������������������\n");

					use[0].re();
					use[1].re();

					if(use[0].sum>use[1].sum) 
					{
						use[0].count +=1;
						System.out.println(use[0].name +"���� �̰���ϴ�");

					}
					else if(use[1].sum>use[0].sum) 
					{
						use[1].count +=1;
						System.out.println(use[1].name +"���� �̰���ϴ�");
					}else System.out.println("���� �����ϴ�");

					System.out.println("�������ھ� ="+use[0].name+"("+use[0].count +")"+":"+use[1].name+"("+use[1].count+")\n" );
					System.out.println( "�����������������������������������������������������������\n");
					System.out.println( "�ٽ��Ͻ÷��� 1���� �����ּ���");
					System.out.println( "�׸��Ϸ��� 2���� �����ּ���");
					choose = s.nextInt( );
					if (this.choose == 1 ) 
					{
						use[0].roll();
						use[1].roll();
					}else if (this.choose == 2 ) 
					{
						break;
					}
				}
			}
		}
	}
}
