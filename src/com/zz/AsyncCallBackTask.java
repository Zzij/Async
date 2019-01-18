package com.zz;

public class AsyncCallBackTask {
	
	public void callBack(CallBack myCallBack) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					System.out.println("我callback睡一会");
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				int sum = 0;
				for(int i = 0; i < 100; i++) {
					sum += i;
				}
				myCallBack.callBack(sum);
			}
		});
		thread.start();
	}

}
