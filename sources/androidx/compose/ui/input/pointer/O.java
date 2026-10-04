package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class O {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f102192b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f102193c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f102194d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f102195e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f102196f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f102197g = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f102198a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return O.f102197g;
        }

        public final int b() {
            return O.f102195e;
        }

        public final int c() {
            return O.f102196f;
        }

        public final int d() {
            return O.f102194d;
        }

        public final int e() {
            return O.f102193c;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ O(int i10) {
        this.f102198a = i10;
    }

    public static final /* synthetic */ O f(int i10) {
        return new O(i10);
    }

    public static int g(int i10) {
        return i10;
    }

    public static boolean h(int i10, Object obj) {
        return (obj instanceof O) && i10 == ((O) obj).f102198a;
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static int j(int i10) {
        return i10;
    }

    @NotNull
    public static String k(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public boolean equals(Object obj) {
        return h(this.f102198a, obj);
    }

    public int hashCode() {
        return this.f102198a;
    }

    public final /* synthetic */ int l() {
        return this.f102198a;
    }

    @NotNull
    public String toString() {
        return k(this.f102198a);
    }
}
