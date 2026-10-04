package kotlinx.coroutines;

import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class T0 {

    @kotlin.jvm.internal.V({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n*L\n1#1,14:1\n*E\n"})
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4376a<kotlin.L0> f218797a;

        public a(InterfaceC4376a<kotlin.L0> interfaceC4376a) {
            this.f218797a = interfaceC4376a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f218797a.invoke();
        }
    }

    @NotNull
    public static final Runnable a(@NotNull InterfaceC4376a<kotlin.L0> interfaceC4376a) {
        return new a(interfaceC4376a);
    }
}
