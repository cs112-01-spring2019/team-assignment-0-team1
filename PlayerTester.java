
public class PlayerTester
{
	public static void main(String[] args)
	{
		Player p1 = new Player("Albus");
		Player p2 = new Player("Snape");

		p1.setWins(p1.getWins()+5);
		p1.setLose(p1.getLose()+2);
		p2.setWins(p2.getWins()+2);
		p2.setLose(p2.getLose()+5);

		p1.setPoints(6);
		p2.setPoints(2);
		System.out.println(p1.getPoints()+" "+p2.getPoints());

		System.out.println(p1+"\n"+p2);
	}
}