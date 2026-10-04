package androidx.compose.ui.graphics;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@dd.h
public final class C2113u2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f101431b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f101432c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f101433d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101434a;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.u2$a */
    public static final class a {
        public a() {
        }

        public final int a() {
            return C2113u2.f101432c;
        }

        public final int b() {
            return C2113u2.f101433d;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ C2113u2(int i10) {
        this.f101434a = i10;
    }

    public static final /* synthetic */ C2113u2 c(int i10) {
        return new C2113u2(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof C2113u2) && i10 == ((C2113u2) obj).f101434a;
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return i10;
    }

    @NotNull
    public static String h(int i10) {
        return i10 == f101432c ? "Fill" : i10 == f101433d ? "Stroke" : "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.f101434a, obj);
    }

    public int hashCode() {
        return this.f101434a;
    }

    public final /* synthetic */ int i() {
        return this.f101434a;
    }

    @NotNull
    public String toString() {
        return h(this.f101434a);
    }
}
