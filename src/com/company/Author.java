package com.company;

import java.util.Objects;

public class Author {
    public String authorFirstName;
    public String authorSecondName;


    public Author(String authorFirstName, String authorSecondName) {
        this.authorFirstName = authorFirstName;
        this.authorSecondName = authorSecondName;
    }

    public String getAuthorName() {
        return authorFirstName + authorSecondName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorSecondName() {

        return authorSecondName;
    }

    public String toSting() {
        return this.authorFirstName + this.authorSecondName + " автор книги ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorFirstName.equals(author.authorFirstName) && authorSecondName.equals(author.authorSecondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFirstName, authorSecondName);
    }
}
