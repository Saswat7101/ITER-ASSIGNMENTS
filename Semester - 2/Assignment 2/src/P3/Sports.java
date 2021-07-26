package P3;
import java.util.Scanner;
interface sports
{
	int Score1=0;
	int Score2=0;
}
public class Sports implements sports{
int Score1,Score2;
	public  void Input()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the scores");
		Score1=s1.nextInt();
		Score2=s1.nextInt();

	}
	public void disp()
	{
		System.out.println("The Scores are="+Score1+" "+Score2);
	}
	public int tot() {
		return Score1+Score2;
	}
	
}

