import java.util.Scanner;
public class Coffee {
	Scanner sc = new Scanner(System.in); 
	public int hot=1500,ice=2000,moka=2500,kara=2500;  //Ŀ�ǰ���
	public int ysm=3000,ssm=3500; //���Ʈ����
	public int ycake=5000,bcake=5000; //���Ͱ���
	public int count=0; //�ֹ�����
	public int sum; //�հ�
	public int choice; //�ֹ���������
	public int cupon=0;
	public int stamp=0;
	public int hotSum,iceSum,mokaSum,karaSum,ysmSum,smmSum,ycakeSum,bcakeSum; //���� ���� �հ�
	/// Ŭ�����迭�� ������ 
	
	public Coffee() { //������

	}
	public void HA() { //�Ƹ޸�ī��
		System.out.println("��ֹ��ϰڽ��ϱ�?");
		count=sc.nextInt();
		this.hotSum=hot*count;
		this.count+=count;
		this.sum+=hotSum;
		System.out.println(hotSum);
	}


	public void IA() { //���̽��Ƹ޸�ī��
		System.out.println("��ֹ��ϰڽ��ϱ�?");
		count=sc.nextInt();
		this.iceSum=ice*count;
		this.count+=count;
		this.sum+=iceSum;
		System.out.println(iceSum);
	}


	public void Mo() { //��ī��
		System.out.println("��ֹ��ϰڽ��ϱ�?");
		count=sc.nextInt();
		this.mokaSum=moka*count;
		this.count+=count;
		this.sum+=mokaSum;
		System.out.println(mokaSum);
	}

	public void Ka() { //ī��Ḷ���߶�
		System.out.println("��ֹ��ϰڽ��ϱ�?");
		count=sc.nextInt();
		this.karaSum=kara*count;
		this.count+=count;
		this.sum+=karaSum;
		System.out.println(karaSum);

	}
	public void Ys() {  //��Ŀ��

	}

	public void Ss() { //������Ʈ

	}



	public void Ck() { //ġ������

	}


	public void Cok() { //��������

	}
	public void Print() { //�����ֹ��ܰ�
		System.out.println("�����������������ֹ�������������");
		if(hotSum !=0) 
			System.out.println("�Ƹ޸�ī��: "+(hotSum/hot)+"��  "+hotSum+" ��");
		if(iceSum !=0) 
			System.out.println("���̽� �Ƹ޸�ī��: "+(iceSum/ice)+"��  "+iceSum+" ��");
		if(mokaSum !=0) 
			System.out.println("ī���ī: "+(mokaSum/moka)+"��  "+mokaSum+" ��");
		if(karaSum !=0) 
			System.out.println("ī��Ḷ���߶�: "+(karaSum/kara)+"��  "+karaSum+" ��");

			System.out.println("��"+sum+"�� �Դϴ�.");
			System.out.println("ȸ���̽ʴϱ�?");
			choice=sc.nextInt();
			
			this.stamp=count;
			System.out.println("���� ��������"+stamp);
			cupon = stamp/3;
			System.out.println("��밡��������"+cupon+" ���Դϴ�.");
	}


}
