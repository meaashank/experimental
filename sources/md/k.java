package md;

import java.util.NoSuchElementException;
import kotlin.collections.AbstractC4864f0;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends AbstractC4864f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f221142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f221143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f221144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f221145d;

    public k(int i10, int i11, int i12) {
        this.f221142a = i12;
        this.f221143b = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f221144c = z10;
        this.f221145d = z10 ? i10 : i11;
    }

    public final int b() {
        return this.f221142a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f221144c;
    }

    @Override // kotlin.collections.AbstractC4864f0
    public int nextInt() {
        int i10 = this.f221145d;
        if (i10 != this.f221143b) {
            this.f221145d = this.f221142a + i10;
            return i10;
        }
        if (!this.f221144c) {
            throw new NoSuchElementException();
        }
        this.f221144c = false;
        return i10;
    }
}
