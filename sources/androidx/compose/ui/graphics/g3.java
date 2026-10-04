package androidx.compose.ui.graphics;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@dd.h
public final class g3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f101118b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f101119c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f101120d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f101121e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101122a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return g3.f101121e;
        }

        public final int b() {
            return g3.f101119c;
        }

        public final int c() {
            return g3.f101120d;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ g3(int i10) {
        this.f101122a = i10;
    }

    public static final /* synthetic */ g3 d(int i10) {
        return new g3(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof g3) && i10 == ((g3) obj).f101122a;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return i10;
    }

    @NotNull
    public static String i(int i10) {
        return i10 == f101119c ? "Miter" : i10 == f101120d ? "Round" : i10 == f101121e ? "Bevel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return f(this.f101122a, obj);
    }

    public int hashCode() {
        return this.f101122a;
    }

    public final /* synthetic */ int j() {
        return this.f101122a;
    }

    @NotNull
    public String toString() {
        return i(this.f101122a);
    }
}
