import java.util.Scanner;

public class Machine  {
	int count;
	int choice;
	int allsum=0;
	Coffee coff =new Coffee(); //커피 값 저장되어있는곳
	public Machine() {

	}


	public void Machine() {
		Scanner sc = new Scanner(System.in); 
		while(true) { //총메뉴 무한
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
				if(choice ==1) {
					coff.cof.get(0).Buy(); //아메리카노
				}

				if(choice ==2) {
					coff.cof.get(1).Buy(); //아이스아메리카노
				}

				if(choice ==3) {
					coff.cof.get(2).Buy();//모카라떼
				}

				if(choice ==4) {
					coff.cof.get(3).Buy();//카라멜 마끼야또
				} 
				
				
				
				
			}else if(choice ==2) { //스무디시작
				System.out.println("===스무디===");
				System.out.println("1. 요거트 스무디");
				System.out.println("2. 딸기 스무디");
				choice=sc.nextInt();
				if(choice ==1) {
					coff.cof.get(4).Buy();
				}

				if(choice ==2) {
					coff.cof.get(5).Buy();
				}//스무디끝

				
				
			}else if(choice ==3) { //케이크시작
				System.out.println("===케이크===");
				System.out.println("1. 치즈케익");
				System.out.println("2. 초코케익");
				choice=sc.nextInt();
			
				
				
				if(choice ==1) {
					coff.cof.get(6).Buy(); //치즈케익

				}

				
				
				
				if(choice ==2) {
					coff.cof.get(7).Buy(); //초코케익
				}//케익끝

				
				
				
			}else if(choice ==4) { //구매한 커피 값 출력
				System.out.println("구매하신 커피 가격은");

				for(int i=0;i<coff.cof.size();i++) 
				{
					coff.cof.get(i).totalprint();
				}
				coff.Allsum();
				coff.TotalStamp();
				coff. SumStamp();

				
			
		}
	}
}
}