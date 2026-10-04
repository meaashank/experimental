package androidx.compose.ui.graphics.vector;

import androidx.compose.animation.L;
import androidx.compose.ui.graphics.AbstractC2131z0;
import androidx.compose.ui.graphics.C2031g0;
import androidx.compose.ui.graphics.C2086n2;
import androidx.compose.ui.graphics.K0;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.d3;
import java.util.ArrayList;
import java.util.List;
import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,651:1\n696#2:652\n702#2:653\n272#3,8:654\n280#3:663\n282#3,4:670\n1#4:662\n33#5,6:664\n33#5,6:674\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n*L\n410#1:652\n411#1:653\n609#1:654,8\n609#1:663\n609#1:670,4\n616#1:664,6\n626#1:674,6\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class GroupComponent extends i {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f101435u = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public float[] f101436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<i> f101437d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f101438e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f101439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public List<? extends e> f101440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f101441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Path f101442i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public ed.l<? super i, L0> f101443j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ed.l<i, L0> f101444k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public String f101445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f101446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f101447n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f101448o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f101449p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f101450q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f101451r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f101452s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f101453t;

    public GroupComponent() {
        K0.f100733b.getClass();
        this.f101439f = K0.f100746o;
        this.f101440g = o.h();
        this.f101441h = true;
        this.f101444k = new ed.l<i, L0>() { // from class: androidx.compose.ui.graphics.vector.GroupComponent$wrappedListener$1
            {
                super(1);
            }

            public final void e(@NotNull i iVar) {
                this.f101454d.w(iVar);
                ed.l<? super i, L0> lVar = this.f101454d.f101443j;
                if (lVar != null) {
                    lVar.invoke(iVar);
                }
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(i iVar) {
                e(iVar);
                return L0.f217464a;
            }
        };
        this.f101445l = "";
        this.f101449p = 1.0f;
        this.f101450q = 1.0f;
        this.f101453t = true;
    }

    public final void A(@NotNull String str) {
        this.f101445l = str;
        c();
    }

    public final void B(float f10) {
        this.f101447n = f10;
        this.f101453t = true;
        c();
    }

    public final void C(float f10) {
        this.f101448o = f10;
        this.f101453t = true;
        c();
    }

    public final void D(float f10) {
        this.f101446m = f10;
        this.f101453t = true;
        c();
    }

    public final void E(float f10) {
        this.f101449p = f10;
        this.f101453t = true;
        c();
    }

    public final void F(float f10) {
        this.f101450q = f10;
        this.f101453t = true;
        c();
    }

    public final void G(float f10) {
        this.f101451r = f10;
        this.f101453t = true;
        c();
    }

    public final void H(float f10) {
        this.f101452s = f10;
        this.f101453t = true;
        c();
    }

    public final void I() {
        if (q()) {
            Path pathA = this.f101442i;
            if (pathA == null) {
                pathA = C2031g0.a();
                this.f101442i = pathA;
            }
            h.d(this.f101440g, pathA);
        }
    }

    public final void J() {
        float[] fArrC = this.f101436c;
        if (fArrC == null) {
            fArrC = C2086n2.c(null, 1, null);
            this.f101436c = fArrC;
        } else {
            C2086n2.m(fArrC);
        }
        float[] fArr = fArrC;
        C2086n2.x(fArr, this.f101447n + this.f101451r, this.f101448o + this.f101452s, 0.0f, 4, null);
        C2086n2.p(fArr, this.f101446m);
        C2086n2.q(fArr, this.f101449p, this.f101450q, 1.0f);
        C2086n2.x(fArr, -this.f101447n, -this.f101448o, 0.0f, 4, null);
    }

    @Override // androidx.compose.ui.graphics.vector.i
    public void a(@NotNull androidx.compose.ui.graphics.drawscope.h hVar) {
        if (this.f101453t) {
            J();
            this.f101453t = false;
        }
        if (this.f101441h) {
            I();
            this.f101441h = false;
        }
        androidx.compose.ui.graphics.drawscope.f fVarL1 = hVar.l1();
        long jE = fVarL1.e();
        fVarL1.g().A();
        try {
            androidx.compose.ui.graphics.drawscope.m mVarJ = fVarL1.j();
            float[] fArr = this.f101436c;
            if (fArr != null) {
                mVarJ.a(fArr);
            }
            Path path = this.f101442i;
            if (q() && path != null) {
                androidx.compose.ui.graphics.drawscope.l.c(mVarJ, path, 0, 2, null);
            }
            List<i> list = this.f101437d;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).a(hVar);
            }
            L.a(fVarL1, jE);
        } catch (Throwable th) {
            L.a(fVarL1, jE);
            throw th;
        }
    }

    @Override // androidx.compose.ui.graphics.vector.i
    @Nullable
    public ed.l<i, L0> b() {
        return this.f101443j;
    }

    @Override // androidx.compose.ui.graphics.vector.i
    public void d(@Nullable ed.l<? super i, L0> lVar) {
        this.f101443j = lVar;
    }

    @NotNull
    public final List<e> f() {
        return this.f101440g;
    }

    @NotNull
    public final String g() {
        return this.f101445l;
    }

    public final int h() {
        return this.f101437d.size();
    }

    public final float i() {
        return this.f101447n;
    }

    public final float j() {
        return this.f101448o;
    }

    public final float k() {
        return this.f101446m;
    }

    public final float l() {
        return this.f101449p;
    }

    public final float m() {
        return this.f101450q;
    }

    public final long n() {
        return this.f101439f;
    }

    public final float o() {
        return this.f101451r;
    }

    public final float p() {
        return this.f101452s;
    }

    public final boolean q() {
        return !this.f101440g.isEmpty();
    }

    public final void r(int i10, @NotNull i iVar) {
        if (i10 < this.f101437d.size()) {
            this.f101437d.set(i10, iVar);
        } else {
            this.f101437d.add(iVar);
        }
        w(iVar);
        iVar.d(this.f101444k);
        c();
    }

    public final boolean s() {
        return this.f101438e;
    }

    public final void t() {
        this.f101438e = false;
        K0.f100733b.getClass();
        this.f101439f = K0.f100746o;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.f101445l);
        List<i> list = this.f101437d;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = list.get(i10);
            sb2.append("\t");
            sb2.append(iVar.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public final void u(AbstractC2131z0 abstractC2131z0) {
        if (this.f101438e && abstractC2131z0 != null) {
            if (abstractC2131z0 instanceof d3) {
                v(((d3) abstractC2131z0).f101064c);
            } else {
                t();
            }
        }
    }

    public final void v(long j10) {
        if (this.f101438e && j10 != 16) {
            long j11 = this.f101439f;
            if (j11 == 16) {
                this.f101439f = j10;
            } else {
                if (o.i(j11, j10)) {
                    return;
                }
                t();
            }
        }
    }

    public final void w(i iVar) {
        if (iVar instanceof PathComponent) {
            PathComponent pathComponent = (PathComponent) iVar;
            u(pathComponent.f101480d);
            u(pathComponent.f101486j);
        } else if (iVar instanceof GroupComponent) {
            GroupComponent groupComponent = (GroupComponent) iVar;
            if (groupComponent.f101438e && this.f101438e) {
                v(groupComponent.f101439f);
            } else {
                t();
            }
        }
    }

    public final void x(int i10, int i11, int i12) {
        int i13 = 0;
        if (i10 > i11) {
            while (i13 < i12) {
                i iVar = this.f101437d.get(i10);
                this.f101437d.remove(i10);
                this.f101437d.add(i11, iVar);
                i11++;
                i13++;
            }
        } else {
            while (i13 < i12) {
                i iVar2 = this.f101437d.get(i10);
                this.f101437d.remove(i10);
                this.f101437d.add(i11 - 1, iVar2);
                i13++;
            }
        }
        c();
    }

    public final void y(int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (i10 < this.f101437d.size()) {
                this.f101437d.get(i10).d(null);
                this.f101437d.remove(i10);
            }
        }
        c();
    }

    public final void z(@NotNull List<? extends e> list) {
        this.f101440g = list;
        this.f101441h = true;
        c();
    }
}
