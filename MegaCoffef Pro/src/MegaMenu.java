import java.util.ArrayList;  
import java.util.Scanner;
public class MegaMenu {
	
	public MegaMenu() { //생산자
		run();
	}
	
	void run() {     //메인에서 run(); 하나로 MegaMenu 를 실행시키기 위한 메소드
		MegaMenu();
		
	}

	public void MegaMenu() {
		Scanner sc = new Scanner(System.in);   //키보드 값을 입력받기위한 스캐너 
		ArrayList<MegaUser> usr = new ArrayList<MegaUser>();  //회원을 ArrayList 로 받기위한 생성
		
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
			MegaUser u;   // MegaUser 객체화...종구찬스
			
			if(choice ==1) { ///회원등록
				
				u = new MegaUser();     // MegaUser 초기화
				System.out.println("Id를 입력해주세요.");
				u.setId(sc.next());   //setId(String id)  <== 파라미터 안에 값을넣어야하니 () 안에 scanner 를 넣었다
				System.out.println("비밀번호를 입력하세요.");
				u.setPass(sc.next());
				usr.add(u);   //ArratList 에 유저추가
				
			}
			
			
			else if(choice ==2) { //주문
				Machine m =new Machine();
				m.Machine(); //포스기 시작
				
			}
			
			
			else if(choice ==3) { //현 유저정보
				for(int i=0; i<usr.size(); i++) {
					System.out.println(usr.get(i).toString());
					
					
				}
				System.out.println("계속하시려면 아무거나 눌러주세요.");
				
			}
			
			
			
			
			
		}
		
		
		
	}

}