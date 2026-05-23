/* Q4. Problem:Create a POJO class Player with fields: playerId, name, runs, and matches. Store details of 5 players using an array of objects. Perform the following operations:
Calculate the average runs per match for each player.
Find and display the player with the highest batting average.
Print the details of players whose batting average is above the team average.
Why?
 This teaches ratio calculations, finding max averages, and filtering players — same aggregation + comparison style. */

/* Q4. Problem:
Create a POJO class Player with fields: playerId, name, runs, and matches.
*/

import java.util.*;

class Player
{
    private int playerId;
    private String name;
    private int runs;
    private int matches;
    
    //setter
    public void setPlayerId(int playerId)
    {
        this.playerId = playerId;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public void setRuns(int runs)
    {
        this.runs = runs;
    }   
    public void setMatches(int matches)
    {
        this.matches = matches;
    }
    
    //getter  
    public int getPlayerId()
    {
        return playerId;
    }
    public String getName()
    {
        return name;
    }
    public int getRuns()
    {
        return runs;
    }
    public int getMatches()
    {
        return matches;
    }
    
    //calculate average
    public float getAverage()
    {
        if (matches == 0)
            return 0;
        return (float)runs / matches;
    }
}

public class player_4
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        
        Player[] players = new Player[5];
        
        //input 5 players
        for(int i = 0; i < players.length; i++)
        {
            players[i] = new Player();
            
            System.out.println("Enter Player "+(i+1)+" Details:");
            
            System.out.print("Player ID: ");
            players[i].setPlayerId(sc.nextInt());
            
            System.out.print("Name : ");
            players[i].setName(sc.next());  // FIXED: next()
            
            System.out.print("Runs : ");
            players[i].setRuns(sc.nextInt()); // FIXED
            
            System.out.print("Matches: ");
            players[i].setMatches(sc.nextInt());
        }

        //1. print average of each player
        System.out.println("\n--- Player Averages ---");
        for(int i = 0; i < players.length; i++)
        {
            System.out.println(players[i].getName() + " -> " + players[i].getAverage());
        }
        
        //2. Find player with highest average
        Player best = players[0];
        for(int i = 1; i < players.length; i++)
        {
            if (players[i].getAverage() > best.getAverage())
            {
                best = players[i];
            }
        }
        
        System.out.println("\nHighest Average Player:");
        System.out.println("ID: " + best.getPlayerId() + " Name: " + best.getName() +
                           " Avg: " + best.getAverage());
        
        //3. Calculate team average
        float sumAvg = 0;
        for(int i = 0; i < players.length; i++)
        {
            sumAvg += players[i].getAverage();
        }
        
        float teamAverage = sumAvg / players.length;
        System.out.println("\nTeam Average : " + teamAverage);
        
        //4. Print players above team average
        System.out.println("\nPlayers Above Team Average:");
        for(int i = 0; i < players.length; i++)
        {
            if (players[i].getAverage() > teamAverage)
            {
                System.out.println(players[i].getName() +
                                   " (Avg: " + players[i].getAverage() + ")");
            }
        }
        
        sc.close();
    }
}

/* 
java player_4.java
Enter Player 1 Details:
Player ID: 1
Name : harshad
Runs : 100
Matches: 10
Enter Player 2 Details:
Player ID: 2
Name : sahil
Runs : 200
Matches: 15
Enter Player 3 Details:
Player ID: 3
Name : soham
Runs : 500
Matches: 10
Enter Player 4 Details:
Player ID: 4
Name : omkar
Runs : 600
Matches: 20
Enter Player 5 Details:
Player ID: 5
Name : ganesh
Runs : 700
Matches: 20

--- Player Averages ---
harshad -> 10.0
sahil -> 13.333333
soham -> 50.0
omkar -> 30.0
ganesh -> 35.0

Highest Average Player:
ID: 3 Name: soham Avg: 50.0

Team Average : 27.666666

Players Above Team Average:
soham (Avg: 50.0)
omkar (Avg: 30.0)
ganesh (Avg: 35.0) */