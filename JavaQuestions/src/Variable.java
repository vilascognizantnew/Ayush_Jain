
public class Variable {
		   int Variable;
		   static int data = 30;
		   public int id=10;
		   public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		 static void myMethod(String name) {
			    System.out.println(name + " Method Parameter");
		 }
		public static void main(String args[]){
		      int a = 100;
		      Variable obj = new Variable();
		      
		      System.out.println("Value of instance variable Variable: "+obj.Variable);
		      System.out.println("Value of static variable data: "+obj.data);
		      System.out.println("Value of local variable a: "+a);
		   
		   }
		}

