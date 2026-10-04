package androidx.compose.ui;

import androidx.compose.runtime.T1;
import kotlin.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T1
public interface t extends i.b {

    /* JADX INFO: renamed from: N2, reason: collision with root package name */
    @NotNull
    public static final b f104180N2 = b.f104181a;

    public static final class a {
        public static <R> R a(@NotNull t tVar, R r10, @NotNull ed.p<? super R, ? super i.b, ? extends R> pVar) {
            return (R) i.b.a.a(tVar, r10, pVar);
        }

        @Nullable
        public static <E extends i.b> E b(@NotNull t tVar, @NotNull i.c<E> cVar) {
            return (E) i.b.a.b(tVar, cVar);
        }

        @NotNull
        public static kotlin.coroutines.i c(@NotNull t tVar, @NotNull i.c<?> cVar) {
            return i.b.a.c(tVar, cVar);
        }

        @NotNull
        public static kotlin.coroutines.i d(@NotNull t tVar, @NotNull kotlin.coroutines.i iVar) {
            return i.b.a.d(tVar, iVar);
        }
    }

    public static final class b implements i.c<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f104181a = new b();
    }

    float G1();

    @Override // kotlin.coroutines.i.b
    @NotNull
    i.c<?> getKey();
}
