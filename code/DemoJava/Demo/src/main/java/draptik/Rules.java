package draptik;

import org.apache.commons.lang3.StringUtils;

public class Rules {

    private static final String HELLO_WORLD = "Hello World";

    public String helloWorld() {
        return HELLO_WORLD;
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
