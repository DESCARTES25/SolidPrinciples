package SRP;/*
    S: Single responsibility principle o Principio de responsabilidad única
 */

public class Instrumento {
    String color;
    String tipo;
    public Instrumento(String color, String tipo){
        this.color = color;
        this.tipo = tipo;
    }
    public void tocar(){
        System.out.println("Tocando SRP.Instrumento");
    }
    /*public void imprimir(){
        System.out.println("Imprimiento SRP.Instrumento: Color-" + this.color + " Tipo-" + this.tipo);
    }*/
}

