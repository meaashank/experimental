package md;

import fd.InterfaceC4418a;
import kotlin.collections.F;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: md.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C5225a implements Iterable<Character>, InterfaceC4418a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C0838a f221120d = new C0838a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f221121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f221122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f221123c;

    /* JADX INFO: renamed from: md.a$a, reason: collision with other inner class name */
    public static final class C0838a {
        public C0838a() {
        }

        @NotNull
        public final C5225a a(char c10, char c11, int i10) {
            return new C5225a(c10, c11, i10);
        }

        public C0838a(C4969v c4969v) {
        }
    }

    public C5225a(char c10, char c11, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f221121a = c10;
        this.f221122b = (char) Xc.o.c(c10, c11, i10);
        this.f221123c = i10;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C5225a)) {
            return false;
        }
        if (isEmpty() && ((C5225a) obj).isEmpty()) {
            return true;
        }
        C5225a c5225a = (C5225a) obj;
        return this.f221121a == c5225a.f221121a && this.f221122b == c5225a.f221122b && this.f221123c == c5225a.f221123c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f221121a * 31) + this.f221122b) * 31) + this.f221123c;
    }

    public boolean isEmpty() {
        return this.f221123c > 0 ? G.t(this.f221121a, this.f221122b) > 0 : G.t(this.f221121a, this.f221122b) < 0;
    }

    public final char j() {
        return this.f221121a;
    }

    public final char o() {
        return this.f221122b;
    }

    public final int q() {
        return this.f221123c;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public F iterator() {
        return new C5226b(this.f221121a, this.f221122b, this.f221123c);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f221123c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f221121a);
            sb2.append("..");
            sb2.append(this.f221122b);
            sb2.append(" step ");
            i10 = this.f221123c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f221121a);
            sb2.append(" downTo ");
            sb2.append(this.f221122b);
            sb2.append(" step ");
            i10 = -this.f221123c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
