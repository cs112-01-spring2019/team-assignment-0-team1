public class DiePairTest{

public static void main(String[] args)
{
	DicePair twoDie = new DicePair();
	twoDie.Roll();
	System.out.println(""+twoDie.getDice1()+twoDie.getDice2()+twoDie.getTotal());

	System.out.print(twoDie);
}
}
