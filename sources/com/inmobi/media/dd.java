package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public abstract class dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f152824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Xc f152825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f152826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte f152827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final N4 f152828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f152829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f152830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f152831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f152832i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Zc f152833j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final kotlin.G f152834k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kotlin.G f152835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f152836m;

    public dd(Xc visibilityChecker, byte b10, N4 n42) {
        kotlin.jvm.internal.G.p(visibilityChecker, "visibilityChecker");
        WeakHashMap weakHashMap = new WeakHashMap(10);
        Handler handler = new Handler(Looper.getMainLooper());
        this.f152824a = weakHashMap;
        this.f152825b = visibilityChecker;
        this.f152826c = handler;
        this.f152827d = b10;
        this.f152828e = n42;
        this.f152829f = 50;
        this.f152830g = new ArrayList(50);
        this.f152832i = new AtomicBoolean(true);
        this.f152834k = kotlin.I.a(new bd(this));
        this.f152835l = kotlin.I.a(new cd(this));
    }

    public final void a(View view, Object obj, int i10) {
        kotlin.jvm.internal.G.p(view, "view");
        N4 n42 = this.f152828e;
        if (n42 != null) {
            ((O4) n42).c("VisibilityTracker", "add view to tracker - minPercent - " + i10 + GlideException.a.f139488d + this);
        }
        ad adVar = (ad) this.f152824a.get(view);
        if (adVar == null) {
            adVar = new ad();
            this.f152824a.put(view, adVar);
            this.f152831h++;
        }
        adVar.f152710a = i10;
        long j10 = this.f152831h;
        adVar.f152711b = j10;
        adVar.f152712c = view;
        adVar.f152713d = obj;
        long j11 = this.f152829f;
        if (j10 % j11 == 0) {
            long j12 = j10 - j11;
            for (Map.Entry entry : this.f152824a.entrySet()) {
                View view2 = (View) entry.getKey();
                if (((ad) entry.getValue()).f152711b < j12) {
                    this.f152830g.add(view2);
                }
            }
            ArrayList arrayList = this.f152830g;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj2 = arrayList.get(i11);
                i11++;
                View view3 = (View) obj2;
                kotlin.jvm.internal.G.m(view3);
                a(view3);
            }
            this.f152830g.clear();
        }
        if (this.f152824a.size() == 1) {
            f();
        }
    }

    public void b() {
        N4 n42 = this.f152828e;
        if (n42 != null) {
            ((O4) n42).c("VisibilityTracker", "destroy " + this);
        }
        a();
        this.f152833j = null;
        this.f152832i.set(true);
    }

    public abstract int c();

    public abstract void d();

    public void e() {
        N4 n42 = this.f152828e;
        if (n42 != null) {
            ((O4) n42).c("VisibilityTracker", "pause " + this);
        }
        ((Yc) this.f152834k.getValue()).run();
        this.f152826c.removeCallbacksAndMessages(null);
        this.f152836m = false;
        this.f152832i.set(true);
    }

    public void f() {
        N4 n42 = this.f152828e;
        if (n42 != null) {
            ((O4) n42).c("VisibilityTracker", "resume " + this);
        }
        this.f152832i.set(false);
        g();
    }

    public final void g() {
        toString();
        if (this.f152836m || this.f152832i.get()) {
            return;
        }
        this.f152836m = true;
        int i10 = T3.f152448a;
        ((ScheduledThreadPoolExecutor) T3.f152450c.getValue()).schedule((Runnable) this.f152835l.getValue(), c(), TimeUnit.MILLISECONDS);
    }

    public final void a(View view) {
        kotlin.jvm.internal.G.p(view, "view");
        N4 n42 = this.f152828e;
        if (n42 != null) {
            ((O4) n42).c("VisibilityTracker", "removed view from tracker " + this);
        }
        if (((ad) this.f152824a.remove(view)) != null) {
            this.f152831h--;
            if (this.f152824a.isEmpty()) {
                e();
            }
        }
    }

    public final void a() {
        N4 n42 = this.f152828e;
        if (n42 != null) {
            ((O4) n42).c("VisibilityTracker", "clear " + this);
        }
        this.f152824a.clear();
        this.f152826c.removeMessages(0);
        this.f152836m = false;
    }
}
