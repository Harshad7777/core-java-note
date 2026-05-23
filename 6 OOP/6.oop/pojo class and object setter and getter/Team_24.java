/* Q24. WAP to create class name Employee with field name as Player with field id,name and run
and we have class name as Team with following methods
void setPlayer(Player player): this function is used for accept player details
void showPlayer(): this function is used for show the player details. */


 
import java.util.*;

class Player
{
	private int id ;
	private String name;
	private int run;
	
	//setter
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name =name;
	}
	
	public void setRun(int run)
	{
		this.run = run;
	}
	
	//getter
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	
	public int getRun()
	{
		return run;
	}
}

class Team
{
	private Player ply;
	
	public void setPlayer(Player ply)
	{
		this.ply = ply;
	}
	
	public void showPlayer()
	{
		if(ply == null)
		{
			System.out.println("no player available!");
		}
		else
		{
			System.out.println("Player detail");
			System.out.println("ID :"+ply.getId());
			System.out.println("Name :"+ply.getName());
			System.out.println("RUNS :"+ply.getRun());
			
		}
	}
}
public class Team_24
{
	public static void main(String x[])
	{
		Player p1 = new Player();

		p1.setId(10);
		p1.setName("harshad");
		p1.setRun(18000);
		
		Player p2 = new Player();
		
		p2.setId(11);
		p2.setName("dhruve");
		p2a.setRun(1800);
		
		Team t = new Team();
		
		t.setPlayer(p1);
		t.setPlayer(p2);
		
		t.showPlayer();
		
	}
}
