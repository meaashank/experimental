package kotlin.coroutines;

import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC5043v;
import kotlin.coroutines.i;
import kotlin.coroutines.i.b;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.3")
@InterfaceC5043v
public abstract class b<B extends i.b, E extends B> implements i.c<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ed.l<i.b, E> f217675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final i.c<?> f217676b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.i$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [ed.l<? super kotlin.coroutines.i$b, ? extends E extends B>, ed.l<kotlin.coroutines.i$b, E extends B>, java.lang.Object] */
    public b(@NotNull i.c<B> baseKey, @NotNull ed.l<? super i.b, ? extends E> safeCast) {
        G.p(baseKey, "baseKey");
        G.p(safeCast, "safeCast");
        this.f217675a = safeCast;
        this.f217676b = baseKey instanceof b ? (i.c<B>) ((b) baseKey).f217676b : baseKey;
    }

    public final boolean a(@NotNull i.c<?> key) {
        G.p(key, "key");
        return key == this || this.f217676b == key;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/i$b;)TE; */
    @Nullable
    public final i.b b(@NotNull i.b element) {
        G.p(element, "element");
        return (i.b) this.f217675a.invoke(element);
    }
}
