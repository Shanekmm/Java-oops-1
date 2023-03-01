package wrapper;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser tabOne=new Browser();
		Browser tabTwo=new Browser();
		Browser tabThree=new Browser();
		Browser tabFour=new Browser();
		int C=tabOne.count;
		Integer Count=C;//autoboxing
		System.out.println("Number of browsers : "+Count);
		int Count1=Count;//unboxing
		System.out.println("Number of browsers : "+Count1);

	}

}
