import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class WordCounter {
	private String urlStr;
    private String content;
    private double score;
    
    public WordCounter(String urlStr){
    	this.urlStr = urlStr;
    }
    
    private String fetchContent() throws IOException{
		URL url = new URL(this.urlStr);
		URLConnection conn = url.openConnection();
		InputStream in = conn.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
	
		String retVal = "";
	
		String line = null;
		
		while ((line = br.readLine()) != null){
		    retVal = retVal + line + "\n";
		}
	
		return retVal;
    }
    
    public int countKeyword(String keyword) throws IOException{
		if (content == null){
		    content = fetchContent();
		}
		
		//To do a case-insensitive search, we turn the whole content and keyword into upper-case:
		content = content.toUpperCase();
		keyword = keyword.toUpperCase();
	
		int retVal = 0;
		int fromIdx = 0;
		int found = -1;
	
		while ((found = content.indexOf(keyword, fromIdx)) != -1){
		    retVal++;
		    fromIdx = found + keyword.length();
		}
	
		return retVal;
    }
    
    public double getScore() throws IOException{
    	ArrayList<Keyword>keywords=new ArrayList<Keyword>();
    	keywords.add(new Keyword("Chocolate",5));			keywords.add(new Keyword("巧克力",5));
    	keywords.add(new Keyword("Candy",3));				keywords.add(new Keyword("糖果",3));
    	keywords.add(new Keyword("Delicious",2));			keywords.add(new Keyword("好吃",2));
    	keywords.add(new Keyword("Dessert",3));				keywords.add(new Keyword("甜點",3));
    	keywords.add(new Keyword("Ice cream",2));			keywords.add(new Keyword("點心",3));
    	keywords.add(new Keyword("Cocoa",4));				keywords.add(new Keyword("冰淇淋",2));
    	keywords.add(new Keyword("Hair",-5));				keywords.add(new Keyword("可可",4));	
    	keywords.add(new Keyword("Body",-4));				keywords.add(new Keyword("頭髮",-5));
    	keywords.add(new Keyword("Cleansing",-3));			keywords.add(new Keyword("身體",-4));
    	keywords.add(new Keyword("Deodorant",-5));			keywords.add(new Keyword("清潔",-3));	
    	keywords.add(new Keyword("Lotion",-5));				keywords.add(new Keyword("除臭劑",-5));	
    	keywords.add(new Keyword("Antiperspirant",-5));		keywords.add(new Keyword("洗劑",-5));	
    	keywords.add(new Keyword("Conditioner",-5));		keywords.add(new Keyword("止汗劑",-5));	
    	keywords.add(new Keyword("護髮素",-5));	
    	
		score = 0;
//		3.calculate score
		for(Keyword k : keywords){	
			score+=k.weight*countKeyword(k.name);
		}
		return score;
	}
  
}
