package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.C2099r0;
import androidx.compose.ui.graphics.C2103s0;
import androidx.compose.ui.graphics.C2125x2;
import androidx.compose.ui.graphics.K0;
import androidx.compose.ui.graphics.f3;
import androidx.compose.ui.graphics.g3;
import java.util.List;
import kotlin.L0;
import kotlin.collections.EmptyList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f101713a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f101714b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f101715c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f101716d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f101717e = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f101718f = 1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f101719g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f101720h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final List<e> f101721i = EmptyList.f217510a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f101722j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f101723k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f101724l = 4.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f101725m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float f101726n = 1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float f101727o = 0.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f101728p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f101729q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f101730r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f101731s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f101732t;

    static {
        f3.f101112b.getClass();
        f101728p = f3.f101113c;
        g3.f101118b.getClass();
        f101729q = g3.f101119c;
        C2099r0.f101402b.getClass();
        f101730r = C2099r0.f101408h;
        K0.f100733b.getClass();
        f101731s = K0.f100745n;
        C2125x2.f101785b.getClass();
        f101732t = C2125x2.f101786c;
    }

    @NotNull
    public static final List<e> a(@NotNull ed.l<? super d, L0> lVar) {
        d dVar = new d();
        lVar.invoke(dVar);
        return dVar.f101604a;
    }

    @NotNull
    public static final List<e> b(@Nullable String str) {
        if (str == null) {
            return f101721i;
        }
        g gVar = new g();
        gVar.c(str);
        return gVar.g();
    }

    public static final int c() {
        return f101732t;
    }

    public static final int d() {
        return f101728p;
    }

    public static final int e() {
        return f101729q;
    }

    public static final int f() {
        return f101730r;
    }

    public static final long g() {
        return f101731s;
    }

    @NotNull
    public static final List<e> h() {
        return f101721i;
    }

    public static final boolean i(long j10, long j11) {
        return K0.I(j10) == K0.I(j11) && K0.G(j10) == K0.G(j11) && K0.C(j10) == K0.C(j11);
    }

    public static final boolean j(@Nullable androidx.compose.ui.graphics.L0 l02) {
        if (!(l02 instanceof C2103s0)) {
            return l02 == null;
        }
        C2103s0 c2103s0 = (C2103s0) l02;
        int i10 = c2103s0.f101429d;
        C2099r0.a aVar = C2099r0.f101402b;
        aVar.getClass();
        if (i10 != C2099r0.f101408h) {
            int i11 = c2103s0.f101429d;
            aVar.getClass();
            if (i11 != C2099r0.f101406f) {
                return false;
            }
        }
        return true;
    }
}
