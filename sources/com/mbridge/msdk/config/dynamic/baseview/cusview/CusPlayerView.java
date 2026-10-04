package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.gms.internal.ads.U;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.config.component.common.express.node.m;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes5.dex */
public class CusPlayerView extends ComponentLinearLayout {
    public static final String TAG = "PlayerView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.video.b f154952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f154953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f154954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f154955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f154956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f154957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SurfaceHolder f154958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected float f154959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected float f154960i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f154961j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f154962k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private MediaEvents f154963l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f154964m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f154965n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AudioManager f154966o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AudioManager.OnAudioFocusChangeListener f154967p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f154968q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f154969r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f154970s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private AspectRatioFrameLayout f154971t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f154972u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final com.mbridge.msdk.config.dynamic.baseview.video.c f154973v;

    public class a implements AudioManager.OnAudioFocusChangeListener {
        public a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i10) {
            CusPlayerView.this.a(i10);
        }
    }

    public class b implements com.mbridge.msdk.config.dynamic.baseview.video.c {
        public b() {
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.c
        public void a(float f10) {
            if (CusPlayerView.this.f154971t != null) {
                CusPlayerView.this.f154971t.setAspectRatio(f10);
                if (CusPlayerView.this.f154971t.getVisibility() != 0) {
                    CusPlayerView.this.f154971t.setVisibility(0);
                }
            }
        }

        @Override // com.mbridge.msdk.config.dynamic.baseview.video.c
        public void onRenderedFirstFrame() {
        }
    }

    public class c implements SurfaceHolder.Callback {
        private c() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            try {
                q0.c("PlayerView", "surfaceChanged");
                if (CusPlayerView.this.f154952a != null && surfaceHolder != null && CusPlayerView.this.f154958g != surfaceHolder) {
                    CusPlayerView.this.f154958g = surfaceHolder;
                    CusPlayerView.this.f154952a.a(surfaceHolder);
                    if (CusPlayerView.this.f154972u) {
                        CusPlayerView.this.f154952a.n();
                    }
                }
                CusPlayerView.this.f154955d = false;
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                q0.c("PlayerView", "surfaceCreated");
                if (CusPlayerView.this.f154952a == null || surfaceHolder == null) {
                    return;
                }
                CusPlayerView.this.f154958g = surfaceHolder;
                CusPlayerView.this.f154952a.a(surfaceHolder);
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            try {
                q0.c("PlayerView", "surfaceDestroyed ");
                CusPlayerView.this.f154955d = true;
                CusPlayerView.this.f154957f = true;
                CusPlayerView.this.f154952a.m();
                CusPlayerView.this.pauseOmsdk();
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }

        public /* synthetic */ c(CusPlayerView cusPlayerView, a aVar) {
            this();
        }
    }

    public CusPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f154954c = false;
        this.f154955d = false;
        this.f154956e = false;
        this.f154957f = false;
        this.f154961j = 1;
        this.f154962k = false;
        this.f154964m = "";
        this.f154965n = 1;
        this.f154968q = false;
        this.f154969r = false;
        this.f154970s = true;
        this.f154972u = false;
        this.f154973v = new b();
        b();
    }

    private boolean e() {
        int i10;
        try {
            if (this.f154966o == null) {
                q0.b("PlayerView", "AudioManager is null, cannot request audio focus");
                return false;
            }
            boolean z10 = true;
            if (this.f154969r) {
                q0.c("PlayerView", "Requesting audio focus with mix mode (AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK)");
                i10 = 3;
            } else {
                q0.c("PlayerView", "Requesting audio focus without mix mode (AUDIOFOCUS_GAIN)");
                i10 = 1;
            }
            if (this.f154966o.requestAudioFocus(this.f154967p, 3, i10) != 1) {
                z10 = false;
            }
            this.f154968q = z10;
            return z10;
        } catch (Exception e10) {
            m.a(e10, new StringBuilder("Error requesting audio focus: "), "PlayerView");
            return false;
        }
    }

    public void closeSound() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f154952a;
        if (bVar != null) {
            bVar.j();
        }
    }

    public void coverUnlockResume() {
        try {
            if (this.f154952a != null) {
                q0.c("PlayerView", "coverUnlockResume========");
                if (this.f154952a.f() && !this.f154957f) {
                    start(true);
                    return;
                }
                playVideo(0);
            }
        } catch (Throwable th) {
            q0.b("PlayerView", th.getMessage());
        }
    }

    public int getCurPosition() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar;
        try {
            bVar = this.f154952a;
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
        long jC = bVar != null ? bVar.c() : 0L;
        return U.a(jC);
    }

    public int getDuration() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f154952a;
        if (bVar != null) {
            return bVar.d();
        }
        return 0;
    }

    public String getSelfTag() {
        return this.f154964m;
    }

    public MediaEvents getVideoEvents() {
        return this.f154963l;
    }

    public float getVolume() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f154952a;
        if (bVar != null) {
            return bVar.e();
        }
        return 0.0f;
    }

    public void initBufferIngParam(int i10) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f154952a;
        if (bVar != null) {
            bVar.b(i10);
        }
    }

    public boolean initVFPData(String str, String str2, com.mbridge.msdk.config.dynamic.baseview.video.a aVar) {
        if (TextUtils.isEmpty(str)) {
            q0.c("PlayerView", "playUrl==null");
            return false;
        }
        this.f154953b = str;
        this.f154952a.a(aVar);
        this.f154952a.c(this.f154953b);
        this.f154954c = true;
        return true;
    }

    public boolean isComplete() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f154952a;
            if (bVar != null) {
                if (bVar.g()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            q0.b("PlayerView", th.getMessage(), th);
            return false;
        }
    }

    public boolean isMixWithOtherAudio() {
        return this.f154969r;
    }

    public boolean isPlayIng() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f154952a;
            if (bVar != null) {
                return bVar.h();
            }
            return false;
        } catch (Throwable th) {
            q0.b("PlayerView", th.getMessage());
            return false;
        }
    }

    public boolean isPlayWithoutAudioFocus() {
        return this.f154970s;
    }

    public boolean isSilent() {
        return this.f154952a.i();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f154959h = motionEvent.getRawX();
        this.f154960i = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onPause() {
        try {
            pause();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void onResume() {
        try {
            if (this.f154952a == null || this.f154955d || isComplete() || this.f154956e) {
                return;
            }
            q0.c("PlayerView", "onresume========");
            if (this.f154952a.f()) {
                resumeStart();
            } else {
                playVideo(0);
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void openSound() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f154952a;
        if (bVar != null) {
            bVar.t();
        }
    }

    public void pause() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f154952a;
            if (bVar != null) {
                bVar.m();
            }
            this.f154972u = false;
            pauseOmsdk();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void pauseOmsdk() {
        try {
            if (this.f154963l == null || this.f154962k) {
                return;
            }
            q0.a("omsdk", "play view:  pause");
            this.f154962k = true;
            this.f154963l.pause();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean playVideo(int i10) {
        try {
            if (this.f154952a == null) {
                q0.c("PlayerView", "player init error 播放失败");
                return false;
            }
            if (!this.f154954c) {
                q0.c("PlayerView", "vfp init failed 播放失败");
                return false;
            }
            if (e()) {
                this.f154952a.t();
            } else {
                q0.d("PlayerView", "Audio focus request denied");
                if (this.f154970s) {
                    q0.c("PlayerView", "Continuing playback without audio");
                    this.f154952a.j();
                }
            }
            this.f154952a.a(i10);
            this.f154972u = true;
            this.f154957f = false;
            return true;
        } catch (Throwable th) {
            q0.b("PlayerView", th.getMessage(), th);
            return false;
        }
    }

    public void prepare() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f154952a;
            if (bVar != null) {
                bVar.o();
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void release() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f154952a;
            if (bVar != null) {
                bVar.p();
            }
            if (this.f154963l != null) {
                this.f154963l = null;
            }
            a();
            if (this.f154958g != null) {
                q0.b("PlayerView", "mSurfaceHolder release");
                this.f154958g.getSurface().release();
            }
        } catch (Throwable th) {
            q0.b("PlayerView", th.getMessage());
        }
    }

    public void resumeOMSDK() {
        try {
            MediaEvents mediaEvents = this.f154963l;
            if (mediaEvents != null) {
                this.f154962k = false;
                mediaEvents.resume();
                q0.a("omsdk", "play view:  resume");
            }
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public void resumeStart() {
        try {
            if (e()) {
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f154952a;
                if (bVar != null) {
                    bVar.t();
                }
            } else {
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar2 = this.f154952a;
                if (bVar2 != null) {
                    bVar2.j();
                }
            }
            start(true);
            resumeOMSDK();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void seekTo(int i10) {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f154952a;
            if (bVar != null) {
                bVar.a(i10);
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void seekToEndFrame() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f154952a;
        if (bVar != null) {
            bVar.q();
        }
    }

    public void setIsCovered(boolean z10) {
        try {
            this.f154956e = z10;
            q0.b("PlayerView", "mIsCovered:" + z10);
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void setMixWithOtherAudio(int i10) {
        this.f154969r = i10 == 1;
    }

    public void setPlayWithoutAudioFocus(boolean z10) {
        this.f154970s = z10;
        q0.c("PlayerView", "setPlayWithoutAudioFocus: " + z10);
    }

    public void setPlaybackParams(float f10) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f154952a;
        if (bVar != null) {
            bVar.a(f10);
        }
    }

    public void setRenderMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f154964m = SameMD5.getMD5(str);
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f154963l = mediaEvents;
    }

    public void setVideoGravity(int i10) {
        if (this.f154965n == i10) {
            return;
        }
        this.f154965n = i10;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f154971t;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i10);
        }
    }

    public void setVolume(float f10, float f11) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f154952a;
        if (bVar != null) {
            bVar.a(f10, f11);
        }
    }

    public void start(boolean z10) {
        try {
            if (this.f154952a != null) {
                this.f154972u = true;
                if (z10) {
                    if (e()) {
                        this.f154952a.t();
                    } else {
                        this.f154952a.j();
                    }
                }
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f154952a;
                if (bVar == null || this.f154956e) {
                    return;
                }
                bVar.n();
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void stop() {
        try {
            this.f154972u = false;
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f154952a;
            if (bVar != null) {
                bVar.s();
            }
            if (this.f154963l != null) {
                this.f154963l = null;
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    private void c() {
        try {
            this.f154966o = (AudioManager) getContext().getSystemService("audio");
            this.f154967p = new a();
            q0.c("PlayerView", "AudioManager initialized");
        } catch (Exception e10) {
            m.a(e10, new StringBuilder("Failed to initialize AudioManager: "), "PlayerView");
        }
    }

    private void d() {
        this.f154971t = new AspectRatioFrameLayout(getContext());
        SurfaceView surfaceView = new SurfaceView(getContext().getApplicationContext());
        SurfaceHolder holder = surfaceView.getHolder();
        this.f154958g = holder;
        holder.setKeepScreenOn(true);
        this.f154958g.addCallback(new c(this, null));
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = new com.mbridge.msdk.config.dynamic.baseview.video.b();
        this.f154952a = bVar;
        bVar.a(getContext(), this.f154958g);
        this.f154952a.a(this.f154973v);
        this.f154971t.addView(surfaceView, -1, -1);
        setGravity(17);
        this.f154971t.setVisibility(4);
        addView(this.f154971t, -1, -1);
    }

    private void b() {
        try {
            d();
            c();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        try {
            if (i10 == -3) {
                q0.c("PlayerView", "Audio focus lost transient can duck");
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f154952a;
                if (bVar != null) {
                    bVar.a(0.3f, 0.3f);
                    return;
                }
                return;
            }
            if (i10 == -2) {
                q0.c("PlayerView", "Audio focus lost transient");
                this.f154968q = false;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar2 = this.f154952a;
                if (bVar2 == null || !bVar2.h()) {
                    return;
                }
                this.f154952a.m();
                return;
            }
            if (i10 == -1) {
                q0.c("PlayerView", "Audio focus lost");
                this.f154968q = false;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar3 = this.f154952a;
                if (bVar3 == null || !bVar3.h()) {
                    return;
                }
                this.f154952a.m();
                return;
            }
            if (i10 != 1) {
                return;
            }
            q0.c("PlayerView", "Audio focus gained");
            this.f154968q = true;
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar4 = this.f154952a;
            if (bVar4 != null) {
                bVar4.a(1.0f, 1.0f);
                if (this.f154952a.h()) {
                    return;
                }
                this.f154952a.n();
            }
        } catch (Exception e10) {
            m.a(e10, new StringBuilder("Error handling audio focus change: "), "PlayerView");
        }
    }

    public boolean playVideo() {
        return playVideo(0);
    }

    private void a() {
        try {
            AudioManager audioManager = this.f154966o;
            if (audioManager == null || !this.f154968q) {
                return;
            }
            int iAbandonAudioFocus = audioManager.abandonAudioFocus(this.f154967p);
            this.f154968q = false;
            q0.c("PlayerView", "Audio focus abandoned, result: " + iAbandonAudioFocus);
        } catch (Exception e10) {
            m.a(e10, new StringBuilder("Error abandoning audio focus: "), "PlayerView");
        }
    }
}
