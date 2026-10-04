package androidx.lifecycle.compose;

import androidx.compose.runtime.S;
import androidx.compose.runtime.T;
import androidx.compose.runtime.X1;
import androidx.lifecycle.B;
import androidx.lifecycle.InterfaceC2611y;
import androidx.lifecycle.Lifecycle;
import ed.InterfaceC4376a;
import ed.l;
import kotlin.L0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleEventEffect$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,747:1\n64#2,5:748\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleEventEffect$1$1\n*L\n76#1:748,5\n*E\n"})
public final class LifecycleEffectKt$LifecycleEventEffect$1$1 extends Lambda implements l<T, S> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B f114203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Lifecycle.Event f114204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ X1<InterfaceC4376a<L0>> f114205f;

    @V({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleEventEffect$1$1\n*L\n1#1,497:1\n77#2,2:498\n*E\n"})
    public static final class a implements S {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ B f114206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2611y f114207b;

        public a(B b10, InterfaceC2611y interfaceC2611y) {
            this.f114206a = b10;
            this.f114207b = interfaceC2611y;
        }

        @Override // androidx.compose.runtime.S
        public void dispose() {
            this.f114206a.getLifecycle().g(this.f114207b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleEffectKt$LifecycleEventEffect$1$1(B b10, Lifecycle.Event event, X1<? extends InterfaceC4376a<L0>> x12) {
        super(1);
        this.f114203d = b10;
        this.f114204e = event;
        this.f114205f = x12;
    }

    public static final void h(Lifecycle.Event event, X1 x12, B b10, Lifecycle.Event event2) {
        if (event2 == event) {
            ((InterfaceC4376a) x12.getValue()).invoke();
        }
    }

    @Override // ed.l
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final S invoke(@NotNull T t10) {
        final Lifecycle.Event event = this.f114204e;
        final X1<InterfaceC4376a<L0>> x12 = this.f114205f;
        InterfaceC2611y interfaceC2611y = new InterfaceC2611y() { // from class: androidx.lifecycle.compose.a
            @Override // androidx.lifecycle.InterfaceC2611y
            public final void onStateChanged(B b10, Lifecycle.Event event2) {
                LifecycleEffectKt$LifecycleEventEffect$1$1.h(event, x12, b10, event2);
            }
        };
        this.f114203d.getLifecycle().c(interfaceC2611y);
        return new a(this.f114203d, interfaceC2611y);
    }
}
