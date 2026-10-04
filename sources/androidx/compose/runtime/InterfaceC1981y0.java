package androidx.compose.runtime;

import kotlin.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.runtime.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1981y0 extends i.b {

    /* JADX INFO: renamed from: J2, reason: collision with root package name */
    @NotNull
    public static final b f100320J2 = b.f100321a;

    /* JADX INFO: renamed from: androidx.compose.runtime.y0$a */
    public static final class a {
        public static <R> R a(@NotNull InterfaceC1981y0 interfaceC1981y0, R r10, @NotNull ed.p<? super R, ? super i.b, ? extends R> pVar) {
            return (R) i.b.a.a(interfaceC1981y0, r10, pVar);
        }

        @Nullable
        public static <E extends i.b> E b(@NotNull InterfaceC1981y0 interfaceC1981y0, @NotNull i.c<E> cVar) {
            return (E) i.b.a.b(interfaceC1981y0, cVar);
        }

        @Deprecated
        @NotNull
        public static i.c<?> c(@NotNull InterfaceC1981y0 interfaceC1981y0) {
            return C1978x0.b(interfaceC1981y0);
        }

        @NotNull
        public static kotlin.coroutines.i d(@NotNull InterfaceC1981y0 interfaceC1981y0, @NotNull i.c<?> cVar) {
            return i.b.a.c(interfaceC1981y0, cVar);
        }

        @NotNull
        public static kotlin.coroutines.i e(@NotNull InterfaceC1981y0 interfaceC1981y0, @NotNull kotlin.coroutines.i iVar) {
            return i.b.a.d(interfaceC1981y0, iVar);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.y0$b */
    public static final class b implements i.c<InterfaceC1981y0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f100321a = new b();
    }

    @Nullable
    <R> Object B1(@NotNull ed.l<? super Long, ? extends R> lVar, @NotNull kotlin.coroutines.e<? super R> eVar);

    @Override // kotlin.coroutines.i.b
    @NotNull
    i.c<?> getKey();
}
