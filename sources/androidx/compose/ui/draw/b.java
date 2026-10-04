package androidx.compose.ui.draw;

import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.ui.graphics.P2;
import androidx.compose.ui.graphics.c3;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@dd.h
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f100512b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final c3 f100513c = P2.f100788a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final c3 f100514d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final c3 f100515a;

    public static final class a {
        public a() {
        }

        @NotNull
        public final c3 a() {
            return b.f100513c;
        }

        @NotNull
        public final c3 b() {
            return b.f100514d;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ b(c3 c3Var) {
        this.f100515a = c3Var;
    }

    public static final /* synthetic */ b c(c3 c3Var) {
        return new b(c3Var);
    }

    @NotNull
    public static c3 d(@Nullable c3 c3Var) {
        return c3Var;
    }

    public static boolean e(c3 c3Var, Object obj) {
        return (obj instanceof b) && G.g(c3Var, ((b) obj).f100515a);
    }

    public static final boolean f(c3 c3Var, c3 c3Var2) {
        return G.g(c3Var, c3Var2);
    }

    public static int h(c3 c3Var) {
        if (c3Var == null) {
            return 0;
        }
        return c3Var.hashCode();
    }

    public static String i(c3 c3Var) {
        return "BlurredEdgeTreatment(shape=" + c3Var + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f100515a, obj);
    }

    @Nullable
    public final c3 g() {
        return this.f100515a;
    }

    public int hashCode() {
        return h(this.f100515a);
    }

    public final /* synthetic */ c3 j() {
        return this.f100515a;
    }

    public String toString() {
        return i(this.f100515a);
    }
}
