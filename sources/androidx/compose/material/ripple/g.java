package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.I;
import kotlin.collections.N;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nRippleContainer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleContainer.android.kt\nandroidx/compose/material/ripple/RippleContainer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1#2:199\n*E\n"})
@r(parameters = 0)
public final class g extends ViewGroup {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f98876f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<k> f98878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<k> f98879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final i f98880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f98881e;

    public g(@NotNull Context context) {
        super(context);
        this.f98877a = 5;
        ArrayList arrayList = new ArrayList();
        this.f98878b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f98879c = arrayList2;
        this.f98880d = new i();
        setClipChildren(false);
        k kVar = new k(context);
        addView(kVar);
        arrayList.add(kVar);
        arrayList2.add(kVar);
        this.f98881e = 1;
        setTag(u.b.f105453J, Boolean.TRUE);
    }

    public final void a(@NotNull h hVar) {
        hVar.f2();
        k kVarB = this.f98880d.b(hVar);
        if (kVarB != null) {
            kVarB.d();
            this.f98880d.c(hVar);
            this.f98879c.add(kVarB);
        }
    }

    @NotNull
    public final k b(@NotNull h hVar) {
        k kVarB = this.f98880d.b(hVar);
        if (kVarB != null) {
            return kVarB;
        }
        k kVar = (k) N.P0(this.f98879c);
        if (kVar == null) {
            if (this.f98881e > I.L(this.f98878b)) {
                kVar = new k(getContext());
                addView(kVar);
                this.f98878b.add(kVar);
            } else {
                kVar = this.f98878b.get(this.f98881e);
                h hVarA = this.f98880d.a(kVar);
                if (hVarA != null) {
                    hVarA.f2();
                    this.f98880d.c(hVarA);
                    kVar.d();
                }
            }
            int i10 = this.f98881e;
            if (i10 < this.f98877a - 1) {
                this.f98881e = i10 + 1;
            } else {
                this.f98881e = 0;
            }
        }
        this.f98880d.d(hVar, kVar);
        return kVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }
}
