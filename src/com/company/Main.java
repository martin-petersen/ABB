package com.company;


import javax.swing.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
        arvore.insert(100);
        arvore.insert(50);
        arvore.insert(20);
        arvore.insert(60);
        arvore.insert(70);
        arvore.insert(80);
        arvore.insert(150);

        System.out.println(arvore.isBalanced());

//        Random random = new Random();
//        for (int i = 0; i < 30; i++) {
//            arvore.insert(
//                new Node(i)
//            );
//        }
//
        JFrame frame = new JFrame("Visualizador de ABB");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);

        ArvoreBinariaBuscaView view = new ArvoreBinariaBuscaView(arvore);
        frame.add(view);

        frame.setVisible(true);
    }
}
