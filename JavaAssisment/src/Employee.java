
public class Employee {
	    
	    private int empno;
	    private String name;
	    private double sal;
	    
	    public int getEmpno() {
	        return empno;
	    }
	    public void setEmpno(int empno) {
	        this.empno = empno;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public double getSal() {
	        return sal;
	    }
	    public void setSal(double sal) {
	        this.sal = sal;
	    }
	    
	    @Override
	    public String toString() {
	        return "Employee [empno=" + empno + ", name=" + name + ", sal=" + sal + "]";
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	}


