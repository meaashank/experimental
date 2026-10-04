package md;

import fd.InterfaceC4418a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.C4969v;
import kotlin.x0;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.3")
public final class w implements Iterator<x0>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f221166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f221167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f221168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f221169d;

    public /* synthetic */ w(int i10, int i11, int i12, C4969v c4969v) {
        this(i10, i11, i12);
    }

    public int b() {
        int i10 = this.f221169d;
        if (i10 != this.f221166a) {
            this.f221169d = this.f221168c + i10;
            return i10;
        }
        if (!this.f221167b) {
            throw new NoSuchElementException();
        }
        this.f221167b = false;
        return i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f221167b;
    }

    @Override // java.util.Iterator
    public /* synthetic */ x0 next() {
        return new x0(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public w(int i10, int i11, int i12) {
        this.f221166a = i11;
        boolean z10 = false;
        int iCompare = Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
        if (i12 <= 0 ? iCompare >= 0 : iCompare <= 0) {
            z10 = true;
        }
        this.f221167b = z10;
        this.f221168c = i12;
        this.f221169d = z10 ? i10 : i11;
    }
}
