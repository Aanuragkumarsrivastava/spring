package springbasic;

public class triangle
{
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void showprogress()
	{
		System.out.println(getType()+" is triange is drawing");
	}
	
}
