import java.util.Random;

public class BubbleSort {
	/** Bubble Sort'a ilk elemandan başlayıp ikişer ikişer kıyaslama yapıyoruz
		İlk iki kıyaslanan elemandan küçük olan büyük olan ile yer değiştiriyor.
	*/
	
	private static void writeArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void main(String[] args) {
		
		int temp;
		int [] arr = new int[10];
		Random random = new Random();
		
		//Diziye rastgele elemanlar atıyoruz
		for(int i=0;i<arr.length;i++)
			arr[i] = random.nextInt(100);
		writeArray(arr);
		System.out.println();
		
		//Diziyi Bubble Sort kullanarak sıralıyoruz
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		writeArray(arr);
		
	}

}
