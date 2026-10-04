package androidx.core.util;

import android.util.Log;
import androidx.annotation.RestrictTo;
import java.io.Writer;

/* JADX INFO: renamed from: androidx.core.util.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@Deprecated
public class C2436m extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StringBuilder f111409b = new StringBuilder(128);

    public C2436m(String str) {
        this.f111408a = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d();
    }

    public final void d() {
        if (this.f111409b.length() > 0) {
            Log.d(this.f111408a, this.f111409b.toString());
            StringBuilder sb2 = this.f111409b;
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
                this.f111409b.append(c10);
            }
        }
    }
}
