package org.example;

import org.example.entities.Comentarios;
import org.example.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat stf = new SimpleDateFormat("DD/MM/YYYY HH:MM:SS");
        Comentarios c1 = new Comentarios("HAVE A NICE TRIP!");
        Comentarios c2 = new Comentarios("WOW! That's awesome!");
        Post p1 = new Post(stf.parse("21/06/2018 13:05:44"), "Traveling to new Zeland", "I'm going to visit this wonderful country!", 12);

        p1.adicionarComentario(c1);
        p1.adicionarComentario(c2);

        System.out.println(p1);

    }
}