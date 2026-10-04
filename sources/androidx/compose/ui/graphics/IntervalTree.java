package androidx.compose.ui.graphics;

import androidx.annotation.RestrictTo;
import fd.InterfaceC4418a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nIntervalTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n1#1,408:1\n171#1,16:409\n171#1,16:425\n171#1,16:441\n*S KotlinDebug\n*F\n+ 1 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n121#1:409,16\n148#1:425,16\n160#1:441,16\n*E\n"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class IntervalTree<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IntervalTree<T>.a f100717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public IntervalTree<T>.a f100718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ArrayList<IntervalTree<T>.a> f100719c;

    public enum TreeColor {
        Red,
        Black
    }

    public final class a extends C2041i2<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public TreeColor f100720d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f100721e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f100722f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public IntervalTree<T>.a f100723g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public IntervalTree<T>.a f100724h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public IntervalTree<T>.a f100725i;

        public a(float f10, float f11, @Nullable T t10, @NotNull TreeColor treeColor) {
            super(f10, f11, t10);
            this.f100720d = treeColor;
            this.f100721e = f10;
            this.f100722f = f11;
            IntervalTree<T>.a aVar = IntervalTree.this.f100717a;
            this.f100723g = aVar;
            this.f100724h = aVar;
            this.f100725i = aVar;
        }

        @NotNull
        public final TreeColor g() {
            return this.f100720d;
        }

        @NotNull
        public final IntervalTree<T>.a h() {
            return this.f100723g;
        }

        public final float i() {
            return this.f100722f;
        }

        public final float j() {
            return this.f100721e;
        }

        @NotNull
        public final IntervalTree<T>.a k() {
            return this.f100725i;
        }

        @NotNull
        public final IntervalTree<T>.a l() {
            return this.f100724h;
        }

        @NotNull
        public final IntervalTree<T>.a m() {
            a aVar = this;
            while (true) {
                IntervalTree<T>.a aVar2 = aVar.f100723g;
                if (aVar2 == IntervalTree.this.f100717a) {
                    return aVar;
                }
                aVar = aVar2;
            }
        }

        @NotNull
        public final IntervalTree<T>.a n() {
            IntervalTree<T>.a aVar = this.f100724h;
            if (aVar != IntervalTree.this.f100717a) {
                return aVar.m();
            }
            IntervalTree<T>.a aVar2 = this.f100725i;
            a aVar3 = this;
            while (aVar2 != IntervalTree.this.f100717a && aVar3 == aVar2.f100724h) {
                aVar3 = aVar2;
                aVar2 = aVar2.f100725i;
            }
            return aVar2;
        }

        public final void o(@NotNull TreeColor treeColor) {
            this.f100720d = treeColor;
        }

        public final void p(@NotNull IntervalTree<T>.a aVar) {
            this.f100723g = aVar;
        }

        public final void q(float f10) {
            this.f100722f = f10;
        }

        public final void r(float f10) {
            this.f100721e = f10;
        }

        public final void s(@NotNull IntervalTree<T>.a aVar) {
            this.f100725i = aVar;
        }

        public final void t(@NotNull IntervalTree<T>.a aVar) {
            this.f100724h = aVar;
        }
    }

    public static final class b implements Iterator<C2041i2<T>>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public IntervalTree<T>.a f100727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IntervalTree<T> f100728b;

        public b(IntervalTree<T> intervalTree) {
            this.f100728b = intervalTree;
            this.f100727a = intervalTree.f100718b.m();
        }

        @NotNull
        public final IntervalTree<T>.a b() {
            return this.f100727a;
        }

        @Override // java.util.Iterator
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C2041i2<T> next() {
            IntervalTree<T>.a aVar = this.f100727a;
            this.f100727a = aVar.n();
            return aVar;
        }

        public final void e(@NotNull IntervalTree<T>.a aVar) {
            this.f100727a = aVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f100727a != this.f100728b.f100717a;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public IntervalTree() {
        IntervalTree<T>.a aVar = new a(Float.MAX_VALUE, Float.MIN_VALUE, null, TreeColor.Black);
        this.f100717a = aVar;
        this.f100718b = aVar;
        this.f100719c = new ArrayList<>();
    }

    public static /* synthetic */ C2041i2 j(IntervalTree intervalTree, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        return intervalTree.h(f10, f11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List m(IntervalTree intervalTree, float f10, float f11, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        if ((i10 & 4) != 0) {
            list = new ArrayList();
        }
        intervalTree.k(f10, f11, list);
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List n(IntervalTree intervalTree, md.f fVar, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = new ArrayList();
        }
        intervalTree.l(fVar, list);
        return list;
    }

    public static void q(IntervalTree intervalTree, float f10, float f11, ed.l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        IntervalTree<T>.a aVar = intervalTree.f100718b;
        if (aVar != intervalTree.f100717a) {
            ArrayList<IntervalTree<T>.a> arrayList = intervalTree.f100719c;
            arrayList.add(aVar);
            while (arrayList.size() > 0) {
                a aVar2 = (a) kotlin.collections.N.Q0(arrayList);
                if (aVar2.e(f10, f11)) {
                    lVar.invoke(aVar2);
                }
                IntervalTree<T>.a aVar3 = aVar2.f100723g;
                if (aVar3 != intervalTree.f100717a && aVar3.f100722f >= f10) {
                    arrayList.add(aVar3);
                }
                IntervalTree<T>.a aVar4 = aVar2.f100724h;
                if (aVar4 != intervalTree.f100717a && aVar4.f100721e <= f11) {
                    arrayList.add(aVar4);
                }
            }
            arrayList.clear();
        }
    }

    public final void d(float f10, float f11, @Nullable T t10) {
        IntervalTree<T>.a aVar;
        IntervalTree<T>.a aVar2 = new a(f10, f11, t10, TreeColor.Red);
        IntervalTree<T>.a aVar3 = this.f100718b;
        IntervalTree<T>.a aVar4 = this.f100717a;
        while (true) {
            aVar = this.f100717a;
            if (aVar3 == aVar) {
                break;
            }
            aVar4 = aVar3;
            aVar3 = aVar2.f101127a <= aVar3.f101127a ? aVar3.f100723g : aVar3.f100724h;
        }
        aVar2.f100725i = aVar4;
        if (aVar4 == aVar) {
            this.f100718b = aVar2;
        } else if (aVar2.f101127a <= aVar4.f101127a) {
            aVar4.f100723g = aVar2;
        } else {
            aVar4.f100724h = aVar2;
        }
        w(aVar2);
        t(aVar2);
    }

    public final void e() {
        this.f100718b = this.f100717a;
    }

    public final boolean f(float f10) {
        return h(f10, f10) != C2045j2.f101136a;
    }

    public final boolean g(@NotNull md.f<Float> fVar) {
        return h(fVar.b().floatValue(), fVar.h().floatValue()) != C2045j2.f101136a;
    }

    @NotNull
    public final C2041i2<T> h(float f10, float f11) {
        IntervalTree<T>.a aVar = this.f100718b;
        IntervalTree<T>.a aVar2 = this.f100717a;
        if (aVar != aVar2 && aVar != aVar2) {
            ArrayList<IntervalTree<T>.a> arrayList = this.f100719c;
            arrayList.add(aVar);
            while (arrayList.size() > 0) {
                a aVar3 = (a) kotlin.collections.N.Q0(arrayList);
                if (aVar3.e(f10, f11)) {
                    return aVar3;
                }
                IntervalTree<T>.a aVar4 = aVar3.f100723g;
                if (aVar4 != this.f100717a && aVar4.f100722f >= f10) {
                    arrayList.add(aVar4);
                }
                IntervalTree<T>.a aVar5 = aVar3.f100724h;
                if (aVar5 != this.f100717a && aVar5.f100721e <= f11) {
                    arrayList.add(aVar5);
                }
            }
            arrayList.clear();
        }
        C2041i2<T> c2041i2 = (C2041i2<T>) C2045j2.f101136a;
        kotlin.jvm.internal.G.n(c2041i2, "null cannot be cast to non-null type androidx.compose.ui.graphics.Interval<T of androidx.compose.ui.graphics.IntervalTree>");
        return c2041i2;
    }

    @NotNull
    public final C2041i2<T> i(@NotNull md.f<Float> fVar) {
        return h(fVar.b().floatValue(), fVar.h().floatValue());
    }

    @NotNull
    public final List<C2041i2<T>> k(float f10, float f11, @NotNull List<C2041i2<T>> list) {
        IntervalTree<T>.a aVar = this.f100718b;
        if (aVar != this.f100717a) {
            ArrayList<IntervalTree<T>.a> arrayList = this.f100719c;
            arrayList.add(aVar);
            while (arrayList.size() > 0) {
                a aVar2 = (a) kotlin.collections.N.Q0(arrayList);
                if (aVar2.e(f10, f11)) {
                    list.add(aVar2);
                }
                IntervalTree<T>.a aVar3 = aVar2.f100723g;
                if (aVar3 != this.f100717a && aVar3.f100722f >= f10) {
                    arrayList.add(aVar3);
                }
                IntervalTree<T>.a aVar4 = aVar2.f100724h;
                if (aVar4 != this.f100717a && aVar4.f100721e <= f11) {
                    arrayList.add(aVar4);
                }
            }
            arrayList.clear();
        }
        return list;
    }

    @NotNull
    public final List<C2041i2<T>> l(@NotNull md.f<Float> fVar, @NotNull List<C2041i2<T>> list) {
        k(fVar.b().floatValue(), fVar.h().floatValue(), list);
        return list;
    }

    public final void o(float f10, float f11, @NotNull ed.l<? super C2041i2<T>, kotlin.L0> lVar) {
        IntervalTree<T>.a aVar = this.f100718b;
        if (aVar != this.f100717a) {
            ArrayList<IntervalTree<T>.a> arrayList = this.f100719c;
            arrayList.add(aVar);
            while (arrayList.size() > 0) {
                a aVar2 = (a) kotlin.collections.N.Q0(arrayList);
                if (aVar2.e(f10, f11)) {
                    lVar.invoke(aVar2);
                }
                IntervalTree<T>.a aVar3 = aVar2.f100723g;
                if (aVar3 != this.f100717a && aVar3.f100722f >= f10) {
                    arrayList.add(aVar3);
                }
                IntervalTree<T>.a aVar4 = aVar2.f100724h;
                if (aVar4 != this.f100717a && aVar4.f100721e <= f11) {
                    arrayList.add(aVar4);
                }
            }
            arrayList.clear();
        }
    }

    public final void p(@NotNull md.f<Float> fVar, @NotNull ed.l<? super C2041i2<T>, kotlin.L0> lVar) {
        float fFloatValue = fVar.b().floatValue();
        float fFloatValue2 = fVar.h().floatValue();
        IntervalTree<T>.a aVar = this.f100718b;
        if (aVar != this.f100717a) {
            ArrayList<IntervalTree<T>.a> arrayList = this.f100719c;
            arrayList.add(aVar);
            while (arrayList.size() > 0) {
                a aVar2 = (a) kotlin.collections.N.Q0(arrayList);
                if (aVar2.e(fFloatValue, fFloatValue2)) {
                    lVar.invoke(aVar2);
                }
                IntervalTree<T>.a aVar3 = aVar2.f100723g;
                if (aVar3 != this.f100717a && aVar3.f100722f >= fFloatValue) {
                    arrayList.add(aVar3);
                }
                IntervalTree<T>.a aVar4 = aVar2.f100724h;
                if (aVar4 != this.f100717a && aVar4.f100721e <= fFloatValue2) {
                    arrayList.add(aVar4);
                }
            }
            arrayList.clear();
        }
    }

    @NotNull
    public final Iterator<C2041i2<T>> r() {
        return new b(this);
    }

    public final void s(@NotNull C2041i2<T> c2041i2) {
        d(c2041i2.f101127a, c2041i2.f101128b, c2041i2.f101129c);
    }

    public final void t(IntervalTree<T>.a aVar) {
        IntervalTree<T>.a aVar2;
        while (true) {
            aVar2 = this.f100718b;
            if (aVar == aVar2) {
                break;
            }
            IntervalTree<T>.a aVar3 = aVar.f100725i;
            TreeColor treeColor = aVar3.f100720d;
            TreeColor treeColor2 = TreeColor.Red;
            if (treeColor != treeColor2) {
                break;
            }
            IntervalTree<T>.a aVar4 = aVar3.f100725i;
            IntervalTree<T>.a aVar5 = aVar4.f100723g;
            if (aVar3 == aVar5) {
                IntervalTree<T>.a aVar6 = aVar4.f100724h;
                if (aVar6.f100720d == treeColor2) {
                    TreeColor treeColor3 = TreeColor.Black;
                    aVar6.f100720d = treeColor3;
                    aVar3.f100720d = treeColor3;
                    aVar4.f100720d = treeColor2;
                    aVar = aVar4;
                } else {
                    if (aVar == aVar3.f100724h) {
                        u(aVar3);
                        aVar = aVar3;
                    }
                    aVar.f100725i.f100720d = TreeColor.Black;
                    aVar4.f100720d = treeColor2;
                    v(aVar4);
                }
            } else if (aVar5.f100720d == treeColor2) {
                TreeColor treeColor4 = TreeColor.Black;
                aVar5.f100720d = treeColor4;
                aVar3.f100720d = treeColor4;
                aVar4.f100720d = treeColor2;
                aVar = aVar4;
            } else {
                if (aVar == aVar3.f100723g) {
                    v(aVar3);
                    aVar = aVar3;
                }
                aVar.f100725i.f100720d = TreeColor.Black;
                aVar4.f100720d = treeColor2;
                u(aVar4);
            }
        }
        aVar2.f100720d = TreeColor.Black;
    }

    public final void u(IntervalTree<T>.a aVar) {
        IntervalTree<T>.a aVar2 = aVar.f100724h;
        IntervalTree<T>.a aVar3 = aVar2.f100723g;
        aVar.f100724h = aVar3;
        IntervalTree<T>.a aVar4 = this.f100717a;
        if (aVar3 != aVar4) {
            aVar3.f100725i = aVar;
        }
        aVar2.f100725i = aVar.f100725i;
        IntervalTree<T>.a aVar5 = aVar.f100725i;
        if (aVar5 == aVar4) {
            this.f100718b = aVar2;
        } else if (aVar5.f100723g == aVar) {
            aVar5.f100723g = aVar2;
        } else {
            aVar5.f100724h = aVar2;
        }
        aVar2.f100723g = aVar;
        aVar.f100725i = aVar2;
        w(aVar);
    }

    public final void v(IntervalTree<T>.a aVar) {
        IntervalTree<T>.a aVar2 = aVar.f100723g;
        IntervalTree<T>.a aVar3 = aVar2.f100724h;
        aVar.f100723g = aVar3;
        IntervalTree<T>.a aVar4 = this.f100717a;
        if (aVar3 != aVar4) {
            aVar3.f100725i = aVar;
        }
        aVar2.f100725i = aVar.f100725i;
        IntervalTree<T>.a aVar5 = aVar.f100725i;
        if (aVar5 == aVar4) {
            this.f100718b = aVar2;
        } else if (aVar5.f100724h == aVar) {
            aVar5.f100724h = aVar2;
        } else {
            aVar5.f100723g = aVar2;
        }
        aVar2.f100724h = aVar;
        aVar.f100725i = aVar2;
        w(aVar);
    }

    public final void w(IntervalTree<T>.a aVar) {
        while (aVar != this.f100717a) {
            aVar.f100721e = Math.min(aVar.f101127a, Math.min(aVar.f100723g.f100721e, aVar.f100724h.f100721e));
            aVar.f100722f = Math.max(aVar.f101128b, Math.max(aVar.f100723g.f100722f, aVar.f100724h.f100722f));
            aVar = aVar.f100725i;
        }
    }
}
