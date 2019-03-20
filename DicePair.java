import java.*;

public class DicePair{
	private Die dice1;
	private Die dice2;

	private int total;
	

	public DicePair()
	{
		dice1 = new Die();
		dice2 = new Die();
	}

	public int roll()
	{
		dice1.roll();
		dice2.roll();
		total = dice1.getFaceValue() + dice2.getFaceValue();
		return total;
	}

	public Die getDice1()
	{
		return dice1;
	}

	public Die getDice2()
	{
		return dice2;
	}

	public int getTotal()
	{
		return total;
	}


	public void setTotal(int num)
	{
		total = num;
	}

	public void setDice1(int num)
	{
		dice1.setFaceValue(num);
	}

	public void setDice2(int num)
	{
		dice2.setFaceValue(num);
	}


	public String toString(){
		String totalString = Integer.toString(total);
		String stringNum1 = Integer.toString(dice1.getFaceValue());
		String stringNum2 = Integer.toString(dice2.getFaceValue());
		return "total number is " + stringNum1 + " + " + stringNum2 + " =" + totalString;
	}


}