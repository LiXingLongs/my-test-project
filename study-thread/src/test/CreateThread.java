package test;

public class CreateThread extends Thread{
	
	@Override
	public void run(){
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
			
	}

	public static void main(String[] args) {
		CreateThread ct = new CreateThread();
		ct.start();
	}
}
