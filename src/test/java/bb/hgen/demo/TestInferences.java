package bb.hgen.demo;

import java.io.IOException;


public class TestInferences extends bb.runtime.BaseBBTemplate {

private static TestInferences INSTANCE = new TestInferences();


public static class mySection extends bb.runtime.BaseBBTemplate {

private static mySection INSTANCE = new mySection();


    public static String render(String str) {
        StringBuilder sb = new StringBuilder();
        renderInto(sb, str);
        return sb.toString();
    }

    public static void renderInto(Appendable buffer, String str) {
        INSTANCE.renderImpl(buffer, str);
    }

    public void renderImpl(Appendable buffer, String str) {
        try {            buffer.append("\n            <h1> urmom</h1>\n        ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String toS(Object o) {
        return o == null ? "" : o.toString();
    }
}
public static class shouldBeABoolean extends bb.runtime.BaseBBTemplate {

private static shouldBeABoolean INSTANCE = new shouldBeABoolean();


    public static String render(boolean blah) {
        StringBuilder sb = new StringBuilder();
        renderInto(sb, blah);
        return sb.toString();
    }

    public static void renderInto(Appendable buffer, boolean blah) {
        INSTANCE.renderImpl(buffer, blah);
    }

    public void renderImpl(Appendable buffer, boolean blah) {
        try {            buffer.append("\n    <h1>");
            buffer.append(toS(blah));
            buffer.append("</h1>\n    ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String toS(Object o) {
        return o == null ? "" : o.toString();
    }
}
    public static String render() {
        StringBuilder sb = new StringBuilder();
        renderInto(sb);
        return sb.toString();
    }

    public static void renderInto(Appendable buffer) {
        INSTANCE.renderImpl(buffer);
    }
    public void renderImpl(Appendable buffer) {
        try {            buffer.append("<!DOCTYPE html>\n<html lang=\"en\">\n    ");
            boolean blah = false;
            buffer.append("\n    ");
            if(blah) {
        int str = 0;
    } else {
        String str = "int str";
            buffer.append("\n        ");

mySection.renderInto(buffer, str);
            buffer.append("\n    ");
            }
            buffer.append("\n    ");

shouldBeABoolean.renderInto(buffer, blah);
            buffer.append("\n</html>");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String toS(Object o) {
        return o == null ? "" : o.toString();
    }
}