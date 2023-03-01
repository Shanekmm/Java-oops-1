package browser;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Web[] obj = new Web[10];
		int n = -1;
		// TODO Auto-generated method stub

		int choice = 0;
		while (choice < 5) {
			Scanner sc = new Scanner(System.in);
			System.out.println("\n\nMENU");
			System.out.println("1.Show all browser");
			System.out.println("2.Add a new browser");
			System.out.println("3.remove a browser");
			System.out.println("4.Browser history");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				showBrowsername(obj, n);
				break;
			case 2:
				obj[++n] = new Web();
				// System.out.println(n);
				break;

			case 3:
				showBrowsername(obj, n);
				System.out.println("Enter the browser to be deleted");
				int ch = sc.nextInt();
				for (int i = ch; i <= n; i++) {
					obj[i - 1] = obj[i];
				}
				n--;
				break;
			case 4:
				showBrowsername(obj, n);
				System.out.println("Select a browser");
				int c = sc.nextInt();
				obj[c - 1].printHistory();
			default:
			}
		}

	}

	public static void showBrowsername(Web obj[], int n) {
		if (n == -1) {
			System.out.println("Browser list empty");
		} else {
			for (int i = 0; i <= n; i++) {
				System.out.println((i + 1) + "." + obj[i].showName());
			}
		}
	}

}
