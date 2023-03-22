package hack;

import java.util.*;
import java.io.*;

public class Hack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Browser chrome = new Browser();
		System.out.println("Enter the number of browsers");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the urls you wish to visit");
		for (int i = 0; i < n; i++) {
			String url = sc.nextLine();
			chrome.visit(url);
		}
		chrome.print();
		try {
			FileWriter fw = new FileWriter("/home/shanek-pt7184/Desktop/history.txt");
			for (int i = 0; i < chrome.l; i++) {
				fw.write(chrome.history[i]);
				fw.write("\n");
			}
			fw.close();
		}

		catch (IOException e) {
			System.out.println(e);
		}
		try {
			System.out.println("Do You wish to continue:(y/n) :");
			char s = sc.next().charAt(0);
			if (s == 'y') {
				FileReader fr = new FileReader("/home/shanek-pt7184/Desktop/history.txt");
				BufferedReader br = new BufferedReader(fr);
				String k;
				while ((k = br.readLine()) != null) {
					// System.out.println(k);
					int flag = 0;
					for (int i = 0; i < chrome.l; i++) {
						if (k.equals(chrome.history[i])) {
							flag = 1;
							break;
						}
					}
					// System.out.println(flag);
					if (flag == 0) {
						chrome.history[chrome.l] = k;
						chrome.l++;
					}
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("Current history:\n");
		for (int i = 0; i < chrome.l; i++) {
			System.out.println(chrome.history[i]);
		}
	}
}
