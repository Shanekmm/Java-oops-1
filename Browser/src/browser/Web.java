package browser;
import java.util.*;
public class Web {
	private String name=new String();
	private String version;
	private int entry;
	private String[] url=new String[100];
	Scanner sc=new Scanner(System.in);
	public String showName()
	{
		return this.name;
	}
	Web() {
		System.out.println("Enter the name of browser");
		name=sc.nextLine();
		System.out.println("Enter the version of browser");
		version=sc.nextLine();
		System.out.println("How many entries you want to add");
		entry=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<entry;i++)
		{
			System.out.println("Enter url"+ (i+1));
			url[i]=sc.nextLine();
		}
	}
	public void printHistory()
	{
		for(int i=0;i<entry;i++)
		{
			System.out.println(url[i]);
		}
	}

}
