package kotlinx.coroutines.channels;

import kotlinx.coroutines.C5102o;
import kotlinx.coroutines.internal.N;
import kotlinx.coroutines.l1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class r<E> implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public final C5102o<j<? extends E>> f219205a;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@NotNull C5102o<? super j<? extends E>> c5102o) {
        this.f219205a = c5102o;
    }

    @Override // kotlinx.coroutines.l1
    public void b(@NotNull N<?> n10, int i10) {
        this.f219205a.b(n10, i10);
    }
}
