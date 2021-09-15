package com.example.encapsulamento_java;

public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Construtor
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    //Getters
    private int getVolume(){
        return this.volume;
    }

    private boolean getLigado(){
        return this.ligado;
    }

    private boolean getTocando(){
        return this.tocando;
    }

    //Setters
    private void setVolume(int volume){
        this.volume = volume;
    }

    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("Controle remoto ligado");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("Controle remoto desligado");
    }

    @Override
    public void abrirMenu() {
        System.out.println("----------MENU CONTROLE REMOTO-----------");

        System.out.print("Estado controle: ");
        if(this.getLigado())
            System.out.print("ligado \n");
        else
            System.out.print("desligado \n");

        System.out.print("Volume: ");
        for(int i = 0; i < this.getVolume(); i=i+10){
            System.out.print("|");
        }

        System.out.print("\nPlayer: ");
        if(this.getTocando())
            System.out.print("tocando\n");
        else
            System.out.print("pausado\n");

        System.out.println("-----------------------------------------");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Menu do controle fechado");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()) {
            this.setVolume(this.getVolume() + 1);
            System.out.println("Novo volume: "+ this.getVolume());
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()) {
            this.setVolume(this.getVolume() - 1);
            System.out.println("Novo volume: " + this.getVolume());
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
            System.out.println("Mudo ligado");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
            System.out.println("Mudo desligado");
            System.out.println("Novo volume: " + this.getVolume());
        }
    }

    @Override
    public void play(){
        if(this.getLigado() && !this.getTocando()){
            this.setTocando(true);
            System.out.println("Player ativado");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
            System.out.println("Player pausado");
        }
    }
}
