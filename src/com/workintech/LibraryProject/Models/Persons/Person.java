package com.workintech.LibraryProject.Models.Persons;

import com.workintech.LibraryProject.Enums.MemberTypes;

public class Person {
    private String name;
    private MemberTypes memberTypes;

    public Person(String name) {
        this.name = name;
    }

    public MemberTypes getMemberTypes() {
        return memberTypes;
    }

    public void setMemberTypes(MemberTypes memberTypes) {
        this.memberTypes = memberTypes;
    }

    public Person(String name, MemberTypes memberTypes) {
        this.name = name;
        this.memberTypes = memberTypes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", memberTypes=" + memberTypes +
                '}';
    }
}
