package threads;

public  class Delete extends Thread{
	Read r=new Read();
	public synchronized void delete()
	{
//		while((Read.l)>0)
//		{
//			System.out.println(Read.l);
//			System.out.println("Deleting:"+r.history[(Read.l)-1]);
//			Read.l--;
//		}
		while(Read.l>=0)
		{
			int j=1;
			if(Read.history[j-1]!=null) {
		System.out.println("Deleting:"+r.history[j-1]);}
			try {
				wait();
			}
			catch(InterruptedException e) {
				 e.printStackTrace();
			 }
		for(int i=j;i<=Read.l;i++)
		{
		  Read.history[i-1]=Read.history[i];
		  notify();
		}
		Read.l--;
		j++;}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		delete();
		System.out.println("History deleted");
	  //r.printUrl();
	  try {
		  Thread.sleep(1000);
	  }
	  catch(InterruptedException e)
	  {
		  e.printStackTrace();
	  }
	}
	
}
