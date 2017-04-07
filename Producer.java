package com.siva.red.threads;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
	private BlockingQueue<Customer> queue;
	
	public Producer(){}
	
	public Producer(BlockingQueue<Customer> queue){
		this.queue = queue;
	}
	
	@Override
	public void run(){
		
		/* //produce messages
        for(int i=1; i<=10; i++){
        	String name = "Siva " + i;
			String city = "Bangalore " + i;
			Customer c = new Customer(name, city);
            try {
                Thread.sleep(i);
                queue.put(c);
                System.out.println("Produced "+c);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("Producer loop terminated...");
*/
		for(int i = 1 ; i <=10 ; i++){
			
			String name = "Siva " + i;
			String city = "Bangalore " + i;
			Customer c = new Customer(i, name, city);
			try {
				queue.put(c);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("Producer:: " + c);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
