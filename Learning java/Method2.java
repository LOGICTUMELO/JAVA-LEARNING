public class Method2 {
    public static void main(String[] args) {
      Method2 Names=new Method2();
      String T=Names.userNames("Logic", "Codes");

      System.out.println("Hello world this is "+ T);
    }

    public String userNames(String fname,String lname){
          String Fullnames=fname+" "+lname;
          return Fullnames;
    }
}
