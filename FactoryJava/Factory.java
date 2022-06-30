package FactoryPattern;

public class Factory
{

	public IShape getshape(String name)
	{
		
		if(name.equals("Circle"))
		{
		
			return new Circle();
		}
		if(name.equals("Rectangle"))
		{
		
			return new Rectangle();
		}
		if(name.equals("Triangle"))
		{
		
			return new Triangle();
		}
		
	
		return null;
	}
    	
	
}
