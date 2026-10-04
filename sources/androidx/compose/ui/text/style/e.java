package androidx.compose.ui.text.style;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f104960b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104961c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104962d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f104963e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104964a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return e.f104962d;
        }

        public final int b() {
            return e.f104961c;
        }

        public final int c() {
            return e.f104963e;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ e(int i10) {
        this.f104964a = i10;
    }

    public static final /* synthetic */ e d(int i10) {
        return new e(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof e) && i10 == ((e) obj).f104964a;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return i10;
    }

    @NotNull
    public static String i(int i10) {
        return i10 == f104961c ? "Hyphens.None" : i10 == f104962d ? "Hyphens.Auto" : i10 == f104963e ? "Hyphens.Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f104964a, obj);
    }

    public int hashCode() {
        return this.f104964a;
    }

    public final /* synthetic */ int j() {
        return this.f104964a;
    }

    @NotNull
    public String toString() {
        return i(this.f104964a);
    }
}
