package external;

import java.util.ArrayList;

public class EventBuffer<T> {

	ArrayList<T> list = new ArrayList<T>();

	public T remove() {
		while (list.isEmpty()) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list.remove(0);
	}

	public void add(T e) {
		list.add(e);
	}

}
