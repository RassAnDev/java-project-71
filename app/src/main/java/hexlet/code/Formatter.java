package hexlet.code;

import hexlet.code.formatters.JsonFormatter;
import hexlet.code.formatters.PlainFormatter;
import hexlet.code.formatters.StylishFormatter;

import java.util.List;
import java.util.Map;

public class Formatter {
    public static String format(List<Map<String, Object>> listForFormatting, String requiredFormat) throws Exception {
        if (requiredFormat.equals("stylish")) {
            return StylishFormatter.format(listForFormatting);
        } else if (requiredFormat.equals("plain")) {
            return PlainFormatter.format(listForFormatting);
        } else if (requiredFormat.equals("json")) {
            return JsonFormatter.format(listForFormatting);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
