
public class NestedLoop {

	public static void main(String[] args) {
		
		int i, j, k;
		
		for(i=1; i<=10; i++) {
			for(k=i; k<=10; k++) {
				System.out.print(" ");
			}
			    for(j=1; j<=i; j++) {
				   System.out.print(j+" ");
			    } 
			System.out.println();
		}
	}
}
      