package code.string;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

/**
 * 还是不太明白Formatter的格式
 * @author CCC
 *
 */
public class Receipt {
	private double total = 0;
	private Formatter f = new Formatter(System.out);

	private void printTitle() {
		f.format("%-15s %-8s %-5s\n", "item", "qty", "price");
		f.format("%-15s %-8s %-5s\n", "---", "---", "---");
	}

	private void print(String name, int qty, double price) {
		f.format("%-15s %-8d %-5.2f\n", name, qty, price);
		total += price;
	}

	private void printTotal() {
		f.format("%-15s %-8s %-5s\n", "---", "---", "Total");
		f.format("%-15s %-8s %-5f\n", "---", "---", total);
	}

	public static void main(String args[]){
		Receipt receipt= new Receipt();
		receipt.printTitle();
		receipt.print("zhangkang", 5, 1300.115);
		receipt.print("jiran", 15, 8896.2);
		receipt.print("zhangkang", 5, 1300.115);
		receipt.print("jiran", 15, 8896.2);
		receipt.printTotal();
		
		
		
		StringBuilder sb = new StringBuilder();
		Formatter formatter = new Formatter(sb, Locale.US);
		
		formatter.format("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d");
		System.out.println(sb);
		System.out.format("Local time: %tT", Calendar.getInstance());


	}
}
