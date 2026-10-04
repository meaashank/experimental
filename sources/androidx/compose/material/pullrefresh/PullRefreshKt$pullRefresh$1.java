package androidx.compose.material.pullrefresh;

import ed.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class PullRefreshKt$pullRefresh$1 extends FunctionReferenceImpl implements l<Float, Float> {
    public PullRefreshKt$pullRefresh$1(Object obj) {
        super(1, obj, PullRefreshState.class, "onPull", "onPull$material_release(F)F", 0);
    }

    @NotNull
    public final Float e(float f10) {
        return Float.valueOf(((PullRefreshState) this.receiver).q(f10));
    }

    @Override // ed.l
    public /* bridge */ /* synthetic */ Float invoke(Float f10) {
        return e(f10.floatValue());
    }
}
