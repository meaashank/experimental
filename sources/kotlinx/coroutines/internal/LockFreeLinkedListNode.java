package kotlinx.coroutines.internal;

import ed.InterfaceC4376a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.InterfaceC4850b0;
import kotlin.L0;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.InterfaceC5120x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,351:1\n70#1,3:353\n1#2:352\n*S KotlinDebug\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n*L\n132#1:353,3\n*E\n"})
@InterfaceC5120x0
public class LockFreeLinkedListNode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f220293a = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f220294b = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f220295c = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    @InterfaceC4850b0
    public static abstract class a extends AbstractC5068b<LockFreeLinkedListNode> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dd.g
        @NotNull
        public final LockFreeLinkedListNode f220296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dd.g
        @Nullable
        public LockFreeLinkedListNode f220297c;

        public a(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.f220296b = lockFreeLinkedListNode;
        }

        @Override // kotlinx.coroutines.internal.AbstractC5068b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void c(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @Nullable Object obj) {
            boolean z10 = obj == null;
            LockFreeLinkedListNode lockFreeLinkedListNode2 = z10 ? this.f220296b : this.f220297c;
            if (lockFreeLinkedListNode2 != null && androidx.concurrent.futures.c.a(LockFreeLinkedListNode.f220293a, lockFreeLinkedListNode, this, lockFreeLinkedListNode2) && z10) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = this.f220296b;
                LockFreeLinkedListNode lockFreeLinkedListNode4 = this.f220297c;
                kotlin.jvm.internal.G.m(lockFreeLinkedListNode4);
                lockFreeLinkedListNode3.k(lockFreeLinkedListNode4);
            }
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1\n*L\n1#1,351:1\n*E\n"})
    public static final class b extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4376a<Boolean> f220298d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LockFreeLinkedListNode lockFreeLinkedListNode, InterfaceC4376a<Boolean> interfaceC4376a) {
            super(lockFreeLinkedListNode);
            this.f220298d = interfaceC4376a;
        }

        @Override // kotlinx.coroutines.internal.AbstractC5068b
        @Nullable
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Object g(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (this.f220298d.invoke().booleanValue()) {
                return null;
            }
            return C5089x.f220366d;
        }
    }

    public final K A() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220295c;
        K k10 = (K) atomicReferenceFieldUpdater.get(this);
        if (k10 != null) {
            return k10;
        }
        K k11 = new K(this);
        atomicReferenceFieldUpdater.set(this, k11);
        return k11;
    }

    public final /* synthetic */ void B(Object obj) {
        this._next$volatile = obj;
    }

    public final /* synthetic */ void C(Object obj) {
        this._prev$volatile = obj;
    }

    public final /* synthetic */ void D(Object obj) {
        this._removedRef$volatile = obj;
    }

    @InterfaceC4850b0
    public final int E(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode2, @NotNull a aVar) {
        f220294b.set(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220293a;
        atomicReferenceFieldUpdater.set(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        aVar.f220297c = lockFreeLinkedListNode2;
        if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, lockFreeLinkedListNode2, aVar)) {
            return aVar.b(this) == null ? 1 : 2;
        }
        return 0;
    }

    public final void F(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode2) {
    }

    public final void e(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (!n().g(lockFreeLinkedListNode, this)) {
        }
    }

    public final boolean f(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull InterfaceC4376a<Boolean> interfaceC4376a) {
        int iE;
        b bVar = new b(lockFreeLinkedListNode, interfaceC4376a);
        do {
            iE = n().E(lockFreeLinkedListNode, this, bVar);
            if (iE == 1) {
                return true;
            }
        } while (iE != 2);
        return false;
    }

    @InterfaceC4850b0
    public final boolean g(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode2) {
        f220294b.set(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220293a;
        atomicReferenceFieldUpdater.set(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        if (!androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, lockFreeLinkedListNode2, lockFreeLinkedListNode)) {
            return false;
        }
        lockFreeLinkedListNode.k(lockFreeLinkedListNode2);
        return true;
    }

    public final boolean h(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
        f220294b.set(lockFreeLinkedListNode, this);
        f220293a.set(lockFreeLinkedListNode, this);
        while (l() == this) {
            if (androidx.concurrent.futures.c.a(f220293a, this, this, lockFreeLinkedListNode)) {
                lockFreeLinkedListNode.k(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        if (androidx.concurrent.futures.c.a(r4, r3, r2, ((kotlinx.coroutines.internal.K) r5).f220292a) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode i(kotlinx.coroutines.internal.I r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f220294b
            java.lang.Object r0 = r0.get(r8)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f220293a
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L1f
            if (r0 != r2) goto L16
            goto L28
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f220294b
            boolean r0 = androidx.concurrent.futures.c.a(r1, r8, r0, r2)
            if (r0 != 0) goto L28
            goto L0
        L1f:
            boolean r6 = r8.u()
            if (r6 == 0) goto L26
            return r1
        L26:
            if (r5 != r9) goto L29
        L28:
            return r2
        L29:
            boolean r6 = r5 instanceof kotlinx.coroutines.internal.I
            if (r6 == 0) goto L33
            kotlinx.coroutines.internal.I r5 = (kotlinx.coroutines.internal.I) r5
            r5.b(r2)
            goto L0
        L33:
            boolean r6 = r5 instanceof kotlinx.coroutines.internal.K
            if (r6 == 0) goto L4f
            if (r3 == 0) goto L46
            kotlinx.coroutines.internal.K r5 = (kotlinx.coroutines.internal.K) r5
            kotlinx.coroutines.internal.LockFreeLinkedListNode r5 = r5.f220292a
            boolean r2 = androidx.concurrent.futures.c.a(r4, r3, r2, r5)
            if (r2 != 0) goto L44
            goto L0
        L44:
            r2 = r3
            goto La
        L46:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.LockFreeLinkedListNode.f220294b
            java.lang.Object r2 = r4.get(r2)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            goto Lb
        L4f:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.G.n(r5, r3)
            r3 = r5
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.i(kotlinx.coroutines.internal.I):kotlinx.coroutines.internal.LockFreeLinkedListNode");
    }

    public final LockFreeLinkedListNode j(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.u()) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) f220294b.get(lockFreeLinkedListNode);
        }
        return lockFreeLinkedListNode;
    }

    public final void k(LockFreeLinkedListNode lockFreeLinkedListNode) {
        LockFreeLinkedListNode lockFreeLinkedListNode2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220294b;
        do {
            lockFreeLinkedListNode2 = (LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
            if (l() != lockFreeLinkedListNode) {
                return;
            }
        } while (!androidx.concurrent.futures.c.a(f220294b, lockFreeLinkedListNode, lockFreeLinkedListNode2, this));
        if (u()) {
            lockFreeLinkedListNode.i(null);
        }
    }

    @NotNull
    public final Object l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220293a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof I)) {
                return obj;
            }
            ((I) obj).b(this);
        }
    }

    @NotNull
    public final LockFreeLinkedListNode m() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Object objL = l();
        K k10 = objL instanceof K ? (K) objL : null;
        if (k10 != null && (lockFreeLinkedListNode = k10.f220292a) != null) {
            return lockFreeLinkedListNode;
        }
        kotlin.jvm.internal.G.n(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (LockFreeLinkedListNode) objL;
    }

    @NotNull
    public final LockFreeLinkedListNode n() {
        LockFreeLinkedListNode lockFreeLinkedListNodeI = i(null);
        return lockFreeLinkedListNodeI == null ? j((LockFreeLinkedListNode) f220294b.get(this)) : lockFreeLinkedListNodeI;
    }

    public final /* synthetic */ Object o() {
        return this._next$volatile;
    }

    public final /* synthetic */ Object q() {
        return this._prev$volatile;
    }

    public final /* synthetic */ Object s() {
        return this._removedRef$volatile;
    }

    @NotNull
    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode.toString.1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.o
            @Nullable
            public Object get() {
                return kotlinx.coroutines.O.a(this.receiver);
            }
        } + '@' + kotlinx.coroutines.O.b(this);
    }

    public boolean u() {
        return l() instanceof K;
    }

    public final /* synthetic */ void v(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ed.l<Object, L0> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @InterfaceC4850b0
    @NotNull
    public final a w(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull InterfaceC4376a<Boolean> interfaceC4376a) {
        return new b(lockFreeLinkedListNode, interfaceC4376a);
    }

    @Nullable
    public LockFreeLinkedListNode x() {
        Object objL = l();
        K k10 = objL instanceof K ? (K) objL : null;
        if (k10 != null) {
            return k10.f220292a;
        }
        return null;
    }

    public boolean y() {
        return z() == null;
    }

    @InterfaceC4850b0
    @Nullable
    public final LockFreeLinkedListNode z() {
        Object objL;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            objL = l();
            if (objL instanceof K) {
                return ((K) objL).f220292a;
            }
            if (objL == this) {
                return (LockFreeLinkedListNode) objL;
            }
            kotlin.jvm.internal.G.n(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            lockFreeLinkedListNode = (LockFreeLinkedListNode) objL;
        } while (!androidx.concurrent.futures.c.a(f220293a, this, objL, lockFreeLinkedListNode.A()));
        lockFreeLinkedListNode.i(null);
        return null;
    }
}
