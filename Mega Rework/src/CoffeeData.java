public class CoffeeData {    //각 주문 메뉴 에대한 클래스 
	int price; //음료 가격
	int allprice; //총가격
	String name; //음료 이름

	public CoffeeData() { //생성자
		
	}


	public CoffeeData(String name,int price) {  //변수 받아오기
		this.name=name;
		this.price =price;


	}




	@Override
	public String toString() {
		return name+" "+(allprice/price)+"잔  "+allprice+" 원";
	}



}