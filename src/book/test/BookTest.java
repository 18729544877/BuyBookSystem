package book.test;

import java.util.ArrayList;

public class BookTest {
	public static void main(String[] args) {
	//���Student��ļ���
		ArrayList<Book> al = new ArrayList<Book>();
		al.add(new Book(0, "����", 23.4, 130));
		al.add(new Book(1, "��ѧ", 63.4, 130));
		al.add(new Book(2, "Ӣ��", 33.4, 130));
		al.add(new Book(3, "��ѧ", 53.4, 130));

		Items i = new Items();
		System.out.println("ͼ����" + "\t" + "ͼ������" + "\t" + "ͼ��۸�" + "\t" + "ͼ����");
		System.out.println("-----------------------------------");
		i.showItem(al);//ͼ���б�
		System.out.println("-----------------------------------");
		PriceItem p = new PriceItem();
		p.inputItem(al);
		p.outputItem(al);
	}

}
