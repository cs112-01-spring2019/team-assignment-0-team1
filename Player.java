public class Player
{
	private String playerName;
	private int wins;
	private int lose;
	private int points;

	public Player(String playerName)
	{
		this.playerName=playerName;
		wins = 0;
		lose = 0;
		points = 0;
	}

	public String getName()
	{
		return playerName;
	}

	public int getWins()
	{
		return wins;
	}

	public int getLose()
	{
		return lose;
	}

	public int getPoints()
	{
		return points;
	}

	public void setWins(int wins)
	{
		this.wins=wins;
	}

	public void setLose(int lose)
	{
		this.lose=lose;
	}

	public void setPoints(int z)
	{
		this.points=z;
	}

	public String toString()
	{
		return( "Player Name: " + this.getName() + "\n Number of Wins: " + this.getWins()+"\n Number of Loses: "
			+ this.getLose());
	}
}