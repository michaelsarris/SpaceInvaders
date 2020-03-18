
public class SpaceInvadersBoard extends Board{

	private static final String UP = "UP";
	private static final String DOWN = "DOWN";
	private static final String LEFT = "LEFT";
	private static final String RIGHT = "RIGHT";
	private static final String FIRE= "A";
	
	private Spaceship ship;
	private int invaderSpeed = SlowInvader.SPEED;

	
	// Create a board for Invaders
	public SpaceInvadersBoard() 
	{
	 	super(7, 7);
	 	newGame(false);
	}
	
	// Whenever the game starts or restarts, do this
	public void newGame(boolean repaint)
	{
		super.newGame(repaint);		
		invade();
		protect();	
	}
	
	public Spaceship getShip()
	{
		return ship;
	}
	
	public int invaderCount()
	{
		return -1;
	}
	
	// Create full rows of Space Invaders
	public void invade()
	{
		int rows = 4;
		for (int r = 0; r < rows; r++) 
		{			
			for (int c = 0; c < getColumns(); c++)
			{
				Invader i = new SlowInvader(r, invaderSpeed);
				i.setLocation(r, c);
				add(i);
			}
		}
	}
	
	public void step()
	{
		super.step();
		getGui().setStatusMessage("Invaders = " + invaderCount());
		getGui().setWinMessage("Speed = " + invaderSpeed, true);
		if (invaderCount() == 0)
		{
			if (invaderSpeed > 0)
				invaderSpeed--;
			invade();
		}
	}
	
	private void protect()
	{
		ship = new Spaceship();
		ship.setLocation(getRows() - 1, getColumns() / 2);
		add(ship);
	}
	
	// Handle keyboard inputs.
	@Override
	public boolean keyPressed(String description)
	{
		if (description.equals(LEFT))
		{
			ship.moveLeft();
		}
		else if (description.equals(RIGHT))
		{
			ship.moveRight();
		}
		else if (description.equals(UP))
		{
			
		}
		else if (description.equals(DOWN))
		{
			
		}
		else if (description.equals(FIRE))
		{			
			ship.fire();
		}
			
	    return false;
	 }
	
}
