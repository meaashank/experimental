package androidx.compose.animation.core;

import kotlin.Pair;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.animation.core.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public abstract class AbstractC1584f0<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f88107c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f88108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public G f88109b;

    public /* synthetic */ AbstractC1584f0(Object obj, G g10, C4969v c4969v) {
        this(obj, g10);
    }

    @NotNull
    public final G a() {
        return this.f88109b;
    }

    public final T b() {
        return this.f88108a;
    }

    public final void c(@NotNull G g10) {
        this.f88109b = g10;
    }

    @NotNull
    public final <V extends AbstractC1603p> Pair<V, G> d(@NotNull ed.l<? super T, ? extends V> lVar) {
        return new Pair<>(lVar.invoke(this.f88108a), this.f88109b);
    }

    public AbstractC1584f0(T t10, G g10) {
        this.f88108a = t10;
        this.f88109b = g10;
    }
}
