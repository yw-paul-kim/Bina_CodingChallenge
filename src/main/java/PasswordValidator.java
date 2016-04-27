import java.util.ArrayList;
import java.util.List;

import validator.ValidationRule;
import validator.ValidationRuleFactory;

public class PasswordValidator {
    public static boolean validate(String password, String[] validationRuleIds) {
        List<ValidationRule> rules = new ArrayList<>();
        for (String validationRuleId : validationRuleIds) {
            rules.add(ValidationRuleFactory.createValidationRule(validationRuleId));
        }

        for (ValidationRule rule : rules) {
            if (!rule.validate(password))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            throw new RuntimeException("Missing arguments.");
        }

        String password = args[0];
        String[] validationRuleIds = args[1].split(",");

        boolean validationResult = PasswordValidator.validate(password, validationRuleIds);

        System.out.println(validationResult);
    }
}
