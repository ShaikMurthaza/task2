package maven_demo;

public class houseConstruction {
	public int  amountForHouse(String material,int squareFeet)
	{
		if(material.equals("standard material"))
		{
			return(squareFeet*1200);
		}
		if(material.equals("above standard material"))
		{
			return(squareFeet*1500);
		}
		if(material.equals("high standard material"))
		{
			return(squareFeet*1800);
		}
		return(squareFeet*2500);
		
	}

}
