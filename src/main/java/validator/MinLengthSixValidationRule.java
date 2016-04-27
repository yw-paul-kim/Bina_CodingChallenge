package validator;

public class MinLengthSixValidationRule implements ValidationRule {
    @Override
    public boolean validate(String input) {
        if (input.length() < 6) {
            return false;
        }

        return true;
    }
}
