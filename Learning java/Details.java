public class Details {

    private String Name;
    private int Age;
    private double Height;


    //getters

    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }
   public double getHeight(){
        return Height;
   }

   //setters

    public void setName(String name){
        this.Name=name;
    }
    public void setAge(int age){
        this.Age=age;
    }
    public void setHeight(double height){
        this.Height=height;
    }

    public static void main(String[] args){

        Details person=new Details();

        person.setName("Logic Codes");
        person.setAge(21);
        person.setHeight(1.25);

        System.out.println("Name: "+person.getName());
        System.out.println("Age: "+person.getAge());
        System.out.println("Height: "+person.getHeight()+"m");

    }
}
