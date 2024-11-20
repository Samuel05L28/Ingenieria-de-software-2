package Taller_17.Adapter;

public class ImpresoraInkjetAdapter implements SistemaImprimir {
    private ImpresoraInkJet impresoraInkjet;

    public ImpresoraInkjetAdapter(ImpresoraInkJet impresoraInkjet) {
        this.impresoraInkjet = impresoraInkjet;
    }

    @Override
    public void imprimir() {
        impresoraInkjet.imprimirConTinta();
    }
}