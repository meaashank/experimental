package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.G;

/* JADX INFO: loaded from: classes7.dex */
public final class e {
    public static final String b(File file, File file2, String str) {
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        if (str != null) {
            sb2.append(": ".concat(str));
        }
        String string = sb2.toString();
        G.o(string, "toString(...)");
        return string;
    }
}
