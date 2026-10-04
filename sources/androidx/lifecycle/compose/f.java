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
public final class f implements B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f114299b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lifecycle f114300a;

    @V({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleResumePauseEffectScope$onPauseOrDispose$1\n*L\n1#1,747:1\n*E\n"})
    public static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<B, L0> f114301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f114302b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super B, L0> lVar, f fVar) {
            this.f114301a = lVar;
            this.f114302b = fVar;
        }

        @Override // androidx.lifecycle.compose.e
        public void a() {
            this.f114301a.invoke(this.f114302b);
        }
    }

    public f(@NotNull Lifecycle lifecycle) {
        this.f114300a = lifecycle;
    }

    @NotNull
    public final e a(@NotNull l<? super B, L0> lVar) {
        return new a(lVar, this);
    }

    @Override // androidx.lifecycle.B
    @NotNull
    public Lifecycle getLifecycle() {
        return this.f114300a;
    }
}
