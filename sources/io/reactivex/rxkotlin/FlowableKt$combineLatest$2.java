package io.reactivex.rxkotlin;

import kotlin.Pair;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.O;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* JADX INFO: loaded from: classes7.dex */
public final class FlowableKt$combineLatest$2<R, T> extends FunctionReference implements ed.p<T, R, Pair<? extends T, ? extends R>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FlowableKt$combineLatest$2 f212202a = new FlowableKt$combineLatest$2();

    public FlowableKt$combineLatest$2() {
        super(2);
    }

    @Override // ed.p
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Pair<T, R> invoke(@NotNull T p12, @NotNull R p22) {
        G.q(p12, "p1");
        G.q(p22, "p2");
        return new Pair<>(p12, p22);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.c
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final kotlin.reflect.h getOwner() {
        return O.d(Pair.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "<init>(Ljava/lang/Object;Ljava/lang/Object;)V";
    }
}
