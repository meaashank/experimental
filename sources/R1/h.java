package R1;

import androidx.lifecycle.k0;
import ed.l;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.O;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class h<T extends k0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kotlin.reflect.d<T> f67692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final l<a, T> f67693b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@NotNull kotlin.reflect.d<T> clazz, @NotNull l<? super a, ? extends T> initializer) {
        G.p(clazz, "clazz");
        G.p(initializer, "initializer");
        this.f67692a = clazz;
        this.f67693b = initializer;
    }

    @NotNull
    public final kotlin.reflect.d<T> a() {
        return this.f67692a;
    }

    @NotNull
    public final l<a, T> b() {
        return this.f67693b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Class<T> clazz, @NotNull l<? super a, ? extends T> initializer) {
        this(O.d(clazz), initializer);
        G.p(clazz, "clazz");
        G.p(initializer, "initializer");
    }
}
