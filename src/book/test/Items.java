package book.test;

import java.util.ArrayList;
import java.util.Iterator;

public class Items {
public void showItem(ArrayList<Book> al) { 
         Iterator<Book> ite = al.iterator();
         while(ite.hasNext()) {
        	Book b = ite.next();
        	 System.out.println(b.getBooksId()+"\t"+b.getName()+"\t"+b.getPrice()+"\t"+b.getCount());
         }
}

public double showArray2(ArrayList<Book> al) {
	double money=0;
	Iterator<Book>   ii = al.iterator();
	while(ii.hasNext()) {
		Book b = ii.next();
		money+=b.getPrice()*b.getCount();
		System.out.println(b.getBooksId()+"\t"+b.getName()+"\t"+b.getPrice()+"\t"+b.getCount());
	}
	return money;
}

}
