
public class SlowInvader extends Invader{
	
	public static final int SPEED = 10;
	private int delay;
	
	// Creates Invader specified by number 0..INVADER_NUM and a speed value
	public SlowInvader(int num, int speed)
	{
		super(num);
		delay = speed;
	}
	
	
	// Creates Invader specified by number 0..INVADER_NUM
	public SlowInvader(int num)
	{
		super(num);
		delay = SPEED;
	}
		
	// Moves the Invader down
	public void step()
	{
		delay--;
		if (0 == delay)
		{
			move();
			delay = SPEED;
		}
	}
}



