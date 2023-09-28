class P17
{
	public static void main(String args[])
	{
		int p,r,n,si;
		System.out.print("Enter Amount ::");
		p = Integer.parseInt(System.console().readLine());
		System.out.print("Enter Rate of Amount ::");
		r = Integer.parseInt(System.console().readLine());
		System.out.print("Enter Number of Year ::");
		n = Integer.parseInt(System.console().readLine());

		si = p*r*n/100;	
		
		System.out.println("simple Intrest is  ::"+si);
	}
}