package main.models;

public class Book {

    private String title;

    private String author;

    private String publishingCompany;

    private int numberPages;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    @Override
    public String toString() {
        return "Titulo: " + title +
                "\nAuthor: " + author +
                "\nEditora: " + publishingCompany +
                "\nNumero de paginas: " + numberPages;
    }

    public String toStringToSave() {
        return "title: " + title +
                ", author: " + author +
                ", publishingCompany: " + publishingCompany +
                ", numberPages: " + numberPages;
    }
}
