/*
 * HashMap : It implements Map interface.
 *         : It internally uses HashSet.
 *   Imp   : It works with Key and Value Pair.
 *         : Every Key is unique.
 *         : To access Values, it can accessed through Key
 *         : No Duplicate Keys. 
 *           
 */

package OOP;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put(1, "Jack");
		hm.put(2, "Jill");
		hm.put(3, "Jane");
		hm.put(4, "John");
		hm.put(5, "James");

		System.out.println(hm);
		System.out.println(hm.get(5));
		System.out.println(hm.remove(4));
		System.out.println(hm);

	}

}
