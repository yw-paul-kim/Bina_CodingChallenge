# Bina_CodingChallenge  
  
1. Command to compile and run the PasswordValidator  
    "gradlew run -PappArgs="['$PASSWORD', '$COMMA_SEPERATED_RULE_IDS']"  
  
    (example: gradlew run -PappArgs="['000000A', '1,2,3']")  
  
2. To add new validation rule  
    Step 1. Create new implementation of ValidationRule class under validator package.  

    Step 2. Add a switch case for a new rule id in the ValidationRuleFactory.createValidationRule method. 
            (In the switch case, return a new instance of associated validation rule implementation with a given rule id.)  
