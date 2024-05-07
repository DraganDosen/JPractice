package Pages;

public class practice1 {
	
	public static int find(int param){
		int a= param;
		int sum =0;
		int b;
		System.out.println(a);
		
		
	   
	  System.out.println(a);
		//int sum = b+c;
		while (a != 0) {
		  b = a%10;
           a = a/10;
           System.out.println("a is: "+a);
           System.out.println("b is: "+b);
           sum = sum +b;
           System.out.println("sum is: "+sum);
           
		}
		return (sum);
		
		
	};

	public static void main(String[] args) {
		
		//System.out.println("Hello World");
		int a =293;
		find(a);
		System.out.println(find(a));
		// TODO Auto-generated method stub
	}
    
	}


