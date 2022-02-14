import java.util.regex.Pattern;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean  checkNameToEmboss() {
        final String regex = "\\S{1,9} {1}\\S{1,9}";

        if(Pattern.matches(regex,name)){
            System.out.println(true);
            return true;
        }else {
            System.out.println(false);
            return false;
        }
    }
}