package androidx.core.util;

import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class p<F, S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f111414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f111415b;

    public p(F f10, S s10) {
        this.f111414a = f10;
        this.f111415b = s10;
    }

    @NonNull
    public static <A, B> p<A, B> a(A a10, B b10) {
        return new p<>(a10, b10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Objects.equals(pVar.f111414a, this.f111414a) && Objects.equals(pVar.f111415b, this.f111415b);
    }

    public int hashCode() {
        F f10 = this.f111414a;
        int iHashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f111415b;
        return iHashCode ^ (s10 != null ? s10.hashCode() : 0);
    }

    @NonNull
    public String toString() {
        return "Pair{" + this.f111414a + C4.q.f17581a + this.f111415b + "}";
    }
}
