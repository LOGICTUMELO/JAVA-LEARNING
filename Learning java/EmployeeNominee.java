import java.util.Scanner;

public class EmployeeNominee {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int experience,levels,technicalSkills,projectManagementSkills,age;

        System.out.print("Provide the number of years of experience: ");
        experience=in.nextInt();

        System.out.print("Provide the employee's level: ");
        levels=in.nextInt();

        System.out.print("Provide the number of technical skills: ");
        technicalSkills=in.nextInt();

        System.out.print("Provide the number of management related skills: ");
        projectManagementSkills=in.nextInt();

        System.out.print("Provide the employee's age: ");
        age=in.nextInt();


        boolean checkXpAndLvl=(experience>=2)||(levels==5)||(levels==6);
        boolean checkTechSkill=(technicalSkills>=3)||(projectManagementSkills>=5);
        boolean checkAge=(age<60);

        if((checkAge)&&(checkTechSkill)&&(checkXpAndLvl)){
          System.out.println("The employee can be nominated.");
        }else{
            System.out.println("Unfortunately,the employee cannot be nominated");
        }
    }
}
