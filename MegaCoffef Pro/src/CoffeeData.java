import java.util.Scanner;
public class CoffeeData {
	int price;
	int count;
	int sum=0;
	
	String name;

	
	Scanner scan = new Scanner(System.in);	
	public CoffeeData(String name,int price) {
		System.out.println("몇개를 주문하겠습니까?");
		count=scan.nextInt();
		this.sum+=count;
		
		
	}
	
	
	
	
	
	
	
}
