package springbasic;

public class triangle
{
	private String type;
	private int height;
	
	public triangle(String type)
	{
	this.type=type;	
	}
	
	public triangle(String type,int height)
	{
		this.type=type;
		this.height=height;
	}
	
	public String getType() {
		return type;
	}
	
	

//	public void setType(String type) {
//		this.type = type;
//	}
	public int getHeight() {
		return height;
	}
	
	


	public void showprogress()
	{
		System.out.println(getType()+" is drawing having height "+getHeight());
	}

	
}
