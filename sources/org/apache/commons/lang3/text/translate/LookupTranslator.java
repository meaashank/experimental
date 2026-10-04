package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class LookupTranslator extends CharSequenceTranslator {
    private final int longest;
    private final HashMap<CharSequence, CharSequence> lookupMap = new HashMap<>();
    private final int shortest;

    public LookupTranslator(CharSequence[]... charSequenceArr) {
        int i10 = Integer.MAX_VALUE;
        int i11 = 0;
        if (charSequenceArr != null) {
            int i12 = 0;
            for (CharSequence[] charSequenceArr2 : charSequenceArr) {
                this.lookupMap.put(charSequenceArr2[0], charSequenceArr2[1]);
                int length = charSequenceArr2[0].length();
                i10 = length < i10 ? length : i10;
                if (length > i12) {
                    i12 = length;
                }
            }
            i11 = i12;
        }
        this.shortest = i10;
        this.longest = i11;
    }

    @Override // org.apache.commons.lang3.text.translate.CharSequenceTranslator
    public int translate(CharSequence charSequence, int i10, Writer writer) throws IOException {
        int length = this.longest;
        if (i10 + length > charSequence.length()) {
            length = charSequence.length() - i10;
        }
        while (length >= this.shortest) {
            CharSequence charSequence2 = this.lookupMap.get(charSequence.subSequence(i10, i10 + length));
            if (charSequence2 != null) {
                writer.write(charSequence2.toString());
                return length;
            }
            length--;
        }
        return 0;
    }
}
