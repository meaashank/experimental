package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes6.dex */
public class UnicodeEscaper extends CodePointTranslator {
    private final int above;
    private final int below;
    private final boolean between;

    public UnicodeEscaper() {
        this(0, Integer.MAX_VALUE, true);
    }

    public static UnicodeEscaper above(int i10) {
        return outsideOf(0, i10);
    }

    public static UnicodeEscaper below(int i10) {
        return outsideOf(i10, Integer.MAX_VALUE);
    }

    public static UnicodeEscaper between(int i10, int i11) {
        return new UnicodeEscaper(i10, i11, true);
    }

    public static UnicodeEscaper outsideOf(int i10, int i11) {
        return new UnicodeEscaper(i10, i11, false);
    }

    @Override // org.apache.commons.lang3.text.translate.CodePointTranslator
    public boolean translate(int i10, Writer writer) throws IOException {
        if (this.between) {
            if (i10 < this.below || i10 > this.above) {
                return false;
            }
        } else if (i10 >= this.below && i10 <= this.above) {
            return false;
        }
        if (i10 > 65535) {
            writer.write("\\u" + CharSequenceTranslator.hex(i10));
            return true;
        }
        if (i10 > 4095) {
            writer.write("\\u" + CharSequenceTranslator.hex(i10));
            return true;
        }
        if (i10 > 255) {
            writer.write("\\u0" + CharSequenceTranslator.hex(i10));
            return true;
        }
        if (i10 > 15) {
            writer.write("\\u00" + CharSequenceTranslator.hex(i10));
            return true;
        }
        writer.write("\\u000" + CharSequenceTranslator.hex(i10));
        return true;
    }

    private UnicodeEscaper(int i10, int i11, boolean z10) {
        this.below = i10;
        this.above = i11;
        this.between = z10;
    }
}
