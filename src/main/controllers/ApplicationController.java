package main.controllers;

import main.utils.C;

import java.util.Scanner;

public class ApplicationController {

    public static void start() {

        int option = 0;

        C.print("==========================");
        C.print("BEM VINDO A SUA BIBLIOTECA");
        C.print("==========================\n");

        try (Scanner reader = new Scanner(System.in)) {

            do {
                C.print("==============================");
                C.print("Digite 1 para NOVO LIVRO");
                C.print("Digite 2 para CONSULTAR LIVROS");
                C.print("Digite 0 para SAIR");
                C.print("==============================\n");

                option = reader.nextInt();

                switch (option) {
                    case 1 -> BookController.createBook(reader);
                    case 2 -> BookController.getBook(reader);
                    case 0 -> C.print("Voce saiu do programa.");
                    default -> C.print("Voce digitou uma opcao invalida!\n");
                }
            } while (option != 0);
        }
    }
}
