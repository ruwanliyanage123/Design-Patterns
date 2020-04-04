package factory_pattern.driver_class;

import factory_pattern.employees_concrete.BusinessAnalyst;
import factory_pattern.employees_concrete.QAEngineer;
import factory_pattern.employees_concrete.SoftwareEngineer;
import factory_pattern.employees_interface.Employee;
import factory_pattern.exceptions.EmployeeTypeNotFoundException;
import factory_pattern.factory.EmployeeFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverClass {
    private static Logger logger = LoggerFactory.getLogger(DriverClass.class);

    public static void main(String[] args) {
        /**
         * to create a software engineer object without using new keyword
         * needed to type cast as software engineer
         */
        SoftwareEngineer softwareEngineer = null;
        try {
            softwareEngineer = (SoftwareEngineer) EmployeeFactory.getEmployee(Employee.SOFTWARE_ENGINEER);
            logger.info("software engineer name :" + softwareEngineer.getName());
            logger.info("software engineer age :" + softwareEngineer.getAge());
            logger.info("software engineer salary :" + softwareEngineer.getSalary());
        } catch (EmployeeTypeNotFoundException e) {
            String message = "Check the Software engineer type. You have entered a invalid type";
            logger.error(message, e);
        }

        /**
         * to create a business analyst object without using new keyword
         * needed to type cast as business analyst
         */
        BusinessAnalyst businessAnalyst = null;
        try {
            businessAnalyst = (BusinessAnalyst) EmployeeFactory.getEmployee(Employee.BUSINESS_ANALYST);
            logger.info("business analyst name :" + businessAnalyst.getName());
            logger.info("business analyst age :" + businessAnalyst.getAge());
            logger.info("business analyst salary :" + businessAnalyst.getSalary());
        } catch (EmployeeTypeNotFoundException e) {
            String message = "Check the business analyst type. You have entered a invalid type";
            logger.error(message, e);
        }

        /**
         * to create a qa engineer object without using new keyword
         * needed to type cast as qa engineer
         */
        QAEngineer qaEngineer = null;
        try {
            qaEngineer = (QAEngineer) EmployeeFactory.getEmployee(Employee.QA_ENGINEER);
            logger.info("qa engineer name :" + qaEngineer.getName());
            logger.info("qa engineer age :" + qaEngineer.getAge());
            logger.info("qa engineer salary :" + qaEngineer.getSalary());
        } catch (EmployeeTypeNotFoundException e) {
            String message = "Check the qa engineer type. You have entered a invalid type";
            logger.error(message, e);
        }
    }
}
