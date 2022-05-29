package aula06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class List_part2 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Tawan");
		list.add("Catia");
		list.add("Roseli");
		list.add(2, "Samara");
		list.add("Cebola");
		list.add("Macarrão");
		list.add("Melancia");

		// size() retorna tamanho da lista
		System.out.println("Tamanho da lista: " + list.size());

		System.out.println("------------------------");

		/*
		 * Remoção por predicado, remove todo mundo que tenha o primeiro index do nome
		 * com 'M'
		 */
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("------------------------");

		// indexOf -> retorna 1 se encontrar na lista e -1 se não encontrar
		System.out.println("IndexOf retorna 1 se encontar e -1 caso não encontre.");
		System.out.println("Index of bob: " + list.indexOf("Bob"));
		System.out.println("Index of Tawan: " + list.indexOf("Tawan"));
		System.out.println("Index of C: " + list.indexOf("C"));

		System.out.println("------------------------");
		
		System.out.println("Retorna elementos tenham 'T' e 'A' ");
		String name = list.stream().filter(el -> el.charAt(0) == 'T').findFirst().orElse(null);
		String nameDois = list.stream().filter(el -> el.charAt(1) == 'a').findFirst().orElse(null);
		System.out.println(name);
		System.out.println(nameDois);
		System.out.println("------------------------");
		/*
		 * Converte o List<String> List para stream faz separa os bois e converte para
		 * string novamente para ser usado.
		 */
		System.out.println("Filtrando 'M' no List<String>");
		List<String> result = list.stream().filter(prop -> prop.charAt(0) == 'C').collect(Collectors.toList());

		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		System.out.println("Os que não foram excluídos");
		// Compara o valor do parametro se encontrar remove!
		list.remove("Cebola");

		// Remove o index 0 da lista
		list.remove(0);
		System.out.println("------------------------");

		// Percorre cada elemento da lista
		for (String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("------------------------");

	}
}
