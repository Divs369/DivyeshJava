/*
 * Collection : It is a group of data.(One object contains another object).
 * It is like structure in C programming.
 * All interfaces belongs to java.util package
 * 
 * Arraylist: It works similar like Array ,but it is not an array.
 *            Array stores data of same type,but Arraylist stores data of Multiple types.
 *            Arraylist is Dynamic.
 *            It stores Duplicate value also.
 *            It follows Sequential order.
 * 
 */

package OOP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("tops");
		al.add(10);
		al.add(10.10);
		al.add("t");
		al.add(true);
		al.add(10);
		al.add(null);
		System.out.println(al);

		System.out.println(al.size());
		System.out.println(al.indexOf(true));
		System.out.println(al.isEmpty());
		al.remove(4);
		System.out.println(al);
		al.add(true);
		System.out.println(al);
		al.set(6, 1);
		System.out.println(al);

		Iterator itr = al.iterator();
		System.out.println("\nUsing Iterator : Top to Bottom");

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		ListIterator litr = al.listIterator();
		System.out.println("\nUsing List Iterator : Top to Bottom");

		while (litr.hasNext()) {
			System.out.println(litr.next() + "tops");
		}

		System.out.println("\nUsing List Iterator : Bottom to Top");

		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

	}

}
