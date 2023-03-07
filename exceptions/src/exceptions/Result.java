package exceptions;

import java.util.*;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BrowserHistory Chrome = new BrowserHistory("Google.com");
		int ch = 0;
		String a;
		while (ch <= 6) {
			System.out.println("\nMENU\n");
			System.out.println("1.Show Current url");
			System.out.println("2.Visit next url");
			System.out.println("3.Go backward");
			System.out.println("4.Go forward");
			System.out.println("5.Get url from particular position");
			System.out.println("6.Exit\n\n\n");
			System.out.println("Enter your choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("You are currently on : " + Chrome.get(Chrome.l - 1));
				break;
			case 2:
				System.out.println("Enter number of urls you wish to visit");
				int entry = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the urls in order:\n");
				for (int i = 0; i < entry; i++) {
					String url = sc.nextLine();
					Chrome.visit(url);
				}
				break;
			case 3:
				System.out.println("How many steps backward");
				int n = sc.nextInt();
				a = Chrome.back(n);
				if (a != null) {
					System.out.println("Now You are on: " + a);
				}
				break;
			case 4:
				System.out.println("How many steps forward");
				n= sc.nextInt();
				a = Chrome.forward(n);
				if (a != null) {
					System.out.println("Now You are on: " + a);
				}
				break;
			case 5:
				System.out.println("Enter the position");
				n = sc.nextInt();
				a = Chrome.get(n);
				if (a != null) {
					System.out.println(a);
				}
				else if(n<10&&n>=0)
				{
					System.out.println("No entries on the position: "+n);
				}
				break;
			case 6:
				System.exit(0);
			}
		}
	}

}
