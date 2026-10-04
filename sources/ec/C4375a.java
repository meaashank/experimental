package ec;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.SectionIndexer;
import androidx.compose.animation.W;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import e.InterfaceC4337k;
import in.myinnos.alphabetsindexfastscrollrecycler.IndexFastScrollRecyclerView;

/* JADX INFO: renamed from: ec.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C4375a extends RecyclerView.i {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f200322I = 1;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final long f200323J = 10;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @InterfaceC4337k
    public int f200324A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @InterfaceC4337k
    public int f200325B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f200326C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f200327D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public AttributeSet f200329F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f200332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f200333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f200334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f200335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f200336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f200337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f200338g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecyclerView f200341j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RectF f200344m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f200345n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f200346o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f200347p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f200348q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f200350s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @InterfaceC4337k
    public int f200354w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @InterfaceC4337k
    public int f200355x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @InterfaceC4337k
    public int f200356y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f200357z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f200339h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f200340i = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SectionIndexer f200342k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String[] f200343l = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f200349r = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Typeface f200351t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Boolean f200352u = Boolean.TRUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Boolean f200353v = Boolean.FALSE;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f200328E = -1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Runnable f200330G = null;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @SuppressLint({"HandlerLeak"})
    public Handler f200331H = new HandlerC0728a();

    /* JADX INFO: renamed from: ec.a$a, reason: collision with other inner class name */
    public class HandlerC0728a extends Handler {

        /* JADX INFO: renamed from: ec.a$a$a, reason: collision with other inner class name */
        public class RunnableC0729a implements Runnable {
            public RunnableC0729a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C4375a.this.f200341j.invalidate();
            }
        }

        public HandlerC0728a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                C4375a.this.f200341j.invalidate();
            }
            C4375a c4375a = C4375a.this;
            RunnableC0729a runnableC0729a = new RunnableC0729a();
            c4375a.f200330G = runnableC0729a;
            c4375a.f200341j.postDelayed(runnableC0729a, 10L);
        }
    }

    public C4375a(Context context, IndexFastScrollRecyclerView indexFastScrollRecyclerView) {
        this.f200341j = null;
        this.f200345n = indexFastScrollRecyclerView.f202923d;
        this.f200346o = indexFastScrollRecyclerView.f202924e;
        this.f200347p = indexFastScrollRecyclerView.f202925f;
        this.f200348q = indexFastScrollRecyclerView.f202926g;
        this.f200357z = indexFastScrollRecyclerView.f202932m;
        this.f200324A = indexFastScrollRecyclerView.f202933n;
        this.f200325B = indexFastScrollRecyclerView.f202934o;
        this.f200326C = (int) (indexFastScrollRecyclerView.f202935p * 255.0f);
        this.f200350s = indexFastScrollRecyclerView.f202927h;
        this.f200354w = indexFastScrollRecyclerView.f202929j;
        this.f200355x = indexFastScrollRecyclerView.f202930k;
        this.f200356y = indexFastScrollRecyclerView.f202931l;
        this.f200327D = (int) (indexFastScrollRecyclerView.f202928i * 255.0f);
        this.f200335d = context.getResources().getDisplayMetrics().density;
        this.f200336e = context.getResources().getDisplayMetrics().scaledDensity;
        this.f200341j = indexFastScrollRecyclerView;
        l(indexFastScrollRecyclerView.getAdapter());
        float f10 = this.f200346o;
        float f11 = this.f200335d;
        this.f200332a = f10 * f11;
        this.f200333b = this.f200347p * f11;
        this.f200334c = this.f200348q * f11;
    }

    public void A(float f10) {
        this.f200326C = (int) (f10 * 255.0f);
    }

    public void B(boolean z10) {
        this.f200349r = z10;
    }

    public void C(Typeface typeface) {
        this.f200351t = typeface;
    }

    public boolean d(float f10, float f11) {
        RectF rectF = this.f200344m;
        if (f10 < rectF.left) {
            return false;
        }
        float f12 = rectF.top;
        return f11 >= f12 && f11 <= rectF.height() + f12;
    }

    public final int e(float f10) {
        return (int) (f10 * 255.0f);
    }

    public void f(Canvas canvas) {
        int i10;
        if (this.f200352u.booleanValue()) {
            Paint paint = new Paint();
            paint.setColor(this.f200354w);
            paint.setAlpha(this.f200327D);
            paint.setAntiAlias(true);
            RectF rectF = this.f200344m;
            int i11 = this.f200350s;
            float f10 = this.f200335d;
            canvas.drawRoundRect(rectF, i11 * f10, i11 * f10, paint);
            String[] strArr = this.f200343l;
            if (strArr == null || strArr.length <= 0) {
                return;
            }
            if (this.f200349r && (i10 = this.f200339h) >= 0 && strArr[i10] != "") {
                Paint paint2 = new Paint();
                paint2.setColor(this.f200324A);
                paint2.setAlpha(this.f200326C);
                paint2.setAntiAlias(true);
                paint2.setShadowLayer(3.0f, 0.0f, 0.0f, Color.argb(64, 0, 0, 0));
                Paint paint3 = new Paint();
                paint3.setColor(this.f200325B);
                paint3.setAntiAlias(true);
                paint3.setTextSize(this.f200357z * this.f200336e);
                paint3.setTypeface(this.f200351t);
                float fMeasureText = paint3.measureText(this.f200343l[this.f200339h]);
                float fMax = Math.max((paint3.descent() + (this.f200334c * 2.0f)) - paint3.ascent(), (this.f200334c * 2.0f) + fMeasureText);
                int i12 = this.f200337f;
                int i13 = this.f200338g;
                RectF rectF2 = new RectF((i12 - fMax) / 2.0f, (i13 - fMax) / 2.0f, W.a(i12, fMax, 2.0f, fMax), W.a(i13, fMax, 2.0f, fMax));
                float f11 = this.f200335d;
                canvas.drawRoundRect(rectF2, f11 * 5.0f, f11 * 5.0f, paint2);
                canvas.drawText(this.f200343l[this.f200339h], (((fMax - fMeasureText) / 2.0f) + rectF2.left) - 1.0f, (((fMax - (paint3.descent() - paint3.ascent())) / 2.0f) + rectF2.top) - paint3.ascent(), paint3);
                g(300L);
            }
            Paint paint4 = new Paint();
            paint4.setColor(this.f200355x);
            paint4.setAntiAlias(true);
            paint4.setTextSize(this.f200345n * this.f200336e);
            paint4.setTypeface(this.f200351t);
            float fHeight = (this.f200344m.height() - (this.f200333b * 2.0f)) / this.f200343l.length;
            float fDescent = (fHeight - (paint4.descent() - paint4.ascent())) / 2.0f;
            for (int i14 = 0; i14 < this.f200343l.length; i14++) {
                if (this.f200353v.booleanValue()) {
                    int i15 = this.f200339h;
                    if (i15 <= -1 || i14 != i15) {
                        paint4.setTypeface(this.f200351t);
                        paint4.setTextSize(this.f200345n * this.f200336e);
                        paint4.setColor(this.f200355x);
                    } else {
                        paint4.setTypeface(Typeface.create(this.f200351t, 1));
                        paint4.setTextSize((this.f200345n + 3) * this.f200336e);
                        paint4.setColor(this.f200356y);
                    }
                    float fMeasureText2 = (this.f200332a - paint4.measureText(this.f200343l[i14])) / 2.0f;
                    String str = this.f200343l[i14];
                    RectF rectF3 = this.f200344m;
                    canvas.drawText(str, rectF3.left + fMeasureText2, (((i14 * fHeight) + (rectF3.top + this.f200333b)) + fDescent) - paint4.ascent(), paint4);
                } else {
                    float fMeasureText3 = (this.f200332a - paint4.measureText(this.f200343l[i14])) / 2.0f;
                    String str2 = this.f200343l[i14];
                    RectF rectF4 = this.f200344m;
                    canvas.drawText(str2, rectF4.left + fMeasureText3, (((i14 * fHeight) + (rectF4.top + this.f200333b)) + fDescent) - paint4.ascent(), paint4);
                }
            }
        }
    }

    public final void g(long j10) {
        Runnable runnable;
        RecyclerView recyclerView = this.f200341j;
        if (recyclerView != null && (runnable = this.f200330G) != null) {
            recyclerView.removeCallbacks(runnable);
        }
        this.f200331H.removeMessages(0);
        this.f200331H.sendEmptyMessageAtTime(1, SystemClock.uptimeMillis() + j10);
    }

    public final int h(float f10) {
        String[] strArr = this.f200343l;
        if (strArr == null || strArr.length == 0) {
            return 0;
        }
        RectF rectF = this.f200344m;
        float f11 = rectF.top;
        if (f10 < this.f200333b + f11) {
            return 0;
        }
        float fHeight = rectF.height() + f11;
        float f12 = this.f200333b;
        if (f10 >= fHeight - f12) {
            return this.f200343l.length - 1;
        }
        RectF rectF2 = this.f200344m;
        return (int) (((f10 - rectF2.top) - f12) / ((rectF2.height() - (this.f200333b * 2.0f)) / this.f200343l.length));
    }

    public void i(int i10, int i11, int i12, int i13) {
        this.f200337f = i10;
        this.f200338g = i11;
        float f10 = i10;
        float f11 = this.f200333b;
        this.f200344m = new RectF((f10 - f11) - this.f200332a, f11, f10 - f11, i11 - f11);
    }

    public boolean j(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && this.f200340i) {
                    if (d(motionEvent.getX(), motionEvent.getY())) {
                        this.f200339h = h(motionEvent.getY());
                        k();
                    }
                    return true;
                }
            } else if (this.f200340i) {
                this.f200340i = false;
                this.f200339h = -1;
            }
        } else if (d(motionEvent.getX(), motionEvent.getY())) {
            this.f200340i = true;
            this.f200339h = h(motionEvent.getY());
            k();
            return true;
        }
        return false;
    }

    public final void k() {
        try {
            int positionForSection = this.f200342k.getPositionForSection(this.f200339h);
            RecyclerView.LayoutManager layoutManager = this.f200341j.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(positionForSection, 0);
            } else {
                layoutManager.scrollToPosition(positionForSection);
            }
        } catch (Exception unused) {
            Log.d("INDEX_BAR", "Data size returns null");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void l(RecyclerView.Adapter adapter) {
        if (adapter instanceof SectionIndexer) {
            adapter.registerAdapterDataObserver(this);
            SectionIndexer sectionIndexer = (SectionIndexer) adapter;
            this.f200342k = sectionIndexer;
            this.f200343l = (String[]) sectionIndexer.getSections();
        }
    }

    public void m(@InterfaceC4337k int i10) {
        this.f200354w = i10;
    }

    public void n(int i10) {
        this.f200350s = i10;
    }

    public void o(@InterfaceC4337k int i10) {
        this.f200356y = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void onChanged() {
        this.f200343l = (String[]) this.f200342k.getSections();
    }

    public void p(boolean z10) {
        this.f200353v = Boolean.valueOf(z10);
    }

    public void q(@InterfaceC4337k int i10) {
        this.f200355x = i10;
    }

    public void r(float f10) {
        this.f200327D = (int) (f10 * 255.0f);
    }

    public void s(boolean z10) {
        this.f200352u = Boolean.valueOf(z10);
    }

    public void t(int i10) {
        this.f200345n = i10;
    }

    public void u(float f10) {
        this.f200333b = f10;
    }

    public void v(float f10) {
        this.f200332a = f10;
    }

    public void w(@InterfaceC4337k int i10) {
        this.f200324A = i10;
    }

    public void x(int i10) {
        this.f200348q = i10;
    }

    public void y(@InterfaceC4337k int i10) {
        this.f200325B = i10;
    }

    public void z(int i10) {
        this.f200357z = i10;
    }
}
