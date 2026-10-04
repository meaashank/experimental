package androidx.compose.ui.graphics;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@dd.h
public final class U1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f100844b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f100845c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f100846d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f100847e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f100848f = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f100849a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return U1.f100848f;
        }

        public final int b() {
            return U1.f100846d;
        }

        public final int c() {
            return U1.f100847e;
        }

        public final int d() {
            return U1.f100845c;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ U1(int i10) {
        this.f100849a = i10;
    }

    public static final /* synthetic */ U1 e(int i10) {
        return new U1(i10);
    }

    public static int f(int i10) {
        return i10;
    }

    public static boolean g(int i10, Object obj) {
        return (obj instanceof U1) && i10 == ((U1) obj).f100849a;
    }

    public static final boolean h(int i10, int i11) {
        return i10 == i11;
    }

    public static int j(int i10) {
        return i10;
    }

    @NotNull
    public static String k(int i10) {
        return i10 == f100845c ? "None" : i10 == f100846d ? "Low" : i10 == f100847e ? "Medium" : i10 == f100848f ? "High" : "Unknown";
    }

    public boolean equals(Object obj) {
        return g(this.f100849a, obj);
    }

    public int hashCode() {
        return this.f100849a;
    }

    public final int i() {
        return this.f100849a;
    }

    public final /* synthetic */ int l() {
        return this.f100849a;
    }

    @NotNull
    public String toString() {
        return k(this.f100849a);
    }
}
