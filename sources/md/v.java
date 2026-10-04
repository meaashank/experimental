package md;

import fd.InterfaceC4418a;
import java.util.Iterator;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.C4969v;
import kotlin.x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.5")
public class v implements Iterable<x0>, InterfaceC4418a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f221162d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f221163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f221164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f221165c;

    public static final class a {
        public a() {
        }

        @NotNull
        public final v a(int i10, int i11, int i12) {
            return new v(i10, i11, i12);
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ v(int i10, int i11, int i12, C4969v c4969v) {
        this(i10, i11, i12);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        if (isEmpty() && ((v) obj).isEmpty()) {
            return true;
        }
        v vVar = (v) obj;
        return this.f221163a == vVar.f221163a && this.f221164b == vVar.f221164b && this.f221165c == vVar.f221165c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f221163a * 31) + this.f221164b) * 31) + this.f221165c;
    }

    public boolean isEmpty() {
        return this.f221165c > 0 ? Integer.compare(this.f221163a ^ Integer.MIN_VALUE, this.f221164b ^ Integer.MIN_VALUE) > 0 : Integer.compare(this.f221163a ^ Integer.MIN_VALUE, this.f221164b ^ Integer.MIN_VALUE) < 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<x0> iterator() {
        return new w(this.f221163a, this.f221164b, this.f221165c);
    }

    public final int j() {
        return this.f221163a;
    }

    public final int o() {
        return this.f221164b;
    }

    public final int q() {
        return this.f221165c;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f221165c > 0) {
            sb2 = new StringBuilder();
            sb2.append((Object) x0.g0(this.f221163a));
            sb2.append("..");
            sb2.append((Object) x0.g0(this.f221164b));
            sb2.append(" step ");
            i10 = this.f221165c;
        } else {
            sb2 = new StringBuilder();
            sb2.append((Object) x0.g0(this.f221163a));
            sb2.append(" downTo ");
            sb2.append((Object) x0.g0(this.f221164b));
            sb2.append(" step ");
            i10 = -this.f221165c;
        }
        sb2.append(i10);
        return sb2.toString();
    }

    public v(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f221163a = i10;
        this.f221164b = Xc.t.d(i10, i11, i12);
        this.f221165c = i12;
    }
}
