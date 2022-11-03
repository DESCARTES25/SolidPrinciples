package SRP;

public class InstrumentoPrinter {
    Instrumento instrumento;

    public InstrumentoPrinter(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    public void imprimir() {
        System.out.println("Imprimiento SRP.Instrumento: Color-" + this.instrumento.color + " Tipo-" + this.instrumento.tipo);
    }
}
