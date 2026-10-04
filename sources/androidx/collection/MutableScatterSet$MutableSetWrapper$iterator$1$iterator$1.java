package androidx.collection;

import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5002o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1097:1\n198#2,7:1098\n209#2,3:1106\n212#2,9:1110\n1956#3:1105\n1820#3:1109\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1\n*L\n1055#1:1098,7\n1055#1:1106,3\n1055#1:1110,9\n1055#1:1105\n1055#1:1109\n*E\n"})
@Vc.d(c = "androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {com.prism.gaia.helper.utils.apk.b.f165089i}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
public final class MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1<E> extends RestrictedSuspendLambda implements ed.p<AbstractC5002o<? super E>, kotlin.coroutines.e<? super kotlin.L0>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f86790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f86791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f86792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f86795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f86796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f86797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f86798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f86799k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MutableScatterSet<E> f86800l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MutableScatterSet$MutableSetWrapper$iterator$1 f86801m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(MutableScatterSet<E> mutableScatterSet, MutableScatterSet$MutableSetWrapper$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$1, kotlin.coroutines.e<? super MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1> eVar) {
        super(2, eVar);
        this.f86800l = mutableScatterSet;
        this.f86801m = mutableScatterSet$MutableSetWrapper$iterator$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<kotlin.L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 = new MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(this.f86800l, this.f86801m, eVar);
        mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1.f86799k = obj;
        return mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;
    }

    @Override // ed.p
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull AbstractC5002o<? super E> abstractC5002o, @Nullable kotlin.coroutines.e<? super kotlin.L0> eVar) {
        return ((MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1) create(abstractC5002o, eVar)).invokeSuspend(kotlin.L0.f217464a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0055 -> B:23:0x00a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0057 -> B:14:0x006b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0074 -> B:20:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0097 -> B:20:0x009a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r22) throws java.lang.Throwable {
        /*
            r21 = this;
            r0 = r21
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f86798j
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L34
            if (r2 != r5) goto L2c
            int r2 = r0.f86796h
            int r6 = r0.f86795g
            long r7 = r0.f86797i
            int r9 = r0.f86794f
            int r10 = r0.f86793e
            java.lang.Object r11 = r0.f86792d
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.f86791c
            androidx.collection.MutableScatterSet r12 = (androidx.collection.MutableScatterSet) r12
            java.lang.Object r13 = r0.f86790b
            androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1 r13 = (androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1) r13
            java.lang.Object r14 = r0.f86799k
            kotlin.sequences.o r14 = (kotlin.sequences.AbstractC5002o) r14
            kotlin.C4885d0.n(r22)
            goto L9a
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            kotlin.C4885d0.n(r22)
            java.lang.Object r2 = r0.f86799k
            kotlin.sequences.o r2 = (kotlin.sequences.AbstractC5002o) r2
            androidx.collection.MutableScatterSet<E> r6 = r0.f86800l
            androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1 r7 = r0.f86801m
            long[] r8 = r6.f86876a
            int r9 = r8.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto Lab
            r10 = 0
        L47:
            r11 = r8[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La6
            int r13 = r10 - r9
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r10
            r10 = r9
            r9 = r14
            r14 = r2
            r2 = 0
            r19 = r11
            r12 = r6
            r11 = r8
            r6 = r13
            r13 = r7
            r7 = r19
        L6b:
            if (r2 >= r6) goto L9d
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L9a
            int r15 = r9 << 3
            int r15 = r15 + r2
            r13.f86787a = r15
            java.lang.Object[] r3 = r12.f86877b
            r3 = r3[r15]
            r0.f86799k = r14
            r0.f86790b = r13
            r0.f86791c = r12
            r0.f86792d = r11
            r0.f86793e = r10
            r0.f86794f = r9
            r0.f86797i = r7
            r0.f86795g = r6
            r0.f86796h = r2
            r0.f86798j = r5
            java.lang.Object r3 = r14.b(r3, r0)
            if (r3 != r1) goto L9a
            return r1
        L9a:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L6b
        L9d:
            if (r6 != r4) goto Lab
            r2 = r10
            r10 = r9
            r9 = r2
            r8 = r11
            r6 = r12
            r7 = r13
            r2 = r14
        La6:
            if (r10 == r9) goto Lab
            int r10 = r10 + 1
            goto L47
        Lab:
            kotlin.L0 r1 = kotlin.L0.f217464a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
