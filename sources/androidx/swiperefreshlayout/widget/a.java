package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.C2507z0;
import y2.C5811a;

/* JADX INFO: loaded from: classes2.dex */
public class a extends ImageView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f117547d = -328966;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f117548e = 1023410176;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f117549f = 503316480;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f117550g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f117551h = 1.75f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f117552i = 3.5f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f117553j = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Animation.AnimationListener f117554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f117555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f117556c;

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.a$a, reason: collision with other inner class name */
    public static class C0332a extends OvalShape {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Paint f117557a = new Paint();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f117558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f117559c;

        public C0332a(a aVar, int i10) {
            this.f117559c = aVar;
            this.f117558b = i10;
            a((int) rect().width());
        }

        public final void a(int i10) {
            float f10 = i10 / 2;
            this.f117557a.setShader(new RadialGradient(f10, f10, this.f117558b, new int[]{a.f117548e, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = this.f117559c.getWidth() / 2;
            float height = this.f117559c.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f117557a);
            canvas.drawCircle(width, height, r0 - this.f117558b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f10, float f11) {
            super.onResize(f10, f11);
            a((int) f10);
        }
    }

    public a(Context context) {
        super(context);
        float f10 = getContext().getResources().getDisplayMetrics().density;
        this.f117555b = (int) (3.5f * f10);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(C5811a.j.f241017Q);
        this.f117556c = typedArrayObtainStyledAttributes.getColor(C5811a.j.f241018R, f117547d);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        C2507z0.U1(this, f10 * 4.0f);
        shapeDrawable.getPaint().setColor(this.f117556c);
        C2507z0.O1(this, shapeDrawable);
    }

    public final boolean a() {
        return true;
    }

    public int b() {
        return this.f117556c;
    }

    public void c(Animation.AnimationListener animationListener) {
        this.f117554a = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f117554a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f117554a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
            this.f117556c = i10;
        }
    }
}
