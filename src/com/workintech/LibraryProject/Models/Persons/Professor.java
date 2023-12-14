package com.workintech.LibraryProject.Models.Persons;

import com.workintech.LibraryProject.Enums.MemberTypes;

public class Professor extends Person{
    public Professor(String name, MemberTypes memberTypes) {
        super(name, MemberTypes.PROFESSOR);
    }
}
