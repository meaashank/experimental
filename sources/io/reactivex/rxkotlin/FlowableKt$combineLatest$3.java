package io.reactivex.rxkotlin;

import kotlin.Triple;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.O;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [R, T, U] */
/* JADX INFO: loaded from: classes7.dex */
public final class FlowableKt$combineLatest$3<R, T, U> extends FunctionReference implements ed.q<T, R, U, Triple<? extends T, ? extends R, ? extends U>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FlowableKt$combineLatest$3 f212203a = new FlowableKt$combineLatest$3();

    public FlowableKt$combineLatest$3() {
        super(3);
    }

    @Override // ed.q
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Triple<T, R, U> invoke(@NotNull T p12, @NotNull R p22, @NotNull U p32) {
        G.q(p12, "p1");
        G.q(p22, "p2");
        G.q(p32, "p3");
        return new Triple<>(p12, p22, p32);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.c
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final kotlin.reflect.h getOwner() {
        return O.d(Triple.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V";
    }
}
