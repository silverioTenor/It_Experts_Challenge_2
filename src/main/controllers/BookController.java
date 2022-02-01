package main.controllers;

import main.models.Book;
import main.services.BookService;
import main.utils.C;

import java.io.*;
import java.util.Scanner;

public class BookController {

    public static void getBook(Scanner reader) {

        BookService bookService = new BookService();

        C.print("Digite o nome do titulo a ser pesquisado: ");
        String titleBook = reader.nextLine();

        reader.nextLine();

        try {
            bookService.getByTitle(titleBook);
        } catch (FileNotFoundException e) {
            C.print(e.getMessage());
        }
    }

    public static void createBook(Scanner reader) {

        Book book = new Book();
        reader.nextLine();

        C.print("Entre com o nome do titulo");
        book.setTitle(reader.nextLine());

        C.print("Entre com o nome do autor");
        book.setAuthor(reader.nextLine());

        C.print("Entre com o nome da editora");
        book.setPublishingCompany(reader.nextLine());

        C.print("Entre com o numero de paginas do livro");
        book.setNumberPages(reader.nextInt());

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("books.txt", true))) {

            writer.write(book.toStringToSave());
            writer.newLine();

            C.print("Castro feito com sucesso!");

        } catch (IOException e) {
            C.print(e.getMessage());
        }
    }
}
