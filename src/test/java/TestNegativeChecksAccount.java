import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertFalse;

@RunWith(Parameterized.class)
public class TestNegativeChecksAccount {
    private String name;

    public TestNegativeChecksAccount(String name){
        this.name=name;
    }

    @Parameterized.Parameters(name = "Test with negative checks {0} {1} {2} {3} {4} {5} {6}")
    public static Object [][] getNameNegativeTest(){
        return new Object[][]{
                {"123"},
                {"123456789 1234567890"},
                {" Тимоти Шаламе"},
                {"Тимоти Шаламе "},
                {" ТимотиШаламе"},
                {"ТимотиШаламе "},
                {""}
        };
    }
    @Test
    @DisplayName("Test with negative checks")
    public void nameNegativeTest(){
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertFalse("Negative scenarios not passed",actual);
    }
}