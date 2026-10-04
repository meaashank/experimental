package kotlinx.coroutines.debug.internal;

import androidx.collection.C1526d;

/* JADX INFO: loaded from: classes5.dex */
public final class e {
    public static final String b(String str) {
        StringBuilder sb2 = new StringBuilder("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\"') {
                sb2.append("\\\"");
            } else if (cCharAt == '\\') {
                sb2.append("\\\\");
            } else if (cCharAt == '\b') {
                sb2.append("\\b");
            } else if (cCharAt == '\n') {
                sb2.append("\\n");
            } else if (cCharAt == '\r') {
                sb2.append("\\r");
            } else if (cCharAt == '\t') {
                sb2.append("\\t");
            } else {
                sb2.append(cCharAt);
            }
        }
        return C1526d.a(sb2, '\"', "toString(...)");
    }
}
