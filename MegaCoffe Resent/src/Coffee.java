import java.util.Scanner;

import Shop.CoffeeData;

import java.util.ArrayList;
public class Coffee {
	int alsum=0;
	int alStamp=0;
	
	Scanner sc = new Scanner(System.in); 


	ArrayList<CoffeeData> cof = new ArrayList<CoffeeData>();
	ArrayList<MegaUser> usr = new ArrayList<MegaUser>();  //회원을 ArrayList 로 받기위한 생성
	MegaUser u;   // MegaUser 객체화...종구찬스
	public Coffee() { //생산자
		Coff();
	}

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

	public void allsum() {
		for(int i =0; i<cof.size(); i++) {
			alsum+=cof.get(i).allprice;
		}
	}

	public void totalStamp() { 
		for(int i =0; i<cof.size(); i++) {
			alStamp+=cof.get(i).stamp;
		}
	}
	public void sumStamp() {
		for(int i=0; i<cof.size();i++) {
			if(cof.get(i).allprice !=0) {
			System.out.println(cof.get(i).toString());
			}
		}
		System.out.println("지불하실 총금액은"+this.alsum+" 원 입니다");
		System.out.println("도장은"+this.alStamp +" 개 입니다");
	}
	
	public void login() {
		u = new MegaUser();     // MegaUser 초기화
		System.out.println("Id를 입력해주세요.");
		u.setId(sc.next());   //setId(String id)  <== 파라미터 안에 값을넣어야하니 () 안에 scanner 를 넣었다
		System.out.println("비밀번호를 입력하세요.");
		u.setPass(sc.next());
		usr.add(u);   //ArratList 에 유저추가

		
	}
	

	
	
	public void buy(int i) { //구매를 하기위한 메소드  
	
		System.out.println("몇개주문하겠습니까?");
		int count =sc.nextInt();
		cof.get(i).sum+=count;
		cof.get(i).allprice=(cof.get(i).price*count);
		cof.get(i).stamp+=count;
		

	}

}
