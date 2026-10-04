package com.iab.omid.library.bytedance2.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.bytedance2.processor.a;
import com.iab.omid.library.bytedance2.utils.f;
import com.iab.omid.library.bytedance2.utils.h;
import com.iab.omid.library.bytedance2.walking.a;
import e.f0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class TreeWalker implements a.InterfaceC0525a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f151357i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f151358j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f151359k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f151360l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f151361m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f151363b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f151369h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f151362a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f151364c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.bytedance2.weakreference.a> f151365d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.a f151367f = new com.iab.omid.library.bytedance2.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.processor.b f151366e = new com.iab.omid.library.bytedance2.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.b f151368g = new com.iab.omid.library.bytedance2.walking.b(new com.iab.omid.library.bytedance2.walking.async.c());

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
            TreeWalker.this.f151368g.b();
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
            if (TreeWalker.f151359k != null) {
                TreeWalker.f151359k.post(TreeWalker.f151360l);
                TreeWalker.f151359k.postDelayed(TreeWalker.f151361m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f151369h);
    }

    private void e() {
        this.f151363b = 0;
        this.f151365d.clear();
        this.f151364c = false;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f151364c = true;
                break;
            }
        }
        this.f151369h = f.b();
    }

    public static TreeWalker getInstance() {
        return f151357i;
    }

    private void i() {
        if (f151359k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f151359k = handler;
            handler.post(f151360l);
            f151359k.postDelayed(f151361m, 200L);
        }
    }

    private void k() {
        Handler handler = f151359k;
        if (handler != null) {
            handler.removeCallbacks(f151361m);
            f151359k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f151362a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f151362a.add(treeWalkerTimeLogger);
    }

    @f0
    public void f() {
        TreeWalker treeWalker;
        this.f151367f.e();
        long jB = f.b();
        com.iab.omid.library.bytedance2.processor.a aVarA = this.f151366e.a();
        if (this.f151367f.b().size() > 0) {
            for (String str : this.f151367f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f151367f.a(str), jSONObjectA);
                com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f151368g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f151367f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA2);
            treeWalker.f151368g.b(jSONObjectA2, treeWalker.f151367f.c(), jB);
            if (treeWalker.f151364c) {
                Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f151365d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f151368g.b();
        }
        treeWalker.f151367f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f151362a.clear();
        f151358j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f151362a.contains(treeWalkerTimeLogger)) {
            this.f151362a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f151362a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f151362a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f151363b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f151363b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strD = this.f151367f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, strD);
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, Boolean.valueOf(this.f151367f.f(view)));
        this.f151367f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.bytedance2.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.bytedance2.processor.a.InterfaceC0525a
    public void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.bytedance2.walking.c cVarE;
        TreeWalker treeWalker;
        if (h.d(view) && (cVarE = this.f151367f.e(view)) != com.iab.omid.library.bytedance2.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f151364c && cVarE == com.iab.omid.library.bytedance2.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f151365d.add(new com.iab.omid.library.bytedance2.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarE, z11);
            }
            treeWalker.f151363b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.bytedance2.processor.a aVarB = this.f151366e.b();
        String strB = this.f151367f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0527a c0527aC = this.f151367f.c(view);
        if (c0527aC == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, c0527aC);
        return true;
    }
}
