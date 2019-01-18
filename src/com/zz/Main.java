package com.zz;

public class Main {
	public static void main(String[] args) {
		new AsyncCallBackTask().callBack(new CallBack() {
			
			@Override
			public void callBack(Object object) {
				System.out.println("异步调用结果" + object);
			}
		});
		System.out.println("主线程结束");
	}
}
