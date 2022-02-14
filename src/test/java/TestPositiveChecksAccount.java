import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class TestPositiveChecksAccount {
    private String name;

    public TestPositiveChecksAccount(String name){
        this.name=name;
    }

    @Parameterized.Parameters(name = "Test with negative checks = {0} {1} {2} {3}")
    public static Object [][] getNamePositiveTest(){
        return new Object[][]{
                {"1 3"},
                {"123456789 123456789"},
                {"Тимоти Шаламе"},
                {"Timoty Shalome"}
        };
    }
    @Test
    @DisplayName("Test with negative checks")
    public void namePositiveTest(){
     Account account = new Account(name);
     boolean actual = account.checkNameToEmboss();
     assertTrue("Positive scenarios not passed",actual);
    }
}