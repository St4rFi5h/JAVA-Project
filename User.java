import java.util.Random;
public class User {
	public String name;
	Random random = new Random();
	int dice1= random.nextInt(5)+1 , dice2= random.nextInt(5)+1;
	int count =0;
	int sum= dice1 + dice2;; 



	public String getName() 
	{
		return name;
	}


	public void setName(String name) 
	{
		this.name = name;

	}


	public void roll() 
	{
		dice1= random.nextInt(5)+1;
		dice2= random.nextInt(5)+1;
	}


	public int getDice1() 
	{

		return dice1;
	}


	public int getDice2() 
	{
		return dice2;
	}



	public void re() 
	{
		sum= dice1 + dice2;
		System.out.println(this.name+": �ֻ�����"+dice1 + ","+dice2+"   ���� :"+sum+"�Դϴ�\n");
	}


}

