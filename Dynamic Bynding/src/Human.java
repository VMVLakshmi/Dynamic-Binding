
public class Human {
	public void walk()
	   {
	       System.out.println("Human walks");
	   }
	}
	class Demo extends Human{
	   //Overriding Method
	   public void walk(){
	       System.out.println("Boy walks");
	   }
	   public static void main( String args[]) {
	    
	       Human obj = new Demo();
	  
	       Human obj2 = new Human();
	       obj.walk();
	       obj2.walk();

}
}