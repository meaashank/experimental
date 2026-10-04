package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.github.appintro.AppIntroBaseFragmentKt;

/* JADX INFO: loaded from: classes5.dex */
public class ProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Runnable f156883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f156884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f156885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f156886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f156887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f156888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f156889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Handler f156890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Drawable f156891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f156892j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f156893k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f156894l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f156895m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f156896n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f156897o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f156898p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Rect f156899q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f156900r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f156901s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f156902t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f156903u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f156904v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f156905w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f156906x;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar.this.invalidate();
        }
    }

    public ProgressBar(Context context) {
        super(context);
        this.f156883a = new a();
        this.f156889g = 25L;
        this.f156890h = new Handler(Looper.getMainLooper());
        this.f156893k = false;
        this.f156896n = 0.95f;
        this.f156897o = false;
        this.f156899q = new Rect();
        a(context);
    }

    private void a(Context context) {
        setWillNotDraw(false);
    }

    private float getVelocity() {
        if (this.f156902t) {
            return this.f156894l ? 1.0f : 0.4f;
        }
        if (this.f156906x < 2000) {
            if (this.f156904v == 1) {
                return this.f156894l ? 1.0f : 0.4f;
            }
            if (this.f156903u == 1) {
                return this.f156894l ? 0.4f : 0.2f;
            }
            if (this.f156894l) {
                return 0.2f;
            }
        }
        return 0.05f;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.f156893k) {
            this.f156893k = true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f156897o ? 0L : jCurrentTimeMillis - this.f156895m;
        this.f156886d = Math.abs(j10 / 1000.0f);
        this.f156895m = jCurrentTimeMillis;
        this.f156906x += j10;
        float velocity = getVelocity();
        this.f156885c = velocity;
        float f10 = (velocity * this.f156886d) + this.f156884b;
        this.f156884b = f10;
        if (!this.f156902t) {
            float f11 = this.f156896n;
            if (f10 > f11) {
                this.f156884b = f11;
            }
        }
        this.f156899q.right = (int) (this.f156884b * this.f156901s);
        this.f156890h.removeCallbacksAndMessages(null);
        this.f156890h.postDelayed(this.f156883a, this.f156889g);
        super.draw(canvas);
        a(canvas, this.f156886d);
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z10) {
        return null;
    }

    public float getProgress() {
        return this.f156884b;
    }

    public void initResource(boolean z10) {
        if (z10 || (this.f156891i == null && this.f156898p == null && this.f156900r == null && this.f156887e == null)) {
            Drawable drawable = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_highlight", AppIntroBaseFragmentKt.ARG_DRAWABLE, com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f156891i = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f156891i.getIntrinsicHeight());
            }
            Drawable drawable2 = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_head", AppIntroBaseFragmentKt.ARG_DRAWABLE, com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f156898p = drawable2;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f156898p.getIntrinsicHeight());
            }
            this.f156900r = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_tail", AppIntroBaseFragmentKt.ARG_DRAWABLE, com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f156887e = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_end_animation", AppIntroBaseFragmentKt.ARG_DRAWABLE, com.mbridge.msdk.foundation.controller.c.n().i()));
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f156901s = getMeasuredWidth();
    }

    public void onThemeChange() {
        if (this.f156893k) {
            initResource(true);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Drawable drawable = this.f156891i;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (((double) drawable.getIntrinsicWidth()) * 1.5d), getHeight());
        }
        Drawable drawable2 = this.f156898p;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    public void setPaused(boolean z10) {
        this.f156897o = z10;
        if (z10) {
            return;
        }
        this.f156895m = System.currentTimeMillis();
    }

    public void setProgress(float f10, boolean z10) {
        if (!z10 || f10 < 1.0f) {
            return;
        }
        startEndAnimation();
    }

    public void setProgressBarListener(c cVar) {
    }

    public void setProgressState(int i10) {
        if (i10 == 5) {
            this.f156903u = 1;
            this.f156904v = 0;
            this.f156905w = 0;
            this.f156906x = 0L;
            return;
        }
        if (i10 == 6) {
            this.f156904v = 1;
            if (this.f156905w == 1) {
                startEndAnimation();
            }
            this.f156906x = 0L;
            return;
        }
        if (i10 == 7) {
            startEndAnimation();
        } else {
            if (i10 != 8) {
                return;
            }
            this.f156905w = 1;
            if (this.f156904v == 1) {
                startEndAnimation();
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public void setVisible(boolean z10) {
        if (!z10) {
            setVisibility(4);
            return;
        }
        this.f156894l = true;
        this.f156895m = System.currentTimeMillis();
        this.f156886d = 0.0f;
        this.f156906x = 0L;
        this.f156902t = false;
        this.f156888f = 0.0f;
        this.f156884b = 0.0f;
        this.f156901s = getMeasuredWidth();
        this.f156897o = false;
        this.f156903u = 0;
        this.f156904v = 0;
        this.f156905w = 0;
        Drawable drawable = this.f156891i;
        if (drawable != null) {
            this.f156892j = -drawable.getIntrinsicWidth();
        } else {
            this.f156892j = 0;
        }
        Drawable drawable2 = this.f156900r;
        if (drawable2 != null) {
            drawable2.setAlpha(255);
        }
        Drawable drawable3 = this.f156887e;
        if (drawable3 != null) {
            drawable3.setAlpha(255);
        }
        Drawable drawable4 = this.f156898p;
        if (drawable4 != null) {
            drawable4.setAlpha(255);
        }
        setVisibility(0);
        invalidate();
    }

    public void startEndAnimation() {
        if (this.f156902t) {
            return;
        }
        this.f156902t = true;
        this.f156888f = 0.0f;
    }

    private void a(Canvas canvas, float f10) {
        Drawable drawable;
        Drawable drawable2;
        if (this.f156902t) {
            float f11 = this.f156888f;
            float f12 = this.f156901s * 0.5f;
            int i10 = (int) ((1.0f - (f11 / f12)) * 255.0f);
            if (i10 < 0) {
                i10 = 0;
            }
            if (f11 > f12) {
                setVisible(false);
            }
            Drawable drawable3 = this.f156900r;
            if (drawable3 != null) {
                drawable3.setAlpha(i10);
            }
            Drawable drawable4 = this.f156887e;
            if (drawable4 != null) {
                drawable4.setAlpha(i10);
            }
            Drawable drawable5 = this.f156898p;
            if (drawable5 != null) {
                drawable5.setAlpha(i10);
            }
            canvas.save();
            canvas.translate(this.f156888f, 0.0f);
        }
        if (this.f156900r != null && this.f156898p != null) {
            Drawable drawable6 = this.f156900r;
            drawable6.setBounds(0, 0, (int) (this.f156899q.width() - (this.f156898p.getIntrinsicWidth() * 0.05f)), drawable6.getIntrinsicHeight());
            this.f156900r.draw(canvas);
        }
        if (this.f156902t && (drawable2 = this.f156887e) != null && this.f156898p != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable7 = this.f156887e;
            drawable7.setBounds(0, 0, intrinsicWidth, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate(-intrinsicWidth, 0.0f);
            this.f156887e.draw(canvas);
            canvas.restore();
        }
        if (this.f156898p != null) {
            canvas.save();
            canvas.translate(this.f156899q.width() - getWidth(), 0.0f);
            this.f156898p.draw(canvas);
            canvas.restore();
        }
        if (!this.f156902t && Math.abs(this.f156884b - this.f156896n) < 1.0E-5f && (drawable = this.f156891i) != null) {
            int i11 = (int) ((f10 * 0.2f * this.f156901s) + this.f156892j);
            this.f156892j = i11;
            if (drawable.getIntrinsicWidth() + i11 >= this.f156899q.width()) {
                this.f156892j = -this.f156891i.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate(this.f156892j, 0.0f);
            this.f156891i.draw(canvas);
            canvas.restore();
        }
        if (this.f156902t) {
            canvas.restore();
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f156883a = new a();
        this.f156889g = 25L;
        this.f156890h = new Handler(Looper.getMainLooper());
        this.f156893k = false;
        this.f156896n = 0.95f;
        this.f156897o = false;
        this.f156899q = new Rect();
        a(context);
    }
}
