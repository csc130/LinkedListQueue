
public class LLQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LLQueue <String>aQ = new LLQueue<String>();
		try {
			aQ.dequeue();
		} catch  (QueueUnderFlowException e) {
			System.out.println(e.getMessage());
		}
		aQ.enqueue("Ant");
		aQ.enqueue("Bee");
		aQ.enqueue("Cat");
		try {
			aQ.dequeue();
		} catch  (QueueUnderFlowException e) {
			e.getMessage();
		}
		System.out.println(aQ);
		
		LLQueue <Integer>bQ = new LLQueue<Integer>();
		bQ.enqueue(1);
		bQ.enqueue(2);
		bQ.enqueue(3);
		
		System.out.println(bQ);
		
	}

}
