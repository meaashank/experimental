package kotlinx.coroutines.flow;

import kotlin.InterfaceC4849b;
import kotlin.InterfaceC4850b0;
import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,218:1\n105#2:219\n105#2:220\n105#2:221\n105#2:222\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n46#1:219\n72#1:220\n142#1:221\n177#1:222\n*E\n"})
public final /* synthetic */ class FlowKt__EmittersKt {
    public static final void b(@NotNull f<?> fVar) {
        if (fVar instanceof x) {
            throw ((x) fVar).f220247a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object c(kotlinx.coroutines.flow.f<? super T> r4, ed.q<? super kotlinx.coroutines.flow.f<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.e<? super kotlin.L0>, ? extends java.lang.Object> r5, java.lang.Throwable r6, kotlin.coroutines.e<? super kotlin.L0> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1) r0
            int r1 = r0.f219498c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219498c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f219497b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f219498c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f219496a
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.C4885d0.n(r7)     // Catch: java.lang.Throwable -> L2c
            goto L44
        L2c:
            r4 = move-exception
            goto L47
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.C4885d0.n(r7)
            r0.f219496a = r6     // Catch: java.lang.Throwable -> L2c
            r0.f219498c = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L2c
            if (r4 != r1) goto L44
            return r1
        L44:
            kotlin.L0 r4 = kotlin.L0.f217464a
            return r4
        L47:
            if (r6 == 0) goto L4e
            if (r6 == r4) goto L4e
            kotlin.C4987s.a(r4, r6)
        L4e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt.c(kotlinx.coroutines.flow.f, ed.q, java.lang.Throwable, kotlin.coroutines.e):java.lang.Object");
    }

    @NotNull
    public static final <T> e<T> d(@NotNull e<? extends T> eVar, @NotNull ed.q<? super f<? super T>, ? super Throwable, ? super kotlin.coroutines.e<? super L0>, ? extends Object> qVar) {
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(eVar, qVar);
    }

    @NotNull
    public static final <T> e<T> e(@NotNull e<? extends T> eVar, @NotNull ed.p<? super f<? super T>, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar) {
        return new FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(eVar, pVar);
    }

    @NotNull
    public static final <T> e<T> f(@NotNull e<? extends T> eVar, @NotNull ed.p<? super f<? super T>, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar) {
        return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(pVar, eVar);
    }

    @NotNull
    public static final <T, R> e<R> g(@NotNull e<? extends T> eVar, @InterfaceC4849b @NotNull ed.q<? super f<? super R>, ? super T, ? super kotlin.coroutines.e<? super L0>, ? extends Object> qVar) {
        return new m(new FlowKt__EmittersKt$transform$1(eVar, qVar, null));
    }

    @InterfaceC4850b0
    @NotNull
    public static final <T, R> e<R> h(@NotNull e<? extends T> eVar, @InterfaceC4849b @NotNull ed.q<? super f<? super R>, ? super T, ? super kotlin.coroutines.e<? super L0>, ? extends Object> qVar) {
        return new FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(eVar, qVar);
    }
}
