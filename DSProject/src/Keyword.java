public class Keyword {
	
	public String name;
    public double weight;
    public int count;
   
    
    public Keyword(String name,double weight,int count){
    	
		this.name = name;
		this.weight =weight;
		this.count = count;
		
		
    }
    
    public Keyword(String name,double weight) {
    	
    	this.name = name;
    	this.weight = weight;
    	this.count = 0;
    }
    
    public Keyword(String name) {
    	
    	this.name = name;
    	this.weight = 3;
    	this.count = 0;
    	
    }
    @Override
    public String toString(){
    	return "["+name+","+weight+","+count+"]";
    }
    
    public void setCount(int count) {
    	
    	this.count = count;
    	
    }
}
