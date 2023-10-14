package queuey;

import java.util.LinkedList;

public class Queuey<D> {
	LinkedList<D> queue;

	public Queuey() {
		this.queue = new LinkedList();
	}

	public boolean isEmpty() {
		return this.queue.isEmpty();
	}

	public int size() {
		return this.queue.size();
	}

	public void enqueue(D n) {
		this.queue.addLast(n);
	}

	public D dequeue() {
		return queue.remove(0);
	}

	public D peek() {
		return queue.get(0);
	}
}
