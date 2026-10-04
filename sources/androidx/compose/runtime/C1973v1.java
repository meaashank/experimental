package androidx.compose.runtime;

import androidx.collection.C1545m0;
import androidx.collection.C1562v0;
import androidx.collection.C1564w0;
import androidx.compose.runtime.InterfaceC1946s;
import fd.InterfaceC4418a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: androidx.compose.runtime.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 6 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 7 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4179:1\n159#1,8:4265\n175#1,5:4273\n181#1,3:4285\n1#2:4180\n1#2:4284\n4553#3,7:4181\n4553#3,7:4188\n4553#3,7:4195\n4553#3,7:4215\n4553#3,7:4222\n4553#3,7:4236\n4553#3,7:4243\n4553#3,7:4250\n33#4,7:4202\n33#4,7:4229\n33#4,7:4258\n50#4,7:4288\n50#4,7:4295\n33#4,7:4306\n33#4,7:4313\n33#4,7:4321\n33#4,7:4328\n50#4,7:4335\n50#4,7:4342\n50#4,7:4349\n50#4,7:4356\n50#4,7:4363\n50#4,7:4370\n50#4,7:4377\n50#4,7:4384\n50#4,7:4391\n50#4,7:4398\n50#4,7:4405\n33#4,7:4416\n33#4,7:4423\n4046#5,6:4209\n89#6:4257\n33#7,6:4278\n33#7,4:4302\n38#7:4320\n33#7,4:4412\n38#7:4430\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n358#1:4265,8\n395#1:4273,5\n395#1:4285,3\n395#1:4284\n204#1:4181,7\n205#1:4188,7\n221#1:4195,7\n234#1:4215,7\n245#1:4222,7\n265#1:4236,7\n266#1:4243,7\n278#1:4250,7\n222#1:4202,7\n246#1:4229,7\n307#1:4258,7\n514#1:4288,7\n521#1:4295,7\n530#1:4306,7\n533#1:4313,7\n556#1:4321,7\n559#1:4328,7\n452#1:4335,7\n457#1:4342,7\n460#1:4349,7\n466#1:4356,7\n469#1:4363,7\n473#1:4370,7\n479#1:4377,7\n483#1:4384,7\n492#1:4391,7\n497#1:4398,7\n502#1:4405,7\n542#1:4416,7\n545#1:4423,7\n225#1:4209,6\n281#1:4257\n397#1:4278,6\n528#1:4302,4\n528#1:4320\n539#1:4412,4\n539#1:4430\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1973v1 implements androidx.compose.runtime.tooling.b, Iterable<androidx.compose.runtime.tooling.d>, InterfaceC4418a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f100251k = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f100253b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f100255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f100256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f100257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f100258g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public HashMap<C1889c, C1915h0> f100260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public C1562v0<C1564w0> f100261j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public int[] f100252a = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public Object[] f100254c = new Object[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public ArrayList<C1889c> f100259h = new ArrayList<>();

    public static final void L(C1970u1 c1970u1, C1564w0 c1564w0, List<C1889c> list, Ref.BooleanRef booleanRef, C1973v1 c1973v1, List<RecomposeScopeImpl> list2) {
        RecomposeScopeImpl recomposeScopeImplA;
        int iP = c1970u1.p();
        if (!c1564w0.d(iP)) {
            c1970u1.d0();
            while (!c1970u1.P()) {
                L(c1970u1, c1564w0, list, booleanRef, c1973v1, list2);
            }
            c1970u1.h();
            return;
        }
        if (iP != -3) {
            list.add(C1970u1.b(c1970u1, 0, 1, null));
        }
        if (booleanRef.f217897a) {
            RecomposeScopeImpl recomposeScopeImplA2 = c1973v1.A(c1970u1.f100243h);
            if (recomposeScopeImplA2 != null) {
                list2.add(recomposeScopeImplA2);
                C1889c c1889c = recomposeScopeImplA2.f99213c;
                if (c1889c != null && c1889c.f99427a == c1970u1.f100243h && (recomposeScopeImplA = c1973v1.A(c1970u1.f100245j)) != null) {
                    list2.add(recomposeScopeImplA);
                }
            } else {
                booleanRef.f217897a = false;
                list2.clear();
            }
        }
        c1970u1.b0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final int f0(Ref.IntRef intRef, C1973v1 c1973v1, int i10, int i11) {
        int i12 = intRef.f217902a;
        int i13 = i12 + 1;
        intRef.f217902a = i13;
        int iP0 = C1979x1.p0(c1973v1.f100252a, i12);
        if ((iP0 == i10) != true) {
            StringBuilder sbA = C1545m0.a("Invalid parent index detected at ", i12, ", expected parent index to be ", i10, " found ");
            sbA.append(iP0);
            U0.e(sbA.toString());
            throw null;
        }
        int iY = C1979x1.Y(c1973v1.f100252a, i12) + i12;
        if ((iY <= c1973v1.f100253b) != true) {
            U0.e("A group extends past the end of the table at " + i12);
            throw null;
        }
        if ((iY <= i11) != true) {
            U0.e("A group extends past its parent group at " + i12);
            throw null;
        }
        int iQ = C1979x1.Q(c1973v1.f100252a, i12);
        int iQ2 = i12 >= c1973v1.f100253b - 1 ? c1973v1.f100255d : C1979x1.Q(c1973v1.f100252a, i13);
        if ((iQ2 <= c1973v1.f100254c.length) != true) {
            U0.e("Slots for " + i12 + " extend past the end of the slot table");
            throw null;
        }
        if ((iQ <= iQ2) != true) {
            U0.e("Invalid data anchor at " + i12);
            throw null;
        }
        if ((C1979x1.u0(c1973v1.f100252a, i12) <= iQ2) != true) {
            U0.e("Slots start out of range at " + i12);
            throw null;
        }
        if ((iQ2 - iQ >= (C1979x1.b0(c1973v1.f100252a, i12) ? 1 : 0) + ((C1979x1.d0(c1973v1.f100252a, i12) ? 1 : 0) + (C1979x1.f0(c1973v1.f100252a, i12) ? 1 : 0))) != true) {
            U0.e("Not enough slots added for group " + i12);
            throw null;
        }
        boolean zF0 = C1979x1.f0(c1973v1.f100252a, i12);
        if (((zF0 && c1973v1.f100254c[C1979x1.n0(c1973v1.f100252a, i12)] == null) ? false : true) != true) {
            U0.e("No node recorded for a node group at " + i12);
            throw null;
        }
        int iF0 = 0;
        while (intRef.f217902a < iY) {
            iF0 += f0(intRef, c1973v1, i12, iY);
        }
        int iK0 = C1979x1.k0(c1973v1.f100252a, i12);
        int iY2 = C1979x1.Y(c1973v1.f100252a, i12);
        if ((iK0 == iF0) != true) {
            StringBuilder sbA2 = C1545m0.a("Incorrect node count detected at ", i12, ", expected ", iK0, ", received ");
            sbA2.append(iF0);
            U0.e(sbA2.toString());
            throw null;
        }
        int i14 = intRef.f217902a - i12;
        if ((iY2 == i14) != true) {
            StringBuilder sbA3 = C1545m0.a("Incorrect slot count detected at ", i12, ", expected ", iY2, ", received ");
            sbA3.append(i14);
            U0.e(sbA3.toString());
            throw null;
        }
        if (C1979x1.N(c1973v1.f100252a, i12)) {
            if (!(i12 <= 0 || C1979x1.O(c1973v1.f100252a, i10))) {
                U0.e("Expected group " + i10 + " to record it contains a mark because " + i12 + " does");
                throw null;
            }
        }
        if (zF0) {
            return 1;
        }
        return iF0;
    }

    public static final void l0(C1973v1 c1973v1, C1915h0 c1915h0) {
        ArrayList<Object> arrayList = c1915h0.f99694d;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof C1889c) {
                    C1889c c1889c = (C1889c) obj;
                    if (!c1889c.b()) {
                        U0.d("Source map contains invalid anchor");
                        throw null;
                    }
                    if (!c1973v1.R(c1889c)) {
                        U0.d("Source map anchor is not owned by the slot table");
                        throw null;
                    }
                } else if (obj instanceof C1915h0) {
                    l0(c1973v1, (C1915h0) obj);
                }
            }
        }
    }

    public static final int z(C1973v1 c1973v1, int i10) {
        return i10 >= c1973v1.f100253b ? c1973v1.f100255d : C1979x1.Q(c1973v1.f100252a, i10);
    }

    public final RecomposeScopeImpl A(int i10) {
        int iP0 = i10;
        while (iP0 > 0) {
            M m10 = new M(this, iP0);
            while (m10.hasNext()) {
                Object next = m10.next();
                if (next instanceof RecomposeScopeImpl) {
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) next;
                    if (recomposeScopeImpl.t() && iP0 != i10) {
                        return recomposeScopeImpl;
                    }
                    recomposeScopeImpl.H(true);
                }
            }
            iP0 = C1979x1.p0(this.f100252a, iP0);
        }
        return null;
    }

    @NotNull
    public final ArrayList<C1889c> B() {
        return this.f100259h;
    }

    @Nullable
    public final C1562v0<C1564w0> C() {
        return this.f100261j;
    }

    @NotNull
    public final int[] D() {
        return this.f100252a;
    }

    public final int E() {
        return this.f100253b;
    }

    @NotNull
    public final Object[] F() {
        return this.f100254c;
    }

    @Nullable
    public final HashMap<C1889c, C1915h0> G() {
        return this.f100260i;
    }

    public final int H() {
        return this.f100258g;
    }

    public final boolean I() {
        return this.f100257f;
    }

    public final boolean J(int i10, @NotNull C1889c c1889c) {
        if (this.f100257f) {
            C1968u.v("Writer is active");
            throw null;
        }
        if (!(i10 >= 0 && i10 < this.f100253b)) {
            C1968u.v("Invalid group index");
            throw null;
        }
        if (R(c1889c)) {
            int iY = C1979x1.Y(this.f100252a, i10) + i10;
            int i11 = c1889c.f99427a;
            if (i10 <= i11 && i11 < iY) {
                return true;
            }
        }
        return false;
    }

    public final List<Integer> K() {
        return C1979x1.Z(this.f100252a, this.f100253b * 5);
    }

    @Nullable
    public final List<RecomposeScopeImpl> M(int i10) {
        C1564w0 c1564w0N;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.f217897a = true;
        C1564w0 c1564w0 = new C1564w0(0, 1, null);
        c1564w0.G(i10);
        c1564w0.G(-3);
        C1562v0<C1564w0> c1562v0 = this.f100261j;
        if (c1562v0 != null && (c1564w0N = c1562v0.n(i10)) != null) {
            c1564w0.H(c1564w0N);
        }
        C1970u1 c1970u1P = P();
        try {
            L(c1970u1P, c1564w0, arrayList, booleanRef, this, arrayList2);
            c1970u1P.e();
            C1982y1 c1982y1Q = Q();
            try {
                c1982y1Q.D1();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    C1889c c1889c = (C1889c) arrayList.get(i11);
                    c1889c.getClass();
                    if (c1982y1Q.G(c1889c) >= c1982y1Q.f100343t) {
                        c1982y1Q.m1(c1889c);
                        c1982y1Q.J();
                    }
                }
                c1982y1Q.s1();
                c1982y1Q.W();
                c1982y1Q.N(true);
                if (booleanRef.f217897a) {
                    return arrayList2;
                }
                return null;
            } catch (Throwable th) {
                c1982y1Q.N(false);
                throw th;
            }
        } catch (Throwable th2) {
            c1970u1P.e();
            throw th2;
        }
    }

    public final List<Integer> N() {
        return C1979x1.h0(this.f100252a, this.f100253b * 5);
    }

    public final List<Integer> O() {
        return C1979x1.l0(this.f100252a, this.f100253b * 5);
    }

    @NotNull
    public final C1970u1 P() {
        if (this.f100257f) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f100256e++;
        return new C1970u1(this);
    }

    @NotNull
    public final C1982y1 Q() {
        if (this.f100257f) {
            C1968u.v("Cannot start a writer when another writer is pending");
            throw null;
        }
        if (!(this.f100256e <= 0)) {
            C1968u.v("Cannot start a writer when a reader is pending");
            throw null;
        }
        this.f100257f = true;
        this.f100258g++;
        return new C1982y1(this);
    }

    public final boolean R(@NotNull C1889c c1889c) {
        int iS0;
        return c1889c.b() && (iS0 = C1979x1.s0(this.f100259h, c1889c.f99427a, this.f100253b)) >= 0 && kotlin.jvm.internal.G.g(this.f100259h.get(iS0), c1889c);
    }

    public final List<Integer> S() {
        return C1979x1.q0(this.f100252a, this.f100253b * 5);
    }

    public final <T> T T(@NotNull ed.l<? super C1970u1, ? extends T> lVar) {
        C1970u1 c1970u1P = P();
        try {
            return lVar.invoke(c1970u1P);
        } finally {
            c1970u1P.e();
        }
    }

    public final void U(@NotNull ArrayList<C1889c> arrayList) {
        this.f100259h = arrayList;
    }

    public final void V(@Nullable C1562v0<C1564w0> c1562v0) {
        this.f100261j = c1562v0;
    }

    public final void W(@Nullable HashMap<C1889c, C1915h0> map) {
        this.f100260i = map;
    }

    public final void X(@NotNull int[] iArr, int i10, @NotNull Object[] objArr, int i11, @NotNull ArrayList<C1889c> arrayList, @Nullable HashMap<C1889c, C1915h0> map, @Nullable C1562v0<C1564w0> c1562v0) {
        this.f100252a = iArr;
        this.f100253b = i10;
        this.f100254c = objArr;
        this.f100255d = i11;
        this.f100259h = arrayList;
        this.f100260i = map;
        this.f100261j = c1562v0;
    }

    public final void Y(int i10) {
        this.f100258g = i10;
    }

    @Nullable
    public final Object Z(int i10, int i11) {
        int iU0 = C1979x1.u0(this.f100252a, i10);
        int i12 = i10 + 1;
        int iQ = (i12 < this.f100253b ? C1979x1.Q(this.f100252a, i12) : this.f100254c.length) - iU0;
        if (i11 >= 0 && i11 < iQ) {
            return this.f100254c[iU0 + i11];
        }
        InterfaceC1946s.f99968a.getClass();
        return InterfaceC1946s.a.f99970b;
    }

    @NotNull
    public final List<Object> a0(int i10) {
        int iQ = C1979x1.Q(this.f100252a, i10);
        int i11 = i10 + 1;
        return kotlin.collections.B.dz(this.f100254c).subList(iQ, i11 < this.f100253b ? C1979x1.Q(this.f100252a, i11) : this.f100254c.length);
    }

    @Override // androidx.compose.runtime.tooling.b
    @Nullable
    public androidx.compose.runtime.tooling.d b(@NotNull Object obj) {
        return new C1976w1(this, 0, 0, 4, null).b(obj);
    }

    @Nullable
    public final C1915h0 b0(int i10) {
        C1889c c1889cD0;
        HashMap<C1889c, C1915h0> map = this.f100260i;
        if (map == null || (c1889cD0 = d0(i10)) == null) {
            return null;
        }
        return map.get(c1889cD0);
    }

    @NotNull
    public final String c0() {
        if (this.f100257f) {
            return toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(toString());
        sb2.append('\n');
        int i10 = this.f100253b;
        if (i10 > 0) {
            int iX = 0;
            while (iX < i10) {
                iX += x(sb2, iX, 0);
            }
        } else {
            sb2.append("<EMPTY>");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final C1889c d0(int i10) {
        int i11;
        if (this.f100257f) {
            C1968u.v("use active SlotWriter to crate an anchor for location instead");
            throw null;
        }
        if (i10 < 0 || i10 >= (i11 = this.f100253b)) {
            return null;
        }
        return C1979x1.V(this.f100259h, i10, i11);
    }

    public final void e0() {
        int i10;
        int i11;
        Ref.IntRef intRef = new Ref.IntRef();
        int i12 = -1;
        if (this.f100253b > 0) {
            while (true) {
                i10 = intRef.f217902a;
                i11 = this.f100253b;
                if (i10 >= i11) {
                    break;
                } else {
                    f0(intRef, this, -1, C1979x1.Y(this.f100252a, i10) + i10);
                }
            }
            if (!(i10 == i11)) {
                U0.e("Incomplete group at root " + intRef.f217902a + " expected to be " + this.f100253b);
                throw null;
            }
        }
        int length = this.f100254c.length;
        for (int i13 = this.f100255d; i13 < length; i13++) {
            if (!(this.f100254c[i13] == null)) {
                U0.e("Non null value in the slot gap at index " + i13);
                throw null;
            }
        }
        ArrayList<C1889c> arrayList = this.f100259h;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            C1889c c1889c = arrayList.get(i14);
            c1889c.getClass();
            int i15 = i(c1889c);
            if (!(i15 >= 0 && i15 <= this.f100253b)) {
                U0.d("Invalid anchor, location out of bound");
                throw null;
            }
            if (!(i12 < i15)) {
                U0.d("Anchor is out of order");
                throw null;
            }
            i14++;
            i12 = i15;
        }
        HashMap<C1889c, C1915h0> map = this.f100260i;
        if (map != null) {
            for (Map.Entry<C1889c, C1915h0> entry : map.entrySet()) {
                C1889c key = entry.getKey();
                C1915h0 value = entry.getValue();
                if (!key.b()) {
                    U0.d("Source map contains invalid anchor");
                    throw null;
                }
                if (!R(key)) {
                    U0.d("Source map anchor is not owned by the slot table");
                    throw null;
                }
                l0(this, value);
            }
        }
    }

    @Override // androidx.compose.runtime.tooling.b
    @NotNull
    public Iterable<androidx.compose.runtime.tooling.d> g() {
        return this;
    }

    @NotNull
    public final C1889c h(int i10) {
        if (this.f100257f) {
            C1968u.v("use active SlotWriter to create an anchor location instead");
            throw null;
        }
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f100253b) {
            z10 = true;
        }
        if (!z10) {
            U0.d("Parameter index is out of range");
            throw null;
        }
        ArrayList<C1889c> arrayList = this.f100259h;
        int iS0 = C1979x1.s0(arrayList, i10, this.f100253b);
        if (iS0 >= 0) {
            return arrayList.get(iS0);
        }
        C1889c c1889c = new C1889c(i10);
        arrayList.add(-(iS0 + 1), c1889c);
        return c1889c;
    }

    public final int i(@NotNull C1889c c1889c) {
        if (this.f100257f) {
            C1968u.v("Use active SlotWriter to determine anchor location instead");
            throw null;
        }
        if (c1889c.b()) {
            return c1889c.f99427a;
        }
        U0.d("Anchor refers to a group that was removed");
        throw null;
    }

    @Override // androidx.compose.runtime.tooling.b
    public boolean isEmpty() {
        return this.f100253b == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<androidx.compose.runtime.tooling.d> iterator() {
        return new C1909f0(this, 0, this.f100253b);
    }

    public final void j(@NotNull C1970u1 c1970u1, @Nullable HashMap<C1889c, C1915h0> map) {
        if (!(c1970u1.f100236a == this && this.f100256e > 0)) {
            C1968u.v("Unexpected reader close()");
            throw null;
        }
        this.f100256e--;
        if (map != null) {
            synchronized (this) {
                try {
                    HashMap<C1889c, C1915h0> map2 = this.f100260i;
                    if (map2 != null) {
                        map2.putAll(map);
                    } else {
                        this.f100260i = map;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final int k0() {
        return this.f100255d;
    }

    public final <T> T m0(@NotNull ed.l<? super C1982y1, ? extends T> lVar) {
        C1982y1 c1982y1Q = Q();
        try {
            T tInvoke = lVar.invoke(c1982y1Q);
            c1982y1Q.N(true);
            return tInvoke;
        } catch (Throwable th) {
            c1982y1Q.N(false);
            throw th;
        }
    }

    public final void o(@NotNull C1982y1 c1982y1, @NotNull int[] iArr, int i10, @NotNull Object[] objArr, int i11, @NotNull ArrayList<C1889c> arrayList, @Nullable HashMap<C1889c, C1915h0> map, @Nullable C1562v0<C1564w0> c1562v0) {
        if (!(c1982y1.f100324a == this && this.f100257f)) {
            U0.d("Unexpected writer close()");
            throw null;
        }
        this.f100257f = false;
        X(iArr, i10, objArr, i11, arrayList, map, c1562v0);
    }

    public final void q() {
        this.f100261j = new C1562v0<>(0, 1, null);
    }

    public final void t() {
        this.f100260i = new HashMap<>();
    }

    public final boolean v() {
        return this.f100253b > 0 && C1979x1.O(this.f100252a, 0);
    }

    public final List<Integer> w() {
        return C1979x1.R(this.f100252a, this.f100253b * 5);
    }

    public final int x(StringBuilder sb2, int i10, int i11) {
        String str;
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(' ');
        }
        sb2.append("Group(");
        sb2.append(i10);
        sb2.append(")");
        C1915h0 c1915h0B0 = b0(i10);
        if (c1915h0B0 != null && (str = c1915h0B0.f99692b) != null && (kotlin.text.F.L2(str, "C(", false, 2, null) || kotlin.text.F.L2(str, "CC(", false, 2, null))) {
            int iL3 = kotlin.text.M.L3(str, "(", 0, false, 6, null) + 1;
            int iK3 = kotlin.text.M.K3(str, ')', 0, false, 6, null);
            sb2.append(C4.q.f17581a);
            String strSubstring = str.substring(iL3, iK3);
            kotlin.jvm.internal.G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(strSubstring);
            sb2.append("()");
        }
        sb2.append(" key=");
        sb2.append(this.f100252a[i10 * 5]);
        int iY = C1979x1.Y(this.f100252a, i10);
        sb2.append(", nodes=");
        sb2.append(C1979x1.k0(this.f100252a, i10));
        sb2.append(", size=");
        sb2.append(iY);
        if (C1979x1.c0(this.f100252a, i10)) {
            sb2.append(", mark");
        }
        if (C1979x1.O(this.f100252a, i10)) {
            sb2.append(", contains mark");
        }
        int iZ = z(this, i10);
        int iX = i10 + 1;
        int iZ2 = z(this, iX);
        if (iZ < 0 || iZ > iZ2 || iZ2 > this.f100255d) {
            sb2.append(", *invalid data offsets " + iZ + SignatureVisitor.SUPER + iZ2 + '*');
        } else {
            if (C1979x1.d0(this.f100252a, i10)) {
                sb2.append(" objectKey=".concat(C1979x1.v0(String.valueOf(this.f100254c[C1979x1.o0(this.f100252a, i10)]), 10)));
            }
            if (C1979x1.f0(this.f100252a, i10)) {
                sb2.append(" node=".concat(C1979x1.v0(String.valueOf(this.f100254c[C1979x1.n0(this.f100252a, i10)]), 10)));
            }
            if (C1979x1.b0(this.f100252a, i10)) {
                sb2.append(" aux=".concat(C1979x1.v0(String.valueOf(this.f100254c[C1979x1.M(this.f100252a, i10)]), 10)));
            }
            int iU0 = C1979x1.u0(this.f100252a, i10);
            if (iU0 < iZ2) {
                sb2.append(", slots=[");
                sb2.append(iU0);
                sb2.append(": ");
                for (int i13 = iU0; i13 < iZ2; i13++) {
                    if (i13 != iU0) {
                        sb2.append(U6.j.f68738d);
                    }
                    sb2.append(C1979x1.v0(String.valueOf(this.f100254c[i13]), 10));
                }
                sb2.append("]");
            }
        }
        sb2.append('\n');
        int i14 = i10 + iY;
        while (iX < i14) {
            iX += x(sb2, iX, i11 + 1);
        }
        return iY;
    }
}
