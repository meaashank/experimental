package okio;

import java.io.RandomAccessFile;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class C extends AbstractC5367q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final RandomAccessFile f225871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(boolean z10, @NotNull RandomAccessFile randomAccessFile) {
        super(z10);
        kotlin.jvm.internal.G.p(randomAccessFile, "randomAccessFile");
        this.f225871d = randomAccessFile;
    }

    @Override // okio.AbstractC5367q
    public synchronized void o() {
        this.f225871d.close();
    }

    @Override // okio.AbstractC5367q
    public synchronized void p() {
        this.f225871d.getFD().sync();
    }

    @Override // okio.AbstractC5367q
    public synchronized int q(long j10, @NotNull byte[] array, int i10, int i11) {
        kotlin.jvm.internal.G.p(array, "array");
        this.f225871d.seek(j10);
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i13 = this.f225871d.read(array, i10, i11 - i12);
            if (i13 != -1) {
                i12 += i13;
            } else if (i12 == 0) {
                return -1;
            }
        }
        return i12;
    }

    @Override // okio.AbstractC5367q
    public synchronized void r(long j10) throws Throwable {
        try {
            try {
                long size = size();
                long j11 = j10 - size;
                if (j11 > 0) {
                    int i10 = (int) j11;
                    u(size, new byte[i10], 0, i10);
                } else {
                    this.f225871d.setLength(j10);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // okio.AbstractC5367q
    public synchronized long s() {
        return this.f225871d.length();
    }

    @Override // okio.AbstractC5367q
    public synchronized void u(long j10, @NotNull byte[] array, int i10, int i11) {
        kotlin.jvm.internal.G.p(array, "array");
        this.f225871d.seek(j10);
        this.f225871d.write(array, i10, i11);
    }
}
