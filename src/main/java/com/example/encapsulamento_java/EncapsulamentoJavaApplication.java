package com.example.encapsulamento_java;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EncapsulamentoJavaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EncapsulamentoJavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ControleRemoto controleRemoto = new ControleRemoto();

		System.out.println("Controle remoto criado: ");
		controleRemoto.abrirMenu();
		controleRemoto.fecharMenu();
		controleRemoto.ligar();
		controleRemoto.play();
		controleRemoto.ligarMudo();

		controleRemoto.abrirMenu();
		controleRemoto.fecharMenu();
		controleRemoto.desligarMudo();
		controleRemoto.maisVolume();
		controleRemoto.pause();

		controleRemoto.abrirMenu();
		controleRemoto.fecharMenu();
		controleRemoto.menosVolume();
		controleRemoto.desligar();

		controleRemoto.abrirMenu();
		controleRemoto.fecharMenu();

	}
}
