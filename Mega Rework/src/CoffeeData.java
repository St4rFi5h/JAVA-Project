public class CoffeeData {    //각 주문 메뉴 에대한 클래스 
	int price; //음료 가격
	int allprice; //총가격  (이클래스에서 빠저야하는 변수 목적에 맞지않음)
	String name; //음료 이름

	public CoffeeData() { //생성자
		
	}


	public CoffeeData(String name,int price) {  //변수 받아오기
		this.name=name;
		this.price =price;


	}




	@Override
	public String toString() {
		return name+" 주문갯수 "+(allprice/price)+" 가격 "+allprice+" 원";
	}



}