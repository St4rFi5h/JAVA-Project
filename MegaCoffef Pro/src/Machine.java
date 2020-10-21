import java.util.Scanner;

public class Machine  {
	int count;
	int choice;
	Coffee cof =new Coffee(); //커피 값 저장되어있는곳
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
				//while(true) {  //커피 무한 
					System.out.println("===커피===");
					System.out.println("1. 아메리카노");
					System.out.println("2. 아이스 아메리카노");
					System.out.println("3. 카페모카");
					System.out.println("4. 카라멜마끼야또");
					System.out.println("5. 뒤로가기");

					choice=sc.nextInt();
					if(choice ==1) {
						cof.HA(); //아메리카노
					}

					if(choice ==2) {
						cof.IA(); //아이스아메리카노
					}

					if(choice ==3) {
						cof.Mo();//모카라떼
					}

					if(choice ==4) {
						cof.Ka();//카라멜 마끼야또
					} ///커피끝
					//else {
						//return; ///어디로 가는교 ;; 

					//}
				//}
			}else if(choice ==2) { //스무디시작
				System.out.println("===스무디===");
				System.out.println("1. 요거트 스무디");
				System.out.println("2. 딸기 스무디");
				if(choice ==1) {
					cof.Ys();
				}

				if(choice ==2) {
					cof.Ss();
				}//스무디끝

			}else if(choice ==3) { //케이크시작
				System.out.println("===케이크===");
				System.out.println("1. 치즈케익");
				System.out.println("2. 초코케익");
				if(choice ==1) {
					cof.Ck(); //치즈케익

				}

				if(choice ==2) {
					cof.Cok(); //초코케익
				}//케익끝

			}else if(choice ==4) {
				System.out.println("총가격"+cof.sum);
				cof.Print(); //최종 계산서
			}





			continue;
		}
	}
}

