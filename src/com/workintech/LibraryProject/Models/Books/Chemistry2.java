package com.workintech.LibraryProject.Models.Books;

import com.workintech.LibraryProject.Enums.StudyBooktype;
import com.workintech.LibraryProject.Enums.SubDisciplines;
import com.workintech.LibraryProject.Models.Persons.Person;

public class Chemistry2 extends Chemistry{
    public Chemistry2(long id, String name, double price, double edition, Person author, boolean isAvailable, StudyBooktype studyBooktype, SubDisciplines subDisciplines) {
        super(id, name, price, edition, author, isAvailable, studyBooktype,subDisciplines );
    }

    @Override
    public String toString() {
        return "Chemistry{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", edition=" + getEdition() +
                ", author=" + getAuthor() +
                ", isAvailable=" + isAvailable() +
                ", studyBooktype=" + getStudyBooktype() +
                ", subDisciplines=" + subDisciplines +
                '}';
    }
}
