package string;
import java.util.*;
public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser chrome=new Browser();
		Scanner sc=new Scanner(System.in);
		String url;
		System.out.println("No:of Entries");
		int entry=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<entry;i++) {
		url=sc.nextLine();
		chrome.check(url);
		chrome.output();
	}

}}
