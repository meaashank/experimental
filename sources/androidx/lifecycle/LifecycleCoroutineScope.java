package androidx.lifecycle;

import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.C5092j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LifecycleCoroutineScope implements kotlinx.coroutines.L {
    @NotNull
    public abstract Lifecycle a();

    @InterfaceC4982o(message = "launchWhenCreated is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.CREATED.")
    @NotNull
    public final A0 b(@NotNull ed.p<? super kotlinx.coroutines.L, ? super kotlin.coroutines.e<? super L0>, ? extends Object> block) {
        kotlin.jvm.internal.G.p(block, "block");
        return C5092j.f(this, null, null, new LifecycleCoroutineScope$launchWhenCreated$1(this, block, null), 3, null);
    }

    @InterfaceC4982o(message = "launchWhenResumed is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.RESUMED.")
    @NotNull
    public final A0 c(@NotNull ed.p<? super kotlinx.coroutines.L, ? super kotlin.coroutines.e<? super L0>, ? extends Object> block) {
        kotlin.jvm.internal.G.p(block, "block");
        return C5092j.f(this, null, null, new LifecycleCoroutineScope$launchWhenResumed$1(this, block, null), 3, null);
    }

    @InterfaceC4982o(message = "launchWhenStarted is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.STARTED.")
    @NotNull
    public final A0 e(@NotNull ed.p<? super kotlinx.coroutines.L, ? super kotlin.coroutines.e<? super L0>, ? extends Object> block) {
        kotlin.jvm.internal.G.p(block, "block");
        return C5092j.f(this, null, null, new LifecycleCoroutineScope$launchWhenStarted$1(this, block, null), 3, null);
    }
}
