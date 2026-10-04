package kotlinx.coroutines;

import kotlin.coroutines.i;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class K extends kotlin.coroutines.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f218768c = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f218769b;

    public static final class a implements i.c<K> {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public K(@NotNull String str) {
        super(f218768c);
        this.f218769b = str;
    }

    public static K J2(K k10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = k10.f218769b;
        }
        k10.getClass();
        return new K(str);
    }

    @NotNull
    public final String F2() {
        return this.f218769b;
    }

    @NotNull
    public final K H2(@NotNull String str) {
        return new K(str);
    }

    @NotNull
    public final String R2() {
        return this.f218769b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K) && kotlin.jvm.internal.G.g(this.f218769b, ((K) obj).f218769b);
    }

    public int hashCode() {
        return this.f218769b.hashCode();
    }

    @NotNull
    public String toString() {
        return androidx.compose.runtime.R0.a(new StringBuilder("CoroutineName("), this.f218769b, ')');
    }
}
