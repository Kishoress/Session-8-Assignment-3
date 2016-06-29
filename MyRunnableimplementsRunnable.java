class MyRunnableimplementsRunnable {
	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread a = new Thread((Runnable) r);
		Thread b = new Thread((Runnable) r);
		Thread c = new Thread((Runnable) r);
		a.setName("thread a ");
		b.setName("thread b ");
		c.setName("thread c ");
		a.setPriority(Thread.MIN_PRIORITY);
		b.setPriority(Thread.NORM_PRIORITY);
		c.setPriority(Thread.MAX_PRIORITY);
		a.start();
		b.start();
		c.start();
	}
	
	public void run() {
		for (int i = 1; i <= 10; i++) {
		System.out.println(
			Thread.currentThread().getName() 
				+ i + " is running");
			try {
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}
