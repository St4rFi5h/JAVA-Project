public class CoffeeData {
	int price;
	int count;
	int sum=0; //기준
	int allprice; //총가격
	int stamp; //도장
	String name; //음료 이름

	public CoffeeData() { //생성자
		
	}


	public CoffeeData(String name,int price) {  //변수 받아오기
		this.name=name;
		this.price =price;


	}

	public int getStamp() {
		return stamp;
	}


	public void setStamp(int stamp) {
		this.stamp = stamp;
	}


	public CoffeeData(int count) { //도장, 수량을위한 카운트 
		this.count=count;


	}


	@Override
	public String toString() {
		return name+" "+(allprice/price)+"잔  "+allprice+" 원";
	}



}