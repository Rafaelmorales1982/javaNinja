package Queues;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Inicializando Array
        String[] ninjasArray = new String[6];

        // Inicializando Lista
        List<String> ninjaList = new ArrayList<>();

        // Inicializando Stack
        Stack<String> ninjasStack = new Stack<>();

        // Inicianlizando Queue Filas
        Queue<String> ninjasQueue = new LinkedList<>();

        // adicionando na fila (Queue)
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");

        // Mostrar a fila
        System.out.println("Ninjas na fila 1: "+ ninjasQueue);

        // Tirar um ninja da fila
        ninjasQueue.poll(); // Tira primeiro da cabeça da fila será o Naruto
        System.out.println("Ninjas na fila 2: "+ ninjasQueue);

        // Como ver quem é o primeiro da fila

        System.out.println("Ninjas na fila 3: "+ ninjasQueue.peek());
        // Na Queue Não consegue deletar o ultimo nem no meio apenas deleta de forma sequecial do primeiro para o ultimo

    }
}
