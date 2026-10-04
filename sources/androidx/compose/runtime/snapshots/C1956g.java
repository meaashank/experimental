package androidx.compose.runtime.snapshots;

import androidx.compose.animation.core.C1610t;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class C1956g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f100168b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f100169a;

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.g$a */
    public static final class a {
        public a() {
        }

        public final int a() {
            return 1;
        }

        public final int b() {
            return 4;
        }

        public final int c() {
            return 2;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ C1956g(int i10) {
        this.f100169a = i10;
    }

    public static final /* synthetic */ C1956g a(int i10) {
        return new C1956g(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static int c(int i10, int i11, C4969v c4969v) {
        if ((i11 & 1) != 0) {
            return 0;
        }
        return i10;
    }

    public static boolean d(int i10, Object obj) {
        return (obj instanceof C1956g) && i10 == ((C1956g) obj).f100169a;
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return i10;
    }

    public static final boolean h(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public static String i(int i10) {
        return C1610t.a("ReaderKind(mask=", i10, ')');
    }

    public static final int k(int i10, int i11) {
        return i10 | i11;
    }

    public boolean equals(Object obj) {
        return d(this.f100169a, obj);
    }

    public final int f() {
        return this.f100169a;
    }

    public int hashCode() {
        return this.f100169a;
    }

    public final /* synthetic */ int j() {
        return this.f100169a;
    }

    public String toString() {
        return i(this.f100169a);
    }
}
