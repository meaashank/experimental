package kotlin.sequences;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.sequences.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4990c<T, K> implements InterfaceC5000m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC5000m<T> f218157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.l<T, K> f218158b;

    /* JADX WARN: Multi-variable type inference failed */
    public C4990c(@NotNull InterfaceC5000m<? extends T> source, @NotNull ed.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(source, "source");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        this.f218157a = source;
        this.f218158b = keySelector;
    }

    @Override // kotlin.sequences.InterfaceC5000m
    @NotNull
    public Iterator<T> iterator() {
        return new C4989b(this.f218157a.iterator(), this.f218158b);
    }
}
