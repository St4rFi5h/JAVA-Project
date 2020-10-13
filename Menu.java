import java.util.Scanner;  
class Menu {

	Scanner s = new Scanner (System.in);
	User [] use = new User [2];


	public Menu() 
	{
		start();
	}
	////유저2명

	int choose;
	void start() 
	{

		for(;;)
		{
			System.out.println( "〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓\n");
			System.out.println( "1번 : 선수등록 ");
			System.out.println( "2번 : 게임시작");
			System.out.println( "〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓\n");
			this.choose = s.nextInt( );

			if(this.choose == 1 ) {
				for(int i = 0 ; i <2; i++) 
				{
					use[i] = new User();
					System.out.println( (i+1 )+"번 선수의 이름을 입력해주세요");
					use[i].name = s.next( );
				}

			}
			if(this.choose == 2 ) 
			{
				for(;;) 
				{

					System.out.println( "게임을 시작합니다");
					System.out.println( "〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓\n");

					use[0].re();
					use[1].re();

					if(use[0].sum>use[1].sum) 
					{
						use[0].count +=1;
						System.out.println(use[0].name +"께서 이겼습니다");

					}
					else if(use[1].sum>use[0].sum) 
					{
						use[1].count +=1;
						System.out.println(use[1].name +"께서 이겼습니다");
					}else System.out.println("둘은 비겼습니다");

					System.out.println("현제스코어 ="+use[0].name+"("+use[0].count +")"+":"+use[1].name+"("+use[1].count+")\n" );
					System.out.println( "〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓\n");
					System.out.println( "다시하시려면 1번을 눌러주세요");
					System.out.println( "그만하려면 2번을 눌러주세요");
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
