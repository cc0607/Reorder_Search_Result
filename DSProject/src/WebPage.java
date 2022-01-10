import java.io.IOException;
import java.util.ArrayList;

public class WebPage {

	public String url;
	public String name;
	public WordCounter counter;
	public double score;
	public KeywordList inputKeywordList;
	
	public WebPage(String url,String name,KeywordList list){
		this.url = url;
		this.name = name;
		this.inputKeywordList = list;
		this.counter = new WordCounter(url);
	}
	
	public void setScore(KeywordList defaultKeywords) throws IOException{
		score = 0;
//		3.calculate score
		
		for(Keyword k : defaultKeywords.lst){		
			int count = counter.countKeyword(k.name);
			k.setCount(count);
			score += k.weight*count;	
			
		}
		
		for(Keyword k : inputKeywordList.lst) {//使用者輸入
			
			int count = counter.countKeyword(k.name);
			k.setCount(count);
			score+=2.5*count;
			
		}
	}
}
