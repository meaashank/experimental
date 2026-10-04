package androidx.compose.runtime;

import androidx.compose.animation.core.C1610t;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.runtime.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class C1912g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f99683b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f99684c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f99685d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f99686e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f99687a;

    /* JADX INFO: renamed from: androidx.compose.runtime.g0$a */
    public static final class a {
        public a() {
        }

        public final int a() {
            return C1912g0.f99684c;
        }

        public final int b() {
            return C1912g0.f99685d;
        }

        public final int c() {
            return C1912g0.f99686e;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ C1912g0(int i10) {
        this.f99687a = i10;
    }

    public static final /* synthetic */ C1912g0 d(int i10) {
        return new C1912g0(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof C1912g0) && i10 == ((C1912g0) obj).f99687a;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return i10;
    }

    public static final boolean j(int i10) {
        f99683b.getClass();
        return i10 != f99684c;
    }

    public static final boolean k(int i10) {
        f99683b.getClass();
        return i10 != f99685d;
    }

    public static String l(int i10) {
        return C1610t.a("GroupKind(value=", i10, ')');
    }

    public boolean equals(Object obj) {
        return f(this.f99687a, obj);
    }

    public final int h() {
        return this.f99687a;
    }

    public int hashCode() {
        return this.f99687a;
    }

    public final /* synthetic */ int m() {
        return this.f99687a;
    }

    public String toString() {
        return l(this.f99687a);
    }
}
