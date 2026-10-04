package kotlin.coroutines;

import ed.p;
import kotlin.InterfaceC4887e0;
import kotlin.coroutines.f;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.3")
public interface i {

    public static final class a {
        @NotNull
        public static i b(@NotNull i iVar, @NotNull i context) {
            G.p(context, "context");
            return context == EmptyCoroutineContext.f217673a ? iVar : (i) context.fold(iVar, new h());
        }

        public static i c(i acc, b element) {
            G.p(acc, "acc");
            G.p(element, "element");
            i iVarMinusKey = acc.minusKey(element.getKey());
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f217673a;
            if (iVarMinusKey == emptyCoroutineContext) {
                return element;
            }
            f.b bVar = f.f217679y3;
            f fVar = (f) iVarMinusKey.get(bVar);
            if (fVar == null) {
                return new CombinedContext(iVarMinusKey, element);
            }
            i iVarMinusKey2 = iVarMinusKey.minusKey(bVar);
            return iVarMinusKey2 == emptyCoroutineContext ? new CombinedContext(element, fVar) : new CombinedContext(new CombinedContext(iVarMinusKey2, element), fVar);
        }
    }

    public interface b extends i {

        public static final class a {
            public static <R> R a(@NotNull b bVar, R r10, @NotNull p<? super R, ? super b, ? extends R> operation) {
                G.p(operation, "operation");
                return operation.invoke(r10, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public static <E extends b> E b(@NotNull b bVar, @NotNull c<E> key) {
                G.p(key, "key");
                if (G.g(bVar.getKey(), key)) {
                    return bVar;
                }
                return null;
            }

            @NotNull
            public static i c(@NotNull b bVar, @NotNull c<?> key) {
                G.p(key, "key");
                return G.g(bVar.getKey(), key) ? EmptyCoroutineContext.f217673a : bVar;
            }

            @NotNull
            public static i d(@NotNull b bVar, @NotNull i context) {
                G.p(context, "context");
                return a.b(bVar, context);
            }
        }

        @Override // kotlin.coroutines.i
        <R> R fold(R r10, @NotNull p<? super R, ? super b, ? extends R> pVar);

        @Override // kotlin.coroutines.i
        @Nullable
        <E extends b> E get(@NotNull c<E> cVar);

        @NotNull
        c<?> getKey();

        @Override // kotlin.coroutines.i
        @NotNull
        i minusKey(@NotNull c<?> cVar);
    }

    public interface c<E extends b> {
    }

    <R> R fold(R r10, @NotNull p<? super R, ? super b, ? extends R> pVar);

    @Nullable
    <E extends b> E get(@NotNull c<E> cVar);

    @NotNull
    i minusKey(@NotNull c<?> cVar);

    @NotNull
    i plus(@NotNull i iVar);
}
