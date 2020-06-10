package institute.management.system;

import java.util.List;

/*
 * Many professors, many students.
 * Implements professors and student
 * using an ArrayList.
 */
public class institute {

    private List<professor> professors;
    private List<Student> students;
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new institute object is created.
     * @param professors list of professors in the institute.
     * @param students list of students int the institute.
     */
    public institute(List<professor> professors, List<Student> students) {
        this.professors = professors;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    /**
     *
     * @return the list of professors int the institute.
     */
    public List<professor> getprofessors() {
        return professors;
    }

    /**
     * Adds a professor to the institute.
     * @param professor the professor to be added.
     */
    public void addprofessor(professor professor) {
        professors.add(professor);
    }

    /**
     *
     * @return the list of students in the institute.
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the institute
     * @param student the student to be added.
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money earned by the institute.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the institute.
     * @param MoneyEarned money that is supposed to be  added.
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the institute.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the institute which
     * is the salary given by the institute to its professors.
     * @param moneySpent the money spent by institute.
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
     }
}
