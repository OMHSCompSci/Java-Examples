package examples.threading;

public class ThreadExample {

	public static void main(String[] args)
	{
		/*
		 * A Thread is a continuous stream of instruction to the computer.
		 * When you start a program, it's main thread is created. This is how 
		 * the program knows what to do next. By creating a new Thread and running 
		 * it, you can avoid slowing down the main Thread with something that takes time to do
		 * such as input, waiting, etc. Different Threads run independently, but can still access each other.
		 */
		//Creating a new Thread, and having it print out the loop number and "Thread 1" at a 500ms interval.
		Thread MyFirstThread = new Thread() {
			@Override
			public void run()
			{
				for (int i = 0; i < 10; i++)
				{
					System.out.println(i + " Thread 1");
					try {
						Thread.sleep(500);
					} catch (Exception e)
					{
						//Nothing
					}
				}
			}
		};
		//Creating a new Thread, and having it print out the loop number and "Thread 2" at a 1000ms interval.
		Thread MySecondThread = new Thread() {
			@Override
			public void run()
			{
				for (int i = 0; i < 10; i++)
				{
					System.out.println(i + " Thread 2");
					try {
						Thread.sleep(1000);
					} catch (Exception e)
					{
						//Nothing
					}
				}
			}
		};
		//Starting the new Threads. This is when the new Thread is actually initialized and run.
		MyFirstThread.start();
		MySecondThread.start();
		/*
		 * Notice how the output is staggered. The different Threads don't print out in order because they run independently.
		 * Also note that a Thread cannot be started twice, nor can it be destroyed.
		 */
		
	}
	
}
