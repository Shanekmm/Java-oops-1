package hack;

public class Browser {
	String[] history=new String[10];
	int l=0;
	void visit(String url)
	{
		if (url.endsWith(".in") || url.endsWith(".com") || url.endsWith(".org")) {
			history[l] = url;
			l++;
	}
		else
		{
			System.out.println("Invalid url");
		}
	}
	void print()
	{
		System.out.println("History\n");
		for(int i=0;i<l;i++)
		{
			System.out.println(history[i]);
		}
	}
}
