package androidx.compose.ui.modifier;

import androidx.compose.runtime.T1;
import androidx.compose.ui.platform.AbstractC2281t0;
import androidx.compose.ui.platform.C2278s0;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T1
public final class f extends AbstractC2281t0 implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ed.l<n, L0> f102634d;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull ed.l<? super n, L0> lVar, @NotNull ed.l<? super C2278s0, L0> lVar2) {
        super(lVar2);
        this.f102634d = lVar;
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

    @Override // androidx.compose.ui.modifier.e
    public void a2(@NotNull n nVar) {
        this.f102634d.invoke(nVar);
    }

    @NotNull
    public final ed.l<n, L0> e() {
        return this.f102634d;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof f) && ((f) obj).f102634d == this.f102634d;
    }

    public int hashCode() {
        return this.f102634d.hashCode();
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public Object l0(Object obj, ed.p pVar) {
        return pVar.invoke(obj, this);
    }
}
