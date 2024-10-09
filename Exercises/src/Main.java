import java.util.HashSet;
import java.util.Set;

import java.util.SortedSet;
import java.util.TreeSet;

import java.util.ArrayList;
import java.util.List;

import java.util.PriorityQueue;
import java.util.Queue;

import java.util.HashMap;
import java.util.Map;

import java.util.SortedMap;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {

        //HashSet
        Set<String> participants = new HashSet<>();
        participants.add("Alice");
        participants.add("Bob");
        participants.add("Charlie");
        participants.add("Alice"); // Duplicado, não será adicionado.

        System.out.println("Participantes: " + participants);


        //TreeSet
        SortedSet<String> students = new TreeSet<>();
        students.add("Carlos");
        students.add("Ana");
        students.add("Bruno");

        System.out.println("Ranking de alunos: " + students);

        //List
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Bananas");
        shoppingList.add("Maçãs");
        shoppingList.add("Bananas"); // Itens duplicados permitidos.

        System.out.println("Lista de compras: " + shoppingList);

        //Queue
        Queue<String> bankQueue = new PriorityQueue<>();
        bankQueue.add("Cliente 3");
        bankQueue.add("Cliente 1");
        bankQueue.add("Cliente 2");

        System.out.println("Próximo a ser atendido: " + bankQueue.poll());
        System.out.println("Fila de atendimento: " + bankQueue);

        //HashMap
        Map<String, String> bookCatalog = new HashMap<>();
        bookCatalog.put("978-3-16-148410-0", "Java Programming");
        bookCatalog.put("978-0-13-468599-1", "Effective Java");

        System.out.println("Catálogo de livros: " + bookCatalog);

        //sortedMap
        SortedMap<String, String> appointments = new TreeMap<>();
        appointments.put("09:00", "Consulta médica");
        appointments.put("13:00", "Reunião com cliente");
        appointments.put("15:00", "Lanche");

        System.out.println("Agenda de compromissos: " + appointments);



    }

}



