package JavaOOPS;

public class Student {
	private int sid;
	private String sname;
	private double marks;

	//Setter means to modify or set the data
	void setSid(int sid)
	{
		this.sid = sid;
	}
    // Getter means to read the data 
    int getSid()
    {
    	return sid;
    }
	
    
    void setSname(String sname)
    {
    	  this.sname = sname;
    }
    
    String getSname()
    {
    	return sname;
    }
    
    
    void setMarks(double marks)
    {
    	this.marks = marks;
    }
    
    
    double getMarks()
    {
    	return marks;
    }
	}


