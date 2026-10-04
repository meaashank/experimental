package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.T1;
import androidx.compose.ui.node.C2204h;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.G1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k0.C4813d;
import k0.InterfaceC4814e;
import kotlin.L0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.C4969v;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.C5092j;
import kotlinx.coroutines.C5102o;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5100n;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,809:1\n573#1:840\n574#1:842\n576#1,4:844\n582#1:859\n585#1,3:871\n1208#2:810\n1187#2,2:811\n1208#2:813\n1187#2,2:814\n36#3:816\n36#3:841\n36#3:913\n146#4:817\n460#4,11:818\n492#4,11:829\n146#4:843\n460#4,11:848\n492#4,11:860\n728#4,2:914\n86#5,2:874\n33#5,6:876\n88#5:882\n86#5,2:883\n33#5,6:885\n88#5:891\n416#5,3:892\n33#5,4:895\n419#5:899\n420#5:901\n38#5:902\n421#5:903\n1#6:900\n314#7,9:904\n323#7,2:916\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl\n*L\n597#1:840\n597#1:842\n597#1:844,4\n597#1:859\n597#1:871,3\n489#1:810\n489#1:811,2\n498#1:813\n498#1:814,2\n573#1:816\n597#1:841\n665#1:913\n574#1:817\n579#1:818,11\n582#1:829,11\n597#1:843\n597#1:848,11\n597#1:860,11\n666#1:914,2\n623#1:874,2\n623#1:876,6\n623#1:882\n633#1:883,2\n633#1:885,6\n633#1:891\n636#1:892,3\n636#1:895,4\n636#1:899\n636#1:901\n636#1:902\n636#1:903\n636#1:900\n663#1:904,9\n663#1:916,2\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class SuspendingPointerInputModifierNodeImpl extends p.d implements V, K, InterfaceC4814e {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f102243z = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Object f102244o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public Object f102245p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public Object[] f102246q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public ed.p<? super K, ? super kotlin.coroutines.e<? super L0>, ? extends Object> f102247r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public A0 f102248s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public C2150q f102249t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.collection.c<PointerEventHandlerCoroutine<?>> f102250u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.collection.c<PointerEventHandlerCoroutine<?>> f102251v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public C2150q f102252w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f102253x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f102254y;

    @kotlin.jvm.internal.V({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,809:1\n36#2:810\n735#3,2:811\n314#4,11:813\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine\n*L\n735#1:810\n736#1:811,2\n743#1:813,11\n*E\n"})
    public final class PointerEventHandlerCoroutine<R> implements InterfaceC2138e, InterfaceC4814e, kotlin.coroutines.e<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final kotlin.coroutines.e<R> f102255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SuspendingPointerInputModifierNodeImpl f102256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public InterfaceC5100n<? super C2150q> f102257c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public PointerEventPass f102258d = PointerEventPass.Main;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final kotlin.coroutines.i f102259e = EmptyCoroutineContext.f217673a;

        /* JADX WARN: Multi-variable type inference failed */
        public PointerEventHandlerCoroutine(@NotNull kotlin.coroutines.e<? super R> eVar) {
            this.f102255a = eVar;
            this.f102256b = SuspendingPointerInputModifierNodeImpl.this;
        }

        @Override // k0.InterfaceC4814e
        @T1
        @NotNull
        public P.j A0(@NotNull k0.l lVar) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f102256b;
            suspendingPointerInputModifierNodeImpl.getClass();
            return C4813d.h(suspendingPointerInputModifierNodeImpl, lVar);
        }

        @Override // k0.InterfaceC4814e
        @T1
        public long C(long j10) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f102256b;
            suspendingPointerInputModifierNodeImpl.getClass();
            return C4813d.e(suspendingPointerInputModifierNodeImpl, j10);
        }

        @Override // k0.InterfaceC4814e
        @T1
        public long G(int i10) {
            return this.f102256b.G(i10);
        }

        @Override // k0.InterfaceC4814e
        @T1
        public long I(float f10) {
            return this.f102256b.I(f10);
        }

        @Override // k0.InterfaceC4814e
        @T1
        public int I1(float f10) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f102256b;
            suspendingPointerInputModifierNodeImpl.getClass();
            return C4813d.b(suspendingPointerInputModifierNodeImpl, f10);
        }

        public final void K(@Nullable Throwable th) {
            InterfaceC5100n<? super C2150q> interfaceC5100n = this.f102257c;
            if (interfaceC5100n != null) {
                interfaceC5100n.g(th);
            }
            this.f102257c = null;
        }

        public final void M(@NotNull C2150q c2150q, @NotNull PointerEventPass pointerEventPass) {
            InterfaceC5100n<? super C2150q> interfaceC5100n;
            if (pointerEventPass != this.f102258d || (interfaceC5100n = this.f102257c) == null) {
                return;
            }
            this.f102257c = null;
            interfaceC5100n.resumeWith(c2150q);
        }

        @Override // k0.InterfaceC4814e
        @T1
        public float M1(long j10) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f102256b;
            suspendingPointerInputModifierNodeImpl.getClass();
            return C4813d.f(suspendingPointerInputModifierNodeImpl, j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.A0] */
        /* JADX WARN: Type inference failed for: r11v3, types: [kotlinx.coroutines.A0] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        @Override // androidx.compose.ui.input.pointer.InterfaceC2138e
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> java.lang.Object T0(long r11, @org.jetbrains.annotations.NotNull ed.p<? super androidx.compose.ui.input.pointer.InterfaceC2138e, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r14) throws java.lang.Throwable {
            /*
                r10 = this;
                boolean r0 = r14 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                if (r0 == 0) goto L13
                r0 = r14
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) r0
                int r1 = r0.f102264d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f102264d = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                r0.<init>(r10, r14)
            L18:
                java.lang.Object r14 = r0.f102262b
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f102264d
                r3 = 1
                if (r2 == 0) goto L36
                if (r2 != r3) goto L2e
                java.lang.Object r11 = r0.f102261a
                kotlinx.coroutines.A0 r11 = (kotlinx.coroutines.A0) r11
                kotlin.C4885d0.n(r14)     // Catch: java.lang.Throwable -> L2b
                goto L6e
            L2b:
                r0 = move-exception
                r12 = r0
                goto L74
            L2e:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L36:
                kotlin.C4885d0.n(r14)
                r4 = 0
                int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r14 > 0) goto L4f
                kotlinx.coroutines.n<? super androidx.compose.ui.input.pointer.q> r14 = r10.f102257c
                if (r14 == 0) goto L4f
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r11)
                java.lang.Object r2 = kotlin.C4885d0.a(r2)
                r14.resumeWith(r2)
            L4f:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r14 = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.this
                kotlinx.coroutines.L r4 = r14.B2()
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 r7 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1
                r14 = 0
                r7.<init>(r11, r10, r14)
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                kotlinx.coroutines.A0 r11 = kotlinx.coroutines.C5092j.f(r4, r5, r6, r7, r8, r9)
                r0.f102261a = r11     // Catch: java.lang.Throwable -> L2b
                r0.f102264d = r3     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r14 = r13.invoke(r10, r0)     // Catch: java.lang.Throwable -> L2b
                if (r14 != r1) goto L6e
                return r1
            L6e:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r12 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.f102168a
                r11.a(r12)
                return r14
            L74:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r13 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.f102168a
                r11.a(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.T0(long, ed.p, kotlin.coroutines.e):java.lang.Object");
        }

        @Override // androidx.compose.ui.input.pointer.InterfaceC2138e
        @Nullable
        public Object T1(@NotNull PointerEventPass pointerEventPass, @NotNull kotlin.coroutines.e<? super C2150q> eVar) {
            C5102o c5102o = new C5102o(IntrinsicsKt__IntrinsicsJvmKt.e(eVar), 1);
            c5102o.n0();
            this.f102258d = pointerEventPass;
            this.f102257c = c5102o;
            Object objZ = c5102o.z();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return objZ;
        }

        @Override // androidx.compose.ui.input.pointer.InterfaceC2138e
        @NotNull
        public C2150q U1() {
            return SuspendingPointerInputModifierNodeImpl.this.f102249t;
        }

        @Override // k0.InterfaceC4814e
        @T1
        public float V(int i10) {
            return this.f102256b.V(i10);
        }

        @Override // k0.InterfaceC4814e
        @T1
        public float W(float f10) {
            return f10 / this.f102256b.a();
        }

        @Override // k0.InterfaceC4814e
        @T1
        public long Z(long j10) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f102256b;
            suspendingPointerInputModifierNodeImpl.getClass();
            return C4813d.i(suspendingPointerInputModifierNodeImpl, j10);
        }

        @Override // k0.InterfaceC4814e
        public float a() {
            return this.f102256b.a();
        }

        @Override // androidx.compose.ui.input.pointer.InterfaceC2138e
        public long b() {
            return SuspendingPointerInputModifierNodeImpl.this.f102253x;
        }

        @Override // androidx.compose.ui.input.pointer.InterfaceC2138e
        @NotNull
        public G1 c() {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            suspendingPointerInputModifierNodeImpl.getClass();
            return C2204h.r(suspendingPointerInputModifierNodeImpl).f102761v;
        }

        @Override // kotlin.coroutines.e
        @NotNull
        public kotlin.coroutines.i getContext() {
            return this.f102259e;
        }

        @Override // androidx.compose.ui.input.pointer.InterfaceC2138e
        public long i0() {
            return SuspendingPointerInputModifierNodeImpl.this.i0();
        }

        @Override // k0.p
        @T1
        public float k(long j10) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f102256b;
            suspendingPointerInputModifierNodeImpl.getClass();
            return k0.o.a(suspendingPointerInputModifierNodeImpl, j10);
        }

        @Override // k0.InterfaceC4814e
        @T1
        public float l2(float f10) {
            return this.f102256b.a() * f10;
        }

        @Override // k0.p
        public float m0() {
            return this.f102256b.m0();
        }

        @Override // k0.InterfaceC4814e
        @T1
        public int p2(long j10) {
            return this.f102256b.p2(j10);
        }

        @Override // kotlin.coroutines.e
        public void resumeWith(@NotNull Object obj) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            synchronized (suspendingPointerInputModifierNodeImpl.f102250u) {
                suspendingPointerInputModifierNodeImpl.f102250u.h0(this);
            }
            this.f102255a.resumeWith(obj);
        }

        @Override // k0.p
        @T1
        public long s(float f10) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f102256b;
            suspendingPointerInputModifierNodeImpl.getClass();
            return k0.o.b(suspendingPointerInputModifierNodeImpl, f10);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.pointer.InterfaceC2138e
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> java.lang.Object y0(long r5, @org.jetbrains.annotations.NotNull ed.p<? super androidx.compose.ui.input.pointer.InterfaceC2138e, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r8) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) r0
                int r1 = r0.f102270c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f102270c = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.f102268a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f102270c
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                kotlin.C4885d0.n(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3c
                return r8
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                kotlin.C4885d0.n(r8)
                r0.f102270c = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3c
                java.lang.Object r5 = r4.T0(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3c
                if (r5 != r1) goto L3b
                return r1
            L3b:
                return r5
            L3c:
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.y0(long, ed.p, kotlin.coroutines.e):java.lang.Object");
        }
    }

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102271a;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            try {
                iArr[PointerEventPass.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEventPass.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEventPass.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f102271a = iArr;
        }
    }

    public /* synthetic */ SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, ed.p pVar, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : obj2, (i10 & 4) != 0 ? null : objArr, pVar);
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ P.j A0(k0.l lVar) {
        return C4813d.h(this, lVar);
    }

    @Override // androidx.compose.ui.node.r0
    public void A1(@NotNull C2150q c2150q, @NotNull PointerEventPass pointerEventPass, long j10) {
        this.f102253x = j10;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.f102249t = c2150q;
        }
        if (this.f102248s == null) {
            this.f102248s = C5092j.f(B2(), null, CoroutineStart.UNDISPATCHED, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1, null);
        }
        h3(c2150q, pointerEventPass);
        List<A> list = c2150q.f102318a;
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!r.e(list.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            c2150q = null;
        }
        this.f102252w = c2150q;
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ long C(long j10) {
        return C4813d.e(this, j10);
    }

    @Override // k0.InterfaceC4814e
    public long G(int i10) {
        return s(V(i10));
    }

    @Override // k0.InterfaceC4814e
    public long I(float f10) {
        return s(W(f10));
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ int I1(float f10) {
        return C4813d.b(this, f10);
    }

    @Override // androidx.compose.ui.input.pointer.K
    @Nullable
    public <R> Object J0(@NotNull ed.p<? super InterfaceC2138e, ? super kotlin.coroutines.e<? super R>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super R> eVar) {
        C5102o c5102o = new C5102o(IntrinsicsKt__IntrinsicsJvmKt.e(eVar), 1);
        c5102o.n0();
        final PointerEventHandlerCoroutine<?> pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine<>(c5102o);
        synchronized (this.f102250u) {
            this.f102250u.b(pointerEventHandlerCoroutine);
            ((kotlin.coroutines.l) kotlin.coroutines.g.c(pVar, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine)).resumeWith(L0.f217464a);
        }
        c5102o.k0(new ed.l<Throwable, L0>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void e(@Nullable Throwable th) {
                pointerEventHandlerCoroutine.K(th);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(Throwable th) {
                e(th);
                return L0.f217464a;
            }
        });
        Object objZ = c5102o.z();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objZ;
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ float M1(long j10) {
        return C4813d.f(this, j10);
    }

    @Override // androidx.compose.ui.input.pointer.V
    public void O0(@NotNull ed.p<? super K, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar) {
        Q1();
        this.f102247r = pVar;
    }

    @Override // androidx.compose.ui.input.pointer.K
    public void O1(boolean z10) {
        this.f102254y = z10;
    }

    @Override // androidx.compose.ui.p.d
    public void P2() {
        Q1();
    }

    @Override // androidx.compose.ui.input.pointer.V
    public void Q1() {
        A0 a02 = this.f102248s;
        if (a02 != null) {
            a02.a(new PointerInputResetException());
            this.f102248s = null;
        }
    }

    @Override // k0.InterfaceC4814e
    public float V(int i10) {
        return i10 / a();
    }

    @Override // k0.InterfaceC4814e
    public float W(float f10) {
        return f10 / a();
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ long Z(long j10) {
        return C4813d.i(this, j10);
    }

    @Override // k0.InterfaceC4814e
    public float a() {
        return C2204h.r(this).f102759t.a();
    }

    @Override // androidx.compose.ui.input.pointer.K
    public long b() {
        return this.f102253x;
    }

    @Override // androidx.compose.ui.input.pointer.K
    @NotNull
    public G1 c() {
        return C2204h.r(this).f102761v;
    }

    @Override // androidx.compose.ui.node.r0
    public void d1() {
        C2150q c2150q = this.f102252w;
        if (c2150q == null) {
            return;
        }
        List<A> list = c2150q.f102318a;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).f102149d) {
                List<A> list2 = c2150q.f102318a;
                ArrayList arrayList = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    A a10 = list2.get(i11);
                    long j10 = a10.f102146a;
                    long j11 = a10.f102148c;
                    long j12 = a10.f102147b;
                    float f10 = a10.f102150e;
                    boolean z10 = a10.f102149d;
                    arrayList.add(new A(j10, j12, j11, false, f10, j12, j11, z10, z10, 0, 0L, 1536, (C4969v) null));
                }
                C2150q c2150q2 = new C2150q(arrayList, null);
                this.f102249t = c2150q2;
                h3(c2150q2, PointerEventPass.Initial);
                h3(c2150q2, PointerEventPass.Main);
                h3(c2150q2, PointerEventPass.Final);
                this.f102252w = null;
                return;
            }
        }
    }

    public final void h3(C2150q c2150q, PointerEventPass pointerEventPass) {
        androidx.compose.runtime.collection.c<PointerEventHandlerCoroutine<?>> cVar;
        int i10;
        synchronized (this.f102250u) {
            androidx.compose.runtime.collection.c<PointerEventHandlerCoroutine<?>> cVar2 = this.f102251v;
            cVar2.c(cVar2.f99566c, this.f102250u);
        }
        try {
            int i11 = a.f102271a[pointerEventPass.ordinal()];
            if (i11 == 1 || i11 == 2) {
                androidx.compose.runtime.collection.c<PointerEventHandlerCoroutine<?>> cVar3 = this.f102251v;
                int i12 = cVar3.f99566c;
                if (i12 > 0) {
                    PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr = cVar3.f99564a;
                    int i13 = 0;
                    do {
                        pointerEventHandlerCoroutineArr[i13].M(c2150q, pointerEventPass);
                        i13++;
                    } while (i13 < i12);
                }
            } else if (i11 == 3 && (i10 = (cVar = this.f102251v).f99566c) > 0) {
                int i14 = i10 - 1;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr2 = cVar.f99564a;
                do {
                    pointerEventHandlerCoroutineArr2[i14].M(c2150q, pointerEventPass);
                    i14--;
                } while (i14 >= 0);
            }
        } finally {
            this.f102251v.q();
        }
    }

    @Override // androidx.compose.ui.input.pointer.K
    public long i0() {
        long jI = C4813d.i(this, C2204h.r(this).f102761v.g());
        long j10 = this.f102253x;
        return P.o.a(Math.max(0.0f, P.n.t(jI) - ((int) (j10 >> 32))) / 2.0f, Math.max(0.0f, P.n.m(jI) - ((int) (j10 & ZipKt.f225990j))) / 2.0f);
    }

    @Override // androidx.compose.ui.node.r0
    public void i2() {
        Q1();
    }

    public final void i3(PointerEventPass pointerEventPass, ed.l<? super PointerEventHandlerCoroutine<?>, L0> lVar) {
        androidx.compose.runtime.collection.c<PointerEventHandlerCoroutine<?>> cVar;
        int i10;
        synchronized (this.f102250u) {
            androidx.compose.runtime.collection.c<PointerEventHandlerCoroutine<?>> cVar2 = this.f102251v;
            cVar2.c(cVar2.f99566c, this.f102250u);
        }
        try {
            int i11 = a.f102271a[pointerEventPass.ordinal()];
            if (i11 == 1 || i11 == 2) {
                androidx.compose.runtime.collection.c<PointerEventHandlerCoroutine<?>> cVar3 = this.f102251v;
                int i12 = cVar3.f99566c;
                if (i12 > 0) {
                    PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr = cVar3.f99564a;
                    int i13 = 0;
                    do {
                        lVar.invoke(pointerEventHandlerCoroutineArr[i13]);
                        i13++;
                    } while (i13 < i12);
                }
            } else if (i11 == 3 && (i10 = (cVar = this.f102251v).f99566c) > 0) {
                int i14 = i10 - 1;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr2 = cVar.f99564a;
                do {
                    lVar.invoke(pointerEventHandlerCoroutineArr2[i14]);
                    i14--;
                } while (i14 >= 0);
            }
        } finally {
            this.f102251v.q();
        }
    }

    public final void j3(@Nullable Object obj, @Nullable Object obj2, @Nullable Object[] objArr, @NotNull ed.p<? super K, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar) {
        boolean z10 = !kotlin.jvm.internal.G.g(this.f102244o, obj);
        this.f102244o = obj;
        if (!kotlin.jvm.internal.G.g(this.f102245p, obj2)) {
            z10 = true;
        }
        this.f102245p = obj2;
        Object[] objArr2 = this.f102246q;
        if (objArr2 != null && objArr == null) {
            z10 = true;
        }
        if (objArr2 == null && objArr != null) {
            z10 = true;
        }
        boolean z11 = (objArr2 == null || objArr == null || Arrays.equals(objArr, objArr2)) ? z10 : true;
        this.f102246q = objArr;
        if (z11) {
            Q1();
        }
        this.f102247r = pVar;
    }

    @Override // k0.p
    public /* synthetic */ float k(long j10) {
        return k0.o.a(this, j10);
    }

    @Override // k0.InterfaceC4814e
    public float l2(float f10) {
        return a() * f10;
    }

    @Override // k0.p
    public float m0() {
        return C2204h.r(this).f102759t.m0();
    }

    @Override // androidx.compose.ui.input.pointer.K
    public boolean m2() {
        return this.f102254y;
    }

    @Override // k0.InterfaceC4814e
    public int p2(long j10) {
        return Math.round(M1(j10));
    }

    @Override // androidx.compose.ui.node.r0
    public /* synthetic */ boolean q2() {
        return false;
    }

    @Override // k0.p
    public /* synthetic */ long s(float f10) {
        return k0.o.b(this, f10);
    }

    @Override // androidx.compose.ui.input.pointer.V
    @NotNull
    public ed.p<K, kotlin.coroutines.e<? super L0>, Object> t2() {
        return this.f102247r;
    }

    @Override // androidx.compose.ui.node.r0
    public void u2() {
        Q1();
    }

    @Override // androidx.compose.ui.node.r0
    public /* synthetic */ boolean w0() {
        return false;
    }

    public SuspendingPointerInputModifierNodeImpl(@Nullable Object obj, @Nullable Object obj2, @Nullable Object[] objArr, @NotNull ed.p<? super K, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar) {
        this.f102244o = obj;
        this.f102245p = obj2;
        this.f102246q = objArr;
        this.f102247r = pVar;
        this.f102249t = T.f102276b;
        this.f102250u = new androidx.compose.runtime.collection.c<>(new PointerEventHandlerCoroutine[16], 0);
        this.f102251v = new androidx.compose.runtime.collection.c<>(new PointerEventHandlerCoroutine[16], 0);
        k0.x.f214338b.getClass();
        this.f102253x = k0.x.f214339c;
    }
}
