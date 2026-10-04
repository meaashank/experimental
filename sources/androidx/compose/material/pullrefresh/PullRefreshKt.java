package androidx.compose.material.pullrefresh;

import androidx.compose.material.P;
import androidx.compose.ui.input.nestedscroll.c;
import androidx.compose.ui.p;
import ed.l;
import kotlin.coroutines.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class PullRefreshKt {
    @P
    @NotNull
    public static final p b(@NotNull p pVar, @NotNull PullRefreshState pullRefreshState, boolean z10) {
        return c(pVar, new PullRefreshKt$pullRefresh$1(pullRefreshState), new PullRefreshKt$pullRefresh$2(pullRefreshState), z10);
    }

    @P
    @NotNull
    public static final p c(@NotNull p pVar, @NotNull l<? super Float, Float> lVar, @NotNull ed.p<? super Float, ? super e<? super Float>, ? extends Object> pVar2, boolean z10) {
        return c.b(pVar, new PullRefreshNestedScrollConnection(lVar, pVar2, z10), null, 2, null);
    }

    public static /* synthetic */ p d(p pVar, PullRefreshState pullRefreshState, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return b(pVar, pullRefreshState, z10);
    }

    public static /* synthetic */ p e(p pVar, l lVar, ed.p pVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return c(pVar, lVar, pVar2, z10);
    }

    public static final Object f(PullRefreshState pullRefreshState, float f10, e eVar) {
        return new Float(pullRefreshState.r(f10));
    }
}
