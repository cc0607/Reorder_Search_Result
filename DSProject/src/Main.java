import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println(new GoogleQuery("Dove").query());
//			GoogleQuery g =new GoogleQuery("Dove");
//			g.query();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
