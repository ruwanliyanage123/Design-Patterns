package factory_pattern;

import factory_pattern.employees.BusinessAnalyst;
import factory_pattern.employees.QAEngineer;
import factory_pattern.employees.SoftwareEngineer;

public class EmployeeFactory {
    public static Employee getEmployee(String employeeType){
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
                throw new IllegalArgumentException();
        }
        return employee;
    }
}
