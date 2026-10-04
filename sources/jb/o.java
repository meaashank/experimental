package Jb;

import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class o implements Closeable {
    public static /* synthetic */ int a(o oVar, byte[] bArr, int i10, int i11, int i12, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: read");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return oVar.read(bArr, i10, i11);
    }

    public abstract void f(long j10) throws IOException;

    public abstract int read(@NotNull byte[] bArr, int i10, int i11) throws IOException;
}
