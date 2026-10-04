package androidx.lifecycle.compose;

import androidx.compose.runtime.internal.r;
import androidx.lifecycle.B;
import androidx.lifecycle.Lifecycle;
import ed.l;
import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@r(parameters = 0)
public final class g implements B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f114303b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lifecycle f114304a;

    @V({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleStartStopEffectScope$onStopOrDispose$1\n*L\n1#1,747:1\n*E\n"})
    public static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<B, L0> f114305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f114306b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super B, L0> lVar, g gVar) {
            this.f114305a = lVar;
            this.f114306b = gVar;
        }

        @Override // androidx.lifecycle.compose.h
        public void a() {
            this.f114305a.invoke(this.f114306b);
        }
    }

    public g(@NotNull Lifecycle lifecycle) {
        this.f114304a = lifecycle;
    }

    @NotNull
    public final h a(@NotNull l<? super B, L0> lVar) {
        return new a(lVar, this);
    }

    @Override // androidx.lifecycle.B
    @NotNull
    public Lifecycle getLifecycle() {
        return this.f114304a;
    }
}
