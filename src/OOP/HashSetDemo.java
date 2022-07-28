/*
 * HashSet : It internally implements Set interface and extends 
 *           Set abstract class.
 *         : HashSet internally works with HashTable.
 *         : It does not maintain the Insertion order.
 *         : No Duplicate Values allowed in HashSet. 
 * 
 */

package OOP;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add(10);
		hs.add("tops");
		hs.add("t");
		hs.add(10.10);
		hs.add(true);
		hs.add(null);
		hs.add(10);

		System.out.println(hs);

	}

}
