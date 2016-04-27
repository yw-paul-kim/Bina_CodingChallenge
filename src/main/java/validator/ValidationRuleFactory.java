package validator;

public class ValidationRuleFactory {
    public static ValidationRule createValidationRule(String id) {
        switch (id) {
            case "1":
                return new MinLengthSixValidationRule();
            case "2":
                return new MinOneUppercaseCharValidationRule();
            case "3":
                return new MinOneNumericCharValidationRule();
            default:
                throw new RuntimeException(String.format("Invalid validator id: %s", id));
        }
    }
}
