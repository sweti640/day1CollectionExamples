
/*Consider List of T20 Players.Player (playerid,Name,Country,team)
e.g. (1,”MSDhoni”,”India”,”Chennai Super Kings”)
Then find out which team has maximum Australian players.*/	
	

	import java.util.ArrayList;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



class Player
{
	int playerid;
	String Name;
	String Country;
	String team;
	public Player(int playerid, String name, String country, String team) {
		
		this.playerid = playerid;
		this.Name = name;
		this.Country = country;
		this.team = team;
	}
	@Override
	public String toString() {
		return "\nPlayer [playerid=" + playerid + ", Name=" + Name + ", Country=" + Country + ", team=" + team + "]";
	}
	
	
}
public class demo {

	public static void main(String[] args) {
		Player p=new Player(1,"MSD","India","CSK");
		Player p1=new Player(2,"VK","India","RCB");
		Player p2=new Player(3,"Shane Watson","Australian","RCB");
		Player p3=new Player(4,"BK","Australian","SRH");
		Player p4=new Player(5,"Kane Richardson","Australian","RCB");
		Player p5=new Player(6,"David Warner","Australian","SRH");
		Player p6=new Player(7,"Sachin","India","MI");
		Player p8=new Player(8,"Pat Cummins","Australian","RCB");
		Player p9=new Player(9,"Glenn Maxwell","Australian","RCB");
		Player p10=new Player(10,"Chris Lynn","Australian","RCB");
		Player p11=new Player(11,"David Warner","Australian","SRH");
		Player p12=new Player(12,"David Warner","Australian","SRH");
	
		
		
		ArrayList<Player>al=new ArrayList<>();
		al.add(p);
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		al.add(p6);
		al.add(p8);
		al.add(p9);
		al.add(p10);
		al.add(p11);
		al.add(p12);
		
		Iterator<Player> ite=al.iterator();
		//System.out.println(al);
		int Max=0,count=0;
		String TeamName=" ";

		Map<String, Integer> mp=new HashMap<>();
		while(ite.hasNext())
		{
			Player tName=ite.next();
			String team=tName.team;
			
			for(Player obj:al)
			{
				if(team==obj.team)
				{
					if(obj.Country=="Australian")
					{
						count++;
					}
				}
			}
			if(Max<count)
			{
				Max=count;
				TeamName=tName.team;
			}
		}
		
		System.out.println("Team of Highest player from Australian= "+TeamName);
	}

}