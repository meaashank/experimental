package kotlin;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@kotlin.coroutines.k
@InterfaceC4887e0(version = "1.7")
@O0(markerClass = {InterfaceC5043v.class})
public abstract class AbstractC4978m<T, R> {
    public AbstractC4978m() {
    }

    @Nullable
    public abstract Object a(T t10, @NotNull kotlin.coroutines.e<? super R> eVar);

    @Nullable
    public abstract <U, S> Object b(@NotNull C4974k<U, S> c4974k, U u10, @NotNull kotlin.coroutines.e<? super S> eVar);

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @InterfaceC4852c0(expression = "this.callRecursive(value)", imports = {}))
    @NotNull
    public final Void c(@NotNull C4974k<?, ?> c4974k, @Nullable Object obj) {
        kotlin.jvm.internal.G.p(c4974k, "<this>");
        throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }

    public AbstractC4978m(C4969v c4969v) {
    }
}
