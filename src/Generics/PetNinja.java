package Generics;

public class PetNinja {
    private String nomePetNinja;

    public PetNinja(String nomePetNinja) {
        this.nomePetNinja = nomePetNinja;
    }

    public String getNomePetNinja() {
        return nomePetNinja;
    }

    public void setNomePetNinja(String nomePetNinja) {
        this.nomePetNinja = nomePetNinja;
    }

    @Override
    public String toString() {
        return "nome do Pet Ninja  =" + nomePetNinja;
    }
}
