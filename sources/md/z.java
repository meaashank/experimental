package md;

import fd.InterfaceC4418a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.B0;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.C4969v;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.3")
public final class z implements Iterator<B0>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f221176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f221177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f221178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f221179d;

    public /* synthetic */ z(long j10, long j11, long j12, C4969v c4969v) {
        this(j10, j11, j12);
    }

    public long b() {
        long j10 = this.f221179d;
        if (j10 != this.f221176a) {
            this.f221179d = this.f221178c + j10;
            return j10;
        }
        if (!this.f221177b) {
            throw new NoSuchElementException();
        }
        this.f221177b = false;
        return j10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f221177b;
    }

    @Override // java.util.Iterator
    public /* synthetic */ B0 next() {
        return new B0(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public z(long j10, long j11, long j12) {
        this.f221176a = j11;
        boolean z10 = false;
        if (j12 <= 0 ? Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) >= 0 : Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) <= 0) {
            z10 = true;
        }
        this.f221177b = z10;
        this.f221178c = j12;
        this.f221179d = z10 ? j10 : j11;
    }
}
