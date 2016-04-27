package validator;

public class MinOneNumericCharValidationRule implements ValidationRule {
    @Override
    public boolean validate(String input) {
        if (!input.matches(".*[0-9].*")) {
            return false;
        }

        return true;
    }
}
