package androidx.compose.ui.input.pointer;

import androidx.compose.animation.core.C1610t;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f102235a;

    public /* synthetic */ Q(int i10) {
        this.f102235a = i10;
    }

    public static final /* synthetic */ Q a(int i10) {
        return new Q(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof Q) && i10 == ((Q) obj).f102235a;
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean e(int i10) {
        return (i10 & 2) != 0;
    }

    public static final boolean f(int i10) {
        return (i10 & 1) != 0;
    }

    public static int g(int i10) {
        return i10;
    }

    public static String h(int i10) {
        return C1610t.a("ProcessResult(value=", i10, ')');
    }

    public boolean equals(Object obj) {
        return c(this.f102235a, obj);
    }

    public int hashCode() {
        return this.f102235a;
    }

    public final /* synthetic */ int i() {
        return this.f102235a;
    }

    public String toString() {
        return h(this.f102235a);
    }
}
