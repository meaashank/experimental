package androidx.compose.runtime;

import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f99392a = 0;

    @kotlin.jvm.internal.V({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n*L\n1#1,490:1\n*E\n"})
    public static final class a implements S {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4376a<kotlin.L0> f99393a;

        public a(InterfaceC4376a<kotlin.L0> interfaceC4376a) {
            this.f99393a = interfaceC4376a;
        }

        @Override // androidx.compose.runtime.S
        public void dispose() {
            this.f99393a.invoke();
        }
    }

    @NotNull
    public final S a(@NotNull InterfaceC4376a<kotlin.L0> interfaceC4376a) {
        return new a(interfaceC4376a);
    }
}
