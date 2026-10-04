package androidx.compose.foundation;

import androidx.compose.material.ProgressIndicatorKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", i = {1, 1}, l = {ProgressIndicatorKt.f96887h, 559}, m = "applyToFling-BMRW4eQ", n = {"this", "remainingVelocity"}, s = {"L$0", "J$0"})
public final class AndroidEdgeEffectOverscrollEffect$applyToFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f88359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f88360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f88361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AndroidEdgeEffectOverscrollEffect f88362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88363e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$applyToFling$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, kotlin.coroutines.e<? super AndroidEdgeEffectOverscrollEffect$applyToFling$1> eVar) {
        super(eVar);
        this.f88362d = androidEdgeEffectOverscrollEffect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88361c = obj;
        this.f88363e |= Integer.MIN_VALUE;
        return this.f88362d.c(0L, null, this);
    }
}
