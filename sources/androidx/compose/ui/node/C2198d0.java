package androidx.compose.ui.node;

import androidx.compose.animation.core.C1610t;

/* JADX INFO: renamed from: androidx.compose.ui.node.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class C2198d0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f103051a;

    public /* synthetic */ C2198d0(int i10) {
        this.f103051a = i10;
    }

    public static final /* synthetic */ C2198d0 a(int i10) {
        return new C2198d0(i10);
    }

    public static <T> int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof C2198d0) && i10 == ((C2198d0) obj).f103051a;
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return i10;
    }

    public static final int g(int i10, int i11) {
        return i10 | i11;
    }

    public static final int h(int i10, int i11) {
        return i10 | i11;
    }

    public static String i(int i10) {
        return C1610t.a("NodeKind(mask=", i10, ')');
    }

    public final int e() {
        return this.f103051a;
    }

    public boolean equals(Object obj) {
        return c(this.f103051a, obj);
    }

    public int hashCode() {
        return this.f103051a;
    }

    public final /* synthetic */ int j() {
        return this.f103051a;
    }

    public String toString() {
        return i(this.f103051a);
    }
}
