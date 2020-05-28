package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import org.junit.Assert;
import org.junit.Test;

import javax.servlet.http.HttpSession;

import static org.junit.Assert.*;

public class RegisterTest {

    @Test
    public void execute() throws LoginSampleException {
        try {
            String email = "mail";
            String password1 = "password";
            String password2 = "passwor";
            if (password1.equals(password2)) {
                User user = LogicFacade.createUser(email, password1);

            } else {
                throw new LoginSampleException("the two passwords did not match");
            }
            fail();
        }
        catch (LoginSampleException e) {
            final String expected = "the two passwords did not match";
            Assert.assertEquals(expected, e.getMessage());
        }
    }
}