//import java.util.Date;
import java.util.*;

public class DataType
{
	//main
	public static void main(String[] b)
	{
		//������
		Date d=new Date(); // java.util��Ű���� �ִ� Ŭ����
		System.out.println(d);
		// float(4byte) < double(8byte)����Ʈ
		// float: �ܹ����� �Ҽ������� 7�ڸ� ����
		// double: �����е� �Ҽ������� 15~17�ڸ� ����
		float ft1=12.34F;
		//float�� �ε��Ҽ����� ��� �ݵ�� ���̻� f�� �ٿ��־�� �Ѵ�.
		System.out.println(ft1);
		float ft2=321; //321.0
		System.out.println(ft2);
		//���θ��: ���� �ڷ������� ū �ڷ������� �ڵ����� ����ȯ�� �Ͼ�� ��
		//byte < short < int < long < float < double
		//		 char  < 

		double d1=100.123456789111;
		System.out.println(d1);		
		//System.out.println(d2); //9.0
		//������ ���� ǥ���: e+4==> 10^4, e-4==>10^-4
		double d3=200e-4; //200*1/10000
		System.out.println(d3);		

		float ft3=200e+4f; //200*10000
		System.out.println(ft3);	

		float ft4=3.69f;
		int k=(int)ft4; //casting(��������ȯ): ū�ڷ����� ���� �ڷ������� ��ȯ�ϰ��� �� �� ���
		//����=(�ڷ���)�� => ����: ���� �ս��� �߻��� �� �ִ�.
		System.out.println(ft4);
		
		byte x=(byte)128;
		System.out.println(x);
		
		//������: character => char: ����1���� ������ �� �ִ� (�⺻�ڷ���) '��'
		//���ڿ�: string => ���� �������� ������ �� �ִ�. (������) "���ڿ�"
		//char(2byte): 0~2^16-1 => 0~65535
		//short(2byte): =2^15~2^15-1
		char ch='A';
		//char ch2='AB'; [x]
		String str="AB";
		System.out.println(ch);
		System.out.println(str);
		char ch3='��';
		char ch4='\uff57';
		System.out.println("ch3="+ch3);//���ڿ��� +�����ڸ� ����ϸ� ���ڿ� ������ �Ͼ��.
		System.out.println("ch4="+ch4);

		System.out.println("4.���� -boolean");
		//boolean(1): true, false���� ���´�.
		boolean bool=true;
		boolean bool2=2>5;
		System.out.println("bool="+bool);
		System.out.println("bool2="+bool2);
		//int a=(int)bool;[x] //�ڹ��� ������ ����ȯ �� �� ����. 0�̳� 1�� ȣȯ���� �ʴ´�.

		/* int�� �̸��� �ڷ��� �����͵��� ���꿡 ���� ��� �� ����� int������ �ڵ�����ȯ�� �Ͼ��.
			byte
			short
			char
		*/

	byte m1=1;
	byte m2=2;
	//byte result=m1+m2;
	int resual=m1+m2;
	//System.out.println("result="+result);

	char c='A';
	System.out.println(c); //A
	System.out.println((char)(c+1)); //66
	//B�� ��µǵ��� �غ�����

	//�������� 2-1 8�� �⺻�� �˸��� �ڸ��� ����
	//�������� 2-2 �ֹε�Ϲ�ȣ ��������
	String regNo="9701252222222";
	System.out.println(regNo); 
	//�������� 2-3 ��°��
	System.out.println("1"+"2"); //12
	System.out.println(true+""); //true
	System.out.println('A'+'B'); //131
	System.out.println('1'+2); //51
	System.out.println('1'+'2'); //99
	System.out.println('j'+"ava"); //java
	System.out.println("A"+"B"); //AB
	//System.out.println(true+null); //����
	}
}