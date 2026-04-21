package Animal;

public class Animal {
    public static void main(String[] a){
        // Person newStudent= new Person();
        Person newStudent =new Student();
        newStudent.info();
        Person teacher =new Teacher();
        teacher.info();
        Person principal =new Principal();
        principal.info();
        // principal.Salary();//not accessable
        Principal newPerson= new Principal();
        newPerson.Salary();

    }
    
}
// ABSTRACT CLASSES CAN NEVER BE INSTANTIATED, OBJECTS CAN NO BE CREATED
//ABSTRACT CLASSES CAN HAVE BOTH ABSTRACT, NON-ABS METHODS
//ABSTRACT CLASSES CAN BE USED AS A REFERENCE FOR THE CHILD CLASS TYPE
abstract class Person{
    int age=20;
    abstract void info();

    public int getAge(){
        return age;
    }

}

class Student extends Person{
    String name="John Doe";
    void info(){
        System.out.println("I am a student");
    }
}
class Teacher extends Person{
    String name="David";
     void info(){
        System.out.println("I am a teacher");
    }
}
class Principal extends Person{
    String name="John";
     void info(){
        System.out.println("I am a principal");
    }
    void Salary(){
        
        System.out.println("salary info");
    }
    void expereince(){
        System.out.println("exp info");
        
    }
}

// class MasterStudent extends class Student, Person, Professon, SoccerPlayer{

// }
interface Professor{// do not have constructor 
    void publishArticle();
    void getNobelPrize();
}

interface Player{
    void publishArticle();
    void getNobelPrize();
}
interface Writer{
    void publishArticle();
    void getNobelPrize();
}
// class MasterStudent implements Professor, Player, Writer{

// }


// class something extends Person implements Player, Writer, Professor{

// }

// class XYZ implements A,B,C extends D{} wrong  

