package examples.threading;

public class RunnableExample {

	public static void main(String[] args)
	{
		//Creating a new Runnable and having it print out a string 5 times.
		Runnable MyFirstRunnable = new Runnable() {
			@Override
			public void run()
			{
				for (int i = 0; i < 5; i++)
				{
					System.out.println("WHATS UPPPPPPPPPPP");
				}
			}
		};
		//Runnables, unlike Threads, can be run numerous times. This runs the Runnable on the main Thread.
		MyFirstRunnable.run();
		System.out.println("hey@!");
		/*
		 * Note that the "hey@a!" prints after the runnable finishes executing. This is because the runnable is run
		 * on the main Thread, and must finish executing before continuing. This is part of the reason why
		 * multi-threading is useful.
		 */
		
		////////Divider////////
		System.out.println("--------------------");
		//Making a new Thread using a Runnable as a parameter instead of Overriding run
		Thread coolThread = new Thread(MyFirstRunnable);
		coolThread.start();
		System.out.println("HEY!!!!");
		/*
		 * Note how HEY!!!! Prints before the Runnable, even though it's placed after in the code. This is because
		 * they're on seperate threads, so the main thread doesn't have to wait for the runnable.
		 */
	}
	
}
