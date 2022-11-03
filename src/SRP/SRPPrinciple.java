package SRP;

public class SRPPrinciple{

    public static void main(String[] args){
        Instrumento trombonDorado = new Instrumento("Dorado", "Trombon");
        trombonDorado.tocar();

        InstrumentoPrinter printTrombonDorado = new InstrumentoPrinter(trombonDorado);
        printTrombonDorado.imprimir();

    }

}
