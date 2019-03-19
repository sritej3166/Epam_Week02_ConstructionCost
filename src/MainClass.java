import java.util.Scanner;

public class MainClass {
	public static void main(String[] args)
	{
		CostEstimate ce=new CostEstimate();
		int standard;
		float area;
		double cost;
		boolean automation;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the area of the house:");
		area=sc.nextFloat();
		System.out.println("Do you want fully automated house? (true/false)");
		automation=sc.nextBoolean();
		if(automation==true)
		{
			standard=3;
		}
		else {
			System.out.println("Enter the standard: Press 1 for normal standard/n Press 2 for above average standard/nPress 3 for high standard");
			standard=sc.nextInt();
		}
		sc.close();
		cost=ce.costcalculator(standard,area,automation);
		System.out.print("The total cost is: "+cost);
		return;
	}
}
