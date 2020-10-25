import java.util.Scanner;

import Shop.CoffeeData;

import java.util.ArrayList;
public class Coffee {
	int alsum=0;
	int alStamp=0;
	Scanner sc = new Scanner(System.in); 

	/// 클래스배열각 개간절 
	ArrayList<CoffeeData> cof = new ArrayList<CoffeeData>();


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

	public void Allsum() {
		for(int i =0; i<cof.size(); i++) {
			alsum+=cof.get(i).allprice;
		}
	}

	public void TotalStamp() { 
		for(int i =0; i<cof.size(); i++) {
			alStamp+=cof.get(i).stamp;
		}
	}
	public void SumStamp() {
		System.out.println("지불하실 총금액은"+this.alsum+" 원 입니다");
		System.out.println("도장은"+this.alStamp +" 개 입니다");

	}


}
