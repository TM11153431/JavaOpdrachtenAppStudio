class Flea {

   // Properties of the class...
   public String name;

   // Constructor of the class...
   public Flea(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a flea called " + name;
   }

}

class Dog {

   // Properties of the class...
   public String name;
   public int    age;
   public Flea   dogsFlea;

   // Constructor of the class...
   public Dog(String aName, int anAge, Flea aFlea) {
      name     = aName;
      age      = anAge;
      dogsFlea = aFlea;
   }

   public String toString() {
      return "I am a dog called " + name + ", I am " + age + " years old and my flea is called " + dogsFlea.name;
   }

}

class DogOwner {
   public String name;
   public int salary;
   public Dog ownersDog;

   public DogOwner(String aName, int aSalary, Dog aDog) {
      name = aName;
      salary = aSalary;
      ownersDog = aDog;
   }

   public String toString() {
      return "My name is " + name + " and my dog is called " + ownersDog.name + " and its flea is called " + ownersDog.dogsFlea.name;
   }
}

class DogTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {
      Flea pop = new Flea("Pop");
      Flea squeak = new Flea("Squeak");
      Flea zip = new Flea("Zip");

      Dog rex = new Dog("Rex", 5, pop);
      Dog jimbo = new Dog("Jimbo", 5, squeak);
      Dog fido = new Dog("Fido", 5, zip);

      System.out.println(fido.toString());

      DogOwner angus = new DogOwner("Angus", 22, rex);
      DogOwner brian = new DogOwner("Brian", 22, jimbo);
      DogOwner charles = new DogOwner("Charles", 22, fido);

      System.out.println(angus.toString());
      System.out.println(brian.toString());
      System.out.println(charles.toString());
   }
}

