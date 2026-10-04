package kotlinx.coroutines;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.InterfaceC5043v;
import kotlin.coroutines.f;
import kotlin.coroutines.i;
import kotlin.jvm.internal.C4969v;
import kotlinx.coroutines.internal.C5079m;
import kotlinx.coroutines.internal.C5084s;
import kotlinx.coroutines.internal.C5085t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CoroutineDispatcher extends kotlin.coroutines.a implements kotlin.coroutines.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Key f218710b = new Key();

    @InterfaceC5043v
    public static final class Key extends kotlin.coroutines.b<kotlin.coroutines.f, CoroutineDispatcher> {
        public /* synthetic */ Key(C4969v c4969v) {
            this();
        }

        public Key() {
            super(kotlin.coroutines.f.f217679y3, new ed.l<i.b, CoroutineDispatcher>() { // from class: kotlinx.coroutines.CoroutineDispatcher.Key.1
                @Override // ed.l
                @Nullable
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public final CoroutineDispatcher invoke(@NotNull i.b bVar) {
                    if (bVar instanceof CoroutineDispatcher) {
                        return (CoroutineDispatcher) bVar;
                    }
                    return null;
                }
            });
        }
    }

    public CoroutineDispatcher() {
        super(kotlin.coroutines.f.f217679y3);
    }

    public abstract void F2(@NotNull kotlin.coroutines.i iVar, @NotNull Runnable runnable);

    @InterfaceC5120x0
    public void H2(@NotNull kotlin.coroutines.i iVar, @NotNull Runnable runnable) {
        F2(iVar, runnable);
    }

    public boolean J2(@NotNull kotlin.coroutines.i iVar) {
        return !(this instanceof i1);
    }

    @Override // kotlin.coroutines.f
    @NotNull
    public final <T> kotlin.coroutines.e<T> O0(@NotNull kotlin.coroutines.e<? super T> eVar) {
        return new C5079m(this, eVar);
    }

    @InterfaceC5107q0
    @NotNull
    public CoroutineDispatcher R2(int i10) {
        C5085t.a(i10);
        return new C5084s(this, i10);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    @NotNull
    public final CoroutineDispatcher V2(@NotNull CoroutineDispatcher coroutineDispatcher) {
        return coroutineDispatcher;
    }

    @Override // kotlin.coroutines.f
    public final void c(@NotNull kotlin.coroutines.e<?> eVar) {
        kotlin.jvm.internal.G.n(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C5079m) eVar).w();
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.i.b, kotlin.coroutines.i
    @Nullable
    public <E extends i.b> E get(@NotNull i.c<E> cVar) {
        return (E) f.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.i.b, kotlin.coroutines.i
    @NotNull
    public kotlin.coroutines.i minusKey(@NotNull i.c<?> cVar) {
        return f.a.c(this, cVar);
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '@' + O.b(this);
    }
}
