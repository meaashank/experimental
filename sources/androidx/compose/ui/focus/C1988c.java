package androidx.compose.ui.focus;

import androidx.compose.ui.p;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.focus.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1988c extends p.d implements InterfaceC1993h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public ed.l<? super H, L0> f100649o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public H f100650p;

    public C1988c(@NotNull ed.l<? super H, L0> lVar) {
        this.f100649o = lVar;
    }

    @Override // androidx.compose.ui.focus.InterfaceC1993h
    public void a0(@NotNull H h10) {
        if (kotlin.jvm.internal.G.g(this.f100650p, h10)) {
            return;
        }
        this.f100650p = h10;
        this.f100649o.invoke(h10);
    }

    @NotNull
    public final ed.l<H, L0> e3() {
        return this.f100649o;
    }

    public final void f3(@NotNull ed.l<? super H, L0> lVar) {
        this.f100649o = lVar;
    }
}
