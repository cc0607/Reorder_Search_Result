
import java.io.IOException;
import java.util.ArrayList;

public class WebNode {
	
	public WebPage webPage;
	public double nodeScore;//main element This node's score += all its children¡¦s nodeScore
	
	public WebNode(WebPage webPage){
		this.webPage = webPage;
		
		
	}
	
	public void setNodeScore(KeywordList keywords) throws IOException{
		//this method should be called in post-order mode
		
		//**compute webPage score
		webPage.setScore(keywords);
		//**set webPage score to nodeScore
		nodeScore = webPage.score;
		
		}
		
				
			
	}
	
	
