package androidx.compose.foundation;

import android.view.Surface;
import kotlin.L0;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.C5092j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAndroidExternalSurfaceState implements InterfaceC1648c, y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.L f88423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ed.s<? super x0, ? super Surface, ? super Integer, ? super Integer, ? super kotlin.coroutines.e<? super L0>, ? extends Object> f88424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ed.q<? super Surface, ? super Integer, ? super Integer, L0> f88425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ed.l<? super Surface, L0> f88426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public A0 f88427e;

    public BaseAndroidExternalSurfaceState(@NotNull kotlinx.coroutines.L l10) {
        this.f88423a = l10;
    }

    @Override // androidx.compose.foundation.InterfaceC1648c
    public void a(@NotNull ed.s<? super x0, ? super Surface, ? super Integer, ? super Integer, ? super kotlin.coroutines.e<? super L0>, ? extends Object> sVar) {
        this.f88424b = sVar;
    }

    @Override // androidx.compose.foundation.y0
    public void b(@NotNull Surface surface, @NotNull ed.l<? super Surface, L0> lVar) {
        this.f88426d = lVar;
    }

    @Override // androidx.compose.foundation.y0
    public void c(@NotNull Surface surface, @NotNull ed.q<? super Surface, ? super Integer, ? super Integer, L0> qVar) {
        this.f88425c = qVar;
    }

    public final void f(@NotNull Surface surface, int i10, int i11) {
        ed.q<? super Surface, ? super Integer, ? super Integer, L0> qVar = this.f88425c;
        if (qVar != null) {
            qVar.invoke(surface, Integer.valueOf(i10), Integer.valueOf(i11));
        }
    }

    public final void g(@NotNull Surface surface, int i10, int i11) {
        if (this.f88424b != null) {
            this.f88427e = C5092j.f(this.f88423a, null, CoroutineStart.UNDISPATCHED, new BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(this, surface, i10, i11, null), 1, null);
        }
    }

    public final void h(@NotNull Surface surface) {
        ed.l<? super Surface, L0> lVar = this.f88426d;
        if (lVar != null) {
            lVar.invoke(surface);
        }
        A0 a02 = this.f88427e;
        if (a02 != null) {
            A0.a.b(a02, null, 1, null);
        }
        this.f88427e = null;
    }

    @NotNull
    public final kotlinx.coroutines.L i() {
        return this.f88423a;
    }
}
