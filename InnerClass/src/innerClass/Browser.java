package innerClass;
import java.util.*;
public class Browser {
	static String [] url=new String[10];
	static int l;
	int n;
	int m=0;
	class Bookmarks{ //Member inner class
		String [] bookmarkUrl=new String[10];
		public void setBookmark(String str)
		{
			bookmarkUrl[n++]=str;
		}
		 public void displayStringUrl()
			{
				for(int i=0;i<n;i++)
				{
					System.out.println(url[i]);
				}
		}
		
	}
	static class History{ //static inner class
		public static void set(String str)
		{
			url[l]=str;
			l++;
		}
		public static void display()
		{
			for(int i=0;i<l;i++)
			{
				System.out.println(url[i]);
			}}
	}
	interface Shortcut{
		public void shortcuts();
		public void displayShortcut();
	}
	public static void main(String []args)
	{
		String str;
		String str1;
		String [] value=new String[10];
		Browser chrome=new Browser();
		Scanner sc=new Scanner(System.in);
		Shortcut firefox=new Shortcut(){ //anonymous inner class
			public void shortcuts()
			{
				for(int i=0;i<chrome.l;i++) {
				System.out.println("Enter the shortcut for url."+(i+1)+": "+ chrome.url[i]);
				String shorts=sc.nextLine();
				setShortcut(shorts);
			}}
				public void setShortcut(String shorts) {
					value[chrome.m]=shorts;
					chrome.m++;
				}
				public void displayShortcut()
				{
					for(int i=0;i<chrome.m;i++)
					{
						System.out.println(value[i]);
					}
				}
				};
		Browser.Bookmarks b1=chrome.new Bookmarks();
		System.out.println("How many entries");
		int entry=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter urls");
		for(int i=0;i<entry;i++)
		{	
		str=sc.nextLine();
		Browser.History.set(str);
		}
		System.out.println("No:of urls to be bookmarked");
		int number=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter urls to be bookmarked");
		for(int i=0;i<number;i++)
		{	
		str1=sc.nextLine();
		b1.setBookmark(str1);
		}
		System.out.println("history \n");
		Browser.History.display();
		System.out.println("Bookmarks: \n");
		b1.displayStringUrl();
		firefox.shortcuts();
		System.out.println("shortcuts: \n");
		firefox.displayShortcut();
	}
}
