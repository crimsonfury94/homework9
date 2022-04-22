package com.company;

public class Main {

    public static void main(String[] args) {
        Author firstAuthor = new Author("Рэй Брэдбери");
        System.out.println("Автор книги " + firstAuthor.getAuthorName());
        Book firstBook = new Book("Вино из одуванчиков", new Author(" Рэй Брэдбери "), 1957);
        firstBook.setPublishingYear(1989);
        System.out.println(firstBook.getBookName() + firstBook.getAuthorName().getAuthorName() + firstBook.getPublishingYear());
        Author secondAuthor = new Author("Стивен Хантер");
        System.out.println("Автор книги " + secondAuthor.getAuthorName());
        Book secondBook = new Book("Снайпер", new Author(" Стивен Хантер "), 1993);
        secondBook.setPublishingYear(2003);
        System.out.println(secondBook.getBookName() + secondBook.getAuthorName().getAuthorName() + secondBook.getPublishingYear());


    }
}
