package Sc;

import kotlin.A;
import kotlin.C;
import kotlin.InterfaceC4887e0;
import kotlin.contracts.InvocationKind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.3")
@f
@Xc.b
public interface c {

    public static final class a {
        public static /* synthetic */ Sc.a a(c cVar, A a10, InvocationKind invocationKind, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callsInPlace");
            }
            if ((i10 & 2) != 0) {
                invocationKind = InvocationKind.UNKNOWN;
            }
            return cVar.f(a10, invocationKind);
        }
    }

    @g
    @Xc.b
    @NotNull
    <R> h a(boolean z10, @NotNull A<? extends R> a10);

    @C
    @Xc.b
    @NotNull
    i b();

    @C
    @Xc.b
    @NotNull
    i c(@Nullable Object obj);

    @C
    @Xc.b
    @NotNull
    j d();

    @g
    @Xc.b
    void e(boolean z10, @NotNull j jVar);

    @C
    @Xc.b
    @NotNull
    <R> Sc.a f(@NotNull A<? extends R> a10, @NotNull InvocationKind invocationKind);
}
