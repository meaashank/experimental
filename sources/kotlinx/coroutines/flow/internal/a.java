package kotlinx.coroutines.flow.internal;

import A0.a;
import java.util.Arrays;
import kotlin.L0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.flow.internal.c;
import kotlinx.coroutines.flow.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,128:1\n24#2,4:129\n24#2,4:134\n24#2,4:140\n16#3:133\n16#3:138\n16#3:144\n1#4:139\n13309#5,2:145\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n*L\n26#1:129,4\n41#1:134,4\n72#1:140,4\n26#1:133\n41#1:138\n72#1:144\n91#1:145,2\n*E\n"})
public abstract class a<S extends c<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public S[] f220212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f220213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f220214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public o f220215d;

    @NotNull
    public final S e() {
        S s10;
        o oVar;
        synchronized (this) {
            try {
                S[] sArr = this.f220212a;
                if (sArr == null) {
                    sArr = (S[]) g(2);
                    this.f220212a = sArr;
                } else if (this.f220213b >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    G.o(objArrCopyOf, "copyOf(...)");
                    this.f220212a = (S[]) ((c[]) objArrCopyOf);
                    sArr = (S[]) ((c[]) objArrCopyOf);
                }
                int i10 = this.f220214c;
                do {
                    s10 = sArr[i10];
                    if (s10 == null) {
                        s10 = (S) f();
                        sArr[i10] = s10;
                    }
                    i10++;
                    if (i10 >= sArr.length) {
                        i10 = 0;
                    }
                    G.n(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!s10.a(this));
                this.f220214c = i10;
                this.f220213b++;
                oVar = this.f220215d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (oVar != null) {
            oVar.d0(1);
        }
        return s10;
    }

    @NotNull
    public abstract S f();

    @NotNull
    public abstract S[] g(int i10);

    @NotNull
    public final u<Integer> j() {
        o oVar;
        synchronized (this) {
            oVar = this.f220215d;
            if (oVar == null) {
                oVar = new o(this.f220213b);
                this.f220215d = oVar;
            }
        }
        return oVar;
    }

    public final void k(@NotNull ed.l<? super S, L0> lVar) {
        S[] sArr;
        if (this.f220213b == 0 || (sArr = this.f220212a) == null) {
            return;
        }
        for (a.b bVar : sArr) {
            if (bVar != null) {
                lVar.invoke(bVar);
            }
        }
    }

    public final void l(@NotNull S s10) {
        o oVar;
        int i10;
        kotlin.coroutines.e<L0>[] eVarArrB;
        synchronized (this) {
            try {
                int i11 = this.f220213b - 1;
                this.f220213b = i11;
                oVar = this.f220215d;
                if (i11 == 0) {
                    this.f220214c = 0;
                }
                G.n(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                eVarArrB = s10.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (kotlin.coroutines.e<L0> eVar : eVarArrB) {
            if (eVar != null) {
                eVar.resumeWith(L0.f217464a);
            }
        }
        if (oVar != null) {
            oVar.d0(-1);
        }
    }

    public final int m() {
        return this.f220213b;
    }

    @Nullable
    public final S[] n() {
        return this.f220212a;
    }
}
