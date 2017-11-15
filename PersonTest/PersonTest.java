class Person {

   // Properties of the class...
   private String name;
   public int    age;
   private String gender;

   // Constructor of the class...
   public Person(String aName, int anAge, String aGender) {
      name = aName;
      age  = anAge;
      gender = aGender;
   }

   // Methods of the class...
   public void talk() {
      System.out.println("Hi, my name's " + name);
      System.out.println("and my age is " + age);
      System.out.println("and my gender is " + gender);
      commentAboutAge();
      System.out.println();
   }

   public void commentAboutAge() {
      if (age < 5) {
         System.out.println("baby");
      }
      if (age == 5) {
         System.out.println("time to start school");
      }
      if (age > 60) {
         System.out.println("old person");
      }
   }

   public void growOlder() {
      age++;
   }

   public void addKnightHood() {
      name = "Sir " + name;
   }

   public void growOlderBy(int years) {
      age += years;
   }

}

class PersonTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      // Person ls = new Person();
      // Person wp = new Person();

      Person ls = new Person("Luke Skywalker",34, "Male");
      Person wp = new Person("Winston Peters",48, "Male");

      ls.talk();
      wp.talk();

      ls.commentAboutAge();
      wp.commentAboutAge();

      wp.growOlder();

      wp.addKnightHood();

      ls.growOlderBy(10);

      ls.talk();
      wp.talk();

      System.out.println(ls.age);

   }

}

