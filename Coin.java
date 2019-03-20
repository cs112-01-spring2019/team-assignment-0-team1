public class Coin{
	private final int HEADS = 0;
   	private final int TAILS = 1;

   	private int tossCoin;

   	public Coin()
   {
      flip();
   }

   public void flip()
   {
      tossCoin = (int)(Math.random()*2);
   }

   public boolean isHeads()
   {
   	if (tossCoin==HEADS)
   	{
   		return true;
   	}
   	else
   	{
   		return false;
   	}
   }
   public String toString(){
   	String headsortails;
   	if (tossCoin==TAILS){
   		headsortails = "tails";
   	}
   	else {
   		headsortails="heads";
   	}
   	return headsortails;
   }
}
	
