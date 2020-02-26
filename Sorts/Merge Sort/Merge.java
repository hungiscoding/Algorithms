package mergesort;

/**
 *
 * @author hungle
 */
public class Merge {
	
	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
//		assert isSorted(a, lo, mid); 
//		assert isSorted(a, mid, hi); 
		
		// Copy to auxiliary array
		for (int k = lo; k <= hi; k++) {
			aux[k] = a[k]; 
		}

		// Merge
		int i = lo, j = mid + 1; 
		for (int k = lo; k <= hi; k++) {
			if (i > mid)					a[k] = aux[j++]; 
			else if (j > hi)				a[k] = aux[i++]; 
			else if (less(aux[j], aux[i]))	a[k] = aux[j++]; 
			else							a[k] = aux[i++]; 
		}	

//		assert isSorted(a, lo, hi);
	}

	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
		
		int mid = lo + (hi - lo)/2; 
		
		// Recursion return case (list contain only one element)
		if (lo >= hi) return; 
		
		// Sort two halves then merge
		sort(a, aux, lo, mid);
		sort(a, aux, mid + 1, hi); 
		merge(a, aux, lo, mid, hi); 
	}
	
	public static void merge_sort(Comparable[] a) {
		Comparable[] aux = new Comparable[a.length]; 		
		sort(a, aux, 0, a.length - 1); 
		
	}
	
	private static boolean less(Comparable comparable0, Comparable comparable1) {
		return comparable0.compareTo(comparable1) <= 0; 
	}
	
}
