package com.mbridge.msdk.config.dynamic.baseview.video;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.SimpleExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f155094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SimpleExoPlayer f155095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f155096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.video.a f155097e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f155093a = 5000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f155098f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f155099g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f155100h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f155101i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Handler f155102j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f155103k = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.b();
        }
    }

    public d(Context context, SimpleExoPlayer simpleExoPlayer) {
        this.f155094b = context;
        this.f155095c = simpleExoPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        q0.b("LocalVideoFileMonitor", " 触发 一次检查");
        try {
            File file = new File(this.f155096d);
            if (file.exists()) {
                a(file);
                return;
            }
            q0.b("LocalVideoFileMonitor", " 资源异常 原因 地址文件不存在");
            if (System.currentTimeMillis() - this.f155098f < this.f155093a) {
                this.f155102j.postDelayed(this.f155103k, 1000L);
            } else {
                a("resource buffer exception file is not found");
            }
        } catch (Exception e10) {
            a("resource buffer exception" + e10.getMessage());
        }
    }

    private void d() {
        this.f155098f = 0L;
        this.f155099g = 0L;
        this.f155100h = 0L;
        this.f155101i = 0L;
    }

    private void e() {
        if (this.f155095c != null) {
            com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.f155097e;
            if (aVar != null) {
                aVar.onBufferingEnd();
            }
            ExtractorMediaSource extractorMediaSourceCreateMediaSource = new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(this.f155094b, "MBridge_ExoPlayer")).createMediaSource(Uri.parse(this.f155096d));
            this.f155095c.setRepeatMode(0);
            this.f155095c.prepare(extractorMediaSourceCreateMediaSource);
            this.f155095c.seekTo(this.f155099g);
            this.f155095c.setPlayWhenReady(true);
        }
        a();
    }

    public void c() {
        a();
        this.f155099g = 0L;
        this.f155100h = 0L;
        this.f155101i = 0L;
        this.f155094b = null;
        this.f155095c = null;
        this.f155097e = null;
    }

    public void a(String str, com.mbridge.msdk.config.dynamic.baseview.video.a aVar, int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f155097e = aVar;
        if (i10 > 0) {
            this.f155093a = i10 * 1000;
        }
        this.f155096d = str;
    }

    public boolean a(ExoPlaybackException exoPlaybackException) {
        if (exoPlaybackException == null || exoPlaybackException.type != 0) {
            return false;
        }
        q0.b("LocalVideoFileMonitor", " 触发 资源异常 监控");
        d();
        com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.f155097e;
        if (aVar != null) {
            aVar.onBufferingStart();
        }
        this.f155098f = System.currentTimeMillis();
        SimpleExoPlayer simpleExoPlayer = this.f155095c;
        if (simpleExoPlayer != null) {
            this.f155099g = simpleExoPlayer.getCurrentPosition();
        }
        this.f155102j.post(this.f155103k);
        return true;
    }

    private void a(File file) {
        q0.b("LocalVideoFileMonitor", " 资源异常 原因 地址文件存在 但是不完整");
        long length = file.length();
        long jLastModified = file.lastModified();
        long j10 = this.f155100h;
        boolean z10 = false;
        boolean z11 = (j10 == 0 || length == j10) ? false : true;
        long j11 = this.f155101i;
        if (j11 != 0 && jLastModified != j11) {
            z10 = true;
        }
        this.f155100h = length;
        this.f155101i = jLastModified;
        if (z11 || z10) {
            q0.b("LocalVideoFileMonitor", " 资源状态发生过变化 触发播放");
            e();
        } else if (System.currentTimeMillis() - this.f155098f < this.f155093a) {
            this.f155102j.postDelayed(this.f155103k, 1000L);
        } else {
            a("resource buffer time out");
        }
    }

    private void a() {
        this.f155102j.removeCallbacks(this.f155103k);
    }

    private void a(String str) {
        q0.b("LocalVideoFileMonitor", "通知外部 规定时间内 缓冲未成功");
        com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.f155097e;
        if (aVar != null) {
            aVar.onBufferingTimeOut(str);
            this.f155097e.onPlayError(str);
        }
    }
}
