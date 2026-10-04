package androidx.compose.ui.input.pointer;

import androidx.compose.animation.core.C1610t;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f102191a;

    public /* synthetic */ N(int i10) {
        this.f102191a = i10;
    }

    public static final /* synthetic */ N a(int i10) {
        return new N(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof N) && i10 == ((N) obj).f102191a;
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static int e(int i10) {
        return i10;
    }

    public static String f(int i10) {
        return C1610t.a("PointerKeyboardModifiers(packedValue=", i10, ')');
    }

    public boolean equals(Object obj) {
        return c(this.f102191a, obj);
    }

    public final /* synthetic */ int g() {
        return this.f102191a;
    }

    public int hashCode() {
        return this.f102191a;
    }

    public String toString() {
        return f(this.f102191a);
    }
}
