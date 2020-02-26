package mergesort;

/**
 *
 * @author hungle
 */
public class MergeSort {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		Comparable[] a = {'M', 'E', 'R', 'G', 'E'};
		
		Merge.merge_sort(a); 
		
		display_array(a); 
		
	}
	
	public static void display_array(Comparable[] a) {
		
		System.out.println("******** DISPLAY ARRAY ********");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("******** END OF ARRAY ********");
		
	}
	
}
