package threads;
import java.util.*;
public class Read extends Thread{
	Scanner sc=new Scanner(System.in);
	public static String[] history=new String[10];
	public  static int l=0;
	public void addUrl(String url)
	{
		history[l]=url;
		l++;
		System.out.println();
	}
	public synchronized void printUrl()
	{				 
		System.out.println("Current history: ");
		for(int i=0;i<l;i++)
		{
			System.out.println(history[i]);
			try {
				wait();
			}
			catch(InterruptedException e) {
				 e.printStackTrace();

			}
			}

	notify();}
	public void run()
	{
		while(true) {
	 printUrl();
	 try
	 {
		 Thread.sleep(1000);
	 }
	 catch(InterruptedException e) {
		 e.printStackTrace();
	 }}
	}
}
