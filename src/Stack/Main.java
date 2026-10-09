package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Array
        // São estáticos e tem ref de memória
        String[] ninjaArray = new String[3];
        ninjaArray[0] = "Naruto Uzumaki";

        // Listas
        // São dinamicas e tamanho aumenta e diminui conforme precisa
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");

        // Stack
        // O ultimo elemento que entrou é obrigatoriamente o primeiro a sair
        Stack<String> ninjaStack = new Stack<>();
        // Metodos Stack - Push (adiciona elemento) - pop (Tirar elemento da ultimo da lista) - peek(Verifica com elemento esta no topo da lista)
        // size(tamanho da lista )


        ninjaStack.add("Naruto Uzumaki");
        ninjaStack.push("Sasuke Ushiha");
        ninjaStack.push("Sakura Haruno");
        ninjaStack.push("Hinata Hyuga");
        ninjaStack.push("Kakashi Hatake");
        System.out.println("Minha Stack = " + ninjaStack);

        ninjaStack.pop();
        System.out.println("Minha Stack atualizada com pop =   " + ninjaStack);
        System.out.println("Minha Stack elemento do topo: "+ ninjaStack.peek());
        System.out.println("Tamanho da Stack: " + ninjaStack.size() + " elementos");
    }
}
