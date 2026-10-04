package androidx.compose.ui.graphics;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@dd.h
public final class J0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f100729b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f100730c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f100731d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f100732a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return J0.f100730c;
        }

        public final int b() {
            return J0.f100731d;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ J0(int i10) {
        this.f100732a = i10;
    }

    public static final /* synthetic */ J0 c(int i10) {
        return new J0(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof J0) && i10 == ((J0) obj).f100732a;
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return i10;
    }

    @NotNull
    public static String h(int i10) {
        return i10 == f100730c ? "Difference" : i10 == f100731d ? "Intersect" : "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.f100732a, obj);
    }

    public int hashCode() {
        return this.f100732a;
    }

    public final /* synthetic */ int i() {
        return this.f100732a;
    }

    @NotNull
    public String toString() {
        return h(this.f100732a);
    }
}
