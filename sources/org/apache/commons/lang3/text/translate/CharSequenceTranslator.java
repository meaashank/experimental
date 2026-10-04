package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public abstract class CharSequenceTranslator {
    public static String hex(int i10) {
        return Integer.toHexString(i10).toUpperCase(Locale.ENGLISH);
    }

    public abstract int translate(CharSequence charSequence, int i10, Writer writer) throws IOException;

    public final String translate(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(charSequence.length() * 2);
            translate(charSequence, stringWriter);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final CharSequenceTranslator with(CharSequenceTranslator... charSequenceTranslatorArr) {
        CharSequenceTranslator[] charSequenceTranslatorArr2 = new CharSequenceTranslator[charSequenceTranslatorArr.length + 1];
        charSequenceTranslatorArr2[0] = this;
        System.arraycopy(charSequenceTranslatorArr, 0, charSequenceTranslatorArr2, 1, charSequenceTranslatorArr.length);
        return new AggregateTranslator(charSequenceTranslatorArr2);
    }

    public final void translate(CharSequence charSequence, Writer writer) throws IOException {
        if (writer == null) {
            throw new IllegalArgumentException("The Writer must not be null");
        }
        if (charSequence == null) {
            return;
        }
        int iCodePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        int iCharCount = 0;
        while (iCharCount < iCodePointCount) {
            int iTranslate = translate(charSequence, iCharCount, writer);
            if (iTranslate == 0) {
                writer.write(Character.toChars(Character.codePointAt(charSequence, iCharCount)));
            } else {
                for (int i10 = 0; i10 < iTranslate; i10++) {
                    iCharCount = iCharCount < iCodePointCount + (-2) ? Character.charCount(Character.codePointAt(charSequence, iCharCount)) + iCharCount : iCharCount + 1;
                }
                iCharCount--;
            }
            iCharCount++;
        }
    }
}
