package kotlin.sequences;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.collections.AbstractC4857c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.sequences.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4989b<T, K> extends AbstractC4857c<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Iterator<T> f218154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ed.l<T, K> f218155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final HashSet<K> f218156e;

    /* JADX WARN: Multi-variable type inference failed */
    public C4989b(@NotNull Iterator<? extends T> source, @NotNull ed.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.G.p(source, "source");
        kotlin.jvm.internal.G.p(keySelector, "keySelector");
        this.f218154c = source;
        this.f218155d = keySelector;
        this.f218156e = new HashSet<>();
    }

    @Override // kotlin.collections.AbstractC4857c
    public void b() {
        while (this.f218154c.hasNext()) {
            T next = this.f218154c.next();
            if (this.f218156e.add(this.f218155d.invoke(next))) {
                e(next);
                return;
            }
        }
        this.f217599a = 2;
    }
}
