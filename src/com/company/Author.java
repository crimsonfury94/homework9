package com.company;

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

}
