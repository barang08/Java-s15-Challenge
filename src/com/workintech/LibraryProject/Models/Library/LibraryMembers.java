package com.workintech.LibraryProject.Models.Library;

import com.workintech.LibraryProject.Enums.MemberTypes;
import com.workintech.LibraryProject.Models.Persons.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryMembers {
    Map<Long, Member> kullanicilar = new HashMap<>();


    public void kullaniciKayit(long id, String kullaniciName, MemberTypes memberTypes ){
        if(kullanicilar.containsKey(id)){
            System.out.println("Sistemde kayıtlısınız:" + kullaniciName);
        } else {
            Member newKullanici = new Member(kullaniciName, memberTypes);
            kullanicilar.put(id,newKullanici);
            System.out.println("Kaydınız oluşturuldu:" + kullaniciName);
        }
    }



    @Override
    public String toString() {
        return "LibraryMembers{" +
                "kullanicilar=" + kullanicilar +

                '}';
    }
}
