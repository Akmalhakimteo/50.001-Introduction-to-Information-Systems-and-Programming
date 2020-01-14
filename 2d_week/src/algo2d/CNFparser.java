package algo2d;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class InvalidInputException extends Exception{
	InvalidInputException(){
		System.out.println("Invalid input, CNF only");
	}
	
}


public class CNFparser {
	
	public static int numberVar,numberClause;
	
	public static void main(String[] args) throws IOException,InvalidInputException {
		
		String fileType;
		String line;
		String path="C:\\Users\\akmal\\OneDrive\\Desktop\\SUTD\\TERM 4\\Project-2D\\Project-2D-starting\\sampleCNF\\largeSat.cnf";
		int counter=0;
		
		try {
			FileReader file = new FileReader(path);
			BufferedReader readthislinebyline = new BufferedReader(file);
			line = readthislinebyline.readLine();
			Graph g = new Graph(6000);   //change number according to file size
			
			while(line!=null) {
				if(line.charAt(0)=='c') {
					System.out.println("Comment line= " + line);
					line = readthislinebyline.readLine();
				}
				if(line.charAt(0)=='p') {
					String [] plien = line.split(" ");
					String filetype = plien[1];
					if (filetype != "cnf") {
						throw new InvalidInputException();
					}
					
					System.out.println("Problem line= " + line);
					line = readthislinebyline.readLine();
				}
				else {
					String [] clauses = line.split(" ");   
					int firstliteral = Integer.parseInt(clauses[0]);  //adding first literal
					int secondliteral = Integer.parseInt(clauses[1]); //adding second literal
					g.addEdges(firstliteral, secondliteral);
					System.out.println(line);
					line = readthislinebyline.readLine();
					
				}
			
				
				
			}
			
		}
		
		catch(FileNotFoundException ex){
			ex.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	
	

}
