package com.iab.omid.library.mmadbridge.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.mmadbridge.internal.j;
import com.iab.omid.library.mmadbridge.processor.a;
import com.iab.omid.library.mmadbridge.utils.f;
import com.iab.omid.library.mmadbridge.utils.h;
import com.iab.omid.library.mmadbridge.walking.a;
import e.f0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class TreeWalker implements a.InterfaceC0533a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f151620i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f151621j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f151622k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f151623l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f151624m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f151626b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f151632h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f151625a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f151627c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.mmadbridge.weakreference.a> f151628d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.walking.a f151630f = new com.iab.omid.library.mmadbridge.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.processor.b f151629e = new com.iab.omid.library.mmadbridge.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.walking.b f151631g = new com.iab.omid.library.mmadbridge.walking.b(new com.iab.omid.library.mmadbridge.walking.async.c());

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
            TreeWalker.this.f151631g.b();
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
            if (TreeWalker.f151622k != null) {
                TreeWalker.f151622k.post(TreeWalker.f151623l);
                TreeWalker.f151622k.postDelayed(TreeWalker.f151624m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f151632h);
    }

    private void e() {
        this.f151626b = 0;
        this.f151628d.clear();
        this.f151627c = false;
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = com.iab.omid.library.mmadbridge.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f151627c = true;
                break;
            }
        }
        this.f151632h = f.b();
    }

    public static TreeWalker getInstance() {
        return f151620i;
    }

    private void i() {
        if (f151622k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f151622k = handler;
            handler.post(f151623l);
            f151622k.postDelayed(f151624m, 200L);
        }
    }

    private void k() {
        Handler handler = f151622k;
        if (handler != null) {
            handler.removeCallbacks(f151624m);
            f151622k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        j.b().a();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f151625a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f151625a.add(treeWalkerTimeLogger);
    }

    @f0
    public void f() {
        TreeWalker treeWalker;
        this.f151630f.e();
        long jB = f.b();
        com.iab.omid.library.mmadbridge.processor.a aVarA = this.f151629e.a();
        if (this.f151630f.b().size() > 0) {
            for (String str : this.f151630f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f151630f.a(str), jSONObjectA);
                com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f151631g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f151630f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.mmadbridge.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA2);
            treeWalker.f151631g.b(jSONObjectA2, treeWalker.f151630f.c(), jB);
            if (treeWalker.f151627c) {
                Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = com.iab.omid.library.mmadbridge.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f151628d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f151631g.b();
        }
        treeWalker.f151630f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f151625a.clear();
        f151621j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f151625a.contains(treeWalkerTimeLogger)) {
            this.f151625a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f151625a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f151625a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f151626b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f151626b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f151630f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, strC);
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, Boolean.valueOf(this.f151630f.e(view)));
        com.iab.omid.library.mmadbridge.utils.c.b(jSONObject, Boolean.valueOf(this.f151630f.c(strC)));
        this.f151630f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.mmadbridge.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.mmadbridge.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.mmadbridge.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.mmadbridge.processor.a.InterfaceC0533a
    public void a(View view, com.iab.omid.library.mmadbridge.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.mmadbridge.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f151630f.d(view)) != com.iab.omid.library.mmadbridge.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f151627c && cVarD == com.iab.omid.library.mmadbridge.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f151628d.add(new com.iab.omid.library.mmadbridge.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f151626b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.mmadbridge.processor.a aVarB = this.f151629e.b();
        String strB = this.f151630f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0535a c0535aB = this.f151630f.b(view);
        if (c0535aB == null) {
            return false;
        }
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, c0535aB);
        return true;
    }
}
