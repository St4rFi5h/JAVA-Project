import java.util.Scanner;
import java.util.ArrayList;
public class Coffee {
	int alsum;   //모든 메뉴의 총 합
	int alStamp; //모든 메뉴의 도장갯수합 

	Scanner sc = new Scanner(System.in); 




	ArrayList<CoffeeData> cof = new ArrayList<CoffeeData>();  // 커피종류별로 데이터 저장 
	ArrayList<MegaUser> usr = new ArrayList<MegaUser>();  //회원을 ArrayList 로 받기위한 생성
	MegaUser u;   // MegaUser 객체화
	
	
	//////생산자
	public Coffee() { 
		Coff();
	}


	///////각 메뉴 이름 , 가격 지정
	public void Coff() { 
		cof.add(0, new CoffeeData("아메리카노", 1500));
		cof.add(1, new CoffeeData("ICE 아메리카노", 2000));
		cof.add(2, new CoffeeData("모카라떼", 3000));
		cof.add(3, new CoffeeData("카라멜 마끼야또", 3000));
		//0~3 커피

		cof.add(4, new CoffeeData("요거트 스무디", 4000));
		cof.add(5, new CoffeeData("딸기스무디", 4500));
		//4~5 스무디

		cof.add(6, new CoffeeData("치즈케익", 5000));
		cof.add(7, new CoffeeData("초코케익", 5000));
		//6~7 케이크
	}





	///////총가격 계산 메소드
	public void allsum() {  
		for(int i =0; i<cof.size(); i++) {
			alsum+=cof.get(i).allprice;
		}
	}







	/////최종 영수증	
	public void bill() { 
		for(int i=0; i<cof.size();i++) {
			if(cof.get(i).allprice !=0) {
				System.out.println(cof.get(i).toString());
			}
		}
		System.out.println("지불하실 총금액은"+this.alsum+" 원 입니다");
		System.out.println("도장은"+this.alStamp +" 개 입니다");
	}



	//////각음료 갯수 주문 메소드 
	public void buy(int i) {   

		System.out.println("몇개주문하겠습니까?");
		int count =sc.nextInt();
		cof.get(i).allprice=(cof.get(i).price*count);
		alStamp+=count;



	}


	///////로그인, 스템프 적립
	public void login() { 
		  
		System.out.println("회원 이신가요?");
		System.out.println("1. 예  2. 아니요");
		int i =sc.nextInt();
		if(i ==1) {
			System.out.println("아이디를 입력해주세요");
			String j = sc.next();
			System.out.println("비밀번호를 입력해주세요");
			String k = sc.next();
			for(i=0; i< usr.size();i++) {
				if(j.equals (usr.get(i).getId()) && k.equals(usr.get(i).getPass())) {
					System.out.println("적립되었습니다.");
					usr.get(i).setStamp(alStamp);
					System.out.println(alStamp);
					System.out.println(usr.get(i).getStamp());

				}else {
					System.out.println("계정이 잘못되었습니다");
				}



			}


		}else if(i==2) {
			
		}



	}




	 ///////회원가입
	public void useradd() { 
		u = new MegaUser();     // MegaUser 초기화
		System.out.println("Id를 입력해주세요.");
		u.setId(sc.next());   //setId(String id)  <== 파라미터 안에 값을넣어야하니 () 안에 scanner 를 넣었다
		System.out.println("비밀번호를 입력하세요.");
		u.setPass(sc.next());
		usr.add(u);   //ArratList 에 유저추가
	}
	 ///////회원 목록 출력
	public void userprint() { 
		for(int i=0; i<usr.size(); i++) {
			System.out.println(usr.get(i).toString());


		}
		
		System.out.println("계속하시려면 아무거나 눌러주세요.");
		String i =sc.next();
	}

}