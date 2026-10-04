package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.ProgressBar;
import androidx.core.app.NotificationCompat;
import com.inmobi.media.C3765v8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.inmobi.media.v8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3765v8 extends TextureView implements MediaController.MediaPlayerControl, InterfaceC3667o7 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f153452D = "v8";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final MediaPlayer.OnBufferingUpdateListener f153453A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final MediaPlayer.OnErrorListener f153454B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final TextureViewSurfaceTextureListenerC3751u8 f153455C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f153456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f153457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Surface f153458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Q7 f153459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f153460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f153461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f153462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f153463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f153464i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InterfaceC3709r8 f153465j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC3696q8 f153466k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InterfaceC3682p8 f153467l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f153468m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HandlerC3723s8 f153469n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C3668o8 f153470o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f153471p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f153472q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f153473r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f153474s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Handler f153475t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f153476u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C3681p7 f153477v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public MediaPlayer.OnVideoSizeChangedListener f153478w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C3737t8 f153479x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final MediaPlayer.OnCompletionListener f153480y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final MediaPlayer.OnInfoListener f153481z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3765v8(Context context) {
        super(context);
        kotlin.jvm.internal.G.p(context, "context");
        this.f153464i = Integer.MIN_VALUE;
        Context context2 = getContext();
        kotlin.jvm.internal.G.o(context2, "getContext(...)");
        this.f153477v = new C3681p7(context2, this);
        requestLayout();
        invalidate();
        this.f153478w = new MediaPlayer.OnVideoSizeChangedListener() { // from class: F5.H2
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
                C3765v8.c(this.f34324a, mediaPlayer, i10, i11);
            }
        };
        this.f153479x = new C3737t8(this);
        this.f153480y = new MediaPlayer.OnCompletionListener() { // from class: F5.I2
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                C3765v8.a(this.f34333a, mediaPlayer);
            }
        };
        this.f153481z = new MediaPlayer.OnInfoListener() { // from class: F5.J2
            @Override // android.media.MediaPlayer.OnInfoListener
            public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
                return C3765v8.b(this.f34338a, mediaPlayer, i10, i11);
            }
        };
        this.f153453A = new MediaPlayer.OnBufferingUpdateListener() { // from class: F5.K2
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
                C3765v8.a(this.f34345a, mediaPlayer, i10);
            }
        };
        this.f153454B = new MediaPlayer.OnErrorListener() { // from class: F5.L2
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
                return C3765v8.a(this.f34352a, mediaPlayer, i10, i11);
            }
        };
        this.f153455C = new TextureViewSurfaceTextureListenerC3751u8(this);
    }

    public static final void a(C3765v8 this$0, MediaPlayer mediaPlayer) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        try {
            this$0.d();
        } catch (Exception e10) {
            String TAG = f153452D;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public static final boolean b(C3765v8 this$0, MediaPlayer mediaPlayer, int i10, int i11) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        if (3 != i10) {
            return true;
        }
        this$0.a(8, 8);
        return true;
    }

    public static final void c(C3765v8 this$0, MediaPlayer mediaPlayer, int i10, int i11) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.f153461f = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this$0.f153462g = videoHeight;
        if (this$0.f153461f == 0 || videoHeight == 0) {
            return;
        }
        this$0.requestLayout();
    }

    private final void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    private final void setVideoURI(Uri uri) {
        this.f153456a = uri;
        this.f153457b = null;
        e();
        requestLayout();
        invalidate();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return this.f153472q;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return this.f153473r;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return this.f153474s;
    }

    public final void d() {
        Q7 q72 = this.f153459d;
        if (q72 != null) {
            q72.f152393a = 5;
        }
        if (q72 != null) {
            q72.f152394b = 5;
        }
        C3668o8 c3668o8 = this.f153470o;
        if (c3668o8 != null) {
            c3668o8.c();
        }
        HandlerC3723s8 handlerC3723s8 = this.f153469n;
        if (handlerC3723s8 != null) {
            handlerC3723s8.removeMessages(1);
        }
        Object tag = getTag();
        if (tag instanceof C3640m8) {
            C3640m8 c3640m8 = (C3640m8) tag;
            Object obj = c3640m8.f153163t.get("didCompleteQ4");
            kotlin.jvm.internal.G.n(obj, "null cannot be cast to non-null type kotlin.Boolean");
            if (!((Boolean) obj).booleanValue()) {
                c3640m8.f153163t.put("didCompleteQ4", Boolean.TRUE);
                InterfaceC3709r8 interfaceC3709r8 = this.f153465j;
                if (interfaceC3709r8 != null) {
                    ((J7) interfaceC3709r8).a((byte) 3);
                }
            }
            c3640m8.f153163t.put("didSignalVideoCompleted", Boolean.TRUE);
            HashMap map = c3640m8.f153163t;
            if (map != null) {
                Boolean bool = Boolean.FALSE;
                map.put("didCompleteQ1", bool);
                map.put("didCompleteQ2", bool);
                map.put("didCompleteQ3", bool);
                map.put("didPause", bool);
                map.put("didStartPlaying", bool);
                map.put("didQ4Fire", bool);
            }
            if (c3640m8.f153168B) {
                start();
                return;
            }
            this.f153477v.a();
            Object obj2 = c3640m8.f153163t.get("isFullScreen");
            kotlin.jvm.internal.G.n(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj2).booleanValue()) {
                a(8, 0);
            }
        }
    }

    public final void e() {
        Q7 q72;
        C3668o8 mediaController;
        byte bByteValue;
        Q7 q7A;
        if (this.f153456a == null || this.f153458c == null) {
            return;
        }
        if (this.f153459d == null) {
            Object tag = getTag();
            C3640m8 c3640m8 = tag instanceof C3640m8 ? (C3640m8) tag : null;
            if (c3640m8 != null) {
                Object obj = c3640m8.f153163t.get("placementType");
                kotlin.jvm.internal.G.n(obj, "null cannot be cast to non-null type kotlin.Byte");
                bByteValue = ((Byte) obj).byteValue();
            } else {
                bByteValue = 1;
            }
            if (1 == bByteValue) {
                q7A = new Q7();
            } else {
                Object obj2 = Q7.f152390d;
                q7A = P7.a();
            }
            this.f153459d = q7A;
            int i10 = this.f153460e;
            if (i10 != 0) {
                q7A.setAudioSessionId(i10);
            } else {
                this.f153460e = q7A.getAudioSessionId();
            }
            try {
                Q7 q73 = this.f153459d;
                if (q73 != null) {
                    Context applicationContext = getContext().getApplicationContext();
                    Uri uri = this.f153456a;
                    kotlin.jvm.internal.G.m(uri);
                    q73.setDataSource(applicationContext, uri, this.f153457b);
                }
            } catch (IOException unused) {
                Q7 q74 = this.f153459d;
                if (q74 != null) {
                    q74.f152393a = -1;
                }
                if (q74 == null) {
                    return;
                }
                q74.f152394b = -1;
                return;
            }
        }
        try {
            Q7 q75 = this.f153459d;
            if (q75 != null) {
                q75.setOnPreparedListener(this.f153479x);
                q75.setOnVideoSizeChangedListener(this.f153478w);
                q75.setOnCompletionListener(this.f153480y);
                q75.setOnErrorListener(this.f153454B);
                q75.setOnInfoListener(this.f153481z);
                q75.setOnBufferingUpdateListener(this.f153453A);
                q75.setSurface(this.f153458c);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Q7 q76 = this.f153459d;
                if (q76 != null) {
                    q76.setAudioAttributes(this.f153477v.f153266e);
                }
            } else {
                Q7 q77 = this.f153459d;
                if (q77 != null) {
                    q77.setAudioStreamType(3);
                }
            }
            Q7 q78 = this.f153459d;
            if (q78 != null) {
                q78.prepareAsync();
            }
            this.f153471p = 0;
            Q7 q79 = this.f153459d;
            if (q79 != null) {
                q79.f152393a = 1;
            }
            if (q79 != null && (mediaController = getMediaController()) != null) {
                mediaController.setMediaPlayer(this);
                mediaController.setEnabled(a());
                mediaController.d();
            }
            Object tag2 = getTag();
            if (tag2 instanceof C3640m8) {
                Object obj3 = ((C3640m8) tag2).f153163t.get("shouldAutoPlay");
                kotlin.jvm.internal.G.n(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) obj3).booleanValue() && (q72 = this.f153459d) != null) {
                    q72.f152394b = 3;
                }
                Object obj4 = ((C3640m8) tag2).f153163t.get("didCompleteQ4");
                kotlin.jvm.internal.G.n(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) obj4).booleanValue()) {
                    a(8, 0);
                    return;
                }
            }
            a(0, 0);
        } catch (Exception e10) {
            Q7 q710 = this.f153459d;
            if (q710 != null) {
                q710.f152393a = -1;
            }
            if (q710 != null) {
                q710.f152394b = -1;
            }
            this.f153454B.onError(q710, 1, 0);
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public final void f() {
        Surface surface = this.f153458c;
        if (surface != null) {
            surface.release();
        }
        this.f153458c = null;
        g();
    }

    public final void g() {
        Q7 q72;
        HandlerC3723s8 handlerC3723s8 = this.f153469n;
        if (handlerC3723s8 != null) {
            handlerC3723s8.removeMessages(1);
        }
        C3681p7 c3681p7 = this.f153477v;
        c3681p7.a();
        if (Build.VERSION.SDK_INT >= 26) {
            c3681p7.f153267f = null;
        }
        c3681p7.f153268g = null;
        Object tag = getTag();
        boolean z10 = tag instanceof C3640m8;
        if (z10) {
            ((C3640m8) tag).f153163t.put("seekPosition", Integer.valueOf(getCurrentPosition()));
        }
        Q7 q73 = this.f153459d;
        if (q73 != null) {
            q73.f152393a = 0;
        }
        if (q73 != null) {
            q73.f152394b = 0;
        }
        if (q73 != null) {
            try {
                q73.reset();
            } catch (Exception e10) {
                C3511d5 c3511d5 = C3511d5.f152815a;
                C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
            }
        }
        Q7 q74 = this.f153459d;
        if (q74 != null) {
            q74.setOnPreparedListener(null);
            q74.setOnVideoSizeChangedListener(null);
            q74.setOnCompletionListener(null);
            q74.setOnErrorListener(null);
            q74.setOnInfoListener(null);
            q74.setOnBufferingUpdateListener(null);
        }
        if (z10) {
            Object obj = ((C3640m8) tag).f153163t.get("placementType");
            kotlin.jvm.internal.G.n(obj, "null cannot be cast to non-null type kotlin.Byte");
            if (((Byte) obj).byteValue() == 0 && (q72 = this.f153459d) != null) {
                q72.a();
            }
        } else {
            Q7 q75 = this.f153459d;
            if (q75 != null) {
                q75.a();
            }
        }
        String TAG = f153452D;
        kotlin.jvm.internal.G.o(TAG, "TAG");
        this.f153459d = null;
    }

    @NotNull
    public final C3681p7 getAudioFocusManager$media_release() {
        return this.f153477v;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        if (this.f153460e == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f153460e = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.f153460e;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f153459d != null) {
            return this.f153471p;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        Q7 q72 = this.f153459d;
        if (q72 == null || !a()) {
            return 0;
        }
        return q72.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        Q7 q72 = this.f153459d;
        if (q72 == null || !a()) {
            return -1;
        }
        return q72.getDuration();
    }

    public final int getLastVolume() {
        return this.f153464i;
    }

    @NotNull
    public final MediaPlayer.OnVideoSizeChangedListener getMSizeChangedListener() {
        return this.f153478w;
    }

    @Nullable
    public final C3668o8 getMediaController() {
        return this.f153470o;
    }

    @Nullable
    public final Q7 getMediaPlayer() {
        return this.f153459d;
    }

    public final boolean getPauseScheduled() {
        return this.f153476u;
    }

    @Nullable
    public final InterfaceC3696q8 getPlaybackEventListener() {
        return this.f153466k;
    }

    @Nullable
    public final InterfaceC3709r8 getQuartileCompletedListener() {
        return this.f153465j;
    }

    public final int getState() {
        Q7 q72 = this.f153459d;
        if (q72 != null) {
            return q72.f152393a;
        }
        return 0;
    }

    public final int getVideoVolume() {
        if (isPlaying()) {
            return this.f153463h;
        }
        return -1;
    }

    public final int getVolume() {
        if (a()) {
            return this.f153463h;
        }
        return -1;
    }

    public final void h() {
        Q7 q72 = this.f153459d;
        if (q72 != null) {
            this.f153463h = 0;
            q72.setVolume(0.0f, 0.0f);
            Object tag = getTag();
            if (tag instanceof C3640m8) {
                ((C3640m8) tag).f153163t.put("currentMediaVolume", 0);
            }
        }
    }

    public final void i() {
        Q7 q72 = this.f153459d;
        if (q72 != null) {
            this.f153463h = 1;
            q72.setVolume(1.0f, 1.0f);
            Object tag = getTag();
            if (tag instanceof C3640m8) {
                ((C3640m8) tag).f153163t.put("currentMediaVolume", 15);
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        Q7 q72;
        return a() && (q72 = this.f153459d) != null && q72.isPlaying();
    }

    public final void j() {
        Q7 q72;
        if (a() && (q72 = this.f153459d) != null && q72.isPlaying()) {
            Q7 q73 = this.f153459d;
            if (q73 != null) {
                q73.pause();
            }
            Q7 q74 = this.f153459d;
            if (q74 != null) {
                q74.seekTo(0);
            }
            this.f153477v.a();
            Object tag = getTag();
            if (tag instanceof C3640m8) {
                C3640m8 c3640m8 = (C3640m8) tag;
                HashMap map = c3640m8.f153163t;
                Boolean bool = Boolean.TRUE;
                map.put("didPause", bool);
                c3640m8.f153163t.put("seekPosition", 0);
                c3640m8.f153163t.put("didCompleteQ4", bool);
            }
            Q7 q75 = this.f153459d;
            if (q75 != null) {
                q75.f152393a = 4;
            }
            InterfaceC3696q8 interfaceC3696q8 = this.f153466k;
            if (interfaceC3696q8 != null) {
                ((K7) interfaceC3696q8).a((byte) 4);
            }
        }
        Q7 q76 = this.f153459d;
        if (q76 == null) {
            return;
        }
        q76.f152394b = 4;
    }

    public final void k() {
        if (this.f153459d != null) {
            if (isPlaying()) {
                this.f153477v.c();
            } else {
                i();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r1 > r6) goto L27;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f153461f     // Catch: java.lang.Exception -> L79
            int r0 = android.view.View.getDefaultSize(r0, r6)     // Catch: java.lang.Exception -> L79
            int r1 = r5.f153462g     // Catch: java.lang.Exception -> L79
            int r1 = android.view.View.getDefaultSize(r1, r7)     // Catch: java.lang.Exception -> L79
            int r2 = r5.f153461f     // Catch: java.lang.Exception -> L79
            if (r2 <= 0) goto L75
            int r2 = r5.f153462g     // Catch: java.lang.Exception -> L79
            if (r2 <= 0) goto L75
            int r0 = android.view.View.MeasureSpec.getMode(r6)     // Catch: java.lang.Exception -> L79
            int r6 = android.view.View.MeasureSpec.getSize(r6)     // Catch: java.lang.Exception -> L79
            int r1 = android.view.View.MeasureSpec.getMode(r7)     // Catch: java.lang.Exception -> L79
            int r7 = android.view.View.MeasureSpec.getSize(r7)     // Catch: java.lang.Exception -> L79
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L3c
            if (r1 != r2) goto L3c
            int r0 = r5.f153461f     // Catch: java.lang.Exception -> L79
            int r1 = r0 * r7
            int r2 = r5.f153462g     // Catch: java.lang.Exception -> L79
            int r3 = r6 * r2
            if (r1 >= r3) goto L36
            int r3 = r3 / r0
            goto L73
        L36:
            if (r1 <= r3) goto L5a
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L75
        L3c:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L4e
            int r0 = r5.f153462g     // Catch: java.lang.Exception -> L79
            int r0 = r0 * r6
            int r2 = r5.f153461f     // Catch: java.lang.Exception -> L79
            int r0 = r0 / r2
            if (r1 != r3) goto L4b
            if (r0 <= r7) goto L4b
            goto L5a
        L4b:
            r1 = r0
        L4c:
            r0 = r6
            goto L75
        L4e:
            if (r1 != r2) goto L5e
            int r1 = r5.f153461f     // Catch: java.lang.Exception -> L79
            int r1 = r1 * r7
            int r2 = r5.f153462g     // Catch: java.lang.Exception -> L79
            int r1 = r1 / r2
            if (r0 != r3) goto L5c
            if (r1 <= r6) goto L5c
        L5a:
            r1 = r7
            goto L4c
        L5c:
            r0 = r1
            goto L3a
        L5e:
            int r2 = r5.f153461f     // Catch: java.lang.Exception -> L79
            int r4 = r5.f153462g     // Catch: java.lang.Exception -> L79
            if (r1 != r3) goto L6a
            if (r4 <= r7) goto L6a
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L6c
        L6a:
            r1 = r2
            r7 = r4
        L6c:
            if (r0 != r3) goto L5c
            if (r1 <= r6) goto L5c
            int r4 = r4 * r6
            int r3 = r4 / r2
        L73:
            r1 = r3
            goto L4c
        L75:
            r5.setMeasuredDimension(r0, r1)     // Catch: java.lang.Exception -> L79
            return
        L79:
            java.lang.String r6 = com.inmobi.media.C3765v8.f153452D
            java.lang.String r7 = "TAG"
            kotlin.jvm.internal.G.o(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3765v8.onMeasure(int, int):void");
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        Q7 q72;
        if (a() && (q72 = this.f153459d) != null && q72.isPlaying()) {
            Q7 q73 = this.f153459d;
            if (q73 != null) {
                q73.pause();
            }
            Q7 q74 = this.f153459d;
            if (q74 != null) {
                q74.f152393a = 4;
            }
            this.f153477v.a();
            Object tag = getTag();
            if (tag instanceof C3640m8) {
                C3640m8 c3640m8 = (C3640m8) tag;
                c3640m8.f153163t.put("didPause", Boolean.TRUE);
                c3640m8.f153163t.put("seekPosition", Integer.valueOf(getCurrentPosition()));
            }
            InterfaceC3696q8 interfaceC3696q8 = this.f153466k;
            if (interfaceC3696q8 != null) {
                ((K7) interfaceC3696q8).a((byte) 2);
            }
        }
        Q7 q75 = this.f153459d;
        if (q75 != null) {
            q75.f152394b = 4;
        }
        this.f153476u = false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i10) {
    }

    public final void setIsLockScreen(boolean z10) {
        this.f153468m = z10;
    }

    public final void setLastVolume(int i10) {
        this.f153464i = i10;
    }

    public final void setMSizeChangedListener(@NotNull MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        kotlin.jvm.internal.G.p(onVideoSizeChangedListener, "<set-?>");
        this.f153478w = onVideoSizeChangedListener;
    }

    public final void setMediaController(@Nullable C3668o8 c3668o8) {
        C3668o8 mediaController;
        if (c3668o8 != null) {
            this.f153470o = c3668o8;
            if (this.f153459d == null || (mediaController = getMediaController()) == null) {
                return;
            }
            mediaController.setMediaPlayer(this);
            mediaController.setEnabled(a());
            mediaController.d();
        }
    }

    public final void setMediaErrorListener(@Nullable InterfaceC3682p8 interfaceC3682p8) {
        this.f153467l = interfaceC3682p8;
    }

    public final void setPlaybackEventListener(@Nullable InterfaceC3696q8 interfaceC3696q8) {
        this.f153466k = interfaceC3696q8;
    }

    public final void setQuartileCompletedListener(@Nullable InterfaceC3709r8 interfaceC3709r8) {
        this.f153465j = interfaceC3709r8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    @Override // android.widget.MediaController.MediaPlayerControl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void start() {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3765v8.start():void");
    }

    public final void b() {
        try {
            if (this.f153456a != null) {
                C3657nb.a(new Runnable() { // from class: F5.M2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3765v8.a(this.f34358a);
                    }
                });
            }
        } catch (Exception unused) {
            String TAG = f153452D;
            kotlin.jvm.internal.G.o(TAG, "TAG");
        }
    }

    public static final void b(C3765v8 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.pause();
    }

    public final void c() {
        if (this.f153459d != null) {
            this.f153477v.a();
            h();
        }
    }

    public static final void a(C3765v8 this$0, MediaPlayer mediaPlayer, int i10) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.f153471p = i10;
    }

    public static final boolean a(C3765v8 this$0, MediaPlayer mediaPlayer, int i10, int i11) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        String TAG = f153452D;
        kotlin.jvm.internal.G.o(TAG, "TAG");
        InterfaceC3682p8 interfaceC3682p8 = this$0.f153467l;
        if (interfaceC3682p8 != null) {
            L7 l72 = (L7) interfaceC3682p8;
            C3499c7 c3499c7 = l72.f152192a.f152305b;
            if (!c3499c7.f152791t && (c3499c7 instanceof C3612k8)) {
                try {
                    ((C3612k8) c3499c7).a(l72.f152193b, i10);
                } catch (Exception e10) {
                    N7 n72 = l72.f152192a;
                    N4 n42 = n72.f152309f;
                    if (n42 != null) {
                        String str = n72.f152310g;
                        ((O4) n42).b(str, jd.a(e10, O5.a(str, "access$getTAG$p(...)", "SDK encountered unexpected error in handling the onVideoError event; ")));
                    }
                }
            }
        }
        Q7 q72 = this$0.f153459d;
        if (q72 != null) {
            q72.f152393a = -1;
        }
        if (q72 != null) {
            q72.f152394b = -1;
        }
        C3668o8 c3668o8 = this$0.f153470o;
        if (c3668o8 != null) {
            c3668o8.c();
        }
        this$0.b();
        return true;
    }

    public static final void a(C3765v8 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        String strValueOf = String.valueOf(this$0.f153456a);
        Y0 y0A = AbstractC3531eb.a();
        y0A.getClass();
        ArrayList arrayListA = F1.a(y0A, "disk_uri=? ", new String[]{strValueOf}, null, null, "created_ts DESC ", 1, 12);
        C3589j c3589j = arrayListA.isEmpty() ? null : (C3589j) arrayListA.get(0);
        int iNextInt = new Random().nextInt() & Integer.MAX_VALUE;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (c3589j != null) {
            String url = c3589j.f153016b;
            kotlin.jvm.internal.G.p(url, "url");
            AbstractC3531eb.a().a(new C3589j(iNextInt, url, null, 0, jCurrentTimeMillis, jCurrentTimeMillis2, System.currentTimeMillis(), 0L));
        }
    }

    public final boolean a() {
        int i10;
        Q7 q72 = this.f153459d;
        return q72 == null || !((i10 = q72.f152393a) == -1 || i10 == 0 || i10 == 1);
    }

    public final void a(int i10) {
        if (this.f153476u || 4 == getState()) {
            return;
        }
        if (this.f153475t == null) {
            this.f153475t = new Handler(Looper.getMainLooper());
        }
        if (i10 > 0) {
            this.f153476u = true;
            c();
            Handler handler = this.f153475t;
            if (handler != null) {
                handler.postDelayed(new Runnable() { // from class: F5.N2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3765v8.b(this.f34360a);
                    }
                }, i10 * 1000);
                return;
            }
            return;
        }
        pause();
    }

    public final void a(int i10, int i11) {
        if (this.f153459d != null) {
            ViewParent parent = getParent();
            C3779w8 c3779w8 = parent instanceof C3779w8 ? (C3779w8) parent : null;
            ProgressBar progressBar = c3779w8 != null ? c3779w8.getProgressBar() : null;
            if (progressBar != null) {
                progressBar.setVisibility(i10);
            }
            ViewParent parent2 = getParent();
            C3779w8 c3779w82 = parent2 instanceof C3779w8 ? (C3779w8) parent2 : null;
            ImageView posterImage = c3779w82 != null ? c3779w82.getPosterImage() : null;
            if (posterImage == null) {
                return;
            }
            posterImage.setVisibility(i11);
        }
    }
}
