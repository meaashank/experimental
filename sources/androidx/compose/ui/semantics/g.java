package androidx.compose.ui.semantics;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@dd.h
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f104117b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104118c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104119d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104120a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return g.f104119d;
        }

        public final int b() {
            return g.f104118c;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ g(int i10) {
        this.f104120a = i10;
    }

    public static final /* synthetic */ g c(int i10) {
        return new g(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof g) && i10 == ((g) obj).f104120a;
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return i10;
    }

    @NotNull
    public static String h(int i10) {
        return i10 == f104118c ? "Polite" : i10 == f104119d ? "Assertive" : "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.f104120a, obj);
    }

    public int hashCode() {
        return this.f104120a;
    }

    public final /* synthetic */ int i() {
        return this.f104120a;
    }

    @NotNull
    public String toString() {
        return h(this.f104120a);
    }
}
