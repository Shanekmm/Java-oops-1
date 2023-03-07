package exceptions;

public class BrowserHistory {
	String current = new String();
	String[] history = new String[10];
	int l;

//	int n;
	public BrowserHistory(String homepage) {
		current = homepage;
		history[l] = homepage;
		l++;
	}

	public void visit(String url) 
	{
		try {
			if (url.endsWith(".in") || url.endsWith(".com") || url.endsWith(".org")) {
				history[l] = url;
				current = history[l];
				l++;
			} else {
				throw new InvalidURLException("Invalid URL Extensions\n Urls should end with .in,.org,.com");
			}
		} catch (InvalidURLException e) {
			System.out.println("Exception occured --> " + e);
		}

	}

	public String back(int steps) {
		try {
			if (l - steps - 1 >= 0) {
				l = l - steps - 1;
				current = history[l];
				l++;
			} else {
				throw new NoHistoryFoundException("No history entries");
			}
		} catch (NoHistoryFoundException e) {
			System.out.println("Exception Occured -->" + e);
		}
		return current;
	}

	public String forward(int steps) {
		try {
			if(history[l+steps-1]!=null)
			{
				l = l + steps - 1;
				current = history[l];
				l++;
			} else {
				throw new NoHistoryFoundException("No history entries");
			}
		} catch (NoHistoryFoundException e) {
			System.out.println("Exception Occured -->" + e);
		}
		return current;
	}

	public String get(int position) {
		String currentUrl = null;
		try {
			if (position < 0) {
				throw new InvalidPositionException("Provide only positive values");
			} else if (position < history.length) {
				currentUrl = history[position];
			} else {
				throw new ArrayIndexOutOfBoundsException("Invalid Position");
			}
		} catch (InvalidPositionException e) {
			System.out.println("Exception occured --> " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" Exception occured --> " + e);
		}
		return currentUrl;
	}
}
