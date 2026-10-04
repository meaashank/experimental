package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC5100n<T> extends kotlin.coroutines.e<T> {

    /* JADX INFO: renamed from: kotlinx.coroutines.n$a */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC5100n interfaceC5100n, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return interfaceC5100n.g(th);
        }

        public static /* synthetic */ Object b(InterfaceC5100n interfaceC5100n, Object obj, Object obj2, int i10, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
            }
            if ((i10 & 2) != 0) {
                obj2 = null;
            }
            return interfaceC5100n.d0(obj, obj2);
        }
    }

    boolean U();

    @InterfaceC5107q0
    void X(T t10, @Nullable ed.l<? super Throwable, kotlin.L0> lVar);

    @InterfaceC5107q0
    void a0(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Throwable th);

    @InterfaceC5120x0
    void c0(@NotNull Object obj);

    @InterfaceC5120x0
    @Nullable
    Object d0(T t10, @Nullable Object obj);

    boolean g(@Nullable Throwable th);

    @InterfaceC5120x0
    @Nullable
    Object g0(@NotNull Throwable th);

    @InterfaceC5120x0
    @Nullable
    Object h0(T t10, @Nullable Object obj, @Nullable ed.l<? super Throwable, kotlin.L0> lVar);

    boolean isActive();

    boolean isCancelled();

    void k0(@NotNull ed.l<? super Throwable, kotlin.L0> lVar);

    @InterfaceC5107q0
    void l0(@NotNull CoroutineDispatcher coroutineDispatcher, T t10);

    @InterfaceC5120x0
    void n0();
}
