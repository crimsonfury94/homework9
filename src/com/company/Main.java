package com.company;

public class Main {

    public static void main(String[] args) {

        Author firstAuthor = new Author("Рэй ", "Брэдбери");
        System.out.println("Автор книги " + firstAuthor.getAuthorFirstName() + firstAuthor.getAuthorSecondName());
        System.out.println(firstAuthor.toSting());

        Book firstBook = new Book("<<Вино из одуванчиков>>", firstAuthor, 1957);
        firstBook.setPublishingYear(1989);
        System.out.println(firstBook.getBookName() + " " + firstBook.getNameAuthor().getAuthorName() + " " + firstBook.getPublishingYear());
        System.out.println(firstAuthor.toSting() + firstBook);

        Author secondAuthor = new Author("Стивен ", "Хантер");
        System.out.println("Автор книги " + secondAuthor.getAuthorFirstName() + secondAuthor.getAuthorSecondName());
        System.out.println(secondAuthor.toSting());

        Book secondBook = new Book("<<Снайпер>>", secondAuthor, 1993);
        secondBook.setPublishingYear(2003);
        System.out.println(secondBook.getBookName() + " " + secondBook.getNameAuthor().getAuthorName() + " " + secondBook.getPublishingYear());
        System.out.println(secondAuthor.toSting() + secondBook);

        System.out.println(firstAuthor.equals(firstBook.authorName));
        System.out.println(firstAuthor.hashCode());
        System.out.println(secondAuthor.equals(secondBook.authorName));
        System.out.println(firstBook.hashCode());


    }
}
