package kotlin;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.7")
public final class C4974k<T, R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ed.q<AbstractC4978m<T, R>, T, kotlin.coroutines.e<? super R>, Object> f217992a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4974k(@NotNull ed.q<? super AbstractC4978m<T, R>, ? super T, ? super kotlin.coroutines.e<? super R>, ? extends Object> block) {
        kotlin.jvm.internal.G.p(block, "block");
        this.f217992a = block;
    }

    @NotNull
    public final ed.q<AbstractC4978m<T, R>, T, kotlin.coroutines.e<? super R>, Object> a() {
        return this.f217992a;
    }
}
