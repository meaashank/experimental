package kotlinx.coroutines.internal;

import kotlin.coroutines.i;
import kotlinx.coroutines.Z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class ThreadContextKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final Q f220312a = new Q("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ed.p<Object, i.b, Object> f220313b = new ed.p<Object, i.b, Object>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$countAll$1
        @Override // ed.p
        @Nullable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable Object obj, @NotNull i.b bVar) {
            if (!(bVar instanceof Z0)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final ed.p<Z0<?>, i.b, Z0<?>> f220314c = new ed.p<Z0<?>, i.b, Z0<?>>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$findOne$1
        @Override // ed.p
        @Nullable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Z0<?> invoke(@Nullable Z0<?> z02, @NotNull i.b bVar) {
            if (z02 != null) {
                return z02;
            }
            if (bVar instanceof Z0) {
                return (Z0) bVar;
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final ed.p<c0, i.b, c0> f220315d = new ed.p<c0, i.b, c0>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$updateState$1
        @NotNull
        public final c0 e(@NotNull c0 c0Var, @NotNull i.b bVar) {
            if (bVar instanceof Z0) {
                Z0<?> z02 = (Z0) bVar;
                c0Var.a(z02, z02.z2(c0Var.f220328a));
            }
            return c0Var;
        }

        @Override // ed.p
        public /* bridge */ /* synthetic */ c0 invoke(c0 c0Var, i.b bVar) {
            c0 c0Var2 = c0Var;
            e(c0Var2, bVar);
            return c0Var2;
        }
    };

    public static final void a(@NotNull kotlin.coroutines.i iVar, @Nullable Object obj) {
        if (obj == f220312a) {
            return;
        }
        if (obj instanceof c0) {
            ((c0) obj).b(iVar);
            return;
        }
        Object objFold = iVar.fold(null, f220314c);
        kotlin.jvm.internal.G.n(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((Z0) objFold).u(iVar, obj);
    }

    @NotNull
    public static final Object b(@NotNull kotlin.coroutines.i iVar) {
        Object objFold = iVar.fold(0, f220313b);
        kotlin.jvm.internal.G.m(objFold);
        return objFold;
    }

    @Nullable
    public static final Object c(@NotNull kotlin.coroutines.i iVar, @Nullable Object obj) {
        if (obj == null) {
            obj = b(iVar);
        }
        return obj == 0 ? f220312a : obj instanceof Integer ? iVar.fold(new c0(iVar, ((Number) obj).intValue()), f220315d) : ((Z0) obj).z2(iVar);
    }
}
