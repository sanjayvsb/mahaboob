package program;

public class Hello {
	 public static void main(String[] args) {
	        MyThread mt=new MyThread();
	        mt.start();
	        synchronized(mt){
	            System.out.println("print the word:");
	            try {
	                mt.wait();
	                int i = 0;
					i++;
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	    }

	}

	class MyThread extends Thread{

	    public void run(){
	        synchronized(this){
	        System.out.println("Hello Hello Hello Hello Hello");
	        notify();
	        }
	    }
	}

