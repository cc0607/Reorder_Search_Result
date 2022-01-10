import java.util.Comparator;

public class WebComparator implements Comparator<WebNode>{
	@Override
	public int compare(WebNode wn1, WebNode wn2){
		
		if(wn1==null || wn2==null) throw new NullPointerException();
		
		if(wn1.nodeScore<wn2.nodeScore){ 
			return 1;
		}else if(wn1.nodeScore>wn2.nodeScore){
			return -1;
		}
		return 0;
	}
}