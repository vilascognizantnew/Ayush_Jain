
public class Student {
    
	    private int id;
	    private String name;
	    private float marks[];
	    private int per;
	    
	    public void init()
	    {
	        this.id=0;
	        this.name="Unknown";
	        this.marks=null;
	    }
	    
	    public void init(int id,String name,float marks[])
	    {
	        this.id=id;
	        this.name=name;
	        this.marks=marks;
	        float avg=0;
	        if(marks!=null) {
	            for(int i=0;i<marks.length;i++)
	            {
	                avg=avg+marks[i];
	            }
	            avg=avg/marks.length;
	            per=(int)avg;
	            
	            
	            
	        }
	    }
	    
	    public void display()
	    {
	        System.out.println("Id="+id);
	        System.out.println("Name="+name);
	        System.out.println("Marks="+marks);
	        System.out.println("Per="+per);        
	        
	    }
	    
	    
}

	

