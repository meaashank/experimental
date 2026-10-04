package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.C;
import androidx.compose.foundation.lazy.layout.J;
import androidx.compose.foundation.lazy.layout.O;
import androidx.compose.runtime.T1;
import kotlin.collections.U;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T1
@V({"SMAP\nLazyGridPrefetchStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridPrefetchStrategy.kt\nandroidx/compose/foundation/lazy/grid/DefaultLazyGridPrefetchStrategy\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,228:1\n1208#2:229\n1187#2,2:230\n460#3,11:232\n138#3:243\n460#3,11:244\n460#3,11:255\n460#3,11:266\n*S KotlinDebug\n*F\n+ 1 LazyGridPrefetchStrategy.kt\nandroidx/compose/foundation/lazy/grid/DefaultLazyGridPrefetchStrategy\n*L\n139#1:229\n139#1:230,2\n173#1:232,11\n178#1:243\n188#1:244,11\n196#1:255,11\n216#1:266,11\n*E\n"})
public final class C1720a implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f91418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.collection.c<C.b> f91419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f91420d;

    public C1720a() {
        this(0, 1, null);
    }

    @Override // androidx.compose.foundation.lazy.grid.w
    public void a(@NotNull J j10, int i10) {
        int i11 = this.f91417a;
        for (int i12 = 0; i12 < i11; i12++) {
            j10.a(i10 + i12);
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.w
    public /* synthetic */ O b() {
        return null;
    }

    @Override // androidx.compose.foundation.lazy.grid.w
    public void c(@NotNull u uVar, float f10, @NotNull n nVar) {
        int iL;
        int index;
        androidx.compose.runtime.collection.c<C.b> cVar;
        int i10;
        androidx.compose.runtime.collection.c<C.b> cVar2;
        int i11;
        androidx.compose.runtime.collection.c<C.b> cVar3;
        int i12;
        if (nVar.i().isEmpty()) {
            return;
        }
        int i13 = 0;
        boolean z10 = f10 < 0.0f;
        if (z10) {
            h hVar = (h) U.u3(nVar.i());
            iL = (nVar.a() == Orientation.Vertical ? hVar.l() : hVar.i()) + 1;
            index = ((h) U.u3(nVar.i())).getIndex() + 1;
        } else {
            h hVar2 = (h) U.G2(nVar.i());
            iL = (nVar.a() == Orientation.Vertical ? hVar2.l() : hVar2.i()) - 1;
            index = ((h) U.G2(nVar.i())).getIndex() - 1;
        }
        if (index < 0 || index >= nVar.g()) {
            return;
        }
        if (iL != this.f91418b && iL >= 0) {
            if (this.f91420d != z10 && (i12 = (cVar3 = this.f91419c).f99566c) > 0) {
                C.b[] bVarArr = cVar3.f99564a;
                int i14 = 0;
                do {
                    bVarArr[i14].cancel();
                    i14++;
                } while (i14 < i12);
            }
            this.f91420d = z10;
            this.f91418b = iL;
            this.f91419c.q();
            androidx.compose.runtime.collection.c<C.b> cVar4 = this.f91419c;
            cVar4.h(cVar4.f99566c, uVar.a(iL));
        }
        if (!z10) {
            if (nVar.d() - androidx.compose.foundation.gestures.snapping.e.d((h) U.G2(nVar.i()), nVar.a()) >= f10 || (i10 = (cVar = this.f91419c).f99566c) <= 0) {
                return;
            }
            C.b[] bVarArr2 = cVar.f99564a;
            do {
                bVarArr2[i13].a();
                i13++;
            } while (i13 < i10);
            return;
        }
        h hVar3 = (h) U.u3(nVar.i());
        if (((androidx.compose.foundation.gestures.snapping.e.d(hVar3, nVar.a()) + androidx.compose.foundation.gestures.snapping.e.f(hVar3, nVar.a())) + nVar.h()) - nVar.e() >= (-f10) || (i11 = (cVar2 = this.f91419c).f99566c) <= 0) {
            return;
        }
        C.b[] bVarArr3 = cVar2.f99564a;
        do {
            bVarArr3[i13].a();
            i13++;
        } while (i13 < i11);
    }

    @Override // androidx.compose.foundation.lazy.grid.w
    public void d(@NotNull u uVar, @NotNull n nVar) {
        int iL;
        if (this.f91418b == -1 || nVar.i().isEmpty()) {
            return;
        }
        if (this.f91420d) {
            h hVar = (h) U.u3(nVar.i());
            iL = (nVar.a() == Orientation.Vertical ? hVar.l() : hVar.i()) + 1;
        } else {
            h hVar2 = (h) U.G2(nVar.i());
            iL = (nVar.a() == Orientation.Vertical ? hVar2.l() : hVar2.i()) - 1;
        }
        if (this.f91418b != iL) {
            this.f91418b = -1;
            androidx.compose.runtime.collection.c<C.b> cVar = this.f91419c;
            int i10 = cVar.f99566c;
            if (i10 > 0) {
                C.b[] bVarArr = cVar.f99564a;
                int i11 = 0;
                do {
                    bVarArr[i11].cancel();
                    i11++;
                } while (i11 < i10);
            }
            this.f91419c.q();
        }
    }

    public C1720a(int i10) {
        this.f91417a = i10;
        this.f91418b = -1;
        this.f91419c = new androidx.compose.runtime.collection.c<>(new C.b[16], 0);
    }

    public /* synthetic */ C1720a(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 2 : i10);
    }
}
