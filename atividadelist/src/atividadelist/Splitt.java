package atividadelist;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Splitt {

	public static void main(String[] args) {
		
		parte1();
		
		parte2();
	}

	private static void parte2() {
		
				System.out.println("Parte 2");
				System.out.println("");
		
		        try (Scanner scanner = new Scanner(System.in)) {
					System.out.println("Digite os nomes e gêneros no formato 'nome:sexo', separados por vírgulas:");
					String input = scanner.nextLine();

					
					String[] entradas = input.split(",");

					
					Map<String, List<String>> grupos = new HashMap<>();
					grupos.put("Masculino", new ArrayList<>());
					grupos.put("Feminino", new ArrayList<>());

      
					for (String entrada : entradas) {
					    String[] partes = entrada.split(":");
					    if (partes.length == 2) {
					        String nome = partes[0].trim();
					        String sexo = partes[1].trim();

					        
					        if (sexo.equalsIgnoreCase("Masculino")) {
					            grupos.get("Masculino").add(nome);
					        } else if (sexo.equalsIgnoreCase("Feminino")) {
					            grupos.get("Feminino").add(nome);
					        } else {
					            System.out.println("Gênero não reconhecido para " + nome + ": " + sexo);
					        }
					    } else {
					        System.out.println("Entrada inválida: " + entrada);
					    }
					}

					
					for (Map.Entry<String, List<String>> grupo : grupos.entrySet()) {
					    Collections.sort(grupo.getValue());
					}
					
					
					System.out.println("\nNomes agrupados e ordenados:");
					for (Map.Entry<String, List<String>> grupo : grupos.entrySet()) {
					    System.out.println(grupo.getKey() + ": " + grupo.getValue());
					    
					}
				}
		    }

	private static void parte1() {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Digite os nomes separados por vírgulas:");
		        String input = scanner.nextLine();

		        String[] nomesArray = input.split(",");

		        List<String> nomesList = new ArrayList<>(Arrays.asList(nomesArray));

		        for (int i = 0; i < nomesList.size(); i++) {
		            nomesList.set(i, nomesList.get(i).trim());
		        }
		        
		        Collections.sort(nomesList);
		        
		        System.out.println("Nomes em ordem alfabética:");
		        for (String nome : nomesList) {
		            System.out.println(nome);
		
		        }
	}
}