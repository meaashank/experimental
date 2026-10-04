package androidx.compose.material;

import androidx.compose.animation.core.C1610t;
import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@dd.h
public final class A0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f95079b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f95080c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f95081d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f95082e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f95083f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f95084g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f95085h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f95086i = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95087a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return A0.f95081d;
        }

        public final int b() {
            return A0.f95082e;
        }

        public final int c() {
            return A0.f95083f;
        }

        public final int d() {
            return A0.f95084g;
        }

        public final int e() {
            return A0.f95080c;
        }

        public final int f() {
            return A0.f95086i;
        }

        public final int g() {
            return A0.f95085h;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ A0(int i10) {
        this.f95087a = i10;
    }

    public static final /* synthetic */ A0 h(int i10) {
        return new A0(i10);
    }

    public static int i(int i10) {
        return i10;
    }

    public static boolean j(int i10, Object obj) {
        return (obj instanceof A0) && i10 == ((A0) obj).f95087a;
    }

    public static final boolean k(int i10, int i11) {
        return i10 == i11;
    }

    public static int l(int i10) {
        return i10;
    }

    public static String m(int i10) {
        return C1610t.a("Strings(value=", i10, ')');
    }

    public boolean equals(Object obj) {
        return j(this.f95087a, obj);
    }

    public int hashCode() {
        return this.f95087a;
    }

    public final /* synthetic */ int n() {
        return this.f95087a;
    }

    public String toString() {
        return m(this.f95087a);
    }
}
