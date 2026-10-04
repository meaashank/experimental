package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.VideoView;
import androidx.compose.animation.core.C1610t;
import com.google.common.base.Ascii;
import com.inmobi.media.B6;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import kotlin.text.C5013e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class B6 extends VideoView implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N4 f151773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3819z6 f151774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f151775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public A6 f151776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f151777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f151778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f151779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f151780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f151781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f151782j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f151783k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B6(Activity activity, N4 n42) {
        super(activity);
        kotlin.jvm.internal.G.p(activity, "activity");
        this.f151773a = n42;
        setZOrderOnTop(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT < 28) {
            setDrawingCacheEnabled(true);
        }
        this.f151779g = 100;
        this.f151782j = -1;
        this.f151783k = 0;
        this.f151778f = new WeakReference(activity);
        C3657nb.a(activity, this);
    }

    public static final void a(B6 this$0, MediaPlayer mediaPlayer, int i10, int i11) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        N4 n42 = this$0.f151773a;
        if (n42 != null) {
            ((O4) n42).a("MediaRenderView", ">>> onVideoSizeChanged");
        }
        if (this$0.f151774b == null) {
            C3819z6 c3819z6 = new C3819z6(this$0.getContext());
            this$0.f151774b = c3819z6;
            c3819z6.setAnchorView(this$0);
            this$0.setMediaController(this$0.f151774b);
            this$0.requestLayout();
            this$0.requestFocus();
        }
    }

    public final void b() {
        N4 n42 = this.f151773a;
        if (n42 != null) {
            ((O4) n42).a("MediaRenderView", "Release the media render view");
        }
        stopPlayback();
        ViewGroup viewGroup = this.f151775c;
        if (viewGroup != null) {
            ViewParent parent = viewGroup.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f151775c);
            }
            ViewParent parent2 = getParent();
            ViewGroup viewGroup3 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(this);
            }
            setBackgroundColor(0);
            this.f151775c = null;
        }
        setMediaController(null);
        this.f151774b = null;
        A6 a62 = this.f151776d;
        if (a62 != null) {
            N4 n43 = ((M6) a62).f152227a.f152299b;
            if (n43 != null) {
                ((O4) n43).a("MraidMediaProcessor", ">>> onPlayerCompleted");
            }
            ViewGroup viewContainer = getViewContainer();
            if (viewContainer != null) {
                ViewParent parent3 = viewContainer.getParent();
                ViewGroup viewGroup4 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                if (viewGroup4 != null) {
                    viewGroup4.removeView(viewContainer);
                }
            }
            setViewContainer(null);
        }
    }

    public final int getCurrentAudioVolume() {
        return this.f151779g;
    }

    @Override // android.view.View
    @Nullable
    public final String getId() {
        return this.f151780h;
    }

    @Nullable
    public final A6 getListener() {
        return this.f151776d;
    }

    public final int getMCurrentPosition() {
        return this.f151783k;
    }

    @Nullable
    public final String getPlaybackUrl() {
        return this.f151781i;
    }

    public final int getPreviousPosition() {
        return this.f151782j;
    }

    @Nullable
    public final ViewGroup getViewContainer() {
        return this.f151775c;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.G.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.G.p(activity, "activity");
        kotlin.jvm.internal.G.p(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
        if (this.f151778f.get() == null || !kotlin.jvm.internal.G.g(this.f151778f.get(), activity)) {
            return;
        }
        this.f151777e = false;
        start();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
        Activity activity2 = (Activity) this.f151778f.get();
        if (activity2 == null || !activity2.equals(activity)) {
            return;
        }
        this.f151777e = true;
        if (getCurrentPosition() != 0) {
            this.f151783k = getCurrentPosition();
        }
        pause();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mp) {
        kotlin.jvm.internal.G.p(mp, "mp");
        N4 n42 = this.f151773a;
        if (n42 != null) {
            ((O4) n42).a("MediaRenderView", ">>> onCompletion");
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mp, int i10, int i11) {
        kotlin.jvm.internal.G.p(mp, "mp");
        N4 n42 = this.f151773a;
        if (n42 != null) {
            ((O4) n42).b("MediaRenderView", ">>> onError (" + i10 + U6.j.f68738d + i11 + ')');
        }
        b();
        return false;
    }

    @Override // android.widget.VideoView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        getHolder().setSizeFromLayout();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mp) {
        N4 n42;
        kotlin.jvm.internal.G.p(mp, "mp");
        N4 n43 = this.f151773a;
        if (n43 != null) {
            ((O4) n43).a("MediaRenderView", ">>> onPrepared");
        }
        mp.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: F5.c
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
                B6.a(this.f34454a, mediaPlayer, i10, i11);
            }
        });
        int i10 = this.f151783k;
        if (i10 < getDuration()) {
            this.f151783k = i10;
            seekTo(i10);
        }
        A6 a62 = this.f151776d;
        if (a62 != null && (n42 = ((M6) a62).f152227a.f152299b) != null) {
            ((O4) n42).a("MraidMediaProcessor", ">>> onPlayerPrepared");
        }
        start();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        Context contextD;
        kotlin.jvm.internal.G.p(view, "view");
        super.onVisibilityChanged(view, i10);
        N4 n42 = this.f151773a;
        if (n42 != null) {
            ((O4) n42).a("MediaRenderView", C1610t.a(">>> onVisibilityChanged (", i10, ')'));
        }
        if (i10 != 0 || (contextD = C3657nb.d()) == null) {
            return;
        }
        setBackground(new BitmapDrawable(contextD.getResources(), (Bitmap) null));
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        N4 n42 = this.f151773a;
        if (n42 != null) {
            ((O4) n42).a("MediaRenderView", C1610t.a(">>> onWindowVisibilityChanged (", i10, ')'));
        }
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        N4 n42 = this.f151773a;
        if (n42 != null) {
            ((O4) n42).a("MediaRenderView", "Pause media playback");
        }
        super.pause();
    }

    public final void setAudioMuted(boolean z10) {
    }

    public final void setCurrentAudioVolume(int i10) {
        this.f151779g = i10;
    }

    public final void setId(@Nullable String str) {
        this.f151780h = str;
    }

    public final void setListener(@Nullable A6 a62) {
        this.f151776d = a62;
    }

    public final void setMCurrentPosition(int i10) {
        this.f151783k = i10;
    }

    public final void setPlaybackData(@NotNull String url) {
        String str;
        kotlin.jvm.internal.G.p(url, "url");
        byte[] bytes = url.getBytes(C5013e.f218326b);
        kotlin.jvm.internal.G.o(bytes, "this as java.lang.String).getBytes(charset)");
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bytes) {
            if (((byte) (b10 & (-128))) > 0) {
                sb2.append("%");
                char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', androidx.compose.ui.graphics.vector.f.f101687s, 'b', androidx.compose.ui.graphics.vector.f.f101679k, 'd', 'e', 'f'};
                sb2.append(new String(new char[]{cArr[(b10 >> 4) & 15], cArr[(byte) (b10 & Ascii.SI)]}));
            } else {
                sb2.append((char) b10);
            }
        }
        try {
            String string = sb2.toString();
            kotlin.jvm.internal.G.o(string, "toString(...)");
            byte[] bytes2 = string.getBytes(C5013e.f218326b);
            kotlin.jvm.internal.G.o(bytes2, "this as java.lang.String).getBytes(charset)");
            str = new String(bytes2, C5013e.f218331g);
        } catch (UnsupportedEncodingException unused) {
            str = "";
        }
        this.f151781i = str;
        this.f151780h = "anonymous";
    }

    public final void setPlaybackUrl(@Nullable String str) {
        this.f151781i = str;
    }

    public final void setPlayerPrepared(boolean z10) {
    }

    public final void setPreviousPosition(int i10) {
        this.f151782j = i10;
    }

    public final void setViewContainer(@Nullable ViewGroup viewGroup) {
        this.f151775c = viewGroup;
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        if (this.f151777e) {
            return;
        }
        N4 n42 = this.f151773a;
        if (n42 != null) {
            ((O4) n42).a("MediaRenderView", "Start media playback");
        }
        super.start();
    }

    public final void a() {
        setVideoPath(this.f151781i);
        setOnCompletionListener(this);
        setOnPreparedListener(this);
        setOnErrorListener(this);
        if (this.f151774b == null) {
            C3819z6 c3819z6 = new C3819z6(getContext());
            this.f151774b = c3819z6;
            c3819z6.setAnchorView(this);
            setMediaController(this.f151774b);
        }
    }
}
