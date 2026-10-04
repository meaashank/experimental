package androidx.compose.ui.graphics;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@dd.h
public final class f3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f101112b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f101113c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f101114d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f101115e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101116a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return f3.f101113c;
        }

        public final int b() {
            return f3.f101114d;
        }

        public final int c() {
            return f3.f101115e;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ f3(int i10) {
        this.f101116a = i10;
    }

    public static final /* synthetic */ f3 d(int i10) {
        return new f3(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof f3) && i10 == ((f3) obj).f101116a;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return i10;
    }

    @NotNull
    public static String i(int i10) {
        return i10 == f101113c ? "Butt" : i10 == f101114d ? "Round" : i10 == f101115e ? "Square" : "Unknown";
    }

    public boolean equals(Object obj) {
        return f(this.f101116a, obj);
    }

    public int hashCode() {
        return this.f101116a;
    }

    public final /* synthetic */ int j() {
        return this.f101116a;
    }

    @NotNull
    public String toString() {
        return i(this.f101116a);
    }
}
