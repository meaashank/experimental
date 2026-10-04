package androidx.compose.ui.semantics;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@dd.h
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f104127b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104128c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104129d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f104130e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f104131f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f104132g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f104133h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f104134i = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104135a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return i.f104128c;
        }

        public final int b() {
            return i.f104129d;
        }

        public final int c() {
            return i.f104134i;
        }

        public final int d() {
            return i.f104133h;
        }

        public final int e() {
            return i.f104131f;
        }

        public final int f() {
            return i.f104130e;
        }

        public final int g() {
            return i.f104132g;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ i(int i10) {
        this.f104135a = i10;
    }

    public static final /* synthetic */ i h(int i10) {
        return new i(i10);
    }

    public static int i(int i10) {
        return i10;
    }

    public static boolean j(int i10, Object obj) {
        return (obj instanceof i) && i10 == ((i) obj).f104135a;
    }

    public static final boolean k(int i10, int i11) {
        return i10 == i11;
    }

    public static int l(int i10) {
        return i10;
    }

    @NotNull
    public static String m(int i10) {
        return i10 == f104128c ? "Button" : i10 == f104129d ? "Checkbox" : i10 == f104130e ? "Switch" : i10 == f104131f ? "RadioButton" : i10 == f104132g ? "Tab" : i10 == f104133h ? "Image" : i10 == f104134i ? "DropdownList" : "Unknown";
    }

    public boolean equals(Object obj) {
        return j(this.f104135a, obj);
    }

    public int hashCode() {
        return this.f104135a;
    }

    public final /* synthetic */ int n() {
        return this.f104135a;
    }

    @NotNull
    public String toString() {
        return m(this.f104135a);
    }
}
