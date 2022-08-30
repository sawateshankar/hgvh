package practicecode;

public class BubbleSort2 {

	public static void main(String[] args) {

		String[] a= {"shankar","deep","arjun","mahaveer"};
	String temp;
		
		for(int i=0;i<a.length;i++)
		{
		
		int falg=0;
		for(int j=0;j<a.length-1-i;j++)
			{
		if(a[j].compareTo(a[j+1])>0)
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					falg=1;
				}
			}
		if(falg==0) {
			break;
		}
		}
		
		for(int i=0;i<a.length;i++)
		{
		System.out.println(""+a[i]);	
		}
		
	}

}

