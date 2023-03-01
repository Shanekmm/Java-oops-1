package string;

public class Browser {
	String [] history=new String[10];
	int [] count=new int[10];
	int length;
	public void check(String url)
	{
		int flag=-1;
		for(int j=0;j<length;j++)
		{
			if(url.equals(history[j]))
			{
				count[j]++;
				flag=j;
				break;
			}
		}
		if(flag==-1)
		{
			history[length]=url;
			count[length]++;
			length++;
		}}
	public void output()
	{
		System.out.println("output --> \n");
		for(int j=0;j<length;j++)
		{
		System.out.println(history[j].concat(" ##")+count[j]);
	}
	}
}
