
import java.util.Scanner;
public class Machine  {
	int count;
	int choice;
	int allsum=0;
	int i;


	Coffee coff =new Coffee(); //커피 값 저장되어있는곳
	public Machine() { //생산자
		run();
	}

	void run() {     //메인에서 run(); 하나로 MegaMenu 를 실행시키기 위한 메소드
		Machine();

	}

	public void Machine() {
		Scanner sc = new Scanner(System.in);   //키보드 값을 입력받기위한 스캐너 


		while(true) {
			int choice;
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			System.out.println("메가커피에 오신걸 환영합니다.");
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓\n\n");




			System.out.println("                                                .,......                                                                       ");
			System.out.println("  ,,,,    ,,,,  ,,,,,,,  ,,,,,,,     ,,,    ,,,,      ,,,,   ......    .....,,,  &&&&&&&& &&&&&&& ,,,,,,,, ,,,,,,,,           ");
			System.out.println("  &&&&    &&&&  &&&&&&&* &&&&&&&&   &&&&&    ....      ....  %&&&&&&&, &&&&&&&&  &&&&&&&& &&&&&&& &&&&&&&& &&&&&&&&             ");
			System.out.println("  &&&&&  &&&&&  &&&.     &&&  &&&   &&&&&&   .....   .....   &&&& &&&& &&&  &&&  &&&&     &&&     &&&&     &&&&                 ");
			System.out.println("  &&&&&  &&&&&  &&&.     &&&       #&&&&&&    .. ..... ...   &&&&      &&&  &&&  &&&&     &&&     &&&&     &&&&                 ");
			System.out.println("  &&&&&&&&&&&&  &&&&&&&  &&& &&&&  &&& &&&#   ... ...  ..    &&&&      &&&  &&&  &&&&&&&  &&&&&&& &&&&&&&  &&&&&&%              ");
			System.out.println("  &&&&&&&&&&&&  &&&.     &&&  &&&  &&&&&&&&   ..... .....    &&&& &&&& &&&  &&&  &&&&     &&&     &&&&     &&&&                 ");
			System.out.println("  &&& &&&&.&&&  &&&.     &&&  &&& &&&&%&&&&   .. ..... ..    &&&% &&&& &&%  &&&  &&&&     &&&     &&&&     &&&&                 ");
			System.out.println("  &&& &&&&.&&&  &&&&&&&* &&&&&&&& &&&&  &&&%   .... ....      &&&&&&&  &&&&&&&&  &&&&     &&&     &&&&&&&& &&&&&&&&             ");
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			System.out.println("				        원하시는 서비스를 골라주세요                                                      ");
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			System.out.println("1. 회원등록 ");
			System.out.println("2. 주문");
			System.out.println("3. 회원정보검색");
			choice=sc.nextInt();


			if(choice ==1) { ///회원등록
				coff.useradd();
			}


			else if(choice ==2) { //주문
				//	while(true) { //총메뉴 무한
				System.out.println("===메뉴===");
				System.out.println("1. 커피");
				System.out.println("2. 스무디");
				System.out.println("3. 케이크");
				System.out.println("4. 계산");
				choice=sc.nextInt();

				if(choice ==1) {

					System.out.println("===커피===");
					System.out.println("1. 아메리카노");
					System.out.println("2. 아이스 아메리카노");
					System.out.println("3. 카페모카");
					System.out.println("4. 카라멜마끼야또");
					System.out.println("5. 뒤로가기");

					choice=sc.nextInt();


					i = (choice-1);
					coff.buy(i);
					coff.cof.get(i).toString();


				}else if(choice ==2) { //스무디시작
					System.out.println("===스무디===");
					System.out.println("1. 요거트 스무디");
					System.out.println("2. 딸기 스무디");


					choice=sc.nextInt();
					i = (choice+3);
					coff.buy(i);
					coff.cof.get(i).toString();



				}else if(choice ==3) { //케이크시작
					System.out.println("===케이크===");
					System.out.println("1. 치즈케익");
					System.out.println("2. 초코케익");
					choice=sc.nextInt();


					i = (choice+1);
					coff.buy(i);
					coff.cof.get(i).toString();



				}else if(choice ==4) { //구매한 커피 값 출력
					coff.login();  

					System.out.println("구매하신 커피 가격은");
					for(int i=0;i<coff.cof.size();i++) 
					{
						coff.cof.get(i).toString();
					}
					coff.allsum();  ///총가격 계산 메소드
					coff.totalStamp(); /// 스템프 계산 메소드
					coff. sumStamp(); /// 최종 영수증



				}else{
					continue;}
				//}


			}
			else if(choice ==3) { //현 유저정보
				coff.userprint();

			}









		}

	}

}
