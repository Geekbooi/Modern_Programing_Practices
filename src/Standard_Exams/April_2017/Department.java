package Standard_Exams.April_2017;

public abstract class Department {
	private final String name;

	public Department(String name){
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	private StringQueue queue = new StringQueue();
	public StringQueue getQueue() {
		return queue;
	}
	public void addMessage(String message)
	{
		queue.enqueue(message);
	}

	public String nextMessage() throws EmptyQueueException{
		return queue.dequeue();
	}


	//implement
}
