
public class PrimeNum {

	public static void main(String[] args) {
		int n=6;
		boolean b=true;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				b=false;
				break;
			}
		}
if(b==true)
{
	System.out.println(n+" is prime");
	
}
else
{
	System.out.println(n+" not prime");
}
}
}

