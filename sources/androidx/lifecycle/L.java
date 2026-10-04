package androidx.lifecycle;

import kotlin.InterfaceC4982o;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class L {

    @kotlin.jvm.internal.V({"SMAP\nLiveData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveData.kt\nandroidx/lifecycle/LiveDataKt$observe$wrappedObserver$1\n*L\n1#1,56:1\n*E\n"})
    public static final class a<T> implements Q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ed.l<T, L0> f114028a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ed.l<? super T, L0> lVar) {
            this.f114028a = lVar;
        }

        @Override // androidx.lifecycle.Q
        public final void a(T t10) {
            this.f114028a.invoke(t10);
        }
    }

    @e.I
    @InterfaceC4982o(message = "This extension method is not required when using Kotlin 1.4. You should remove \"import androidx.lifecycle.observe\"")
    @NotNull
    public static final <T> Q<T> a(@NotNull K<T> k10, @NotNull B owner, @NotNull ed.l<? super T, L0> onChanged) {
        kotlin.jvm.internal.G.p(k10, "<this>");
        kotlin.jvm.internal.G.p(owner, "owner");
        kotlin.jvm.internal.G.p(onChanged, "onChanged");
        a aVar = new a(onChanged);
        k10.k(owner, aVar);
        return aVar;
    }
}
