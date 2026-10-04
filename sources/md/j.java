package md;

import fd.InterfaceC4418a;
import kotlin.collections.AbstractC4864f0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class j implements Iterable<Integer>, InterfaceC4418a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f221138d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f221139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f221140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f221141c;

    public static final class a {
        public a() {
        }

        @NotNull
        public final j a(int i10, int i11, int i12) {
            return new j(i10, i11, i12);
        }

        public a(C4969v c4969v) {
        }
    }

    public j(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f221139a = i10;
        this.f221140b = Xc.o.c(i10, i11, i12);
        this.f221141c = i12;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (isEmpty() && ((j) obj).isEmpty()) {
            return true;
        }
        j jVar = (j) obj;
        return this.f221139a == jVar.f221139a && this.f221140b == jVar.f221140b && this.f221141c == jVar.f221141c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f221139a * 31) + this.f221140b) * 31) + this.f221141c;
    }

    public boolean isEmpty() {
        return this.f221141c > 0 ? this.f221139a > this.f221140b : this.f221139a < this.f221140b;
    }

    public final int j() {
        return this.f221139a;
    }

    public final int o() {
        return this.f221140b;
    }

    public final int q() {
        return this.f221141c;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public AbstractC4864f0 iterator() {
        return new k(this.f221139a, this.f221140b, this.f221141c);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f221141c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f221139a);
            sb2.append("..");
            sb2.append(this.f221140b);
            sb2.append(" step ");
            i10 = this.f221141c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f221139a);
            sb2.append(" downTo ");
            sb2.append(this.f221140b);
            sb2.append(" step ");
            i10 = -this.f221141c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
