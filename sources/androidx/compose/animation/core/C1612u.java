package androidx.compose.animation.core;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.animation.core.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@dd.h
@S
public final class C1612u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f88196b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f88197c = 5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f88198d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f88199e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88200a;

    /* JADX INFO: renamed from: androidx.compose.animation.core.u$a */
    public static final class a {
        public a() {
        }

        public final int a() {
            return C1612u.f88197c;
        }

        public final int b() {
            return C1612u.f88198d;
        }

        public final int c() {
            return C1612u.f88199e;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ C1612u(int i10) {
        this.f88200a = i10;
    }

    public static final /* synthetic */ C1612u d(int i10) {
        return new C1612u(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof C1612u) && i10 == ((C1612u) obj).f88200a;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return i10;
    }

    public static String i(int i10) {
        return C1610t.a("ArcMode(value=", i10, ')');
    }

    public boolean equals(Object obj) {
        return f(this.f88200a, obj);
    }

    public int hashCode() {
        return this.f88200a;
    }

    public final /* synthetic */ int j() {
        return this.f88200a;
    }

    public String toString() {
        return i(this.f88200a);
    }
}
