
public class Fibonacci {

	public static void main(String[] args) {
		int fn, sn, next, limit;
		limit=10;
		fn=0;
		sn=1;
		System.out.println(fn+" "+sn);
		for(int i=3; i<=limit; i++)
		{
			next=fn+sn;
			System.out.println(" "+next);
			fn=sn;
			sn=next;
		}

		
	}

}
