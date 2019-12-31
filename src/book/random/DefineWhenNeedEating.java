package book.random;

import java.util.Random;
import java.util.Scanner;

public class DefineWhenNeedEating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {1,2,3,4,5,6,7};
        System.out.println("�������ڼ��� (1,2,3,4,5,6,7)");
        Scanner scan = new Scanner(System.in);
        String str = new String(arr);
        System.out.println(str);
        int inputInt = scan.nextInt();
        while(str.indexOf(inputInt) > -1) {
        	Random random = new Random();
        	if(random.nextInt() == inputInt) {
        		System.out.println("�׷�");
        	}else if(random.nextInt() > inputInt) {
        		System.out.println("����");
        	}else if(random.nextInt() < inputInt) {
        		System.out.println("����");
        	}
        }
        //System.out.println("���֣�");
	}

}
