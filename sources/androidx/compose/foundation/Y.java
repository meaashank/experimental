package androidx.compose.foundation;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements androidx.compose.ui.draw.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final X f88914a;

    public Y(@NotNull X x10) {
        this.f88914a = x10;
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public Object M(Object obj, ed.p pVar) {
        return pVar.invoke(this, obj);
    }

    @Override // androidx.compose.ui.draw.j
    public void N(@NotNull androidx.compose.ui.graphics.drawscope.d dVar) {
        this.f88914a.a(dVar);
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
    public final X a() {
        return this.f88914a;
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public Object l0(Object obj, ed.p pVar) {
        return pVar.invoke(obj, this);
    }
}
