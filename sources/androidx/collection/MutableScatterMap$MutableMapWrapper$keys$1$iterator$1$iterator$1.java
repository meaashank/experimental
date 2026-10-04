package androidx.collection;

import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5002o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1980:1\n365#2,6:1981\n375#2,3:1988\n378#2,9:1992\n1956#3:1987\n1820#3:1991\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1\n*L\n1514#1:1981,6\n1514#1:1988,3\n1514#1:1992,9\n1514#1:1987\n1514#1:1991\n*E\n"})
@Vc.d(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1515}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3"})
public final class MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 extends RestrictedSuspendLambda implements ed.p<AbstractC5002o<? super Integer>, kotlin.coroutines.e<? super kotlin.L0>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f86763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f86764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f86768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f86769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f86770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MutableScatterMap<K, V> f86771j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap, kotlin.coroutines.e<? super MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1> eVar) {
        super(2, eVar);
        this.f86771j = mutableScatterMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<kotlin.L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 = new MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(this.f86771j, eVar);
        mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1.f86770i = obj;
        return mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1;
    }

    @Override // ed.p
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull AbstractC5002o<? super Integer> abstractC5002o, @Nullable kotlin.coroutines.e<? super kotlin.L0> eVar) {
        return ((MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1) create(abstractC5002o, eVar)).invokeSuspend(kotlin.L0.f217464a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004b -> B:23:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:14:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0068 -> B:20:0x0089). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0086 -> B:20:0x0089). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r20) throws java.lang.Throwable {
        /*
            r19 = this;
            r0 = r19
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f86769h
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2c
            if (r2 != r5) goto L24
            int r2 = r0.f86767f
            int r6 = r0.f86766e
            long r7 = r0.f86768g
            int r9 = r0.f86765d
            int r10 = r0.f86764c
            java.lang.Object r11 = r0.f86763b
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.f86770i
            kotlin.sequences.o r12 = (kotlin.sequences.AbstractC5002o) r12
            kotlin.C4885d0.n(r20)
            goto L89
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2c:
            kotlin.C4885d0.n(r20)
            java.lang.Object r2 = r0.f86770i
            kotlin.sequences.o r2 = (kotlin.sequences.AbstractC5002o) r2
            androidx.collection.MutableScatterMap<K, V> r6 = r0.f86771j
            long[] r6 = r6.f86837a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L97
            r8 = r3
        L3d:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L92
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r11
            r11 = r6
            r6 = r12
            r12 = r2
            r2 = r3
            r17 = r9
            r10 = r7
            r9 = r8
            r7 = r17
        L5f:
            if (r2 >= r6) goto L8c
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L89
            int r13 = r9 << 3
            int r13 = r13 + r2
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r13)
            r0.f86770i = r12
            r0.f86763b = r11
            r0.f86764c = r10
            r0.f86765d = r9
            r0.f86768g = r7
            r0.f86766e = r6
            r0.f86767f = r2
            r0.f86769h = r5
            java.lang.Object r13 = r12.b(r14, r0)
            if (r13 != r1) goto L89
            return r1
        L89:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L5f
        L8c:
            if (r6 != r4) goto L97
            r8 = r9
            r7 = r10
            r6 = r11
            r2 = r12
        L92:
            if (r8 == r7) goto L97
            int r8 = r8 + 1
            goto L3d
        L97:
            kotlin.L0 r1 = kotlin.L0.f217464a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
