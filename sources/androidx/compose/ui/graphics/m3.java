package androidx.compose.ui.graphics;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@dd.h
public final class m3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f101346b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f101347c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f101348d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f101349e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101350a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return m3.f101349e;
        }

        public final int b() {
            return m3.f101348d;
        }

        public final int c() {
            return m3.f101347c;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ m3(int i10) {
        this.f101350a = i10;
    }

    public static final /* synthetic */ m3 d(int i10) {
        return new m3(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof m3) && i10 == ((m3) obj).f101350a;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return i10;
    }

    @NotNull
    public static String i(int i10) {
        return i10 == f101347c ? "Triangles" : i10 == f101348d ? "TriangleStrip" : i10 == f101349e ? "TriangleFan" : "Unknown";
    }

    public boolean equals(Object obj) {
        return f(this.f101350a, obj);
    }

    public int hashCode() {
        return this.f101350a;
    }

    public final /* synthetic */ int j() {
        return this.f101350a;
    }

    @NotNull
    public String toString() {
        return i(this.f101350a);
    }
}
