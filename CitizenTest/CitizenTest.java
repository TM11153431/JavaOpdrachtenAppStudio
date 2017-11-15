class Citizen {

   // Properties of the class...
   private String name;
   private int    salary;
   private int    savings;
   private int    loan;

   // Constructor of the class...
   public Citizen(String aName, int aSalary, int aSavings, int aLoan) {
      name    = aName;
      salary  = aSalary;
      savings = aSavings;
      loan    = aLoan;
   }

   public Citizen(String aName) {
      name = aName;
      salary = 0;
      savings = 0;
      loan = 0;
   }

   // Methods of the class...
   public int getSalary() {
      return salary;
   }
   public void setSalary(int aSalary) {
      salary = aSalary;
   }
   public void salaryRise(int aSalary) {
      salary += aSalary;
   }
   public int netWorth() {
      return savings - loan;
   }
   public String toString() {
      // ik had dat met + zelf verzonnen hoor niet uit de hint van de ding maar meer uit ervaring met JavaScript das ook bijna
      // Java in principe alleen dan met Script erachter hahahaha eigenlijk dus "Java" + "Script" snap je hem dat is echt super
      // toepasselijk op het moment
      String result = name + " has a salary of " + salary + ", savings of " + savings;

      if (loan > 0) {
         result += " and a loan of " + loan;
      }

      result += ".";

      return result;
   }

}

class CitizenTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Citizen e = new Citizen("Ernie", 50000, 2000,   0);
      Citizen b = new Citizen("Bert", 100000,10000,5000);
      Citizen f = new Citizen("Fred");

      e.salaryRise(10000);
      e.netWorth();

      System.out.println(e.toString());
      System.out.println(b.toString());
      System.out.println(f.toString());

      System.out.println("Ernie's networth is: " + e.netWorth());
      System.out.println("Ernie's salary is: " + e.getSalary());
   }
}
