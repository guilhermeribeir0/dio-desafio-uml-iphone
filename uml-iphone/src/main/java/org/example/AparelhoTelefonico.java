package org.example;

public class AparelhoTelefonico implements RepodutorMusicial, NavegadorInternet {


    public void ligar() {
        System.out.println("Ligado");
    }

    public void atender() {
        System.out.println("Atendido");
    }

    public void iniciarCorrerioVoz() {
        System.out.println("Iniciado Correio de Voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibido pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionada Nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizada Pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocado");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica Selecionada");
    }
}
