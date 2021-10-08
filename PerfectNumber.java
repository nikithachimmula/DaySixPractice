
public class PerfectNumber {

	public static void main(String[] args) {
	  int n,s;
	  s=0;
	  n=8;
	  for(int i=2; i<n; i++)
	  {
		   
			  if(n%i==0)
			  {
		  s=s+i;
	  }
if(n==s)
{
	System.out.println(n+" perfect number");
	
}
else
{
	System.out.println(n+" not perfect number");
}
	}

	}
}
