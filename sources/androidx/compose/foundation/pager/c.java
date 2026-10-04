package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.v0;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nMeasuredPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasuredPage.kt\nandroidx/compose/foundation/pager/MeasuredPage\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n127#1:144\n33#2,6:132\n69#2,4:138\n74#2:143\n1#3:142\n*S KotlinDebug\n*F\n+ 1 MeasuredPage.kt\nandroidx/compose/foundation/pager/MeasuredPage\n*L\n98#1:144\n50#1:132,6\n74#1:138,4\n74#1:143\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class c implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f92465o = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f92466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<v0> f92468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f92469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Object f92470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final c.b f92471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final c.InterfaceC0245c f92472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final LayoutDirection f92473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f92474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f92475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f92476k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final int[] f92477l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f92478m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f92479n;

    public /* synthetic */ c(int i10, int i11, List list, long j10, Object obj, Orientation orientation, c.b bVar, c.InterfaceC0245c interfaceC0245c, LayoutDirection layoutDirection, boolean z10, C4969v c4969v) {
        this(i10, i11, list, j10, obj, orientation, bVar, interfaceC0245c, layoutDirection, z10);
    }

    public final void a(int i10) {
        this.f92478m += i10;
        int length = this.f92477l.length;
        for (int i11 = 0; i11 < length; i11++) {
            boolean z10 = this.f92475j;
            if ((z10 && i11 % 2 == 1) || (!z10 && i11 % 2 == 0)) {
                int[] iArr = this.f92477l;
                iArr[i11] = iArr[i11] + i10;
            }
        }
    }

    public final long b(long j10, ed.l<? super Integer, Integer> lVar) {
        return k0.u.a(this.f92475j ? (int) (j10 >> 32) : lVar.invoke(Integer.valueOf((int) (j10 >> 32))).intValue(), this.f92475j ? lVar.invoke(Integer.valueOf((int) (j10 & ZipKt.f225990j))).intValue() : (int) (j10 & ZipKt.f225990j));
    }

    public final int c() {
        return this.f92476k;
    }

    public final int d(v0 v0Var) {
        return this.f92475j ? v0Var.f102605b : v0Var.f102604a;
    }

    public final long e(int i10) {
        int[] iArr = this.f92477l;
        int i11 = i10 * 2;
        return k0.u.a(iArr[i11], iArr[i11 + 1]);
    }

    public final int f() {
        return this.f92467b;
    }

    public final void g(@NotNull v0.a aVar) {
        v0.a aVar2;
        int iD;
        int iD2;
        if (this.f92479n == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int size = this.f92468c.size();
        int i10 = 0;
        while (i10 < size) {
            v0 v0Var = this.f92468c.get(i10);
            long jE = e(i10);
            if (this.f92474i) {
                if (this.f92475j) {
                    iD = (int) (jE >> 32);
                } else {
                    iD = (this.f92479n - ((int) (jE >> 32))) - d(v0Var);
                }
                if (this.f92475j) {
                    iD2 = (this.f92479n - ((int) (jE & ZipKt.f225990j))) - d(v0Var);
                } else {
                    iD2 = (int) (jE & ZipKt.f225990j);
                }
                jE = k0.u.a(iD, iD2);
            }
            long jR = k0.t.r(jE, this.f92469d);
            if (this.f92475j) {
                aVar2 = aVar;
                v0.a.I(aVar2, v0Var, jR, 0.0f, null, 6, null);
            } else {
                aVar2 = aVar;
                v0.a.A(aVar2, v0Var, jR, 0.0f, null, 6, null);
            }
            i10++;
            aVar = aVar2;
        }
    }

    @Override // androidx.compose.foundation.pager.e
    public int getIndex() {
        return this.f92466a;
    }

    @Override // androidx.compose.foundation.pager.e
    @NotNull
    public Object getKey() {
        return this.f92470e;
    }

    @Override // androidx.compose.foundation.pager.e
    public int getOffset() {
        return this.f92478m;
    }

    public final void h(int i10, int i11, int i12) {
        int i13;
        this.f92478m = i10;
        this.f92479n = this.f92475j ? i12 : i11;
        List<v0> list = this.f92468c;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            v0 v0Var = list.get(i14);
            int i15 = i14 * 2;
            if (this.f92475j) {
                int[] iArr = this.f92477l;
                c.b bVar = this.f92471f;
                if (bVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment");
                }
                iArr[i15] = bVar.a(v0Var.f102604a, i11, this.f92473h);
                this.f92477l[i15 + 1] = i10;
                i13 = v0Var.f102605b;
            } else {
                int[] iArr2 = this.f92477l;
                iArr2[i15] = i10;
                int i16 = i15 + 1;
                c.InterfaceC0245c interfaceC0245c = this.f92472g;
                if (interfaceC0245c == null) {
                    throw new IllegalArgumentException("null verticalAlignment");
                }
                iArr2[i16] = interfaceC0245c.a(v0Var.f102605b, i12);
                i13 = v0Var.f102604a;
            }
            i10 += i13;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(int i10, int i11, List<? extends v0> list, long j10, Object obj, Orientation orientation, c.b bVar, c.InterfaceC0245c interfaceC0245c, LayoutDirection layoutDirection, boolean z10) {
        this.f92466a = i10;
        this.f92467b = i11;
        this.f92468c = list;
        this.f92469d = j10;
        this.f92470e = obj;
        this.f92471f = bVar;
        this.f92472g = interfaceC0245c;
        this.f92473h = layoutDirection;
        this.f92474i = z10;
        this.f92475j = orientation == Orientation.Vertical;
        int size = list.size();
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            v0 v0Var = (v0) list.get(i12);
            iMax = Math.max(iMax, !this.f92475j ? v0Var.f102605b : v0Var.f102604a);
        }
        this.f92476k = iMax;
        this.f92477l = new int[this.f92468c.size() * 2];
        this.f92479n = Integer.MIN_VALUE;
    }
}
