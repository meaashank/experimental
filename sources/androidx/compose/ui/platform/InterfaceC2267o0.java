package androidx.compose.ui.platform;

import kotlin.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.platform.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2267o0 extends i.b {

    /* JADX INFO: renamed from: T2, reason: collision with root package name */
    @NotNull
    public static final b f103904T2 = b.f103905a;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.o0$a */
    public static final class a {
        public static <R> R a(@NotNull InterfaceC2267o0 interfaceC2267o0, R r10, @NotNull ed.p<? super R, ? super i.b, ? extends R> pVar) {
            return (R) i.b.a.a(interfaceC2267o0, r10, pVar);
        }

        @Nullable
        public static <E extends i.b> E b(@NotNull InterfaceC2267o0 interfaceC2267o0, @NotNull i.c<E> cVar) {
            return (E) i.b.a.b(interfaceC2267o0, cVar);
        }

        @Deprecated
        @NotNull
        public static i.c<?> c(@NotNull InterfaceC2267o0 interfaceC2267o0) {
            return C2264n0.b(interfaceC2267o0);
        }

        @NotNull
        public static kotlin.coroutines.i d(@NotNull InterfaceC2267o0 interfaceC2267o0, @NotNull i.c<?> cVar) {
            return i.b.a.c(interfaceC2267o0, cVar);
        }

        @NotNull
        public static kotlin.coroutines.i e(@NotNull InterfaceC2267o0 interfaceC2267o0, @NotNull kotlin.coroutines.i iVar) {
            return i.b.a.d(interfaceC2267o0, iVar);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.o0$b */
    public static final class b implements i.c<InterfaceC2267o0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f103905a = new b();
    }

    @Override // kotlin.coroutines.i.b
    @NotNull
    i.c<?> getKey();

    @Nullable
    <R> Object n2(@NotNull ed.l<? super kotlin.coroutines.e<? super R>, ? extends Object> lVar, @NotNull kotlin.coroutines.e<? super R> eVar);
}
