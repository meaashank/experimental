package Oc;

import java.util.Comparator;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class l<T> implements Comparator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Comparator<T> f65483a;

    public l(@NotNull Comparator<T> comparator) {
        G.p(comparator, "comparator");
        this.f65483a = comparator;
    }

    @NotNull
    public final Comparator<T> a() {
        return this.f65483a;
    }

    @Override // java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f65483a.compare(t11, t10);
    }

    @Override // java.util.Comparator
    @NotNull
    public final Comparator<T> reversed() {
        return this.f65483a;
    }
}
