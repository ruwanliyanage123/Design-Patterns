package factory_pattern.exceptions;

public class EmployeeTypeNotFoundException extends Exception {
    public EmployeeTypeNotFoundException(String message) {
        super(message);
    }
}
