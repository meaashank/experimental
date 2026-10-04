package androidx.compose.ui.draw;

import androidx.compose.ui.unit.LayoutDirection;
import k0.C4815f;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n f100521a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f100522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final LayoutDirection f100523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final InterfaceC4814e f100524d;

    static {
        P.n.f65527b.getClass();
        f100522b = P.n.f65529d;
        f100523c = LayoutDirection.Ltr;
        f100524d = new C4815f(1.0f, 1.0f);
    }

    @Override // androidx.compose.ui.draw.c
    @NotNull
    public InterfaceC4814e a() {
        return f100524d;
    }

    @Override // androidx.compose.ui.draw.c
    public long e() {
        return f100522b;
    }

    @Override // androidx.compose.ui.draw.c
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return f100523c;
    }
}
