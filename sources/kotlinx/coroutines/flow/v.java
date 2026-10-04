package kotlinx.coroutines.flow;

import A0.a;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.Q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,428:1\n1#2:429\n*E\n"})
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Q f220244a = new Q("NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Q f220245b = new Q("PENDING");

    @NotNull
    public static final <T> j<T> a(T t10) {
        if (t10 == null) {
            t10 = (T) kotlinx.coroutines.flow.internal.l.f220222a;
        }
        return new StateFlowImpl(t10);
    }

    @NotNull
    public static final <T> e<T> d(@NotNull u<? extends T> uVar, @NotNull kotlin.coroutines.i iVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) ? o.e(uVar, iVar, i10, bufferOverflow) : uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    public static final <T> T e(@NotNull j<T> jVar, @NotNull ed.l<? super T, ? extends T> lVar) {
        ?? r02;
        do {
            r02 = (Object) jVar.getValue();
        } while (!jVar.compareAndSet(r02, lVar.invoke(r02)));
        return r02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void f(@NotNull j<T> jVar, @NotNull ed.l<? super T, ? extends T> lVar) {
        a.b.C0001a c0001a;
        do {
            c0001a = (Object) jVar.getValue();
        } while (!jVar.compareAndSet(c0001a, lVar.invoke(c0001a)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T g(@NotNull j<T> jVar, @NotNull ed.l<? super T, ? extends T> lVar) {
        a.b.C0001a c0001a;
        T tInvoke;
        do {
            c0001a = (Object) jVar.getValue();
            tInvoke = lVar.invoke(c0001a);
        } while (!jVar.compareAndSet(c0001a, tInvoke));
        return tInvoke;
    }
}
