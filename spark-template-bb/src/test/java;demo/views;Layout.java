package views;Layout;

import java.io.IOException;


public class views;Layout extends bb.sparkjava.BBSparkTemplate implements bb.runtime.ILayout {

private static views;Layout INSTANCE = new views;Layout();


    public static String render() {
        StringBuilder sb = new StringBuilder();
        renderInto(sb);
        return sb.toString();
    }

    public static void renderInto(Appendable buffer) {
        INSTANCE.renderImpl(buffer);
    }

    public void renderImpl(Appendable buffer) {
    try {
            INSTANCE.header(buffer);
            INSTANCE.footer(buffer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static bb.runtime.ILayout asLayout() {
        return INSTANCE;
    }

    @Override
    public void header(Appendable buffer) throws IOException {
            buffer.append("
    }
    @Override
    public void footer(Appendable buffer) throws IOException {
            buffer.append("
    }
}