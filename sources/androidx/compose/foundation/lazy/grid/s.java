package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLazyGridMeasuredLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,86:1\n13579#2,2:87\n13644#2,3:89\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n*L\n46#1:87,2\n68#1:89,3\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class s {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f91497i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final p[] f91499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final D f91500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<C1722c> f91501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f91502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f91503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f91504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f91505h;

    public s(int i10, @NotNull p[] pVarArr, @NotNull D d10, @NotNull List<C1722c> list, boolean z10, int i11) {
        this.f91498a = i10;
        this.f91499b = pVarArr;
        this.f91500c = d10;
        this.f91501d = list;
        this.f91502e = z10;
        this.f91503f = i11;
        int iMax = 0;
        for (p pVar : pVarArr) {
            iMax = Math.max(iMax, pVar.f91484s);
        }
        this.f91504g = iMax;
        int i12 = iMax + this.f91503f;
        this.f91505h = i12 >= 0 ? i12 : 0;
    }

    public final int a() {
        return this.f91498a;
    }

    @NotNull
    public final p[] b() {
        return this.f91499b;
    }

    public final int c() {
        return this.f91504g;
    }

    public final int d() {
        return this.f91505h;
    }

    public final boolean e() {
        return this.f91499b.length == 0;
    }

    @NotNull
    public final p[] f(int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        p[] pVarArr = this.f91499b;
        int length = pVarArr.length;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < length) {
            p pVar = pVarArr[i17];
            int i20 = i18 + 1;
            int i21 = (int) this.f91501d.get(i18).f91427a;
            int i22 = this.f91500c.f91205b[i19];
            boolean z10 = this.f91502e;
            int i23 = z10 ? this.f91498a : i19;
            if (z10) {
                i13 = i19;
                i16 = i10;
                i14 = i11;
                i15 = i12;
            } else {
                i13 = this.f91498a;
                i14 = i11;
                i15 = i12;
                i16 = i10;
            }
            pVar.w(i16, i22, i14, i15, i23, i13);
            i19 += i21;
            i17++;
            i18 = i20;
        }
        return this.f91499b;
    }
}
