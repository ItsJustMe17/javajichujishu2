package javajichu_3;

import java.util.Scanner;

public class Qianqiu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("�����뿼���Ա���/Ů����");
		String sex=sc.next();
		System.out.println("�����뿼���ɼ���");
		double cg=sc.nextDouble();
		double mark=0;
//		�ַ�����ֵ�ȽϵĵĴ��룬ע��Ҫʹ��.equals ����
		if(sex.equals("��")) {
			if(cg>=9) {
				mark=10;
			}else if(cg>=8.2) {
				mark=9;
			}else if(cg>=7.5) {
				mark=8;
			}else if(cg>=6.5) {
				mark=7;
			}else if(cg>=5.5) {
				mark=6;
			}else {
				mark=5;
			}
		}else {
			if(cg>=8) {
				mark=10;
			}else if(cg>=7) {
				mark=9;
			}else if(cg>=6) {
				mark=8;
			}else if(cg>=5) {
				mark=7;
			}else if(cg>=4.2) {
				mark=6;
			}else {
				mark=5;
			}
		}
		System.out.println("��"+sex+"�ɼ�Ϊ��"+mark);
	}

}
