package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC5120x0
public abstract class AbstractC5049a<T> extends JobSupport implements A0, kotlin.coroutines.e<T>, L {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.i f218811c;

    public AbstractC5049a(@NotNull kotlin.coroutines.i iVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            S0((A0) iVar.get(A0.f218690A3));
        }
        this.f218811c = iVar.plus(this);
    }

    public static /* synthetic */ void O1() {
    }

    public void L1(@Nullable Object obj) {
        S(obj);
    }

    public void P1(@NotNull Throwable th, boolean z10) {
    }

    public void Q1(T t10) {
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void R0(@NotNull Throwable th) {
        I.b(this.f218811c, th);
    }

    public final <R> void R1(@NotNull CoroutineStart coroutineStart, R r10, @NotNull ed.p<? super R, ? super kotlin.coroutines.e<? super T>, ? extends Object> pVar) {
        coroutineStart.invoke(pVar, r10, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    @NotNull
    public String f0() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // kotlin.coroutines.e
    @NotNull
    public final kotlin.coroutines.i getContext() {
        return this.f218811c;
    }

    @Override // kotlinx.coroutines.JobSupport
    @NotNull
    public String h1() {
        return super.h1();
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.A0
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.L
    @NotNull
    public kotlin.coroutines.i m() {
        return this.f218811c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.JobSupport
    public final void p1(@Nullable Object obj) {
        if (!(obj instanceof B)) {
            Q1(obj);
        } else {
            B b10 = (B) obj;
            P1(b10.f218701a, b10.a());
        }
    }

    @Override // kotlin.coroutines.e
    public final void resumeWith(@NotNull Object obj) {
        Object objE1 = e1(E.d(obj, null, 1, null));
        if (objE1 == G0.f218719b) {
            return;
        }
        L1(objE1);
    }
}
