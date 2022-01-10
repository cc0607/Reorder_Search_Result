import java.util.PriorityQueue;

public class WebHeap {
	
	public PriorityQueue<WebNode> heap;
	
	public WebHeap() {
		
		this.heap = new PriorityQueue<WebNode>(10,new WebComparator());
		
	}
	
	public void add(WebNode w) {
		
		heap.offer(w);
		
	}
	
	public WebNode peek() {
		
		if(heap.peek()==null) {
			
			System.out.println("Invalid due to null heap");
			return null;
		}
		
		return heap.peek();
		
	}
	
	public WebNode removeMax() {
		
		if(heap.peek()==null) {
			
			System.out.println("Invalid due to null heap");
			return null;
		}
		
		return heap.poll();
	}
	
	public void output() {
		
		StringBuilder sb = new StringBuilder();
		WebNode w;
		
		if((w=heap.poll())!=null) {
			
			sb.append(w.toString());
			
			if(heap.peek()!=null) {
				
				if(heap.peek()!=null) {
					
					sb.append("");
					
				}
			}
		}
		
		System.out.println(sb.toString());
		
	}
	
	
}
