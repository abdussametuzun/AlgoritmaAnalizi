
public class SelectionSort {
	/**
	 *  Listeyi tararız ve ilk bulduğumuz en küçük elemanı listenin ilk sırasına daha sonra
	 *  bulduğumuz en küçük elemanı ikinci sırasına ekler ve böyle devam ederiz
	 * 
	 */
	
	private static int[] selectionSort(int [] arr)
	{
		int smallest;
		int temp;

		for(int i=0;i<arr.length;i++)
		{	
			smallest=i;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[smallest] > arr[j]) 
					smallest=j;
			}
				temp = arr[i];
				arr[i] = arr[smallest];
				arr[smallest] = temp;

			writeArray(arr);
			if(IsItSort(arr))
				break;
		}
		
		return arr;
	}
	
	private static boolean IsItSort(int [] arr)
	{	
		boolean control = false;
		for(int i = 0;i<arr.length-1;i++)
			if(arr[i]>arr[i+1])
				control = true;
		
		if(control)
			return false;
		return true;
	}
	
	private static void writeArray(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+ " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4,9,1,6,8,7,5,2};
		writeArray(arr);
		selectionSort(arr);
		System.out.println();
		
	}

}
