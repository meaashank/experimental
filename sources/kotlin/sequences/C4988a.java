package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.sequences.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4988a<T> implements InterfaceC5000m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AtomicReference<InterfaceC5000m<T>> f218153a;

    public C4988a(@NotNull InterfaceC5000m<? extends T> sequence) {
        kotlin.jvm.internal.G.p(sequence, "sequence");
        this.f218153a = new AtomicReference<>(sequence);
    }

    @Override // kotlin.sequences.InterfaceC5000m
    @NotNull
    public Iterator<T> iterator() {
        InterfaceC5000m<T> andSet = this.f218153a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
