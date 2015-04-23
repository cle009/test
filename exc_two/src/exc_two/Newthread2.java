package exc_two;

import java.util.HashMap;

public class Newthread2 implements Runnable {

	@Override
	public void run() {
		Newthread nt = new Newthread();
		boolean iswait = true;
		try {
			if(iswait) {
				nt.wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		nt.notify();
		try {
			Thread.sleep(1L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		HashMap hm = new HashMap<>();
		try {
			hm.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		hm.notify();
	}

}
