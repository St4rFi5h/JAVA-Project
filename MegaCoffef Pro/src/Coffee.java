import java.util.Scanner;
public class Coffee {
	Scanner sc = new Scanner(System.in); 
	public int hot=1500,ice=2000,moka=2500,kara=2500;  //커피가격
	public int ysm=3000,ssm=3500; //요거트가격
	public int ycake=5000,bcake=5000; //케익가격
	public int count=0; //주문갯수
	public int sum; //합계
	public int choice; //주문갯수선택
	public int cupon=0;
	public int stamp=0;
	public int hotSum,iceSum,mokaSum,karaSum,ysmSum,smmSum,ycakeSum,bcakeSum; //음류 각각 합계
	/// 클래스배열각 개간절 
	
	public Coffee() { //생산자

	}
	public void HA() { //아메리카노
		System.out.println("몇개주문하겠습니까?");
		count=sc.nextInt();
		this.hotSum=hot*count;
		this.count+=count;
		this.sum+=hotSum;
		System.out.println(hotSum);
	}


	public void IA() { //아이스아메리카노
		System.out.println("몇개주문하겠습니까?");
		count=sc.nextInt();
		this.iceSum=ice*count;
		this.count+=count;
		this.sum+=iceSum;
		System.out.println(iceSum);
	}


	public void Mo() { //모카라떼
		System.out.println("몇개주문하겠습니까?");
		count=sc.nextInt();
		this.mokaSum=moka*count;
		this.count+=count;
		this.sum+=mokaSum;
		System.out.println(mokaSum);
	}

	public void Ka() { //카라멜마끼야또
		System.out.println("몇개주문하겠습니까?");
		count=sc.nextInt();
		this.karaSum=kara*count;
		this.count+=count;
		this.sum+=karaSum;
		System.out.println(karaSum);

	}
	public void Ys() {  //요커드

	}

	public void Ss() { //딸기요거트

	}



	public void Ck() { //치즈케익

	}


	public void Cok() { //초코케익

	}
	public void Print() { //최종주문단계
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓최종주문〓〓〓〓〓〓〓〓〓〓〓");
		if(hotSum !=0) 
			System.out.println("아메리카노: "+(hotSum/hot)+"잔  "+hotSum+" 원");
		if(iceSum !=0) 
			System.out.println("아이스 아메리카노: "+(iceSum/ice)+"잔  "+iceSum+" 원");
		if(mokaSum !=0) 
			System.out.println("카페모카: "+(mokaSum/moka)+"잔  "+mokaSum+" 원");
		if(karaSum !=0) 
			System.out.println("카라멜마끼야또: "+(karaSum/kara)+"잔  "+karaSum+" 원");

			System.out.println("총"+sum+"원 입니다.");
			System.out.println("회원이십니까?");
			choice=sc.nextInt();
			
			this.stamp=count;
			System.out.println("적립 스탬프는"+stamp);
			cupon = stamp/3;
			System.out.println("사용가능쿠폰은"+cupon+" 개입니다.");
	}


}
