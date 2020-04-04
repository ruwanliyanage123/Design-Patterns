package factory_pattern.driver_class;

import factory_pattern.employees_concrete.BusinessAnalyst;
import factory_pattern.employees_concrete.QAEngineer;
import factory_pattern.employees_concrete.SoftwareEngineer;
import factory_pattern.employees_interface.Employee;
import factory_pattern.factory.EmployeeFactory;

public class DriverClass {
    public static void main(String[] args) {
        /**
         * to create a software engineer object without using new keyword
         * needed to type cast as software engineer
         */
        SoftwareEngineer softwareEngineer = (SoftwareEngineer) EmployeeFactory.getEmployee(Employee.SOFTWARE_ENGINEER);
        System.out.println("software engineer name :"+softwareEngineer.getName());
        System.out.println("software engineer age :"+softwareEngineer.getAge());
        System.out.println("software engineer salary :"+softwareEngineer.getSalary());

        /**
         * to create a business analyst object without using new keyword
         * needed to type cast as business analyst
         */
        BusinessAnalyst businessAnalyst = (BusinessAnalyst) EmployeeFactory.getEmployee(Employee.BUSINESS_ANALYST);
        System.out.println("business analyst name :"+businessAnalyst.getName());
        System.out.println("business analyst age :"+businessAnalyst.getAge());
        System.out.println("business analyst salary :"+businessAnalyst.getSalary());

        /**
         * to create a qa engineer object without using new keyword
         * needed to type cast as qa engineer
         */
        QAEngineer qaEngineer = (QAEngineer) EmployeeFactory.getEmployee(Employee.QA_ENGINEER);
        System.out.println("qa engineer name :"+qaEngineer.getName());
        System.out.println("qa engineer age :"+qaEngineer.getAge());
        System.out.println("qa engineer salary :"+qaEngineer.getSalary());
    }
}
