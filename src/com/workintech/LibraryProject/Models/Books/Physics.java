package com.workintech.LibraryProject.Models.Books;

import com.workintech.LibraryProject.Enums.StudyBooktype;
import com.workintech.LibraryProject.Enums.SubjectHeadings;
import com.workintech.LibraryProject.Models.Persons.Person;

public class Physics extends Book{

    public SubjectHeadings subjectHeadings;

    public Physics(long id, String name, double price, double edition, Person author, boolean isAvailable, StudyBooktype studyBooktype) {
        super(id, name, price, edition, author, isAvailable, studyBooktype);
    }

    public Physics(long id, String name, double price, double edition, Person author, boolean isAvailable, StudyBooktype studyBooktype, SubjectHeadings subjectHeadings) {
        super(id, name, price, edition, author, isAvailable, studyBooktype);
        this.subjectHeadings  = subjectHeadings;
    }

    @Override
    public String toString() {
        return "Physics{" +
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
