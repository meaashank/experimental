package androidx.compose.ui.input.pointer;

import androidx.compose.animation.core.C1610t;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class C2149p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f102316a;

    public /* synthetic */ C2149p(int i10) {
        this.f102316a = i10;
    }

    public static final /* synthetic */ C2149p a(int i10) {
        return new C2149p(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof C2149p) && i10 == ((C2149p) obj).f102316a;
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static int e(int i10) {
        return i10;
    }

    public static String f(int i10) {
        return C1610t.a("PointerButtons(packedValue=", i10, ')');
    }

    public boolean equals(Object obj) {
        return c(this.f102316a, obj);
    }

    public final /* synthetic */ int g() {
        return this.f102316a;
    }

    public int hashCode() {
        return this.f102316a;
    }

    public String toString() {
        return f(this.f102316a);
    }
}
