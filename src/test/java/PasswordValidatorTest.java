import org.junit.Test;
import static org.junit.Assert.*;

public class PasswordValidatorTest {
    @Test
    public void validate_inputWithNoRule_true() {
        assertTrue(PasswordValidator.validate("abc", new String[0]));
    }

    @Test
    public void validate_invalidInputWithMin6LengthRule_false() {
        assertFalse(PasswordValidator.validate("abc", new String[]{"1"}));
    }

    @Test
    public void validate_validInputWithMin6LengthRule_true() {
        assertTrue(PasswordValidator.validate("123456", new String[]{"1"}));
    }

    @Test
    public void validate_invalidInputWithMinOneUppercaseRule_false() {
        assertFalse(PasswordValidator.validate("123456", new String[]{"2"}));
    }

    @Test
    public void validate_validInputWithMinOneUppercaseRule_true() {
        assertTrue(PasswordValidator.validate("123A56", new String[]{"2"}));
    }

    @Test
    public void validate_invalidInputWithMinOneNumericCharRule_false() {
        assertFalse(PasswordValidator.validate("abcde", new String[]{"3"}));
    }

    @Test
    public void validate_validInputWithMinOneNumericCharRule_true() {
        assertTrue(PasswordValidator.validate("ab1cde", new String[]{"3"}));
    }

    @Test
    public void validate_invalidInputWithRule1and2and3_false() {
        assertFalse(PasswordValidator.validate("abc", new String[]{"1","2","3"}));
    }

    @Test
    public void validate_validInputWithRule1and2and3_true() {
        assertTrue(PasswordValidator.validate("123456A", new String[]{"1","2","3"}));
    }
}
