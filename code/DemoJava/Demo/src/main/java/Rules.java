import org.junit.platform.commons.util.StringUtils;

public class Rules {
    public String helloWorld() {
        return "Hello World";
    }

    public boolean isValid(String s) {
        if (StringUtils.isBlank(s)) {
            return false;
        }

        if (s.length() > 10) {
            return false;
        }
        else {
            return true;
        }
    }
}
