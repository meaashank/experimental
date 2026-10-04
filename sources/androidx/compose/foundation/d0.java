package androidx.compose.foundation;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f89072b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f89073c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f89074d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f89075a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return d0.f89073c;
        }

        public final int b() {
            return d0.f89074d;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ d0(int i10) {
        this.f89075a = i10;
    }

    public static final /* synthetic */ d0 c(int i10) {
        return new d0(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof d0) && i10 == ((d0) obj).f89075a;
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return i10;
    }

    @NotNull
    public static String h(int i10) {
        if (i10 == f89073c) {
            return "Immediately";
        }
        if (i10 == f89074d) {
            return "WhileFocused";
        }
        throw new IllegalStateException(("invalid value: " + i10).toString());
    }

    public boolean equals(Object obj) {
        return e(this.f89075a, obj);
    }

    public int hashCode() {
        return this.f89075a;
    }

    public final /* synthetic */ int i() {
        return this.f89075a;
    }

    @NotNull
    public String toString() {
        return h(this.f89075a);
    }
}
