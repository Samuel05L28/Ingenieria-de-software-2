package Taller_17.Adapter;

public class Main {
    public static void main(String[] args) {

        ImpresoraLaser laser = new ImpresoraLaser();
        ImpresoraInkJet inkJet = new ImpresoraInkJet();


        SistemaImprimir laserAdapter = new ImpresoraLaserAdapter(laser);
        SistemaImprimir inkJetAdapter = new ImpresoraInkjetAdapter(inkJet);


        laserAdapter.imprimir();
        inkJetAdapter.imprimir(); 
    }
}
