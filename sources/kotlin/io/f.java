package kotlin.io;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends ByteArrayOutputStream {
    public f(int i10) {
        super(i10);
    }

    @NotNull
    public final byte[] d() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        G.o(buf, "buf");
        return buf;
    }
}
