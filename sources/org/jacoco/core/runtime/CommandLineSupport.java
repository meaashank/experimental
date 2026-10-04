package org.jacoco.core.runtime;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
final class CommandLineSupport {
    private static final char BLANK = ' ';
    private static final int M_ESCAPED = 2;
    private static final int M_PARSE_ARGUMENT = 1;
    private static final int M_STRIP_WHITESPACE = 0;
    private static final char QUOTE = '\"';
    private static final char SLASH = '\\';

    private CommandLineSupport() {
    }

    private static void addArgument(List<String> list, StringBuilder sb2) {
        if (sb2.length() > 0) {
            list.add(sb2.toString());
            sb2.setLength(0);
        }
    }

    public static String quote(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (char c10 : str.toCharArray()) {
            if (c10 == '\"' || c10 == '\\') {
                sb2.append('\\');
            }
            sb2.append(c10);
        }
        if (str.indexOf(32) != -1 || str.indexOf(34) != -1) {
            sb2.insert(0, '\"').append('\"');
        }
        return sb2.toString();
    }

    public static List<String> split(String str) {
        if (str == null || str.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        char c10 = ' ';
        char c11 = 0;
        for (char c12 : str.toCharArray()) {
            if (c11 != 0) {
                if (c11 != 1) {
                    if (c11 == 2) {
                        if (c12 == '\"' || c12 == '\\') {
                            sb2.setCharAt(sb2.length() - 1, c12);
                        } else if (c12 == c10) {
                            addArgument(arrayList, sb2);
                        } else {
                            sb2.append(c12);
                        }
                        c11 = 1;
                    }
                } else if (c12 == c10) {
                    addArgument(arrayList, sb2);
                    c11 = 0;
                } else if (c12 == '\\') {
                    sb2.append('\\');
                    c11 = 2;
                } else {
                    sb2.append(c12);
                }
            } else if (!Character.isWhitespace(c12)) {
                if (c12 == '\"') {
                    c10 = '\"';
                } else {
                    sb2.append(c12);
                    c10 = ' ';
                }
                c11 = 1;
            }
        }
        addArgument(arrayList, sb2);
        return arrayList;
    }

    public static String quote(List<String> list) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        for (String str : list) {
            if (z10) {
                sb2.append(' ');
            }
            sb2.append(quote(str));
            z10 = true;
        }
        return sb2.toString();
    }
}
