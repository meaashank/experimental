package androidx.compose.ui.graphics;

import androidx.compose.animation.core.C1610t;
import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@dd.h
public final class Q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f100795b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f100796c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f100797d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f100798e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f100799a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return Q1.f100796c;
        }

        public final int b() {
            return Q1.f100798e;
        }

        public final int c() {
            return Q1.f100797d;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ Q1(int i10) {
        this.f100799a = i10;
    }

    public static final /* synthetic */ Q1 d(int i10) {
        return new Q1(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof Q1) && i10 == ((Q1) obj).f100799a;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return i10;
    }

    public static String i(int i10) {
        return C1610t.a("CompositingStrategy(value=", i10, ')');
    }

    public boolean equals(Object obj) {
        return f(this.f100799a, obj);
    }

    public int hashCode() {
        return this.f100799a;
    }

    public final /* synthetic */ int j() {
        return this.f100799a;
    }

    public String toString() {
        return i(this.f100799a);
    }
}
