package institute.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Professor laxman = new Professor(1,"laxman",500);
        Professor madhan = new Professor(2,"madhan",700);
        Professor vaasudev = new Professor(3,"vaasudev",600);

        List<Professor> ProfessorList = new ArrayList<>();
        ProfessorList.add(laxman);
        ProfessorList.add(madhan);
        ProfessorList.add(vaasudev);


        Student tamannah = new Student(1,"tamannah",4);
        Student rahul = new Student(2,"rahul Vasudev",12);
        Student rithvik = new Student(3,"rithvik",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(tamannah);
        studentList.add(rithvik);
        studentList.add(rahul);




        institute iit = new institute(ProfessorList,studentList);

        Professor Mohan = new Professor(6,"Mohan", 900);

        iit.addProfessor(Mohan);


        tamannah.payFees(5000);
        rahul.payFees(6000);
        System.out.println("iit has earned $"+ iit.getTotalMoneyEarned());

        System.out.println("------Making institute PAY SALARY----");
        laxman.receiveSalary(laxman.getSalary());
        System.out.println("iit has spent for salary to " + laxman.getName()
        +" and now has $" + iit.getTotalMoneyEarned());

        vaasudev.receiveSalary(vaasudev.getSalary());
        System.out.println("iit has spent for salary to " + vaasudev.getName()
                +" and now has $" + iit.getTotalMoneyEarned());


        System.out.println(rahul);

        madhan.receiveSalary(madhan.getSalary());

        System.out.println(madhan);


    }
}
