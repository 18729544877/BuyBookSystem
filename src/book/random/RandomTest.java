package book.random;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Random test is starting !!");

		Random random = new Random();
		// random.setSeed(100);

		System.out.println(random.nextInt(10));
		System.out.println(random.nextGaussian());

		int randoms[] = new int[10000];
		for (int i = 0; i < 10000; i++) {
			randoms[i] = random.nextInt(10000);
		}

		// �����ظ���
		
		  Map map = new HashMap<Integer, Integer>(); map = countRepeatNumber(randoms,
		  map); 
		  outputMap(map);
		 

		//outputThreeArno();
	}

	private static void outputMap(Map<Integer, Integer> map) {
		// TODO Auto-generated method stub
		for (int key : map.keySet()) {
			int value = map.get(key);
			if (value >= 5) {
				System.out.println("=================================");
				System.out.println("key:" + key + "�������� ��ʤ����");
				outputThreeArno();
				System.out.println("=================================");
			}
			System.out.println("key:" + key + ", ������" + value + "��");
		}
	}

	private static void outputThreeArno() {
		// TODO Auto-generated method stub
		int m = 3;// ����λ�ƵĿ��
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < (10 - 1) - i + (m); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static Map<Integer, Integer> countRepeatNumber(int[] randoms, Map<Integer, Integer> map) {
		// TODO Auto-generated method stub
		for (int ran : randoms) {
			if (map.containsKey(ran)) {
				map.put(ran, ((int) map.get(ran)) + 1);
			} else {
				map.put(ran, 1);
			}
		}
		return map;
	}
}
