package FactoryPattern;

public class Main
{

	
	public static void main(String[] args)
	{

		Factory myFactory= new Factory();
		
		IShape circle=myFactory.getshape("Circle");
		
		circle.Draw(); 
		
        IShape rect=myFactory.getshape("Rectangle");
		
		rect.Draw();
        IShape tri=myFactory.getshape("Triangle");
		
		tri.Draw();
		
		
		 
	}

}
