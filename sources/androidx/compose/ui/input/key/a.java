package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.p;
import ed.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p.d implements j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public l<? super c, Boolean> f101809o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public l<? super c, Boolean> f101810p;

    public a(@Nullable l<? super c, Boolean> lVar, @Nullable l<? super c, Boolean> lVar2) {
        this.f101809o = lVar;
        this.f101810p = lVar2;
    }

    @Override // androidx.compose.ui.input.key.j
    public boolean C0(@NotNull KeyEvent keyEvent) {
        l<? super c, Boolean> lVar = this.f101809o;
        if (lVar != null) {
            return lVar.invoke(new c(keyEvent)).booleanValue();
        }
        return false;
    }

    @Nullable
    public final l<c, Boolean> e3() {
        return this.f101809o;
    }

    @Nullable
    public final l<c, Boolean> f3() {
        return this.f101810p;
    }

    public final void g3(@Nullable l<? super c, Boolean> lVar) {
        this.f101809o = lVar;
    }

    public final void h3(@Nullable l<? super c, Boolean> lVar) {
        this.f101810p = lVar;
    }

    @Override // androidx.compose.ui.input.key.j
    public boolean r0(@NotNull KeyEvent keyEvent) {
        l<? super c, Boolean> lVar = this.f101810p;
        if (lVar != null) {
            return lVar.invoke(new c(keyEvent)).booleanValue();
        }
        return false;
    }
}
