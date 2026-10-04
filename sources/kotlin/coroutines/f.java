package kotlin.coroutines;

import androidx.activity.D;
import ed.p;
import kotlin.InterfaceC4887e0;
import kotlin.coroutines.i;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.3")
public interface f extends i.b {

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @NotNull
    public static final b f217679y3 = b.f217680a;

    public static final class a {
        public static <R> R a(@NotNull f fVar, R r10, @NotNull p<? super R, ? super i.b, ? extends R> operation) {
            G.p(operation, "operation");
            return operation.invoke(r10, fVar);
        }

        @Nullable
        public static <E extends i.b> E b(@NotNull f fVar, @NotNull i.c<E> key) {
            G.p(key, "key");
            if (!(key instanceof kotlin.coroutines.b)) {
                if (f.f217679y3 != key) {
                    return null;
                }
                G.n(fVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return fVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            if (bVar.a(fVar.getKey())) {
                E e10 = (E) bVar.b(fVar);
                if (D.a(e10)) {
                    return e10;
                }
            }
            return null;
        }

        @NotNull
        public static i c(@NotNull f fVar, @NotNull i.c<?> key) {
            G.p(key, "key");
            if (!(key instanceof kotlin.coroutines.b)) {
                return f.f217679y3 == key ? EmptyCoroutineContext.f217673a : fVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            return (!bVar.a(fVar.getKey()) || bVar.b(fVar) == null) ? fVar : EmptyCoroutineContext.f217673a;
        }

        @NotNull
        public static i d(@NotNull f fVar, @NotNull i context) {
            G.p(context, "context");
            return i.a.b(fVar, context);
        }

        public static void e(@NotNull f fVar, @NotNull e<?> continuation) {
            G.p(continuation, "continuation");
        }
    }

    public static final class b implements i.c<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f217680a = new b();
    }

    @NotNull
    <T> e<T> O0(@NotNull e<? super T> eVar);

    void c(@NotNull e<?> eVar);

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @Nullable
    <E extends i.b> E get(@NotNull i.c<E> cVar);

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @NotNull
    i minusKey(@NotNull i.c<?> cVar);
}
