package threads;
import java.util.*;
public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Read t1=new Read();
		Delete t2=new Delete();
		System.out.println("Enter the no:of urls");
		int n=s.nextInt();
		s.nextLine();
		System.out.println("Enter urls");
		for(int i=0;i<n;i++)
		{
			String url=s.nextLine();
			t1.addUrl(url);
		}
		t1.start();
		t2.start();
		
	}

}
