package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes6.dex */
public class OctalUnescaper extends CharSequenceTranslator {
    private static int OCTAL_MAX = 377;

    @Override // org.apache.commons.lang3.text.translate.CharSequenceTranslator
    public int translate(CharSequence charSequence, int i10, Writer writer) throws IOException {
        if (charSequence.charAt(i10) != '\\' || i10 >= charSequence.length() - 1) {
            return 0;
        }
        int i11 = i10 + 1;
        if (!Character.isDigit(charSequence.charAt(i11))) {
            return 0;
        }
        int i12 = i10 + 2;
        while (i12 < charSequence.length() && Character.isDigit(charSequence.charAt(i12))) {
            int i13 = i12 + 1;
            if (Integer.parseInt(charSequence.subSequence(i11, i13).toString(), 10) > OCTAL_MAX) {
                break;
            }
            i12 = i13;
        }
        writer.write(Integer.parseInt(charSequence.subSequence(i11, i12).toString(), 8));
        return (i12 + 1) - i11;
    }
}
