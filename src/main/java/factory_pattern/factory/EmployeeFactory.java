package factory_pattern.factory;

import factory_pattern.employees_interface.Employee;
import factory_pattern.employees_concrete.BusinessAnalyst;
import factory_pattern.employees_concrete.QAEngineer;
import factory_pattern.employees_concrete.SoftwareEngineer;
import factory_pattern.exceptions.EmployeeTypeNotFoundException;

public class EmployeeFactory {
    public static Employee getEmployee(String employeeType) throws EmployeeTypeNotFoundException{
        Employee employee;
        switch (employeeType){
            case Employee.SOFTWARE_ENGINEER:
                employee = new SoftwareEngineer(26,"Kamal",175000);
                break;
            case Employee.BUSINESS_ANALYST:
                employee = new BusinessAnalyst(31,"Nisal",165000);
                break;
            case Employee.QA_ENGINEER:
                employee = new QAEngineer(23,"Dasun",125000);
                break;
            default:
                throw new EmployeeTypeNotFoundException("Wrong employee type. please check correct one");
        }
        return employee;
    }
}
