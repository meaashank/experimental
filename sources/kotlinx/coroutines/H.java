package kotlinx.coroutines;

import kotlin.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface H extends i.b {

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    @NotNull
    public static final b f218728z3 = b.f218729a;

    public static final class a {
        public static <R> R a(@NotNull H h10, R r10, @NotNull ed.p<? super R, ? super i.b, ? extends R> pVar) {
            return (R) i.b.a.a(h10, r10, pVar);
        }

        @Nullable
        public static <E extends i.b> E b(@NotNull H h10, @NotNull i.c<E> cVar) {
            return (E) i.b.a.b(h10, cVar);
        }

        @NotNull
        public static kotlin.coroutines.i c(@NotNull H h10, @NotNull i.c<?> cVar) {
            return i.b.a.c(h10, cVar);
        }

        @NotNull
        public static kotlin.coroutines.i d(@NotNull H h10, @NotNull kotlin.coroutines.i iVar) {
            return i.b.a.d(h10, iVar);
        }
    }

    public static final class b implements i.c<H> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f218729a = new b();
    }

    void handleException(@NotNull kotlin.coroutines.i iVar, @NotNull Throwable th);
}
