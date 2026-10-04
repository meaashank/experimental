package androidx.compose.runtime.collection;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.internal.r;
import ed.p;
import fd.InterfaceC4418a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.L0;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.C4968u;
import kotlin.jvm.internal.V;
import kotlin.sequences.AbstractC5002o;
import kotlin.sequences.C5004q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nScatterSetWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1726#2,3:64\n*S KotlinDebug\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapper\n*L\n39#1:64,3\n*E\n"})
@r(parameters = 0)
public final class ScatterSetWrapper<T> implements Set<T>, InterfaceC4418a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f99548b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ScatterSet<T> f99549a;

    /* JADX INFO: renamed from: androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1, reason: invalid class name */
    @V({"SMAP\nScatterSetWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapper$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,63:1\n228#2,4:64\n198#2,7:68\n209#2,3:76\n212#2,9:80\n232#2:89\n1956#3:75\n1820#3:79\n*S KotlinDebug\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapper$iterator$1\n*L\n33#1:64,4\n33#1:68,7\n33#1:76,3\n33#1:80,9\n33#1:89\n33#1:75\n33#1:79\n*E\n"})
    @Vc.d(c = "androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1", f = "ScatterSetWrapper.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {34}, m = "invokeSuspend", n = {"$this$iterator", "k$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<AbstractC5002o<? super T>, kotlin.coroutines.e<? super L0>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f99550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f99551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f99552d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f99553e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f99554f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f99555g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f99556h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f99557i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f99558j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ ScatterSetWrapper<T> f99559k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ScatterSetWrapper<T> scatterSetWrapper, kotlin.coroutines.e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.f99559k = scatterSetWrapper;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f99559k, eVar);
            anonymousClass1.f99558j = obj;
            return anonymousClass1;
        }

        @Override // ed.p
        @Nullable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull AbstractC5002o<? super T> abstractC5002o, @Nullable kotlin.coroutines.e<? super L0> eVar) {
            return ((AnonymousClass1) create(abstractC5002o, eVar)).invokeSuspend(L0.f217464a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
        /* JADX WARN: Type inference failed for: r13v0 */
        /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.sequences.o] */
        /* JADX WARN: Type inference failed for: r13v2 */
        /* JADX WARN: Type inference failed for: r13v5 */
        /* JADX WARN: Type inference failed for: r13v6 */
        /* JADX WARN: Type inference failed for: r13v7 */
        /* JADX WARN: Type inference failed for: r13v8 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0053 -> B:23:0x0098). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0055 -> B:14:0x0066). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006f -> B:20:0x008f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008c -> B:20:0x008f). Please report as a decompilation issue!!! */
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
                int r2 = r0.f99557i
                r3 = 0
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L30
                if (r2 != r5) goto L28
                int r2 = r0.f99555g
                int r6 = r0.f99554f
                long r7 = r0.f99556h
                int r9 = r0.f99553e
                int r10 = r0.f99552d
                java.lang.Object r11 = r0.f99551c
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.f99550b
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                java.lang.Object r13 = r0.f99558j
                kotlin.sequences.o r13 = (kotlin.sequences.AbstractC5002o) r13
                kotlin.C4885d0.n(r21)
                goto L8f
            L28:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L30:
                kotlin.C4885d0.n(r21)
                java.lang.Object r2 = r0.f99558j
                kotlin.sequences.o r2 = (kotlin.sequences.AbstractC5002o) r2
                androidx.compose.runtime.collection.ScatterSetWrapper<T> r6 = r0.f99559k
                androidx.collection.ScatterSet<T> r6 = r6.f99549a
                java.lang.Object[] r7 = r6.f86877b
                long[] r6 = r6.f86876a
                int r8 = r6.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto L9d
                r9 = r3
            L45:
                r10 = r6[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto L98
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
            L66:
                if (r2 >= r6) goto L92
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.3E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto L8f
                int r14 = r9 << 3
                int r14 = r14 + r2
                r14 = r12[r14]
                r0.f99558j = r13
                r0.f99550b = r12
                r0.f99551c = r11
                r0.f99552d = r10
                r0.f99553e = r9
                r0.f99556h = r7
                r0.f99554f = r6
                r0.f99555g = r2
                r0.f99557i = r5
                java.lang.Object r14 = r13.b(r14, r0)
                if (r14 != r1) goto L8f
                return r1
            L8f:
                long r7 = r7 >> r4
                int r2 = r2 + r5
                goto L66
            L92:
                if (r6 != r4) goto L9d
                r8 = r10
                r6 = r11
                r7 = r12
                r2 = r13
            L98:
                if (r9 == r8) goto L9d
                int r9 = r9 + 1
                goto L45
            L9d:
                kotlin.L0 r1 = kotlin.L0.f217464a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScatterSetWrapper.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ScatterSetWrapper(@NotNull ScatterSet<T> scatterSet) {
        this.f99549a = scatterSet;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public final ScatterSet<T> b() {
        return this.f99549a;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f99549a.e(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.f99549a.e(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.f99549a.f86879d;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f99549a.r();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return C5004q.a(new AnonymousClass1(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f99549a.f86879d;
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return C4968u.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C4968u.b(this, tArr);
    }
}
