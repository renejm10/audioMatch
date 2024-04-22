package com.renejm.audiomatch.main;

import com.renejm.audiomatch.modelos.Cancion;
import com.renejm.audiomatch.modelos.Favoritos;
import com.renejm.audiomatch.modelos.Podcast;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //inicializa captura de teclado
        Scanner sc = new Scanner(System.in);

        Cancion cancion1 = new Cancion();
        System.out.println("Ingrese titulo de la cancion: ");
        cancion1.setTitulo(sc.nextLine());
        System.out.println("Ingrese artista: ");
        cancion1.setArtista(sc.nextLine());
        for (int i = 0; i < 500; i++) {
            cancion1.meGusta();
        }

        for (int i = 0; i < 3000; i++) {
            cancion1.reproduce();
        }

        Podcast podcast1 = new Podcast();
        System.out.println("Ingrese titulo de podcast:");
        podcast1.setTitulo(sc.nextLine());
        System.out.println("Ingrese presentador: ");
        podcast1.setPresentador(sc.nextLine());

        for (int i = 0; i < 100; i++) {
            podcast1.meGusta();
        }

        for (int i = 0; i < 5000; i++) {
            podcast1.reproduce();
        }

        System.out.println("Reproducciones: " + cancion1.getTotalReproducciones());
        System.out.println("Me Gustas: " + cancion1.getTotalMeGusta());

        Favoritos favoritos = new Favoritos();
        favoritos.adicion(podcast1);
        favoritos.adicion(cancion1);

    }
}
