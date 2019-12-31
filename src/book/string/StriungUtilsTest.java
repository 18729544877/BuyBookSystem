package book.string;

public class StriungUtilsTest {
	public static void main(String[] args) {

		int intValue = 12;
		System.out.println(String.valueOf(intValue));

		System.out.println("���ֶ�Ӧ��ANsCII��ֵ��");
		char[] chs = "134684646aAzZ".toCharArray();
		for (char ch : chs) {
			System.out.println(String.valueOf(ch) + "-->" + (int) ch);
		}
		
		
		System.out.println("String :" + String.valueOf(true));
		System.out.println(true);
	}
	
}
