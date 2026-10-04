package org.javia.arity;

import com.android.launcher3.IconCache;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes6.dex */
class Lexer {
    static final int ADD = 1;
    static final int CALL = 11;
    static final int COMMA = 12;
    static final int CONST = 10;
    static final int DIV = 4;
    static final int END = 15;
    private static final char END_MARKER = '$';
    static final int FACT = 8;
    static final int LPAREN = 13;
    static final int MOD = 5;
    static final int MUL = 3;
    static final int NUMBER = 9;
    static final int PERCENT = 17;
    static final int POWER = 7;
    static final int RPAREN = 14;
    static final int SQRT = 16;
    static final int SUB = 2;
    static final int UMIN = 6;
    private static final char UNICODE_DIV = 247;
    private static final char UNICODE_MINUS = 8722;
    private static final char UNICODE_MUL = 215;
    private static final char UNICODE_SQRT = 8730;
    private static final String WHITESPACE = " \n\r\t";
    private SyntaxException exception;
    private char[] input = new char[32];
    private int pos;
    static final Token TOK_ADD = new Token(1, 4, 2, 3);
    static final Token TOK_SUB = new Token(2, 4, 2, 4);
    static final Token TOK_MUL = new Token(3, 5, 2, 5);
    static final Token TOK_DIV = new Token(4, 5, 2, 6);
    static final Token TOK_MOD = new Token(5, 5, 2, 7);
    static final Token TOK_UMIN = new Token(6, 6, 1, 9);
    static final Token TOK_POWER = new Token(7, 7, 3, 10);
    static final Token TOK_FACT = new Token(8, 8, 4, 11);
    static final Token TOK_PERCENT = new Token(17, 9, 4, 12);
    static final Token TOK_SQRT = new Token(16, 10, 1, 13);
    static final Token TOK_LPAREN = new Token(13, 1, 1, 0);
    static final Token TOK_RPAREN = new Token(14, 3, 0, 0);
    static final Token TOK_COMMA = new Token(12, 2, 0, 0);
    static final Token TOK_END = new Token(15, 0, 0, 0);
    static final Token TOK_NUMBER = new Token(9, 20, 0, 0);
    static final Token TOK_CONST = new Token(10, 20, 0, 0);

    public Lexer(SyntaxException syntaxException) {
        this.exception = syntaxException;
    }

    private void init(String str) {
        int length = str.length();
        int i10 = length + 1;
        if (this.input.length < i10) {
            this.input = new char[i10];
        }
        str.getChars(0, length, this.input, 0);
        this.input[length] = '$';
        this.pos = 0;
    }

    public Token nextToken() throws SyntaxException {
        char[] cArr;
        int i10;
        char c10;
        char[] cArr2;
        char c11;
        char[] cArr3;
        while (WHITESPACE.indexOf(this.input[this.pos]) != -1) {
            this.pos++;
        }
        char[] cArr4 = this.input;
        int i11 = this.pos;
        char c12 = cArr4[i11];
        int i12 = i11 + 1;
        this.pos = i12;
        switch (c12) {
            case '!':
                return TOK_FACT;
            case '\"':
            case '&':
            case '\'':
            case '.':
            default:
                if (('0' > c12 || c12 > '9') && c12 != '.') {
                    if (('a' <= c12 && c12 <= 'z') || ('A' <= c12 && c12 <= 'Z')) {
                        while (true) {
                            cArr = this.input;
                            i10 = i12 + 1;
                            c10 = cArr[i12];
                            if (('a' <= c10 && c10 <= 'z') || (('A' <= c10 && c10 <= 'Z') || ('0' <= c10 && c10 <= '9'))) {
                                i12 = i10;
                            }
                        }
                        if (c10 == '\'') {
                            c10 = cArr[i10];
                            i10 = i12 + 2;
                        }
                        String strValueOf = String.valueOf(cArr, i11, (i10 - 1) - i11);
                        while (WHITESPACE.indexOf(c10) != -1) {
                            c10 = this.input[i10];
                            i10++;
                        }
                        if (c10 == '(') {
                            this.pos = i10;
                            return new Token(11, 0, 1, 0).setAlpha(strValueOf);
                        }
                        this.pos = i10 - 1;
                        return TOK_CONST.setAlpha(strValueOf);
                    }
                    if ((c12 >= 913 && c12 <= 937) || ((c12 >= 945 && c12 <= 969) || c12 == 8734)) {
                        return TOK_CONST.setAlpha("" + c12);
                    }
                    if (c12 == '^') {
                        return TOK_POWER;
                    }
                    if (c12 == 215) {
                        return TOK_MUL;
                    }
                    if (c12 == 247) {
                        return TOK_DIV;
                    }
                    if (c12 == 8722) {
                        return TOK_SUB;
                    }
                    if (c12 == 8730) {
                        return TOK_SQRT;
                    }
                    throw this.exception.set("invalid character '" + c12 + "'", i11);
                }
                if (c12 == '0') {
                    char lowerCase = Character.toLowerCase(cArr4[i12]);
                    if ((lowerCase == 'x' ? 16 : lowerCase == 'b' ? 2 : lowerCase == 'o' ? 8 : 0) > 0) {
                        int i13 = i11 + 2;
                        while (true) {
                            cArr3 = this.input;
                            int i14 = i13 + 1;
                            char c13 = cArr3[i13];
                            if (('a' <= c13 && c13 <= 'z') || (('A' <= c13 && c13 <= 'Z') || ('0' <= c13 && c13 <= '9'))) {
                                i13 = i14;
                            }
                        }
                        String strValueOf2 = String.valueOf(cArr3, i11 + 2, (i13 - 2) - i11);
                        this.pos = i13;
                        try {
                            return TOK_NUMBER.setValue(Integer.parseInt(strValueOf2, r1));
                        } catch (NumberFormatException unused) {
                            throw this.exception.set("invalid number '" + String.valueOf(this.input, i11, i13 - i11) + "'", i11);
                        }
                    }
                }
                while (true) {
                    if (('0' > c12 || c12 > '9') && c12 != '.' && c12 != 'E' && c12 != 'e') {
                        int i15 = i12 - 1;
                        this.pos = i15;
                        String strValueOf3 = String.valueOf(this.input, i11, i15 - i11);
                        try {
                            return strValueOf3.equals(IconCache.EMPTY_CLASS_NAME) ? TOK_NUMBER.setValue(0.0d) : TOK_NUMBER.setValue(Double.parseDouble(strValueOf3));
                        } catch (NumberFormatException unused2) {
                            throw this.exception.set("invalid number '" + strValueOf3 + "'", i11);
                        }
                    }
                    if ((c12 == 'E' || c12 == 'e') && ((c11 = (cArr2 = this.input)[i12]) == '-' || c11 == 8722)) {
                        cArr2[i12] = SignatureVisitor.SUPER;
                        i12++;
                    }
                    c12 = this.input[i12];
                    i12++;
                }
                break;
            case '#':
                return TOK_MOD;
            case '$':
                return TOK_END;
            case '%':
                return TOK_PERCENT;
            case '(':
                return TOK_LPAREN;
            case ')':
                return TOK_RPAREN;
            case '*':
                return TOK_MUL;
            case '+':
                return TOK_ADD;
            case ',':
                return TOK_COMMA;
            case '-':
                return TOK_SUB;
            case '/':
                return TOK_DIV;
        }
    }

    public void scan(String str, TokenConsumer tokenConsumer) throws SyntaxException {
        Token tokenNextToken;
        this.exception.expression = str;
        if (str.indexOf(36) != -1) {
            throw this.exception.set("Invalid character '$'", str.indexOf(36));
        }
        init(str);
        tokenConsumer.start();
        do {
            int i10 = this.pos;
            tokenNextToken = nextToken();
            tokenNextToken.position = i10;
            tokenConsumer.push(tokenNextToken);
        } while (tokenNextToken != TOK_END);
    }
}
