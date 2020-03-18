
public class Spaceship extends PokeThing{
	
	// Creates Invader specified by number 0..INVADER_NUM
	public Spaceship()
	{
		super("spaceship");
		setImageFileType(IMAGETYPE_PNG);
	}
	
	// Moves the Spaceship left
	public void moveLeft()
	{
		
	}
	
	// Moves the Spaceship right
	public void moveRight()
	{
		
	}
	
	public void fire()
	{
		getBoard().getGui().appendTextWindow("Pew! Pew!");
	}

}
