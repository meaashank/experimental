package com.mbridge.msdk.tracker;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f160114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f160115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f160116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f160117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f160118e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f160122i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private HandlerThread f160123j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicInteger f160119f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicInteger f160120g = new AtomicInteger(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f160121h = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f160124k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f160125l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile boolean f160126m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f160127n = false;

    public s(k kVar) {
        this.f160114a = kVar.e();
        this.f160115b = kVar.j();
        this.f160116c = kVar.m();
        this.f160117d = kVar.k();
        this.f160118e = kVar;
    }

    private void m() {
        this.f160114a.c();
    }

    public void k() {
        HandlerThread handlerThread = new HandlerThread("report_timer");
        this.f160123j = handlerThread;
        handlerThread.start();
        b bVar = new b(this.f160123j.getLooper(), this);
        this.f160122i = bVar;
        bVar.sendMessageDelayed(Message.obtain(bVar, 5), 5000L);
        Handler handler = this.f160122i;
        handler.sendMessageDelayed(Message.obtain(handler, 1), this.f160116c);
        this.f160124k = false;
    }

    public void l() {
        synchronized (this.f160121h) {
            try {
                if (!this.f160126m) {
                    this.f160126m = true;
                    m();
                }
                if (!this.f160127n) {
                    this.f160127n = true;
                    this.f160120g.addAndGet(this.f160114a.b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private List<i> c() {
        return this.f160114a.a(this.f160115b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d() {
        return this.f160119f.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        List<i> listC = c();
        if (y.b((List<?>) listC)) {
            if (com.mbridge.msdk.tracker.a.f159874a) {
                Log.d("TrackManager", this.f160118e.w() + " report: 没有可以上报的数据");
                return;
            }
            return;
        }
        a(listC);
        int size = listC.size();
        this.f160120g.addAndGet(-size);
        boolean zA = false;
        if (com.mbridge.msdk.tracker.a.f159874a) {
            Log.d("TrackManager", this.f160118e.w() + " report: 上报的数量 = " + size + " 当前剩余事件数 = " + this.f160120g.addAndGet(0) + " 数据库中剩余事件数 = " + this.f160114a.b());
        }
        try {
            zA = this.f160118e.a();
        } catch (IllegalStateException e10) {
            if (com.mbridge.msdk.tracker.a.f159874a) {
                Log.e("TrackManager", this.f160118e.w() + " report environment check failed ", e10);
            }
        }
        if (!zA) {
            if (com.mbridge.msdk.tracker.a.f159874a) {
                Log.e("TrackManager", this.f160118e.w() + " report 失败，请检查 TrackConfig 配置是否正确");
                return;
            }
            return;
        }
        o oVarN = this.f160118e.n();
        oVarN.a(new a(this.f160122i, this));
        Map<String, String> map = new HashMap<>();
        try {
            map = this.f160118e.g().a(this.f160118e.v(), listC, this.f160118e.p());
        } catch (Exception e11) {
            if (com.mbridge.msdk.tracker.a.f159874a) {
                Log.e("TrackManager", this.f160118e.w() + " report decorate request params failed ", e11);
            }
        }
        oVarN.b(new t(listC), map, y.a(listC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f160119f.set(0);
    }

    public void b() {
        this.f160122i.removeMessages(1);
        Handler handler = this.f160122i;
        handler.sendMessage(Message.obtain(handler, 7));
    }

    public void e() {
        this.f160120g.incrementAndGet();
    }

    public boolean f() {
        return this.f160120g.addAndGet(0) >= this.f160115b;
    }

    public boolean g() {
        return this.f160124k;
    }

    public void j() {
        this.f160124k = true;
        this.f160122i.removeMessages(1);
        this.f160122i.removeMessages(5);
        this.f160123j.quitSafely();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<i> list) {
        if (y.b((List<?>) list)) {
            return;
        }
        this.f160114a.c(list);
    }

    public void a(e eVar) {
        if (this.f160122i.hasMessages(6)) {
            return;
        }
        long jA = y.a(this.f160119f.get(), this.f160125l, this.f160116c);
        if (jA > this.f160116c) {
            Handler handler = this.f160122i;
            handler.sendMessageDelayed(Message.obtain(handler, 6, eVar), (long) (jA * 0.1f));
        } else {
            Handler handler2 = this.f160122i;
            handler2.sendMessage(Message.obtain(handler2, 6, eVar));
        }
    }

    public static final class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s f160130a;

        public b(Looper looper, s sVar) {
            super(looper);
            this.f160130a = sVar;
        }

        private void a(String str) {
            StringBuilder sb2 = new StringBuilder();
            androidx.concurrent.futures.b.a(sb2, this.f160130a.f160118e.w(), C4.q.f17581a, str);
            sb2.append(this.f160130a.f160120g.addAndGet(0));
            sb2.append(" 数据库记录数：");
            sb2.append(this.f160130a.f160114a.b());
            Log.d("TrackManager", sb2.toString());
        }

        private void b() {
            try {
                removeMessages(1);
                removeMessages(6);
                removeMessages(2);
                removeMessages(3);
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f159874a) {
                    Log.e("TrackManager", this.f160130a.f160118e.w() + " removeMessages failed ", e10);
                }
            }
            if (this.f160130a.g()) {
                return;
            }
            try {
                sendMessageDelayed(Message.obtain(this, 1), y.a(this.f160130a.f160119f.get(), this.f160130a.f160125l, this.f160130a.f160116c));
            } catch (Exception e11) {
                if (com.mbridge.msdk.tracker.a.f159874a) {
                    Log.e("TrackManager", this.f160130a.f160118e.w() + " sendMessageDelayed failed ", e11);
                }
            }
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            int i10 = message.what;
            if (i10 == 2 || i10 == 3) {
                b();
                if (com.mbridge.msdk.tracker.a.f159874a) {
                    a("触发上报（report result）当前 Event 数量：");
                }
                a();
                return;
            }
            if (i10 == 5) {
                if (com.mbridge.msdk.tracker.a.f159874a) {
                    a("触发删除 当前 Event 数量：");
                }
                this.f160130a.a();
                sendMessageDelayed(Message.obtain(this, 5), 120000L);
                return;
            }
            if (i10 != 6) {
                if (i10 != 7) {
                    b();
                    if (com.mbridge.msdk.tracker.a.f159874a) {
                        a("触发上报（timer）当前 Event 数量：");
                    }
                    a();
                    return;
                }
                this.f160130a.l();
                b();
                if (com.mbridge.msdk.tracker.a.f159874a) {
                    a("触发上报（flush）当前 Event 数量：");
                }
                a();
                return;
            }
            Object obj = message.obj;
            e eVar = obj instanceof e ? (e) obj : null;
            if (com.mbridge.msdk.tracker.a.f159874a && !y.b(eVar)) {
                a(String.format("收到 Event( %s )，当前 Event 数量：", eVar.g()));
            }
            if (y.a(eVar) || this.f160130a.f()) {
                b();
                if (com.mbridge.msdk.tracker.a.f159874a) {
                    a("触发上报（notice check）当前 Event 数量：");
                }
                a();
            }
        }

        private synchronized void a() {
            try {
                this.f160130a.h();
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f159874a) {
                    Log.e("TrackManager", this.f160130a.f160118e.w() + " report failed ", e10);
                }
            }
        }
    }

    public static final class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f160128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s f160129b;

        public a(Handler handler, s sVar) {
            this.f160128a = handler;
            this.f160129b = sVar;
        }

        @Override // com.mbridge.msdk.tracker.r
        public void a(t tVar) {
            this.f160129b.b(tVar.a());
            this.f160129b.i();
            this.f160129b.f160125l = 0L;
            if (this.f160129b.f()) {
                Handler handler = this.f160128a;
                handler.sendMessage(Message.obtain(handler, 2));
            }
            if (com.mbridge.msdk.tracker.a.f159874a) {
                Log.d("TrackManager", this.f160129b.f160118e.w() + " report success " + tVar.a().size() + " 剩余事件数：" + this.f160129b.f160120g.addAndGet(0) + " 个，数据库记录数：" + this.f160129b.f160114a.b() + " 个");
            }
        }

        @Override // com.mbridge.msdk.tracker.r
        public void a(t tVar, int i10, String str) {
            this.f160129b.a(tVar.a(), str);
            this.f160129b.f160125l = System.currentTimeMillis();
            int iD = this.f160129b.d();
            if (iD <= 10) {
                this.f160128a.removeMessages(3);
                Handler handler = this.f160128a;
                handler.sendMessageDelayed(Message.obtain(handler, 3), ((long) iD) * 1000);
            }
            if (com.mbridge.msdk.tracker.a.f159874a) {
                Log.d("TrackManager", this.f160129b.f160118e.w() + " report failed " + tVar.a().size() + " 剩余事件数：" + this.f160129b.f160120g.addAndGet(0) + " 个，数据库记录数：" + this.f160129b.f160114a.b() + " 个 连续失败次数： " + iD);
            }
        }
    }

    private void a(List<i> list) {
        this.f160114a.b(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (com.mbridge.msdk.tracker.a.f159874a) {
            return;
        }
        int iA = this.f160114a.a();
        if (com.mbridge.msdk.tracker.a.f159874a) {
            Log.d("TrackManager", this.f160118e.w() + " 删除无效数据的数量 = " + iA + " 当前剩余事件数 = " + this.f160120g.addAndGet(0) + " 数据库中剩余事件数 = " + this.f160114a.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<i> list, String str) {
        if (y.b((List<?>) list)) {
            return;
        }
        int i10 = 0;
        for (i iVar : list) {
            if (!y.b(iVar)) {
                boolean z10 = !iVar.l() && iVar.h() >= this.f160117d;
                boolean z11 = !iVar.m() && iVar.g() < System.currentTimeMillis();
                if (!z10 && !z11) {
                    iVar.a(iVar.h() + 1);
                    iVar.b(3);
                    iVar.a(str);
                    i10++;
                } else {
                    iVar.b(-1);
                }
            }
        }
        this.f160114a.a(list);
        this.f160120g.addAndGet(i10);
    }
}
