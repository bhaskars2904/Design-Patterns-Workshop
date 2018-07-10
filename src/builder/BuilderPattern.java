package builder;

public class BuilderPattern {


 public static void main(String[] args){

     //problem
     Person person1 = new Person("John",null,"Robert",null);
     Person person2 = new Person("Bob",null,null,50);
     System.out.println(person1);
     System.out.println("\n");
     System.out.println(person2);

     //solution
     Person person3 = new Person.PersonBuilder().setFirstName("John")
                                         .setLastName("Robert")
                                         .setAge(20)
                                         .build();
     System.out.println("\n");
     System.out.println(person3);

     //easy to add new attribute
     Person person4 = new Person.PersonBuilder().setFirstName("smith")
                                                .setLastName("bob")
                                                .setGender("Male")
                                                 .build();
     System.out.println("\n");
     System.out.println(person4);
 }

}


