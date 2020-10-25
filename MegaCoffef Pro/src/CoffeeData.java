import java.util.Scanner;
public class CoffeeData {
	int price;
	int count;
	int sum=0; 
	int allprice; //총가격
	int stamp; //도장
	String name; //음료 이름

	public CoffeeData() { //생성자
		Buy();
	}


	public CoffeeData(String name,int price) {  //변수 받아오기
		this.name=name;
		this.price =price;


	}

	public CoffeeData(int count) { //도장, 수량을위한 카운트 
		this.count=count;


	}
	void Buy() { //구매를 하기위한 메소드    //데이터에는 데이터만 있어야하는데 메소드가있다 
		Scanner scan = new Scanner(System.in);	
		System.out.println("몇개주문하겠습니까?");
		count=scan.nextInt();
		this.sum+=count;
		this.allprice=price*count;
		this.stamp+=count;

	}


	void totalprint(){  //구매한 가격에대한 출력메소드
		if(allprice !=0) 
			System.out.println(name+" "+(allprice/price)+"잔  "+allprice+" 원");

	}



}