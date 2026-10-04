package androidx.compose.foundation.text;

import androidx.compose.ui.layout.t0;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class N implements t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f93372b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final O f93373a;

    public N(@NotNull O o10) {
        this.f93373a = o10;
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public Object M(Object obj, ed.p pVar) {
        return pVar.invoke(this, obj);
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public /* synthetic */ boolean O(ed.l lVar) {
        return androidx.compose.ui.q.b(this, lVar);
    }

    @Override // androidx.compose.ui.p
    public /* synthetic */ androidx.compose.ui.p P0(androidx.compose.ui.p pVar) {
        return androidx.compose.ui.o.a(this, pVar);
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public /* synthetic */ boolean S(ed.l lVar) {
        return androidx.compose.ui.q.a(this, lVar);
    }

    @NotNull
    public final O a() {
        return this.f93373a;
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public Object l0(Object obj, ed.p pVar) {
        return pVar.invoke(obj, this);
    }

    @NotNull
    public N b(@NotNull InterfaceC4814e interfaceC4814e, @Nullable Object obj) {
        return this;
    }

    @Override // androidx.compose.ui.layout.t0
    public Object h0(InterfaceC4814e interfaceC4814e, Object obj) {
        return this;
    }
}
