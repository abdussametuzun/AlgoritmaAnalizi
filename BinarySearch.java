
public class BinarySearch {
	/* Liste sıralı değilse ilk önce küçükten büyüğe doğru sıralarız
	 Daha sonra aranan elemanın dizinin ortasında mı ortanın sağında mı yoksa ortanın solunda mı
	 onu öğrenip. Bulunduğu tarafa doğru aynı işlemler tekrar edilir
	*/
	
	private static boolean binarySearch(int [] arr, int aranan)
	{
		int orta = 0;
		int enbuyukindis = arr.length-1;
		int enkucukindis = 0;
		
		while(enbuyukindis >=enkucukindis)
		{
			orta = (enbuyukindis + enkucukindis )/2;
			
			if(arr[orta] == aranan)
				return true;
			else if(aranan > arr[orta])
				enkucukindis = orta+1;
			
			else if(aranan < arr[orta])
				enbuyukindis = orta-1;
		}
		
		return false;
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {4,9,13,18,25,36,45,51,83,97};
		
		System.out.println(binarySearch(arr, 4));

	}

}
