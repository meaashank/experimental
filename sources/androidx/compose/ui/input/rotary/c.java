package androidx.compose.ui.input.rotary;

import androidx.compose.ui.p;
import ed.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p.d implements b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public l<? super d, Boolean> f102361o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public l<? super d, Boolean> f102362p;

    public c(@Nullable l<? super d, Boolean> lVar, @Nullable l<? super d, Boolean> lVar2) {
        this.f102361o = lVar;
        this.f102362p = lVar2;
    }

    @Override // androidx.compose.ui.input.rotary.b
    public boolean d2(@NotNull d dVar) {
        l<? super d, Boolean> lVar = this.f102361o;
        if (lVar != null) {
            return lVar.invoke(dVar).booleanValue();
        }
        return false;
    }

    @Nullable
    public final l<d, Boolean> e3() {
        return this.f102361o;
    }

    @Nullable
    public final l<d, Boolean> f3() {
        return this.f102362p;
    }

    public final void g3(@Nullable l<? super d, Boolean> lVar) {
        this.f102361o = lVar;
    }

    public final void h3(@Nullable l<? super d, Boolean> lVar) {
        this.f102362p = lVar;
    }

    @Override // androidx.compose.ui.input.rotary.b
    public boolean z1(@NotNull d dVar) {
        l<? super d, Boolean> lVar = this.f102362p;
        if (lVar != null) {
            return lVar.invoke(dVar).booleanValue();
        }
        return false;
    }
}
