package ua.goit.task1.validate;

public class ValidatorTest {
    public static void main(String[] args) {
        String content = "(073)356-4785";
        Validatable validator = new ContentValidator();
        System.out.println("validator.isValidate(content) = " + validator.isValidate(content));
    }
}
