//package my.com;
//[1]��Ű�� ���� package ��Ű����;
import java.lang.System; //java.lang: �⺻��Ű�� import���� ������ �� ����
//[2]import�� import ��Ű����.Ŭ������;

//[3]class����
public class MyDemo
{
	//main()�޼ҵ� �����غ���
	public static void main(String[] args)
	{
		System.out.println("==�ڹ��� �ڷ���==");
		/*������: byte(1) < short(2) < int(4)����Ʈ < long(8)
		  �Ǽ���: float(4) < double(8)����Ʈ
		*/
		byte a=-128; // 1btye => 8bit : -2^7-1 ~ 2^7-1 : -128 ~ 127 
		byte b=127;
		System.out.println(a);
		System.out.println(b);

		short c=128;//2byte=>16bit : -2^15 ~ 2^15-1
		short d=5000;
		System.out.println(c);
		System.out.println(d);

		int e=70000;//4byte=>32bit: -2^31~2^31-1
		System.out.println(e);
	
		long ln=40; //8byte=>64bit: -2^63~2^63-1
		long ln2=40L; //long���� ��� ���̻�(L,1)�� ���� �� �ִ�.
		System.out.println(ln);
		System.out.println(ln2);

		long i= 1000000000; //0�� 9�� ����(2147483648~2147483647)
		long j= 10000000000L; //0�� 10��
		System.out.println(i);
		System.out.println(j);

	}


}