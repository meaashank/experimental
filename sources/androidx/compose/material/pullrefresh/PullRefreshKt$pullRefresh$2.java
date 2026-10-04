package androidx.compose.material.pullrefresh;

import Vc.l;
import ed.p;
import kotlin.coroutines.e;
import kotlin.jvm.internal.AdaptedFunctionReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class PullRefreshKt$pullRefresh$2 extends AdaptedFunctionReference implements p<Float, e<? super Float>, Object>, l {
    public PullRefreshKt$pullRefresh$2(Object obj) {
        super(2, obj, PullRefreshState.class, "onRelease", "onRelease$material_release(F)F", 4);
    }

    @Nullable
    public final Object h(float f10, @NotNull e<? super Float> eVar) {
        return PullRefreshKt.f((PullRefreshState) this.f217867a, f10, eVar);
    }

    @Override // ed.p
    public /* bridge */ /* synthetic */ Object invoke(Float f10, e<? super Float> eVar) {
        return h(f10.floatValue(), eVar);
    }
}
