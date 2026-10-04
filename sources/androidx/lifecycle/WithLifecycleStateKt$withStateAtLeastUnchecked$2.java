package androidx.lifecycle;

import ed.InterfaceC4376a;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt$withStateAtLeastUnchecked$2\n*L\n1#1,207:1\n*E\n"})
public final class WithLifecycleStateKt$withStateAtLeastUnchecked$2<R> extends Lambda implements InterfaceC4376a<R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4376a<R> f114158d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WithLifecycleStateKt$withStateAtLeastUnchecked$2(InterfaceC4376a<? extends R> interfaceC4376a) {
        super(0);
        this.f114158d = interfaceC4376a;
    }

    @Override // ed.InterfaceC4376a
    public final R invoke() {
        return this.f114158d.invoke();
    }
}
