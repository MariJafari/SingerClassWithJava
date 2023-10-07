
public class Singers {
	
	private int singersId;
	private String singersName;
	private String singersAddress;
	private String singersDateOfBirth;
	private int albumNumbers;
	
	public Singers() {}
	public Singers(int singersId,String singersName,String singersAddress,String singersDateOfBirth,int albumNumbers) 
	{
		this.singersId = singersId;
		this.singersName = singersName;
		this.singersAddress = singersAddress;
		this.singersDateOfBirth = singersDateOfBirth;
		this.albumNumbers = albumNumbers;
	}

	public void setSingersId(int singersId) 
	{
		this.singersId = singersId;
	}
	public int getSingersId()
	{
		return singersId;
	}
	
	
	public void setSingersName(String singersName) 
	{
		this.singersName =singersName;
	}
	public String getSingersName()
	{
		return singersName;
	}
	
	public void setSingersAddress(String singersAddress) 
	{
		this.singersAddress =singersAddress;
	}
	public String getSingersAddress()
	{
		return singersAddress;
	}
	
	
	public void setSingersDateOfBirth(String singersDateOfBirth) 
	{
		this.singersDateOfBirth =singersDateOfBirth;
	}
	public String getSingersDateOfBirth()
	{
		return singersDateOfBirth;
	}
	
	
	public void setAlbumNumbers(int albumNumbers) 
	{
		this.albumNumbers = albumNumbers;
	}
	public int getAlbumNumbers()
	{
		return albumNumbers;
	}
	
	
	public void setSingers(int singersId,String singersName,String singersAddress,String singersDateOfBirth,int albumNumbers)
	{
		this.singersId = singersId;
		this.singersName = singersName;
		this.singersAddress = singersAddress;
		this.singersDateOfBirth = singersDateOfBirth;
		this.albumNumbers = albumNumbers;

	}
	
	public void Display() 
	{
		System.out.println("Singer ID:  " + singersId);
		System.out.println("SingersName: " + singersName);
		System.out.println("SingersAddress: "+ singersAddress);
		System.out.println("SingersDateOfBirth: "+ singersDateOfBirth);
		System.out.println("albumNumbers: " + albumNumbers);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
