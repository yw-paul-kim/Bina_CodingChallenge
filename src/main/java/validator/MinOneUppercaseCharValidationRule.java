package validator;

public class MinOneUppercaseCharValidationRule implements ValidationRule {
    @Override
    public boolean validate(String input) {
        if (input.equals(input.toLowerCase())) {
            return false;
        }

        return true;
    }
}
