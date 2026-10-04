package v3;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class n<Z> extends AbstractC5676b<Z> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f239819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f239820c;

    public n(int i10, int i11) {
        this.f239819b = i10;
        this.f239820c = i11;
    }

    @Override // v3.p
    public final void h(@NonNull o oVar) {
        if (y3.o.x(this.f239819b, this.f239820c)) {
            oVar.d(this.f239819b, this.f239820c);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        sb2.append(this.f239819b);
        sb2.append(" and height: ");
        throw new IllegalArgumentException(android.support.v4.media.d.a(sb2, this.f239820c, ", either provide dimensions in the constructor or call override()"));
    }

    public n() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // v3.p
    public void f(@NonNull o oVar) {
    }
}
