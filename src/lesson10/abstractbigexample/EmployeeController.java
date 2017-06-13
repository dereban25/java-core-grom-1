package lesson10.abstractbigexample;

/**
 * Created by vaha on 10.06.2017.
 */
public class EmployeeController {

    private Employee [] employee = new Employee[100];

   void  paySalaryToEmployess(){

       for(Employee employee : employee){
           employee.paySalary();
           System.out.println("Salary was paid successfully to " + employee.getName() + "employee");
       }
   }


}
