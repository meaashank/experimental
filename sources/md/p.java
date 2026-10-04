package md;

import androidx.compose.animation.core.C1618x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements r<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f221158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f221159b;

    public p(double d10, double d11) {
        this.f221158a = d10;
        this.f221159b = d11;
    }

    private final boolean e(double d10, double d11) {
        return d10 <= d11;
    }

    public boolean a(double d10) {
        return d10 >= this.f221158a && d10 < this.f221159b;
    }

    @Override // md.r
    public Comparable b() {
        return Double.valueOf(this.f221158a);
    }

    @NotNull
    public Double c() {
        return Double.valueOf(this.f221159b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // md.r
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return a(((Number) comparable).doubleValue());
    }

    @NotNull
    public Double d() {
        return Double.valueOf(this.f221158a);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        if (isEmpty() && ((p) obj).isEmpty()) {
            return true;
        }
        p pVar = (p) obj;
        return this.f221158a == pVar.f221158a && this.f221159b == pVar.f221159b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return C1618x.a(this.f221159b) + (C1618x.a(this.f221158a) * 31);
    }

    @Override // md.r
    public Comparable i() {
        return Double.valueOf(this.f221159b);
    }

    @Override // md.r
    public boolean isEmpty() {
        return this.f221158a >= this.f221159b;
    }

    @NotNull
    public String toString() {
        return this.f221158a + "..<" + this.f221159b;
    }
}
