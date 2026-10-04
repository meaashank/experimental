package com.mbridge.msdk.config.component.midi.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import androidx.appcompat.widget.e0;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.config.component.common.express.node.m;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f154673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f154674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f154675c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f154679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HandlerThread f154680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Runnable f154681i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f154682j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.config.component.midi.monitor.a f154683k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f154685m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f154676d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f154677e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f154678f = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f154684l = 0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f154683k != null) {
                c.this.f154683k.a("Video first frame render timeout : " + c.this.f154674b + "ms");
            }
            c.this.h();
        }
    }

    public c(int i10, String str) {
        this.f154673a = 3;
        this.f154685m = str;
        this.f154674b = i10 > 0 ? i10 : e0.f86341n;
        this.f154673a = i10 / 1000;
        try {
            HandlerThread handlerThread = new HandlerThread("PlayerComponentThread");
            this.f154680h = handlerThread;
            handlerThread.start();
            this.f154679g = new Handler(this.f154680h.getLooper());
            d();
        } catch (Exception e10) {
            q0.b("MonitorPlayerTimeout", "初始化MonitorPlayerTimeout失败：" + e10.getMessage());
            this.f154679g = new Handler(Looper.getMainLooper());
            d();
        }
    }

    private void d() {
        this.f154681i = new a();
        this.f154682j = new b();
    }

    public boolean e() {
        return this.f154676d;
    }

    public void f() {
        Runnable runnable;
        if (!this.f154676d || this.f154678f) {
            return;
        }
        this.f154678f = true;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f154675c;
        q0.c("MonitorPlayerTimeout", "第一帧播放完成，耗时：" + jCurrentTimeMillis + "ms");
        Handler handler = this.f154679g;
        if (handler != null && (runnable = this.f154682j) != null) {
            handler.removeCallbacks(runnable);
        }
        if (jCurrentTimeMillis > this.f154674b) {
            q0.d("MonitorPlayerTimeout", "播放超时，但第一帧已播放，耗时：" + jCurrentTimeMillis + "ms");
        }
        h();
    }

    public void g() {
        Runnable runnable;
        if (this.f154679g == null) {
            h();
            com.mbridge.msdk.config.component.midi.monitor.a aVar = this.f154683k;
            if (aVar != null) {
                aVar.a("playerHandler is null");
            }
        }
        if (this.f154676d) {
            q0.d("MonitorPlayerTimeout", "已经启动监控条件 不满足");
            return;
        }
        this.f154676d = true;
        this.f154677e = false;
        this.f154678f = false;
        this.f154684l = 0;
        this.f154675c = System.currentTimeMillis();
        q0.c("MonitorPlayerTimeout", "开始播放超时监控，超时时间：" + this.f154674b + "ms");
        Handler handler = this.f154679g;
        if (handler != null && (runnable = this.f154682j) != null) {
            handler.postDelayed(runnable, this.f154674b);
        }
        a();
    }

    public void h() {
        if (this.f154676d) {
            this.f154676d = false;
            Handler handler = this.f154679g;
            if (handler != null) {
                Runnable runnable = this.f154681i;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                }
                Runnable runnable2 = this.f154682j;
                if (runnable2 != null) {
                    this.f154679g.removeCallbacks(runnable2);
                }
            }
            q0.c("MonitorPlayerTimeout", "停止播放超时监控");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        if (!this.f154676d || this.f154677e || TextUtils.isEmpty(this.f154685m)) {
            q0.b("MonitorPlayerTimeout", "check 条件 不满足");
            return;
        }
        try {
            String strC = c();
            if (TextUtils.isEmpty(strC)) {
                this.f154684l++;
                q0.d("MonitorPlayerTimeout", "检查本地地址次数 " + this.f154684l);
                if (this.f154684l >= this.f154673a) {
                    q0.d("MonitorPlayerTimeout", "检查本地地址次数已达上限，停止检查");
                    return;
                }
                Handler handler = this.f154679g;
                if (handler == null || (runnable2 = this.f154681i) == null) {
                    return;
                }
                handler.postDelayed(runnable2, 1000L);
                return;
            }
            this.f154677e = true;
            q0.c("MonitorPlayerTimeout", "本地视频地址准备完成：" + strC);
            com.mbridge.msdk.config.component.midi.monitor.a aVar = this.f154683k;
            if (aVar != null) {
                aVar.b(strC);
            }
            Handler handler2 = this.f154679g;
            if (handler2 == null || (runnable3 = this.f154681i) == null) {
                return;
            }
            handler2.removeCallbacks(runnable3);
        } catch (Exception e10) {
            m.a(e10, new StringBuilder("检查本地地址异常："), "MonitorPlayerTimeout");
            Handler handler3 = this.f154679g;
            if (handler3 == null || (runnable = this.f154681i) == null) {
                return;
            }
            handler3.postDelayed(runnable, 1000L);
        }
    }

    private String c() {
        try {
            if (this.f154685m.startsWith(R3.a.f67727e) || this.f154685m.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                File file = new File(this.f154685m.replace(R3.a.f67727e, ""));
                if (file.exists() && file.isFile()) {
                    return this.f154685m;
                }
            }
            if (this.f154685m.startsWith("http")) {
                com.mbridge.msdk.config.component.common.file.b bVarA = com.mbridge.msdk.config.component.common.file.a.a(this.f154685m, -1, null);
                String strA = bVarA != null ? bVarA.a() : "";
                File file2 = new File(strA.replace(R3.a.f67727e, ""));
                if (file2.exists() && file2.isFile()) {
                    return strA;
                }
            }
            return null;
        } catch (Exception e10) {
            m.a(e10, new StringBuilder("获取本地视频地址异常："), "MonitorPlayerTimeout");
            return null;
        }
    }

    public void b() {
        try {
            h();
            Handler handler = this.f154679g;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f154679g = null;
            }
            HandlerThread handlerThread = this.f154680h;
            try {
                if (handlerThread != null) {
                    try {
                        try {
                            handlerThread.quitSafely();
                            this.f154680h.join(1000L);
                        } catch (Exception e10) {
                            q0.b("MonitorPlayerTimeout", "清理HandlerThread时发生异常：" + e10.getMessage());
                        }
                    } catch (InterruptedException e11) {
                        q0.d("MonitorPlayerTimeout", "等待HandlerThread退出时被中断：" + e11.getMessage());
                        Thread.currentThread().interrupt();
                    }
                    this.f154680h = null;
                }
                this.f154681i = null;
                this.f154682j = null;
                this.f154683k = null;
                this.f154676d = false;
                this.f154677e = false;
                this.f154678f = false;
                this.f154684l = 0;
                q0.c("MonitorPlayerTimeout", "MonitorPlayerTimeout资源已完全清理");
            } catch (Throwable th) {
                this.f154680h = null;
                throw th;
            }
        } catch (Exception e12) {
            m.a(e12, new StringBuilder("销毁MonitorPlayerTimeout时发生异常："), "MonitorPlayerTimeout");
        }
    }

    public void a(com.mbridge.msdk.config.component.midi.monitor.a aVar) {
        this.f154683k = aVar;
    }
}
