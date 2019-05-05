
public class InsertionSort {
		
/* Bu sıralama algoritmasında verilen array ilk elemandan itibaren bir sonraki 
 * elemanla kıyaslanmaya başlar. Eğer kendinde küçük bir eleman denk gelirse. O denk gelen küçük
 * eleman kendinden öncekilerle kıyasalanarak doğru yere yeleştirilmeye çalışılır.
 * 
 * for instance;
 * 	30 10 40 20 (30 >? 10) Evet (10 ile 30 yer değiştirir)
 *  10 30 40 20 (30 >? 40) Hayır
 *  10 30 40 20 (30 >? 20) Evet (20, 40'dan küçük mü? evet yer değiştir.)
 *  10 30 20 40 (20 <? 30) Evet (20 ile 30u yer değiştir)
 *  10 20 30 40 (20 <? 10) Hayır 
 * 
 */
	private static void insertionSort(int [] arr)
	{
		int temp=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i] > arr[i+1] )
			{
				for(int j=i;j>=0;j--)
				{
					if(arr[j+1] < arr[j])
					{
						temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
		}
	}
	
	private static void insertionSortTwo(int[] arr)
	{	
		int key;
		int j;
		for(int i=2;i<arr.length;i++)
		{
			key = arr[i];
			j = i-1;
			
			while( j>0 && arr[j]>key)
			{
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
	
	private static void writeArray(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+ " ");
		System.out.println();
	}

	
	public static void main(String[] args) 
	{
		
		int [] arr = {17,8,45,21,3,41,61,5,90};
		insertionSort(arr);
		writeArray(arr);
	}

}
