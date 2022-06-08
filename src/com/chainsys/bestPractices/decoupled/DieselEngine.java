package com.chainsys.bestPractices.decoupled;

public class DieselEngine implements Iengine {
	@Override
	public void start() {
		System.out.println("deiese engine started");
	}

	@Override
	public void stop() {
		System.out.println("deiese engine stoped");
	}
}
