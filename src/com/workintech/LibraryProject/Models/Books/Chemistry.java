package com.workintech.LibraryProject.Models.Books;

import com.workintech.LibraryProject.Enums.StudyBooktype;
import com.workintech.LibraryProject.Enums.SubDisciplines;
import com.workintech.LibraryProject.Models.Persons.Person;

public class Chemistry extends Book{

    public SubDisciplines subDisciplines;
    public Chemistry(long id, String name, double price, double edition, Person author, boolean isAvailable, StudyBooktype studyBooktype) {
        super(id, name, price, edition, author, isAvailable, studyBooktype);
    }
    public Chemistry(long id, String name, double price, double edition, Person author, boolean isAvailable, StudyBooktype studyBooktype,SubDisciplines subDisciplines) {
        super(id, name, price, edition, author, isAvailable, studyBooktype);
        this.subDisciplines = subDisciplines;
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

                '}';
    }



}
