package androidx.viewpager.widget;

import B0.C0920d;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.InterfaceC4337k;
import e.InterfaceC4339m;
import e.InterfaceC4346u;

/* JADX INFO: loaded from: classes2.dex */
public class PagerTabStrip extends PagerTitleStrip {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final String f119845I = "PagerTabStrip";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f119846J = 3;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int f119847K = 6;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int f119848L = 16;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f119849M = 32;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f119850N = 64;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f119851O = 1;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int f119852P = 32;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f119853A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f119854B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f119855C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f119856D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f119857E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f119858F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f119859G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f119860H;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f119861s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f119862t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f119863u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f119864v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f119865w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f119866x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Paint f119867y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Rect f119868z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PagerTabStrip.this.f119875a.setCurrentItem(r2.getCurrentItem() - 1);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f119875a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(@NonNull Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int a() {
        return Math.max(super.a(), this.f119865w);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void h(int i10) {
        int i11 = this.f119864v;
        if (i10 < i11) {
            i10 = i11;
        }
        super.h(i10);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void k(int i10, float f10, boolean z10) {
        Rect rect = this.f119868z;
        int height = getHeight();
        int left = this.f119877c.getLeft() - this.f119866x;
        int right = this.f119877c.getRight() + this.f119866x;
        int i11 = height - this.f119862t;
        rect.set(left, i11, right, height);
        super.k(i10, f10, z10);
        this.f119853A = (int) (Math.abs(f10 - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f119877c.getLeft() - this.f119866x, i11, this.f119877c.getRight() + this.f119866x, height);
        invalidate(rect);
    }

    public boolean l() {
        return this.f119854B;
    }

    @InterfaceC4337k
    public int m() {
        return this.f119861s;
    }

    public void n(boolean z10) {
        this.f119854B = z10;
        this.f119855C = true;
        invalidate();
    }

    public void o(@InterfaceC4337k int i10) {
        this.f119861s = i10;
        this.f119867y.setColor(i10);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f119877c.getLeft() - this.f119866x;
        int right = this.f119877c.getRight() + this.f119866x;
        int i10 = height - this.f119862t;
        this.f119867y.setColor((this.f119853A << 24) | (this.f119861s & 16777215));
        float f10 = height;
        canvas.drawRect(left, i10, right, f10, this.f119867y);
        if (this.f119854B) {
            this.f119867y.setColor((this.f119861s & 16777215) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.f119856D, getWidth() - getPaddingRight(), f10, this.f119867y);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f119857E) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (action == 0) {
            this.f119858F = x10;
            this.f119859G = y10;
            this.f119857E = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x10 - this.f119858F) > this.f119860H || Math.abs(y10 - this.f119859G) > this.f119860H)) {
                this.f119857E = true;
            }
        } else if (x10 < this.f119877c.getLeft() - this.f119866x) {
            ViewPager viewPager = this.f119875a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        } else if (x10 > this.f119877c.getRight() + this.f119866x) {
            ViewPager viewPager2 = this.f119875a;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
        return true;
    }

    public void p(@InterfaceC4339m int i10) {
        o(C0920d.getColor(getContext(), i10));
    }

    @Override // android.view.View
    public void setBackgroundColor(@InterfaceC4337k int i10) {
        super.setBackgroundColor(i10);
        if (this.f119855C) {
            return;
        }
        this.f119854B = (i10 & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f119855C) {
            return;
        }
        this.f119854B = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC4346u int i10) {
        super.setBackgroundResource(i10);
        if (this.f119855C) {
            return;
        }
        this.f119854B = i10 == 0;
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        int i14 = this.f119863u;
        if (i13 < i14) {
            i13 = i14;
        }
        super.setPadding(i10, i11, i12, i13);
    }

    public PagerTabStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f119867y = paint;
        this.f119868z = new Rect();
        this.f119853A = 255;
        this.f119854B = false;
        this.f119855C = false;
        int i10 = this.f119888n;
        this.f119861s = i10;
        paint.setColor(i10);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f119862t = (int) ((3.0f * f10) + 0.5f);
        this.f119863u = (int) ((6.0f * f10) + 0.5f);
        this.f119864v = (int) (64.0f * f10);
        this.f119866x = (int) ((16.0f * f10) + 0.5f);
        this.f119856D = (int) ((1.0f * f10) + 0.5f);
        this.f119865w = (int) ((f10 * 32.0f) + 0.5f);
        this.f119860H = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        h(b());
        setWillNotDraw(false);
        this.f119876b.setFocusable(true);
        this.f119876b.setOnClickListener(new a());
        this.f119878d.setFocusable(true);
        this.f119878d.setOnClickListener(new b());
        if (getBackground() == null) {
            this.f119854B = true;
        }
    }
}
