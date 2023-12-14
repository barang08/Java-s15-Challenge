package com.workintech.LibraryProject.Models.Persons;

import com.workintech.LibraryProject.Enums.MemberTypes;

public class Student extends Person{

    public Student(String name, MemberTypes memberTypes) {
        super(name, MemberTypes.STUDENT);

    }
}
