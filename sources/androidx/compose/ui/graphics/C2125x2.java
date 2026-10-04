package androidx.compose.ui.graphics;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@dd.h
public final class C2125x2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f101785b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f101786c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f101787d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101788a;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.x2$a */
    public static final class a {
        public a() {
        }

        public final int a() {
            return C2125x2.f101787d;
        }

        public final int b() {
            return C2125x2.f101786c;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ C2125x2(int i10) {
        this.f101788a = i10;
    }

    public static final /* synthetic */ C2125x2 c(int i10) {
        return new C2125x2(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof C2125x2) && i10 == ((C2125x2) obj).f101788a;
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return i10;
    }

    @NotNull
    public static String h(int i10) {
        return i10 == f101786c ? "NonZero" : i10 == f101787d ? "EvenOdd" : "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.f101788a, obj);
    }

    public int hashCode() {
        return this.f101788a;
    }

    public final /* synthetic */ int i() {
        return this.f101788a;
    }

    @NotNull
    public String toString() {
        return h(this.f101788a);
    }
}
