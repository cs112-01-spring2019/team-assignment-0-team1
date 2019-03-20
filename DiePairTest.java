public class DiePairTest{

public static void main(String[] args)
{
	DicePair twoDie = new DicePair();
	twoDie.roll();
	System.out.println(""+twoDie.getDice1()+twoDie.getDice2()+twoDie.getTotal());

	System.out.println(twoDie);

	twoDie.setDice1(6);
	twoDie.setDice2(3);

	System.out.println(twoDie.getDice1());
	System.out.println(twoDie.getDice2());
}
}
