package androidx.collection;

import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5002o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [K] */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$keys$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1980:1\n407#2,3:1981\n365#2,6:1984\n375#2,3:1991\n378#2,2:1995\n411#2,2:1997\n381#2,6:1999\n413#2:2005\n1956#3:1990\n1820#3:1994\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$keys$1$iterator$1\n*L\n727#1:1981,3\n727#1:1984,6\n727#1:1991,3\n727#1:1995,2\n727#1:1997,2\n727#1:1999,6\n727#1:2005\n727#1:1990\n727#1:1994\n*E\n"})
@Vc.d(c = "androidx.collection.ScatterMap$MapWrapper$keys$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {728}, m = "invokeSuspend", n = {"$this$iterator", "k$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
public final class ScatterMap$MapWrapper$keys$1$iterator$1<K> extends RestrictedSuspendLambda implements ed.p<AbstractC5002o<? super K>, kotlin.coroutines.e<? super kotlin.L0>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f86855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f86856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f86860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f86861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f86862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f86863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ScatterMap<K, V> f86864k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScatterMap$MapWrapper$keys$1$iterator$1(ScatterMap<K, V> scatterMap, kotlin.coroutines.e<? super ScatterMap$MapWrapper$keys$1$iterator$1> eVar) {
        super(2, eVar);
        this.f86864k = scatterMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<kotlin.L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        ScatterMap$MapWrapper$keys$1$iterator$1 scatterMap$MapWrapper$keys$1$iterator$1 = new ScatterMap$MapWrapper$keys$1$iterator$1(this.f86864k, eVar);
        scatterMap$MapWrapper$keys$1$iterator$1.f86863j = obj;
        return scatterMap$MapWrapper$keys$1$iterator$1;
    }

    @Override // ed.p
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull AbstractC5002o<? super K> abstractC5002o, @Nullable kotlin.coroutines.e<? super kotlin.L0> eVar) {
        return ((ScatterMap$MapWrapper$keys$1$iterator$1) create(abstractC5002o, eVar)).invokeSuspend(kotlin.L0.f217464a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0051 -> B:23:0x0096). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0053 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:20:0x008d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008a -> B:20:0x008d). Please report as a decompilation issue!!! */
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
            int r2 = r0.f86862i
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L30
            if (r2 != r5) goto L28
            int r2 = r0.f86860g
            int r6 = r0.f86859f
            long r7 = r0.f86861h
            int r9 = r0.f86858e
            int r10 = r0.f86857d
            java.lang.Object r11 = r0.f86856c
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.f86855b
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            java.lang.Object r13 = r0.f86863j
            kotlin.sequences.o r13 = (kotlin.sequences.AbstractC5002o) r13
            kotlin.C4885d0.n(r21)
            goto L8d
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L30:
            kotlin.C4885d0.n(r21)
            java.lang.Object r2 = r0.f86863j
            kotlin.sequences.o r2 = (kotlin.sequences.AbstractC5002o) r2
            androidx.collection.ScatterMap<K, V> r6 = r0.f86864k
            java.lang.Object[] r7 = r6.f86838b
            long[] r6 = r6.f86837a
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L9b
            r9 = r3
        L43:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L96
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r2
            r2 = r3
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L64:
            if (r2 >= r6) goto L90
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L8d
            int r14 = r9 << 3
            int r14 = r14 + r2
            r14 = r12[r14]
            r0.f86863j = r13
            r0.f86855b = r12
            r0.f86856c = r11
            r0.f86857d = r10
            r0.f86858e = r9
            r0.f86861h = r7
            r0.f86859f = r6
            r0.f86860g = r2
            r0.f86862i = r5
            java.lang.Object r14 = r13.b(r14, r0)
            if (r14 != r1) goto L8d
            return r1
        L8d:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L64
        L90:
            if (r6 != r4) goto L9b
            r8 = r10
            r6 = r11
            r7 = r12
            r2 = r13
        L96:
            if (r9 == r8) goto L9b
            int r9 = r9 + 1
            goto L43
        L9b:
            kotlin.L0 r1 = kotlin.L0.f217464a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap$MapWrapper$keys$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
