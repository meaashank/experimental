package kotlinx.coroutines.flow;

import kotlin.L0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,111:1\n234#2,2:112\n*E\n"})
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$2<R> implements e<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e[] f219908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ed.p f219909b;

    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$2(e[] eVarArr, ed.p pVar) {
        this.f219908a = eVarArr;
        this.f219909b = pVar;
    }

    @Nullable
    public Object c(@NotNull f fVar, @NotNull kotlin.coroutines.e eVar) {
        new ContinuationImpl(eVar) { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$2.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f219910a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f219911b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f219910a = obj;
                this.f219911b |= Integer.MIN_VALUE;
                FlowKt__ZipKt$combine$$inlined$unsafeFlow$2.this.getClass();
                G.P();
                throw null;
            }
        };
        G.P();
        throw null;
    }

    @Override // kotlinx.coroutines.flow.e
    @Nullable
    public Object collect(@NotNull f<? super R> fVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        G.P();
        throw null;
    }
}
