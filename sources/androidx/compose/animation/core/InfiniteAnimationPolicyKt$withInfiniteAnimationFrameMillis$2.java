package androidx.compose.animation.core;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nInfiniteAnimationPolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteAnimationPolicy.kt\nandroidx/compose/animation/core/InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2\n*L\n1#1,42:1\n*E\n"})
public final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2<R> extends Lambda implements ed.l<Long, R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed.l<Long, R> f87672d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2(ed.l<? super Long, ? extends R> lVar) {
        super(1);
        this.f87672d = lVar;
    }

    public final R e(long j10) {
        return this.f87672d.invoke(Long.valueOf(j10 / 1000000));
    }

    @Override // ed.l
    public /* bridge */ /* synthetic */ Object invoke(Long l10) {
        return e(l10.longValue());
    }
}
