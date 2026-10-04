package kotlinx.coroutines.flow;

import kotlin.L0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,111:1\n285#2,5:112\n*E\n"})
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$3<R> implements e<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e[] f219913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ed.p f219914b;

    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$3(e[] eVarArr, ed.p pVar) {
        this.f219913a = eVarArr;
        this.f219914b = pVar;
    }

    @Nullable
    public Object c(@NotNull f fVar, @NotNull kotlin.coroutines.e eVar) {
        new ContinuationImpl(eVar) { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$3.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f219915a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f219916b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f219915a = obj;
                this.f219916b |= Integer.MIN_VALUE;
                FlowKt__ZipKt$combine$$inlined$unsafeFlow$3.this.getClass();
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
