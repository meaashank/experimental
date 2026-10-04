package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.p;
import ed.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p.d implements g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public l<? super c, Boolean> f102106o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public l<? super c, Boolean> f102107p;

    public h(@Nullable l<? super c, Boolean> lVar, @Nullable l<? super c, Boolean> lVar2) {
        this.f102106o = lVar;
        this.f102107p = lVar2;
    }

    @Override // androidx.compose.ui.input.key.g
    public boolean N0(@NotNull KeyEvent keyEvent) {
        l<? super c, Boolean> lVar = this.f102107p;
        if (lVar != null) {
            return lVar.invoke(new c(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.key.g
    public boolean c2(@NotNull KeyEvent keyEvent) {
        l<? super c, Boolean> lVar = this.f102106o;
        if (lVar != null) {
            return lVar.invoke(new c(keyEvent)).booleanValue();
        }
        return false;
    }

    @Nullable
    public final l<c, Boolean> e3() {
        return this.f102106o;
    }

    @Nullable
    public final l<c, Boolean> f3() {
        return this.f102107p;
    }

    public final void g3(@Nullable l<? super c, Boolean> lVar) {
        this.f102106o = lVar;
    }

    public final void h3(@Nullable l<? super c, Boolean> lVar) {
        this.f102107p = lVar;
    }
}
