package exceptiondemo;

public class Demo2  extends Demo1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
		   
          Demo2 demo2=new Demo2();
          try {
			demo2.method2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getClass());
		}
	}
	
	
	
	public void method2 () throws Exception {
		
		Demo1 demo=new Demo2();
		demo.method1();
		
	}

}
