package androidx.constraintlayout.core.widgets.analyzer;

import i.C4541d;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f106323h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f106324i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f106325j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f106326k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WidgetRun f106329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WidgetRun f106330d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f106332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f106333g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106327a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f106328b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<WidgetRun> f106331e = new ArrayList<>();

    public l(WidgetRun widgetRun, int i10) {
        this.f106329c = null;
        this.f106330d = null;
        int i11 = f106326k;
        this.f106332f = i11;
        f106326k = i11 + 1;
        this.f106329c = widgetRun;
        this.f106330d = widgetRun;
        this.f106333g = i10;
    }

    public void a(WidgetRun widgetRun) {
        this.f106331e.add(widgetRun);
        this.f106330d = widgetRun;
    }

    public long b(androidx.constraintlayout.core.widgets.d dVar, int i10) {
        WidgetRun widgetRun = this.f106329c;
        if (!(widgetRun instanceof c) ? i10 != 0 ? (widgetRun instanceof m) : (widgetRun instanceof k) : ((c) widgetRun).f106270f == i10) {
            return 0L;
        }
        DependencyNode dependencyNode = (i10 == 0 ? dVar.f106197e : dVar.f106199f).f106272h;
        DependencyNode dependencyNode2 = (i10 == 0 ? dVar.f106197e : dVar.f106199f).f106273i;
        boolean zContains = widgetRun.f106272h.f106264l.contains(dependencyNode);
        boolean zContains2 = this.f106329c.f106273i.f106264l.contains(dependencyNode2);
        long j10 = this.f106329c.j();
        if (!zContains || !zContains2) {
            if (zContains) {
                return Math.max(f(this.f106329c.f106272h, r12.f106258f), ((long) this.f106329c.f106272h.f106258f) + j10);
            }
            if (zContains2) {
                return Math.max(-e(this.f106329c.f106273i, r12.f106258f), ((long) (-this.f106329c.f106273i.f106258f)) + j10);
            }
            WidgetRun widgetRun2 = this.f106329c;
            return (widgetRun2.j() + ((long) widgetRun2.f106272h.f106258f)) - ((long) this.f106329c.f106273i.f106258f);
        }
        long jF = f(this.f106329c.f106272h, 0L);
        long jE = e(this.f106329c.f106273i, 0L);
        long j11 = jF - j10;
        WidgetRun widgetRun3 = this.f106329c;
        int i11 = widgetRun3.f106273i.f106258f;
        if (j11 >= (-i11)) {
            j11 += (long) i11;
        }
        long j12 = widgetRun3.f106272h.f106258f;
        long j13 = ((-jE) - j10) - j12;
        if (j13 >= j12) {
            j13 -= j12;
        }
        float fU = widgetRun3.f106266b.u(i10);
        float f10 = fU > 0.0f ? (long) ((j11 / (1.0f - fU)) + (j13 / fU)) : 0L;
        long jA = ((long) ((f10 * fU) + 0.5f)) + j10 + ((long) C4541d.a(1.0f, fU, f10, 0.5f));
        WidgetRun widgetRun4 = this.f106329c;
        return (((long) widgetRun4.f106272h.f106258f) + jA) - ((long) widgetRun4.f106273i.f106258f);
    }

    public final boolean c(WidgetRun widgetRun, int i10) {
        DependencyNode dependencyNode;
        WidgetRun widgetRun2;
        DependencyNode dependencyNode2;
        WidgetRun widgetRun3;
        if (!widgetRun.f106266b.f106201g[i10]) {
            return false;
        }
        for (d dVar : widgetRun.f106272h.f106263k) {
            if ((dVar instanceof DependencyNode) && (widgetRun3 = (dependencyNode2 = (DependencyNode) dVar).f106256d) != widgetRun && dependencyNode2 == widgetRun3.f106272h) {
                if (widgetRun instanceof c) {
                    ArrayList<WidgetRun> arrayList = ((c) widgetRun).f106300k;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        WidgetRun widgetRun4 = arrayList.get(i11);
                        i11++;
                        c(widgetRun4, i10);
                    }
                } else if (!(widgetRun instanceof j)) {
                    widgetRun.f106266b.f106201g[i10] = false;
                }
                c(dependencyNode2.f106256d, i10);
            }
        }
        for (d dVar2 : widgetRun.f106273i.f106263k) {
            if ((dVar2 instanceof DependencyNode) && (widgetRun2 = (dependencyNode = (DependencyNode) dVar2).f106256d) != widgetRun && dependencyNode == widgetRun2.f106272h) {
                if (widgetRun instanceof c) {
                    ArrayList<WidgetRun> arrayList2 = ((c) widgetRun).f106300k;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        WidgetRun widgetRun5 = arrayList2.get(i12);
                        i12++;
                        c(widgetRun5, i10);
                    }
                } else if (!(widgetRun instanceof j)) {
                    widgetRun.f106266b.f106201g[i10] = false;
                }
                c(dependencyNode.f106256d, i10);
            }
        }
        return false;
    }

    public void d(boolean z10, boolean z11) {
        if (z10) {
            WidgetRun widgetRun = this.f106329c;
            if (widgetRun instanceof k) {
                c(widgetRun, 0);
            }
        }
        if (z11) {
            WidgetRun widgetRun2 = this.f106329c;
            if (widgetRun2 instanceof m) {
                c(widgetRun2, 1);
            }
        }
    }

    public final long e(DependencyNode dependencyNode, long j10) {
        WidgetRun widgetRun = dependencyNode.f106256d;
        if (widgetRun instanceof j) {
            return j10;
        }
        int size = dependencyNode.f106263k.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = dependencyNode.f106263k.get(i10);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.f106256d != widgetRun) {
                    jMin = Math.min(jMin, e(dependencyNode2, ((long) dependencyNode2.f106258f) + j10));
                }
            }
        }
        if (dependencyNode != widgetRun.f106273i) {
            return jMin;
        }
        long j11 = j10 - widgetRun.j();
        return Math.min(Math.min(jMin, e(widgetRun.f106272h, j11)), j11 - ((long) widgetRun.f106272h.f106258f));
    }

    public final long f(DependencyNode dependencyNode, long j10) {
        WidgetRun widgetRun = dependencyNode.f106256d;
        if (widgetRun instanceof j) {
            return j10;
        }
        int size = dependencyNode.f106263k.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = dependencyNode.f106263k.get(i10);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.f106256d != widgetRun) {
                    jMax = Math.max(jMax, f(dependencyNode2, ((long) dependencyNode2.f106258f) + j10));
                }
            }
        }
        if (dependencyNode != widgetRun.f106272h) {
            return jMax;
        }
        long j11 = j10 + widgetRun.j();
        return Math.max(Math.max(jMax, f(widgetRun.f106273i, j11)), j11 - ((long) widgetRun.f106273i.f106258f));
    }
}
