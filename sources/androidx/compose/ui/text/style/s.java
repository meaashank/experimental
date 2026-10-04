package androidx.compose.ui.text.style;

import androidx.compose.runtime.T1;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f105056b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f105057c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f105058d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f105059e = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f105060a;

    public static final class a {
        public a() {
        }

        @T1
        public static /* synthetic */ void b() {
        }

        @T1
        public static /* synthetic */ void d() {
        }

        @T1
        public static /* synthetic */ void f() {
        }

        public final int a() {
            return s.f105057c;
        }

        public final int c() {
            return s.f105058d;
        }

        public final int e() {
            return s.f105059e;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ s(int i10) {
        this.f105060a = i10;
    }

    public static final /* synthetic */ s d(int i10) {
        return new s(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof s) && i10 == ((s) obj).f105060a;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return i10;
    }

    @NotNull
    public static String i(int i10) {
        return i10 == f105057c ? "Clip" : i10 == f105058d ? "Ellipsis" : i10 == f105059e ? "Visible" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f105060a, obj);
    }

    public int hashCode() {
        return this.f105060a;
    }

    public final /* synthetic */ int j() {
        return this.f105060a;
    }

    @NotNull
    public String toString() {
        return i(this.f105060a);
    }
}
