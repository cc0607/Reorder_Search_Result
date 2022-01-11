import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Main extends HttpServlet{

	public static void main(String[] args) throws FileNotFoundException {
		
		Project project = new Project();
		
		ArrayList<Keyword> lst = new ArrayList<Keyword>();
		
		File file = new File("./src/input.txt");		
		Scanner scanner = new Scanner(file);
	
		while(scanner.hasNextLine()){
			
			try {
				String operation = scanner.next();
			
				switch (operation){
					case "add":
						String name = scanner.next();
						int count = scanner.nextInt();			
						lst.add(new Keyword(name, count));
						System.out.print(name);
						break;
				
					default:
						break;
			}
			
			}catch(Exception e) {
				
			}
		}
		scanner.close();
		
		try {
//			System.out.println(new DoveQuery("DoveChocolate",20,"Chinese").query());
			DoveQuery g =new DoveQuery("sweet",10,"Chinese");
			g.printResult();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("All end");
	}

}
