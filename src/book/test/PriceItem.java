package book.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PriceItem {
	private double moneyCount;
	private Date date;
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getMoneyCount() {
		return moneyCount;
	}

	public void setMoneyCount(double moneyCount) {
		this.moneyCount = moneyCount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public PriceItem() {
		super();
	}

	public void showItem(Book b) {
		System.out.println(b.getBooksId() + "\t\t" + b.getPrice() + "\t\t" + num + "\t\t" + b.getPrice() * this.num);
	}

	public void outputItem(ArrayList<Book> al) {
		// ����嵥
		Items i = new Items();
		int aa = 1;
		System.out.printf("�����ţ�%05d", aa);
		System.out.println();
		System.out.println("���" + "\t" + "����" + "\t" + "��Ǯ" + "\t" + "����");
		System.out.println("---------------------------------");
		double money = i.showArray2(al);
		System.out.println("---------------------------------");
		System.out.println("�ܽ�\t\t" + money);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� hh:MM:ss");
		Date date=new Date();
		System.out.println("��ǰʱ�䣺" + sdf.format(date));
	}

	public void inputItem(ArrayList<Book> al) {
		Scanner sc = new Scanner(System.in);
		for (int j = 0; j < 4; j++) {
			//Items i1 = new Items();
			System.out.println("����������ͼ��ı�ţ�");
			int id = sc.nextInt();
			int[] number = new int[4];
			if (id == al.get(id).getBooksId()) {
				System.out.println("�����빺������");
				number[j] = sc.nextInt();
				al.get(j).setCount(number[j]);
				//i1.showItem(al);
			}
		}
		sc.close();
	}
}
