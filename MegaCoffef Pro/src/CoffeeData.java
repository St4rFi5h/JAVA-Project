import java.util.Scanner;
public class CoffeeData {
	int price;
	int count;
	int sum=0;
	
	String name;

	
	Scanner scan = new Scanner(System.in);	
	public CoffeeData(String name,int price) {
		System.out.println("��� �ֹ��ϰڽ��ϱ�?");
		count=scan.nextInt();
		this.sum+=count;
		
		
	}
	
	
	
	
	
	
	
}
