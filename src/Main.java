import com.workintech.LibraryProject.Enums.*;
import com.workintech.LibraryProject.Models.Books.*;

import com.workintech.LibraryProject.Models.Library.Library;
import com.workintech.LibraryProject.Models.Library.LibraryMembers;
import com.workintech.LibraryProject.Models.Persons.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Main {


    public static void main(String[] args) {



        System.out.println("Fizik kitapları bölümü");
        Author authorPhy = new Author("Frederick J. Keller", AuthorType.PHYSIC_AUTHOR);
        Book physicsBooks = new Physics(1,"Fizik Kitapları",146.5,4.0,authorPhy,true, StudyBooktype.PHYSICS);
        Physics fizik1 = new Physics1(2,"Fizik1 ",146.5,4.1,authorPhy,true, StudyBooktype.PHYSICS, SubjectHeadings.MECHANIC);
        System.out.println(fizik1);
        Physics fizik2 = new Physics2(3,"Fizik-2 ", 150.75,  4.2,authorPhy,
                true,StudyBooktype.PHYSICS,SubjectHeadings.DYNAMIC);
        System.out.println(fizik2);

        System.out.println("Matematik kitapları bölümü");

        Author authorMath = new Author("Rory Shipowick", AuthorType.MATHEMATICS_AUTHOR);
        Book mathBooks = new Mathematics(4,"Matematik Kitapları", 158.75, 4.3,authorMath,true,StudyBooktype.MATHEMATICS);
        Book calculus1 = new Calculus1(5,"Calculus-1", 132.48,4.4,authorMath,true,StudyBooktype.MATHEMATICS, Equations.LINEER_EQUATIONS);
        Book calculus2 = new Calculus1(6,"Calculus-2", 148.75,4.5,authorMath,true,StudyBooktype.MATHEMATICS, Equations.DIFFERANTIAL_EQUATIONS);

        System.out.println(mathBooks);
        System.out.println(calculus1);
        System.out.println(calculus2);

        System.out.println("Kimya kitapları Bölümü");

        Author authorChem = new Author("Tahsin Uyar",  AuthorType.CHEMISTRY_AUTHOR);
        Book chemBook = new Chemistry(7,"Kimya kitapları", 143.4, 4.6,authorChem,true,StudyBooktype.CHEMISTRY);
        Chemistry chemistry1 = new Chemistry1(8,"Kimya-1", 165.2,4.7,authorChem,true,StudyBooktype.CHEMISTRY,SubDisciplines.INORGANIC_CHEMISTRY);
        Book chemistry2 = new Chemistry2(9,"Kimya-2 ", 158.75,4.8,authorChem,true,StudyBooktype.CHEMISTRY,SubDisciplines.ORGANIC_CHEMISTRY);

        System.out.println(chemBook);
        System.out.println(chemistry1);
        System.out.println(chemistry2);

        //Kitapları ekleme zamanı
        Library library = new Library();
        Librarian librarian = new Librarian("librarianAdam", library);
        librarian.addBook(fizik1);
        librarian.addBook(fizik2);
        librarian.addBook(calculus1);
        librarian.addBook(calculus2);
        librarian.addBook(chemistry1);
        librarian.addBook(chemistry2);

        librarian.listBookNames();
        System.out.println("****************");

        //Kitapları silelim

        librarian.deleteBook(2);

        librarian.deleteBook(5);
        librarian.deleteBook(18);
        librarian.listBookNames();

        //Kitaplarımızı search edelim



      librarian.searchBook("Kimya-1");

        librarian.editBook(3, "Fizik4", 111.75,4.9,authorPhy,true,StudyBooktype.PHYSICS ); //Kitap başarılı şekilde editlenebiliyor.
        System.out.println(fizik2);


        //Kullanıcıların kayıtlarını oluşturalım.

        LibraryMembers libraryMembers = new LibraryMembers();

        long id = 123456789;
        String kullaniciName1 = "Baran";
        MemberTypes memberTypes = MemberTypes.STUDENT;
        libraryMembers.kullaniciKayit(id,kullaniciName1,memberTypes);

        long id2 = 123456669;
        String kullaniciName2 = "Ali";
        MemberTypes memberTypes1 = MemberTypes.PROFESSOR;
        libraryMembers.kullaniciKayit(id2,kullaniciName2,memberTypes1);

        long id3 = 14725836;
        String kullaniciName3 = "Serdar";
        MemberTypes memberTypes2 = MemberTypes.RESEARCH_ASISTANT;
        libraryMembers.kullaniciKayit(id3,kullaniciName3,memberTypes2);
        System.out.println(libraryMembers);
        System.out.println("************************************************");

        //Login kontrol
        Member member8 =new Member("Baran",MemberTypes.STUDENT);
        boolean isLogin = member8.login(912300419, "123456");
        System.out.println(isLogin);

        System.out.println("****************************************************");
        member8.borrowBook(fizik1); //Fizik1 ve Fizik2 kitapları ödünç alındı.
        System.out.println("***********");
        member8.returnBook(fizik1);








    }
}


