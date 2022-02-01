package main.services;

import main.models.Book;
import main.utils.C;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BookService {

    public void getByTitle(String title) throws FileNotFoundException {

        String titleBook = "";
        String line = "";
        Book book = new Book();

        try (Scanner reader = new Scanner(new FileReader("books.txt"))) {

            while (reader.hasNextLine()) {

                line = reader.nextLine();
                line = line.trim();

                if (line.contains(String.valueOf(title))) {

                    String[] atributes = line.split(",");

                    for (int i = 0; i < atributes.length; i++) {

                        String[] attr = atributes[i].split(":");

                        String index = attr[0].trim();
                        String value = attr[1].trim();

                        switch (index) {
                            case "title" -> book.setTitle(value);
                            case "author" -> book.setAuthor(value);
                            case "publishingCompany" -> book.setPublishingCompany(value);
                            case "numberPages" -> book.setNumberPages(Integer.parseInt(value));
                            default -> C.print("");
                        }
                    }
                }
            }

            if (book.getTitle() != null) {

                C.print("\n============================");
                C.print(book.toString());
                C.print("============================\n");
            } else {
                C.print("Titulo nao encontrado!");
            }

        }
    }
}
