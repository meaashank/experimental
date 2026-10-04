package androidx.compose.ui.graphics;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@dd.h
public final class e3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f101100b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f101101c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f101102d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f101103e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101104a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return e3.f101103e;
        }

        public final int b() {
            return e3.f101102d;
        }

        public final int c() {
            return e3.f101101c;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ e3(int i10) {
        this.f101104a = i10;
    }

    public static final /* synthetic */ e3 d(int i10) {
        return new e3(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof e3) && i10 == ((e3) obj).f101104a;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return i10;
    }

    @NotNull
    public static String i(int i10) {
        return i10 == f101101c ? "Translate" : i10 == f101102d ? "Rotate" : i10 == f101103e ? "Morph" : "Unknown";
    }

    public boolean equals(Object obj) {
        return f(this.f101104a, obj);
    }

    public int hashCode() {
        return this.f101104a;
    }

    public final /* synthetic */ int j() {
        return this.f101104a;
    }

    @NotNull
    public String toString() {
        return i(this.f101104a);
    }
}
