package Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    // Inicializar Array
    private List<T> ferramentas;

    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    // Colocar ferramentas no nosso Array
    public void adicionarFerramentas(T ferramenta){
        ferramentas.add(ferramenta);
    }


    // Mostrar ferramentas
    // Colocar ferramentas no nosso Array
    public void mostrarFerramentas() {
        for (T ferramenta : ferramentas) {
            System.out.println(ferramenta);

        }
    }
}
