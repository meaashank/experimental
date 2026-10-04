package md;

import java.util.NoSuchElementException;
import kotlin.collections.g0;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f221152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f221153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f221154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f221155d;

    public n(long j10, long j11, long j12) {
        this.f221152a = j12;
        this.f221153b = j11;
        boolean z10 = false;
        if (j12 <= 0 ? j10 >= j11 : j10 <= j11) {
            z10 = true;
        }
        this.f221154c = z10;
        this.f221155d = z10 ? j10 : j11;
    }

    public final long b() {
        return this.f221152a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f221154c;
    }

    @Override // kotlin.collections.g0
    public long nextLong() {
        long j10 = this.f221155d;
        if (j10 != this.f221153b) {
            this.f221155d = this.f221152a + j10;
            return j10;
        }
        if (!this.f221154c) {
            throw new NoSuchElementException();
        }
        this.f221154c = false;
        return j10;
    }
}
