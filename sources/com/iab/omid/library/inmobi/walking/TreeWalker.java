package com.iab.omid.library.inmobi.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.inmobi.processor.a;
import com.iab.omid.library.inmobi.utils.f;
import com.iab.omid.library.inmobi.utils.h;
import com.iab.omid.library.inmobi.walking.a;
import e.f0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class TreeWalker implements a.InterfaceC0529a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f151486i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f151487j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f151488k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f151489l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f151490m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f151492b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f151498h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f151491a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f151493c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.inmobi.weakreference.a> f151494d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.inmobi.walking.a f151496f = new com.iab.omid.library.inmobi.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.inmobi.processor.b f151495e = new com.iab.omid.library.inmobi.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.inmobi.walking.b f151497g = new com.iab.omid.library.inmobi.walking.b(new com.iab.omid.library.inmobi.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f151497g.b();
        }
    }

    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().l();
        }
    }

    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f151488k != null) {
                TreeWalker.f151488k.post(TreeWalker.f151489l);
                TreeWalker.f151488k.postDelayed(TreeWalker.f151490m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f151498h);
    }

    private void e() {
        this.f151492b = 0;
        this.f151494d.clear();
        this.f151493c = false;
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = com.iab.omid.library.inmobi.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f151493c = true;
                break;
            }
        }
        this.f151498h = f.b();
    }

    public static TreeWalker getInstance() {
        return f151486i;
    }

    private void i() {
        if (f151488k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f151488k = handler;
            handler.post(f151489l);
            f151488k.postDelayed(f151490m, 200L);
        }
    }

    private void k() {
        Handler handler = f151488k;
        if (handler != null) {
            handler.removeCallbacks(f151490m);
            f151488k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f151491a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f151491a.add(treeWalkerTimeLogger);
    }

    @f0
    public void f() {
        TreeWalker treeWalker;
        this.f151496f.e();
        long jB = f.b();
        com.iab.omid.library.inmobi.processor.a aVarA = this.f151495e.a();
        if (this.f151496f.b().size() > 0) {
            for (String str : this.f151496f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f151496f.a(str), jSONObjectA);
                com.iab.omid.library.inmobi.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f151497g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f151496f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.inmobi.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.inmobi.utils.c.b(jSONObjectA2);
            treeWalker.f151497g.b(jSONObjectA2, treeWalker.f151496f.c(), jB);
            if (treeWalker.f151493c) {
                Iterator<com.iab.omid.library.inmobi.adsession.a> it = com.iab.omid.library.inmobi.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f151494d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f151497g.b();
        }
        treeWalker.f151496f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f151491a.clear();
        f151487j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f151491a.contains(treeWalkerTimeLogger)) {
            this.f151491a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f151491a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f151491a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f151492b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f151492b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strD = this.f151496f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, strD);
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, Boolean.valueOf(this.f151496f.f(view)));
        this.f151496f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.inmobi.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.inmobi.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.inmobi.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.inmobi.processor.a.InterfaceC0529a
    public void a(View view, com.iab.omid.library.inmobi.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.inmobi.walking.c cVarE;
        TreeWalker treeWalker;
        if (h.d(view) && (cVarE = this.f151496f.e(view)) != com.iab.omid.library.inmobi.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.inmobi.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f151493c && cVarE == com.iab.omid.library.inmobi.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f151494d.add(new com.iab.omid.library.inmobi.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarE, z11);
            }
            treeWalker.f151492b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.inmobi.processor.a aVarB = this.f151495e.b();
        String strB = this.f151496f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.inmobi.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.inmobi.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.inmobi.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0531a c0531aC = this.f151496f.c(view);
        if (c0531aC == null) {
            return false;
        }
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, c0531aC);
        return true;
    }
}
