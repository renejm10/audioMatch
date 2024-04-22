package com.renejm.audiomatch.modelos;

public class Favoritos {
    public void adicion(Audio audio){
        if (audio.getClasificacion() >=8){
            System.out.println(audio.getTitulo() + "Favorito del momento");
        }else{
            System.out.println(audio.getTitulo() + "Entrando en los populares");
        }
    }
}
