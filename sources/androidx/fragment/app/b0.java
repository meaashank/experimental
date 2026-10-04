package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StringBuilder f113833b = new StringBuilder(128);

    public b0(String str) {
        this.f113832a = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d();
    }

    public final void d() {
        if (this.f113833b.length() > 0) {
            Log.d(this.f113832a, this.f113833b.toString());
            StringBuilder sb2 = this.f113833b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        d();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                d();
            } else {
                this.f113833b.append(c10);
            }
        }
    }
}
