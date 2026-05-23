/* 7. Implement Voting Eligibility
Create a class Voter with a method isEligible that checks if a person (age provided) is eligible to vote.
Explanation: Introduces basic logical validation. */


public class voter
{
	public void isEligible(int age)
	{
		if(age >= 18)
		{
			System.out.println("Eligibil to vote");
		}
		else
		{
			System.out.println("not");
		}
	}
}
	
public class voter_7
{
	public static void main(String x[])
	{
		voter obj = new voter();
		
		obj.isEligible(17);
	}
	
}

/* 
java voter_7.java
not */