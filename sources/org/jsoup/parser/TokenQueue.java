package org.jsoup.parser;

import Ra.b;
import androidx.compose.runtime.changelist.a;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes6.dex */
public class TokenQueue {
    private static final char ESC = '\\';
    private int pos = 0;
    private String queue;

    public TokenQueue(String str) {
        Validate.notNull(str);
        this.queue = str;
    }

    private int remainingLength() {
        return this.queue.length() - this.pos;
    }

    public static String unescape(String str) {
        StringBuilder sbStringBuilder = StringUtil.stringBuilder();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i10 = 0;
        char c10 = 0;
        while (i10 < length) {
            char c11 = charArray[i10];
            if (c11 != '\\') {
                sbStringBuilder.append(c11);
            } else if (c10 != 0 && c10 == '\\') {
                sbStringBuilder.append(c11);
            }
            i10++;
            c10 = c11;
        }
        return sbStringBuilder.toString();
    }

    public void addFirst(String str) {
        StringBuilder sbA = a.a(str);
        sbA.append(this.queue.substring(this.pos));
        this.queue = sbA.toString();
        this.pos = 0;
    }

    public void advance() {
        if (isEmpty()) {
            return;
        }
        this.pos++;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x006c A[EDGE_INSN: B:43:0x006c->B:36:0x006c BREAK  A[LOOP:0: B:3:0x0007->B:47:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[LOOP:0: B:3:0x0007->B:47:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String chompBalanced(char r11, char r12) {
        /*
            r10 = this;
            r0 = -1
            r1 = 0
            r5 = r0
            r6 = r5
            r2 = r1
            r3 = r2
            r4 = r3
        L7:
            boolean r7 = r10.isEmpty()
            if (r7 == 0) goto Le
            goto L6c
        Le:
            char r7 = r10.consume()
            java.lang.Character r8 = java.lang.Character.valueOf(r7)
            if (r1 == 0) goto L1c
            r9 = 92
            if (r1 == r9) goto L63
        L1c:
            r9 = 39
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L2f
            if (r7 == r11) goto L2f
            if (r2 != 0) goto L2f
            r3 = r3 ^ 1
            goto L41
        L2f:
            r9 = 34
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L41
            if (r7 == r11) goto L41
            if (r3 != 0) goto L41
            r2 = r2 ^ 1
        L41:
            if (r3 != 0) goto L6a
            if (r2 == 0) goto L46
            goto L6a
        L46:
            java.lang.Character r9 = java.lang.Character.valueOf(r11)
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L57
            int r4 = r4 + 1
            if (r5 != r0) goto L63
            int r5 = r10.pos
            goto L63
        L57:
            java.lang.Character r9 = java.lang.Character.valueOf(r12)
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L63
            int r4 = r4 + (-1)
        L63:
            if (r4 <= 0) goto L69
            if (r1 == 0) goto L69
            int r6 = r10.pos
        L69:
            r1 = r7
        L6a:
            if (r4 > 0) goto L7
        L6c:
            if (r6 < 0) goto L75
            java.lang.String r11 = r10.queue
            java.lang.String r11 = r11.substring(r5, r6)
            goto L77
        L75:
            java.lang.String r11 = ""
        L77:
            if (r4 <= 0) goto L8f
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Did not find balanced marker at '"
            r12.<init>(r0)
            r12.append(r11)
            java.lang.String r0 = "'"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            org.jsoup.helper.Validate.fail(r12)
        L8f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.TokenQueue.chompBalanced(char, char):java.lang.String");
    }

    public String chompTo(String str) {
        String strConsumeTo = consumeTo(str);
        matchChomp(str);
        return strConsumeTo;
    }

    public String chompToIgnoreCase(String str) {
        String strConsumeToIgnoreCase = consumeToIgnoreCase(str);
        matchChomp(str);
        return strConsumeToIgnoreCase;
    }

    public char consume() {
        String str = this.queue;
        int i10 = this.pos;
        this.pos = i10 + 1;
        return str.charAt(i10);
    }

    public String consumeAttributeKey() {
        int i10 = this.pos;
        while (!isEmpty() && (matchesWord() || matchesAny(SignatureVisitor.SUPER, b.f67799c, ':'))) {
            this.pos++;
        }
        return this.queue.substring(i10, this.pos);
    }

    public String consumeCssIdentifier() {
        int i10 = this.pos;
        while (!isEmpty() && (matchesWord() || matchesAny(SignatureVisitor.SUPER, b.f67799c))) {
            this.pos++;
        }
        return this.queue.substring(i10, this.pos);
    }

    public String consumeElementSelector() {
        int i10 = this.pos;
        while (!isEmpty() && (matchesWord() || matchesAny("*|", "|", "_", com.prism.gaia.download.a.f164606q))) {
            this.pos++;
        }
        return this.queue.substring(i10, this.pos);
    }

    public String consumeTagName() {
        int i10 = this.pos;
        while (!isEmpty() && (matchesWord() || matchesAny(':', b.f67799c, SignatureVisitor.SUPER))) {
            this.pos++;
        }
        return this.queue.substring(i10, this.pos);
    }

    public String consumeTo(String str) {
        int iIndexOf = this.queue.indexOf(str, this.pos);
        if (iIndexOf == -1) {
            return remainder();
        }
        String strSubstring = this.queue.substring(this.pos, iIndexOf);
        this.pos = strSubstring.length() + this.pos;
        return strSubstring;
    }

    public String consumeToAny(String... strArr) {
        int i10 = this.pos;
        while (!isEmpty() && !matchesAny(strArr)) {
            this.pos++;
        }
        return this.queue.substring(i10, this.pos);
    }

    public String consumeToIgnoreCase(String str) {
        int i10 = this.pos;
        String strSubstring = str.substring(0, 1);
        boolean zEquals = strSubstring.toLowerCase().equals(strSubstring.toUpperCase());
        while (!isEmpty() && !matches(str)) {
            if (zEquals) {
                int iIndexOf = this.queue.indexOf(strSubstring, this.pos);
                int i11 = this.pos;
                int i12 = iIndexOf - i11;
                if (i12 == 0) {
                    this.pos = i11 + 1;
                } else if (i12 < 0) {
                    this.pos = this.queue.length();
                } else {
                    this.pos = i11 + i12;
                }
            } else {
                this.pos++;
            }
        }
        return this.queue.substring(i10, this.pos);
    }

    public boolean consumeWhitespace() {
        boolean z10 = false;
        while (matchesWhitespace()) {
            this.pos++;
            z10 = true;
        }
        return z10;
    }

    public String consumeWord() {
        int i10 = this.pos;
        while (matchesWord()) {
            this.pos++;
        }
        return this.queue.substring(i10, this.pos);
    }

    public boolean isEmpty() {
        return remainingLength() == 0;
    }

    public boolean matchChomp(String str) {
        if (!matches(str)) {
            return false;
        }
        this.pos = str.length() + this.pos;
        return true;
    }

    public boolean matches(String str) {
        return this.queue.regionMatches(true, this.pos, str, 0, str.length());
    }

    public boolean matchesAny(String... strArr) {
        for (String str : strArr) {
            if (matches(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesCS(String str) {
        return this.queue.startsWith(str, this.pos);
    }

    public boolean matchesStartTag() {
        return remainingLength() >= 2 && this.queue.charAt(this.pos) == '<' && Character.isLetter(this.queue.charAt(this.pos + 1));
    }

    public boolean matchesWhitespace() {
        return !isEmpty() && StringUtil.isWhitespace(this.queue.charAt(this.pos));
    }

    public boolean matchesWord() {
        return !isEmpty() && Character.isLetterOrDigit(this.queue.charAt(this.pos));
    }

    public char peek() {
        if (isEmpty()) {
            return (char) 0;
        }
        return this.queue.charAt(this.pos);
    }

    public String remainder() {
        String str = this.queue;
        String strSubstring = str.substring(this.pos, str.length());
        this.pos = this.queue.length();
        return strSubstring;
    }

    public String toString() {
        return this.queue.substring(this.pos);
    }

    public void consume(String str) {
        if (!matches(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        if (length > remainingLength()) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.pos += length;
    }

    public boolean matchesAny(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        for (char c10 : cArr) {
            if (this.queue.charAt(this.pos) == c10) {
                return true;
            }
        }
        return false;
    }

    public void addFirst(Character ch) {
        addFirst(ch.toString());
    }
}
