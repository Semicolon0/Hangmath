import java.lang.Math;
import java.util.Scanner;

public class hangmath{
	public static void main(String[] args) {
		
        int max = 100;
        int min = 1;
        int range = max - min + 1;
    
            int rand1 = (int) (Math.random() * range) + min;
            int rand2 = (int) (Math.random() * range) + min;
        	int res = rand1 + rand2;
        	
        	int fails = 0;
            
        	boolean correctAnswer = false;
            
            String hang1 = 
            		"      _______\r\n"
            		+ "      |/    |\r\n"
            		+ "      |\r\n"
            		+ "      |\r\n"
            		+ "      |\r\n"
            		+ "  ____|____\r\n"
            		+ " /         \\\r\n"
            		+ "/           \\";
            
            String hang2 = 
            		"      _______\r\n"
            		+ "      |/    |\r\n"
            		+ "      |     0\r\n"
            		+ "      |     |\r\n"
            		+ "      |\r\n"
            		+ "  ____|____\r\n"
            		+ " /         \\\r\n"
            		+ "/           \\";
            
            String hang3 = 
            		"      _______\r\n"
            		+ "      |/    |\r\n"
            		+ "      |     0\r\n"
            		+ "      |    -|-\r\n"
            		+ "      |    / \\\r\n"
            		+ "  ____|____\r\n"
            		+ " /         \\\r\n"
            		+ "/           \\";
            
            String hang = "";
            	while (correctAnswer == false) {
            	Scanner in = new Scanner(System.in);
            	
        		if(fails == 0) {
        			hang = hang1;
        		} else if(fails == 1) {
        			hang = hang2;
        		} else if (fails == 2) {
        			hang = hang3;
        		}
            	
            	String equation = rand1 + " + " + rand2;
            System.out.println("   " + equation + "\n" + hang);
            
        	String userAnswer = in.nextLine();
        	int resNum=Integer.parseInt(userAnswer);
            
        	if(fails > 2) {
        		System.out.println("You were unabale to save the man");
        		correctAnswer = true;
        	}
        	
            if(resNum == res) {
            	System.out.println("CORRECT!");
            	correctAnswer = true;
            } else if(fails<3){
            	System.out.println("INCORRECT");
            	fails++;
            	
            };
            	}
          


}
}

