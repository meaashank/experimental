package androidx.collection;

import java.util.Map;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5002o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1980:1\n365#2,6:1981\n375#2,3:1988\n378#2,9:1992\n1956#3:1987\n1820#3:1991\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1\n*L\n701#1:1981,6\n701#1:1988,3\n701#1:1992,9\n701#1:1987\n701#1:1991\n*E\n"})
@Vc.d(c = "androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {703}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
public final class ScatterMap$MapWrapper$entries$1$iterator$1<K, V> extends RestrictedSuspendLambda implements ed.p<AbstractC5002o<? super Map.Entry<? extends K, ? extends V>>, kotlin.coroutines.e<? super kotlin.L0>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f86844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f86845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f86849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f86850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f86851i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f86852j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ScatterMap<K, V> f86853k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScatterMap$MapWrapper$entries$1$iterator$1(ScatterMap<K, V> scatterMap, kotlin.coroutines.e<? super ScatterMap$MapWrapper$entries$1$iterator$1> eVar) {
        super(2, eVar);
        this.f86853k = scatterMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<kotlin.L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        ScatterMap$MapWrapper$entries$1$iterator$1 scatterMap$MapWrapper$entries$1$iterator$1 = new ScatterMap$MapWrapper$entries$1$iterator$1(this.f86853k, eVar);
        scatterMap$MapWrapper$entries$1$iterator$1.f86852j = obj;
        return scatterMap$MapWrapper$entries$1$iterator$1;
    }

    @Override // ed.p
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull AbstractC5002o<? super Map.Entry<? extends K, ? extends V>> abstractC5002o, @Nullable kotlin.coroutines.e<? super kotlin.L0> eVar) {
        return ((ScatterMap$MapWrapper$entries$1$iterator$1) create(abstractC5002o, eVar)).invokeSuspend(kotlin.L0.f217464a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006c -> B:20:0x0099). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0096 -> B:21:0x009b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a9 -> B:26:0x00aa). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r21) throws java.lang.Throwable {
        /*
            r20 = this;
            r0 = r20
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f86851i
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L30
            if (r2 != r5) goto L28
            int r2 = r0.f86849g
            int r6 = r0.f86848f
            long r7 = r0.f86850h
            int r9 = r0.f86847e
            int r10 = r0.f86846d
            java.lang.Object r11 = r0.f86845c
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.f86844b
            androidx.collection.ScatterMap r12 = (androidx.collection.ScatterMap) r12
            java.lang.Object r13 = r0.f86852j
            kotlin.sequences.o r13 = (kotlin.sequences.AbstractC5002o) r13
            kotlin.C4885d0.n(r21)
            goto L99
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L30:
            kotlin.C4885d0.n(r21)
            java.lang.Object r2 = r0.f86852j
            kotlin.sequences.o r2 = (kotlin.sequences.AbstractC5002o) r2
            androidx.collection.ScatterMap<K, V> r6 = r0.f86853k
            long[] r7 = r6.f86837a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto Lb0
            r9 = 0
        L41:
            r10 = r7[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto La9
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r12
            r12 = r6
            r6 = r13
            r13 = r2
            r2 = 0
            r18 = r10
            r11 = r7
            r10 = r8
            r7 = r18
        L63:
            if (r2 >= r6) goto La1
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L99
            int r14 = r9 << 3
            int r14 = r14 + r2
            androidx.collection.i0 r15 = new androidx.collection.i0
            java.lang.Object[] r3 = r12.f86838b
            r3 = r3[r14]
            r17 = r4
            java.lang.Object[] r4 = r12.f86839c
            r4 = r4[r14]
            r15.<init>(r3, r4)
            r0.f86852j = r13
            r0.f86844b = r12
            r0.f86845c = r11
            r0.f86846d = r10
            r0.f86847e = r9
            r0.f86850h = r7
            r0.f86848f = r6
            r0.f86849g = r2
            r0.f86851i = r5
            java.lang.Object r3 = r13.b(r15, r0)
            if (r3 != r1) goto L9b
            return r1
        L99:
            r17 = r4
        L9b:
            long r7 = r7 >> r17
            int r2 = r2 + r5
            r4 = r17
            goto L63
        La1:
            r3 = r4
            if (r6 != r3) goto Lb0
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r13
            goto Laa
        La9:
            r3 = r4
        Laa:
            if (r9 == r8) goto Lb0
            int r9 = r9 + 1
            r4 = r3
            goto L41
        Lb0:
            kotlin.L0 r1 = kotlin.L0.f217464a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
