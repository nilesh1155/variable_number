package Method_Use;

public class MethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShowMehod.base();
		
		MethodEx me=new MethodEx();
		me.alpha();
				
	}
	
	public void alpha()
	{
		float a= 2, b= 5;
		double c, d;
		c=a*b;
		d=a/b;
		System.out.println("multiplication is "+c+"  "+d);
System.out.println("alpha rays started");
	}

}
