package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.g;

/* JADX INFO: loaded from: classes2.dex */
public class MotionTelltales extends MockView {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f107563s = "MotionTelltales";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint f107564l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MotionLayout f107565m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float[] f107566n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Matrix f107567o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f107568p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f107569q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f107570r;

    public MotionTelltales(Context context) {
        super(context);
        this.f107564l = new Paint();
        this.f107566n = new float[2];
        this.f107567o = new Matrix();
        this.f107568p = 0;
        this.f107569q = -65281;
        this.f107570r = 0.25f;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, g.m.vk);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.m.wk) {
                    this.f107569q = typedArrayObtainStyledAttributes.getColor(index, this.f107569q);
                } else if (index == g.m.yk) {
                    this.f107568p = typedArrayObtainStyledAttributes.getInt(index, this.f107568p);
                } else if (index == g.m.xk) {
                    this.f107570r = typedArrayObtainStyledAttributes.getFloat(index, this.f107570r);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f107564l.setColor(this.f107569q);
        this.f107564l.setStrokeWidth(5.0f);
    }

    public void b(CharSequence text) {
        this.f107496f = text.toString();
        requestLayout();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f107567o);
        if (this.f107565m == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f107565m = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i10 = 0; i10 < 5; i10++) {
            float f10 = fArr[i10];
            for (int i11 = 0; i11 < 5; i11++) {
                float f11 = fArr[i11];
                this.f107565m.y0(this, f11, f10, this.f107566n, this.f107568p);
                this.f107567o.mapVectors(this.f107566n);
                float f12 = width * f11;
                float f13 = height * f10;
                float[] fArr2 = this.f107566n;
                float f14 = fArr2[0];
                float f15 = this.f107570r;
                float f16 = f13 - (fArr2[1] * f15);
                this.f107567o.mapVectors(fArr2);
                canvas.drawLine(f12, f13, f12 - (f14 * f15), f16, this.f107564l);
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        postInvalidate();
    }

    public MotionTelltales(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f107564l = new Paint();
        this.f107566n = new float[2];
        this.f107567o = new Matrix();
        this.f107568p = 0;
        this.f107569q = -65281;
        this.f107570r = 0.25f;
        a(context, attrs);
    }

    public MotionTelltales(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f107564l = new Paint();
        this.f107566n = new float[2];
        this.f107567o = new Matrix();
        this.f107568p = 0;
        this.f107569q = -65281;
        this.f107570r = 0.25f;
        a(context, attrs);
    }
}
