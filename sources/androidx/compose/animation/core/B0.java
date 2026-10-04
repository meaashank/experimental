package androidx.compose.animation.core;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class B0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f87640b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f87641c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f87642d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87643a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return B0.f87641c;
        }

        public final int b() {
            return B0.f87642d;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ B0(int i10) {
        this.f87643a = i10;
    }

    public static final /* synthetic */ B0 c(int i10) {
        return new B0(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof B0) && i10 == ((B0) obj).f87643a;
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return i10;
    }

    public static String h(int i10) {
        return C1610t.a("StartOffsetType(value=", i10, ')');
    }

    public boolean equals(Object obj) {
        return e(this.f87643a, obj);
    }

    public int hashCode() {
        return this.f87643a;
    }

    public final /* synthetic */ int i() {
        return this.f87643a;
    }

    public String toString() {
        return h(this.f87643a);
    }
}
