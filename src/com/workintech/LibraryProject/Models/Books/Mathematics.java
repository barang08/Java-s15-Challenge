package com.workintech.LibraryProject.Models.Books;

import com.workintech.LibraryProject.Enums.Equations;
import com.workintech.LibraryProject.Enums.StudyBooktype;
import com.workintech.LibraryProject.Models.Persons.Person;

public class Mathematics extends Book{

public Equations equations;
    public Mathematics(long id, String name, double price, double edition, Person author, boolean isAvailable, StudyBooktype studyBooktype) {
        super(id, name, price, edition, author, isAvailable, studyBooktype);
    }
    public Mathematics(long id, String name, double price, double edition, Person author, boolean isAvailable, StudyBooktype studyBooktype,Equations equations) {
        super(id, name, price, edition, author, isAvailable, studyBooktype);
        this.equations = equations;
    }
    @Override
    public String toString() {
        return "Mathematics{" +
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
