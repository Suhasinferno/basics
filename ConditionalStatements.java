package basicCodes;

public class ConditionalStatements {
	public static void m2(String [] args)
	{
		int myAge = 24;
		int votingAge = 18;
		if(myAge >= votingAge)
		{
			System.out.print("eligible to vote");
		}
		else
		{
			System.out.print("Not eligible to vote");
		}
	}
	public static void main(String [] args)
	{
		int day=5;
		switch(day)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		}
	}

}
