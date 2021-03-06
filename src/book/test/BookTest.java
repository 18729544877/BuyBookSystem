package book.test;

import java.util.ArrayList;

import book.test.showName.ShoeName;
/**
 * 测试开始
 * @author Administrator
 *
 */
public class BookTest {
	public static void main(String[] args) {
	//添加Student类的集合
		ArrayList<Book> al = new ArrayList<Book>();
		al.add(new Book(0, "语文", 23.4, 130, "借阅"));
		al.add(new Book(1, "数学", 63.4, 130, "卖出"));
		al.add(new Book(2, "英语", 33.4, 130, "借阅"));
		al.add(new Book(3, "化学", 53.4, 130,  "卖出"));

		Items i = new Items();
		System.out.println("图书编号" + "\t" + "图书名称" + "\t" + "图书价格" + "\t" + "图书库存" + '\t' + "作用");
		System.out.println("-----------------------------------");
		i.showItem(al);//图书列表
		System.out.println("-----------------------------------");
		PriceItem p = new PriceItem();
		p.inputItem(al);
		p.outputItem(al);
		ShoeName.showName();
	}
	/**
	 * 测试结束
	 */
}
