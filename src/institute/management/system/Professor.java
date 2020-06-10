package institute.management.system;

/**
 * This class is responsible for keeping the track
 * of professor's name, id, salary.
 */
public class professor {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new professor object.
     * @param id id for the professor.
     * @param name name of the professor.
     * @param salary salary of the professor.
     */
    public professor(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    /**
     *
     * @return the id of the professor.
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return name of the professor.
     */
    public String getName(){
        return name;
    }


    /**
     *
     * @return the salary of the professor.
     */
    public int getSalary(){
        return  salary;
    }

    /**
     * set the salary.
     * @param salary
     */
    public void setSalary(int salary){
        this.salary=salary;
    }

    /**
     * Adds  to salaryEarned.
     * Removes from the total money earned by the institute.
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        institute.updateTotalMoneySpent(salary);
    }


    @Override
    public String toString() {
        return "Name of the professor: " + name
                +" Total salary earned so far $"
                + salaryEarned;
    }
}
