import java.util.StringTokenizer;

class IPCutter{
    public void IPCutterMethod1(String s)
	{
		String ip = s;
		int counter=0;
		
		
		
		
		while (counter<4)
		 {
			int i = ip.indexOf(".");
			if (i==-1)
		        {
				s=ip.substring(0);
				System.out.println(s);
				}	
			else
			    {
				s=ip.substring(0,i);
				System.out.println(s);
		    	ip=ip.substring(i+1);
				}
			counter++;
		 }
	}
	public void IPCutterMethod2(String s)
	{
	
         StringTokenizer token = new StringTokenizer(s,".");
		 
		     while(token.hasMoreElements())
			 {
			 	System.out.println(token.nextToken());
			 }
		 		       
          
	}
	public void IPCutterMethod3(String s)
	{
	
        for (String splitted : s.split("\\."))
	    	{
			    System.out.println(splitted);
		    }
		 		       
          
	}
	
	public static void main(String []args)
	{
	
		IPCutter obj1=new IPCutter();
		
		System.out.println("METHOD ONE\n");
		obj1.IPCutterMethod1(args[0]);
		
		System.out.println("\nMETHOD TWO\n");
		obj1.IPCutterMethod2(args[0]);
		
		System.out.println("\nMETHOD THREE\n");
		obj1.IPCutterMethod3(args[0]);
		
	}
}