
public class InsertPositionSearch {

	public static void main(String... args) {
		int[] array1 = new int[] {1, 2, 3, 4, 5, 6};
		int[] array2 = new int[] {1, 3, 5, 7};
		int[] array3 = new int[] {1, 3, 10, 15};
		int element = 2;
		
		System.out.println("The elements position is : "+findInsertionPosition(array1, element));
		System.out.println("The elements position is : "+findInsertionPosition(array2, element));
		System.out.println("The elements position is : "+findInsertionPosition(array3, 17));
	}

	private static int findInsertionPosition(int[] array, int ele) {
		int position = -1, i=0;
		
		for(i=0; i<array.length; i++) {
			if(array[i] >= ele) {
				position = i;
				break;
			}
		}
		if((i == array.length) && (position == -1))
			position = array.length;
		return position;
	}
}
