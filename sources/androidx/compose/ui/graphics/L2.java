package androidx.compose.ui.graphics;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@dd.h
public final class L2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f100756b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f100757c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f100758d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f100759e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f100760a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return L2.f100758d;
        }

        public final int b() {
            return L2.f100757c;
        }

        public final int c() {
            return L2.f100759e;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ L2(int i10) {
        this.f100760a = i10;
    }

    public static final /* synthetic */ L2 d(int i10) {
        return new L2(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof L2) && i10 == ((L2) obj).f100760a;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return i10;
    }

    @NotNull
    public static String i(int i10) {
        return i10 == f100757c ? "Points" : i10 == f100758d ? "Lines" : i10 == f100759e ? "Polygon" : "Unknown";
    }

    public boolean equals(Object obj) {
        return f(this.f100760a, obj);
    }

    public int hashCode() {
        return this.f100760a;
    }

    public final /* synthetic */ int j() {
        return this.f100760a;
    }

    @NotNull
    public String toString() {
        return i(this.f100760a);
    }
}
