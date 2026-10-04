package md;

import java.util.NoSuchElementException;
import kotlin.collections.F;
import kotlin.jvm.internal.G;

/* JADX INFO: renamed from: md.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5226b extends F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f221124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f221125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f221126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f221127d;

    public C5226b(char c10, char c11, int i10) {
        this.f221124a = i10;
        this.f221125b = c11;
        boolean z10 = false;
        if (i10 <= 0 ? G.t(c10, c11) >= 0 : G.t(c10, c11) <= 0) {
            z10 = true;
        }
        this.f221126c = z10;
        this.f221127d = z10 ? c10 : c11;
    }

    @Override // kotlin.collections.F
    public char d() {
        int i10 = this.f221127d;
        if (i10 != this.f221125b) {
            this.f221127d = this.f221124a + i10;
        } else {
            if (!this.f221126c) {
                throw new NoSuchElementException();
            }
            this.f221126c = false;
        }
        return (char) i10;
    }

    public final int e() {
        return this.f221124a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f221126c;
    }
}
