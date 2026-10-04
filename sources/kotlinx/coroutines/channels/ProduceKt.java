package kotlinx.coroutines.channels;

import ed.InterfaceC4376a;
import kotlin.InterfaceC4849b;
import kotlin.L0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5107q0;
import kotlinx.coroutines.InterfaceC5120x0;
import kotlinx.coroutines.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nProduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,148:1\n1#2:149\n318#3,11:150\n*S KotlinDebug\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n*L\n45#1:150,11\n*E\n"})
public final class ProduceKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.q<?> r4, @org.jetbrains.annotations.NotNull ed.InterfaceC4376a<kotlin.L0> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = (kotlinx.coroutines.channels.ProduceKt$awaitClose$1) r0
            int r1 = r0.f219156d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219156d = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f219155c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f219156d
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.f219154b
            r5 = r4
            ed.a r5 = (ed.InterfaceC4376a) r5
            java.lang.Object r4 = r0.f219153a
            kotlinx.coroutines.channels.q r4 = (kotlinx.coroutines.channels.q) r4
            kotlin.C4885d0.n(r6)     // Catch: java.lang.Throwable -> L30
            goto L6a
        L30:
            r4 = move-exception
            goto L70
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.C4885d0.n(r6)
            kotlin.coroutines.i r6 = r0.getContext()
            kotlinx.coroutines.A0$b r2 = kotlinx.coroutines.A0.f218690A3
            kotlin.coroutines.i$b r6 = r6.get(r2)
            if (r6 != r4) goto L74
            r0.f219153a = r4     // Catch: java.lang.Throwable -> L30
            r0.f219154b = r5     // Catch: java.lang.Throwable -> L30
            r0.f219156d = r3     // Catch: java.lang.Throwable -> L30
            kotlinx.coroutines.o r6 = new kotlinx.coroutines.o     // Catch: java.lang.Throwable -> L30
            kotlin.coroutines.e r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.e(r0)     // Catch: java.lang.Throwable -> L30
            r6.<init>(r0, r3)     // Catch: java.lang.Throwable -> L30
            r6.n0()     // Catch: java.lang.Throwable -> L30
            kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1     // Catch: java.lang.Throwable -> L30
            r0.<init>()     // Catch: java.lang.Throwable -> L30
            r4.H(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = r6.z()     // Catch: java.lang.Throwable -> L30
            if (r4 != r1) goto L6a
            return r1
        L6a:
            r5.invoke()
            kotlin.L0 r4 = kotlin.L0.f217464a
            return r4
        L70:
            r5.invoke()
            throw r4
        L74:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ProduceKt.a(kotlinx.coroutines.channels.q, ed.a, kotlin.coroutines.e):java.lang.Object");
    }

    public static /* synthetic */ Object b(q qVar, InterfaceC4376a interfaceC4376a, kotlin.coroutines.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC4376a = new InterfaceC4376a<L0>() { // from class: kotlinx.coroutines.channels.ProduceKt$awaitClose$2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // ed.InterfaceC4376a
                public /* bridge */ /* synthetic */ L0 invoke() {
                    return L0.f217464a;
                }
            };
        }
        return a(qVar, interfaceC4376a, eVar);
    }

    @InterfaceC5107q0
    @NotNull
    public static final <E> ReceiveChannel<E> c(@NotNull L l10, @NotNull kotlin.coroutines.i iVar, int i10, @InterfaceC4849b @NotNull ed.p<? super q<? super E>, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar) {
        return e(l10, iVar, i10, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, pVar);
    }

    @InterfaceC5120x0
    @NotNull
    public static final <E> ReceiveChannel<E> d(@NotNull L l10, @NotNull kotlin.coroutines.i iVar, int i10, @NotNull CoroutineStart coroutineStart, @Nullable ed.l<? super Throwable, L0> lVar, @InterfaceC4849b @NotNull ed.p<? super q<? super E>, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar) {
        return e(l10, iVar, i10, BufferOverflow.SUSPEND, coroutineStart, lVar, pVar);
    }

    @NotNull
    public static final <E> ReceiveChannel<E> e(@NotNull L l10, @NotNull kotlin.coroutines.i iVar, int i10, @NotNull BufferOverflow bufferOverflow, @NotNull CoroutineStart coroutineStart, @Nullable ed.l<? super Throwable, L0> lVar, @InterfaceC4849b @NotNull ed.p<? super q<? super E>, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar) {
        p pVar2 = new p(CoroutineContextKt.e(l10, iVar), i.d(i10, bufferOverflow, null, 4, null), true, true);
        if (lVar != null) {
            pVar2.V1(lVar);
        }
        coroutineStart.invoke(pVar, pVar2, pVar2);
        return pVar2;
    }

    public static /* synthetic */ ReceiveChannel f(L l10, kotlin.coroutines.i iVar, int i10, ed.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = EmptyCoroutineContext.f217673a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c(l10, iVar, i10, pVar);
    }

    public static ReceiveChannel g(L l10, kotlin.coroutines.i iVar, int i10, CoroutineStart coroutineStart, ed.l lVar, ed.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = EmptyCoroutineContext.f217673a;
        }
        kotlin.coroutines.i iVar2 = iVar;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i11 & 8) != 0) {
            lVar = null;
        }
        return e(l10, iVar2, i12, BufferOverflow.SUSPEND, coroutineStart2, lVar, pVar);
    }

    public static /* synthetic */ ReceiveChannel h(L l10, kotlin.coroutines.i iVar, int i10, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, ed.l lVar, ed.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = EmptyCoroutineContext.f217673a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i11 & 8) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        if ((i11 & 16) != 0) {
            lVar = null;
        }
        ed.l lVar2 = lVar;
        return e(l10, iVar, i10, bufferOverflow, coroutineStart, lVar2, pVar);
    }
}
