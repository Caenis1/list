package atividadelist;

import java.util.Scanner;

public class atividadePt1 {
	public class Main {
	    public static void main(String[] args) {
	        
	    	System.out.println("Olá!, Digite os nomes que deseja ordenar e o sexo.");
	    	System.out.println("Dessa forma: ''nome + sigla,''");
	    	
	    	Scanner s = new Scanner(System.in);
	    	
	    	String nomes = s.nextLine();
	    	
	    	System.out.println("Você Digitou: " + nomes);
	    	
	    	 String[] nomesArray = nomes.split(",");
	    	 
	    	 System.out.println(nomesArray); 
	    }
	}

}

