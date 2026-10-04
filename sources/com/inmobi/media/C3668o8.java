package com.inmobi.media;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.C3668o8;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.inmobi.media.o8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3668o8 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3612k8 f153230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerC3654n8 f153231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C3765v8 f153232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f153233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3467a3 f153234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3467a3 f153235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ProgressBar f153236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RelativeLayout f153237i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f153238j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f153239k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View.OnClickListener f153240l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3668o8(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.G.p(context, "context");
        this.f153229a = "o8";
        this.f153239k = AbstractC3760v3.d().f153497c;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f153237i = relativeLayout;
        this.f153234f = new C3467a3(context, (byte) 9, null);
        this.f153235g = new C3467a3(context, (byte) 10, null);
        ProgressBar progressBar = new ProgressBar(context, null, R.attr.progressBarStyleHorizontal);
        this.f153236h = progressBar;
        progressBar.setScaleY(0.8f);
        addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.setPadding(0, 0, 0, 0);
        a();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        float f10 = AbstractC3760v3.d().f153497c;
        layoutParams.setMargins(0, (int) ((-6) * f10), 0, (int) ((-8) * f10));
        Drawable progressDrawable = progressBar.getProgressDrawable();
        LayerDrawable layerDrawable = progressDrawable instanceof LayerDrawable ? (LayerDrawable) progressDrawable : null;
        if (layerDrawable != null) {
            Drawable drawable = layerDrawable.getDrawable(0);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
            layerDrawable.getDrawable(2).setColorFilter(new PorterDuffColorFilter(-327674, mode));
        }
        relativeLayout.addView(progressBar, layoutParams);
        this.f153231c = new HandlerC3654n8(this);
        this.f153240l = new View.OnClickListener() { // from class: F5.b2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3668o8.a(this.f34451a, view);
            }
        };
    }

    public final void a() {
        int i10 = (int) (30 * this.f153239k);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(12, -1);
        this.f153237i.addView(this.f153234f, layoutParams);
        this.f153234f.setOnClickListener(this.f153240l);
    }

    public final void b() {
        int i10 = (int) (30 * this.f153239k);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(12, -1);
        this.f153237i.addView(this.f153235g, layoutParams);
        this.f153235g.setOnClickListener(this.f153240l);
    }

    public final void c() {
        if (this.f153233e) {
            try {
                HandlerC3654n8 handlerC3654n8 = this.f153231c;
                if (handlerC3654n8 != null) {
                    handlerC3654n8.removeMessages(2);
                }
                setVisibility(8);
            } catch (IllegalArgumentException e10) {
                String TAG = this.f153229a;
                kotlin.jvm.internal.G.o(TAG, "TAG");
                C3511d5 c3511d5 = C3511d5.f152815a;
                C3511d5.f152817c.a(new R1(e10));
            }
            this.f153233e = false;
        }
    }

    public final void d() {
        if (!this.f153233e) {
            C3765v8 c3765v8 = this.f153232d;
            if (c3765v8 != null) {
                int currentPosition = c3765v8.getCurrentPosition();
                int duration = c3765v8.getDuration();
                if (duration != 0) {
                    this.f153236h.setProgress((currentPosition * 100) / duration);
                }
            }
            this.f153233e = true;
            C3765v8 c3765v82 = this.f153232d;
            Object tag = c3765v82 != null ? c3765v82.getTag() : null;
            C3640m8 c3640m8 = tag instanceof C3640m8 ? (C3640m8) tag : null;
            if (c3640m8 != null) {
                this.f153234f.setVisibility(c3640m8.f153167A ? 0 : 4);
                this.f153236h.setVisibility(c3640m8.f153169C ? 0 : 4);
            }
            setVisibility(0);
        }
        HandlerC3654n8 handlerC3654n8 = this.f153231c;
        if (handlerC3654n8 != null) {
            handlerC3654n8.sendEmptyMessage(2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent event) {
        C3765v8 c3765v8;
        C3765v8 c3765v82;
        kotlin.jvm.internal.G.p(event, "event");
        int keyCode = event.getKeyCode();
        boolean z10 = event.getRepeatCount() == 0 && event.getAction() == 0;
        if (keyCode != 24 && keyCode != 25 && keyCode != 27) {
            if (keyCode != 62 && keyCode != 79) {
                if (keyCode != 164) {
                    if (keyCode != 85) {
                        if (keyCode != 86) {
                            if (keyCode == 126) {
                                if (z10 && (c3765v82 = this.f153232d) != null && !c3765v82.isPlaying()) {
                                    C3765v8 c3765v83 = this.f153232d;
                                    if (c3765v83 != null) {
                                        c3765v83.start();
                                    }
                                    d();
                                }
                                return true;
                            }
                            if (keyCode != 127) {
                                d();
                                return super.dispatchKeyEvent(event);
                            }
                        }
                        if (z10 && (c3765v8 = this.f153232d) != null && c3765v8.isPlaying()) {
                            C3765v8 c3765v84 = this.f153232d;
                            if (c3765v84 != null) {
                                c3765v84.pause();
                            }
                            d();
                        }
                        return true;
                    }
                }
            }
            if (z10) {
                C3765v8 c3765v85 = this.f153232d;
                if (c3765v85 != null) {
                    if (c3765v85.isPlaying()) {
                        c3765v85.pause();
                    } else {
                        c3765v85.start();
                    }
                }
                d();
            }
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    @NotNull
    public final Map<View, FriendlyObstructionPurpose> getFriendlyViews() {
        ProgressBar progressBar = this.f153236h;
        FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.VIDEO_CONTROLS;
        return kotlin.collections.n0.M(new Pair(progressBar, friendlyObstructionPurpose), new Pair(this.f153234f, friendlyObstructionPurpose), new Pair(this.f153235g, friendlyObstructionPurpose));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        kotlin.jvm.internal.G.p(event, "event");
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(C3668o8.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        kotlin.jvm.internal.G.p(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(C3668o8.class.getName());
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent ev) {
        kotlin.jvm.internal.G.p(ev, "ev");
        C3765v8 c3765v8 = this.f153232d;
        if (c3765v8 == null || !c3765v8.a()) {
            return false;
        }
        if (this.f153233e) {
            c();
            return false;
        }
        d();
        return false;
    }

    public final void setMediaPlayer(@NotNull C3765v8 videoView) {
        kotlin.jvm.internal.G.p(videoView, "videoView");
        this.f153232d = videoView;
        Object tag = videoView.getTag();
        C3640m8 c3640m8 = tag instanceof C3640m8 ? (C3640m8) tag : null;
        if (c3640m8 == null || !c3640m8.f153167A || c3640m8.a()) {
            return;
        }
        this.f153238j = true;
        this.f153237i.removeView(this.f153235g);
        this.f153237i.removeView(this.f153234f);
        b();
    }

    public final void setVideoAd(@Nullable C3612k8 c3612k8) {
        this.f153230b = c3612k8;
    }

    public static final void a(C3668o8 this$0, View view) {
        C3612k8 c3612k8;
        C3612k8 c3612k82;
        kotlin.jvm.internal.G.p(this$0, "this$0");
        C3765v8 c3765v8 = this$0.f153232d;
        if (c3765v8 != null) {
            Object tag = c3765v8.getTag();
            C3640m8 c3640m8 = tag instanceof C3640m8 ? (C3640m8) tag : null;
            if (this$0.f153238j) {
                C3765v8 c3765v82 = this$0.f153232d;
                if (c3765v82 != null) {
                    c3765v82.k();
                }
                this$0.f153238j = false;
                this$0.f153237i.removeView(this$0.f153235g);
                this$0.f153237i.removeView(this$0.f153234f);
                this$0.a();
                if (c3640m8 == null || (c3612k82 = this$0.f153230b) == null) {
                    return;
                }
                try {
                    c3612k82.i(c3640m8);
                    c3640m8.f153175z = true;
                    return;
                } catch (Exception e10) {
                    String TAG = this$0.f153229a;
                    kotlin.jvm.internal.G.o(TAG, "TAG");
                    C3511d5 c3511d5 = C3511d5.f152815a;
                    C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
                    return;
                }
            }
            C3765v8 c3765v83 = this$0.f153232d;
            if (c3765v83 != null) {
                c3765v83.c();
            }
            this$0.f153238j = true;
            this$0.f153237i.removeView(this$0.f153234f);
            this$0.f153237i.removeView(this$0.f153235g);
            this$0.b();
            if (c3640m8 == null || (c3612k8 = this$0.f153230b) == null) {
                return;
            }
            try {
                c3612k8.e(c3640m8);
                c3640m8.f153175z = false;
            } catch (Exception e11) {
                String TAG2 = this$0.f153229a;
                kotlin.jvm.internal.G.o(TAG2, "TAG");
                C3511d5 c3511d52 = C3511d5.f152815a;
                C3511d5.f152817c.a(K4.a(e11, NotificationCompat.CATEGORY_EVENT));
            }
        }
    }
}
