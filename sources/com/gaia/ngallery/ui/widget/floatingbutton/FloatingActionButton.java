package com.gaia.ngallery.ui.widget.floatingbutton;

import N4.l;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import e.InterfaceC4339m;
import e.InterfaceC4342p;
import e.InterfaceC4346u;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
public class FloatingActionButton extends AppCompatImageButton {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f150462m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f150463n = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f150464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f150465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f150466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f150467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @InterfaceC4346u
    public int f150468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f150469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f150470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f150471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f150472i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f150473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f150474k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f150475l;

    public class a extends ShapeDrawable.ShaderFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f150476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f150477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f150478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f150479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f150480e;

        public a(int i10, int i11, int i12, int i13, int i14) {
            this.f150476a = i10;
            this.f150477b = i11;
            this.f150478c = i12;
            this.f150479d = i13;
            this.f150480e = i14;
        }

        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
        public Shader resize(int i10, int i11) {
            float f10 = i10 / 2;
            return new LinearGradient(f10, 0.0f, f10, i11, new int[]{this.f150476a, this.f150477b, this.f150478c, this.f150479d, this.f150480e}, new float[]{0.0f, 0.2f, 0.5f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static class c extends LayerDrawable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f150482a;

        public c(int i10, Drawable... drawableArr) {
            super(drawableArr);
            this.f150482a = i10;
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Rect bounds = getBounds();
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f150482a, 31);
            super.draw(canvas);
            canvas.restore();
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public void A(int i10) {
        if (this.f150465b != i10) {
            this.f150465b = i10;
            H();
        }
    }

    public void B(@InterfaceC4339m int i10) {
        A(g(i10));
    }

    public void C(@InterfaceC4346u int i10) {
        if (this.f150468e != i10) {
            this.f150468e = i10;
            this.f150469f = null;
            H();
        }
    }

    public void D(@NonNull Drawable drawable) {
        if (this.f150469f != drawable) {
            this.f150468e = 0;
            this.f150469f = drawable;
            H();
        }
    }

    public void E(int i10) {
        if (i10 != 1 && i10 != 0) {
            throw new IllegalArgumentException("Use @FAB_SIZE constants only!");
        }
        if (this.f150470g != i10) {
            this.f150470g = i10;
            I();
            J();
            H();
        }
    }

    public void F(boolean z10) {
        if (this.f150475l != z10) {
            this.f150475l = z10;
            H();
        }
    }

    public void G(String str) {
        this.f150467d = str;
        TextView textViewM = m();
        if (textViewM != null) {
            textViewM.setText(str);
        }
    }

    public void H() {
        float fK = k(l.f.f61262j2);
        float f10 = fK / 2.0f;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{getResources().getDrawable(this.f150470g == 0 ? l.g.f61636U1 : l.g.f61630T1), c(fK), e(fK), l()});
        int iK = ((int) (this.f150471h - k(l.f.f61127a2))) / 2;
        float f11 = this.f150472i;
        int i10 = (int) f11;
        float f12 = this.f150473j;
        int i11 = (int) (f11 - f12);
        int i12 = (int) (f11 + f12);
        layerDrawable.setLayerInset(1, i10, i11, i10, i12);
        int i13 = (int) (i10 - f10);
        layerDrawable.setLayerInset(2, i13, (int) (i11 - f10), i13, (int) (i12 - f10));
        int i14 = i10 + iK;
        layerDrawable.setLayerInset(3, i14, i11 + iK, i14, i12 + iK);
        setBackground(layerDrawable);
    }

    public final void I() {
        this.f150471h = k(this.f150470g == 0 ? l.f.f61247i2 : l.f.f61232h2);
    }

    public final void J() {
        this.f150474k = (int) ((this.f150472i * 2.0f) + this.f150471h);
    }

    public final int a(int i10, float f10) {
        float[] fArr = new float[3];
        Color.colorToHSV(i10, fArr);
        fArr[2] = Math.min(fArr[2] * f10, 1.0f);
        return Color.HSVToColor(Color.alpha(i10), fArr);
    }

    public final Drawable b(int i10, float f10) {
        int iAlpha = Color.alpha(i10);
        int iU = u(i10);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setColor(iU);
        Drawable[] drawableArr = {shapeDrawable, d(iU, f10)};
        LayerDrawable layerDrawable = (iAlpha == 255 || !this.f150475l) ? new LayerDrawable(drawableArr) : new c(iAlpha, drawableArr);
        int i11 = (int) (f10 / 2.0f);
        layerDrawable.setLayerInset(1, i11, i11, i11, i11);
        return layerDrawable;
    }

    public final StateListDrawable c(float f10) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, b(this.f150466c, f10));
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, b(this.f150465b, f10));
        stateListDrawable.addState(new int[0], b(this.f150464a, f10));
        return stateListDrawable;
    }

    public final Drawable d(int i10, float f10) {
        if (!this.f150475l) {
            return new ColorDrawable(0);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        int iA = a(i10, 0.9f);
        int iP = p(iA);
        int iA2 = a(i10, 1.1f);
        int iP2 = p(iA2);
        Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(f10);
        paint.setStyle(Paint.Style.STROKE);
        shapeDrawable.setShaderFactory(new a(iA2, iP2, i10, iP, iA));
        return shapeDrawable;
    }

    public final Drawable e(float f10) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(f10);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-16777216);
        paint.setAlpha((int) 5.1f);
        return shapeDrawable;
    }

    public final int f(int i10) {
        return a(i10, 0.9f);
    }

    public int g(@InterfaceC4339m int i10) {
        return getResources().getColor(i10);
    }

    public int h() {
        return this.f150466c;
    }

    public int i() {
        return this.f150464a;
    }

    public int j() {
        return this.f150465b;
    }

    public float k(@InterfaceC4342p int i10) {
        return getResources().getDimension(i10);
    }

    public Drawable l() {
        Drawable drawable = this.f150469f;
        return drawable != null ? drawable : this.f150468e != 0 ? getResources().getDrawable(this.f150468e) : new ColorDrawable(0);
    }

    public TextView m() {
        return (TextView) getTag(l.h.f62317n3);
    }

    public int n() {
        return this.f150470g;
    }

    public String o() {
        return this.f150467d;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = this.f150474k;
        setMeasuredDimension(i12, i12);
    }

    public final int p(int i10) {
        return Color.argb(Color.alpha(i10) / 2, Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    public void q(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.r.hh, 0, 0);
        this.f150464a = typedArrayObtainStyledAttributes.getColor(l.r.rh, g(R.color.holo_blue_dark));
        this.f150465b = typedArrayObtainStyledAttributes.getColor(l.r.sh, g(R.color.holo_blue_light));
        this.f150466c = typedArrayObtainStyledAttributes.getColor(l.r.qh, g(R.color.darker_gray));
        this.f150470g = typedArrayObtainStyledAttributes.getInt(l.r.uh, 0);
        this.f150468e = typedArrayObtainStyledAttributes.getResourceId(l.r.th, 0);
        this.f150467d = typedArrayObtainStyledAttributes.getString(l.r.wh);
        this.f150475l = typedArrayObtainStyledAttributes.getBoolean(l.r.vh, true);
        typedArrayObtainStyledAttributes.recycle();
        I();
        this.f150472i = k(l.f.f61217g2);
        this.f150473j = k(l.f.f61202f2);
        J();
        H();
    }

    public boolean r() {
        return this.f150475l;
    }

    public final int s(int i10) {
        return a(i10, 1.1f);
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        TextView textViewM = m();
        if (textViewM != null) {
            textViewM.setVisibility(i10);
        }
        super.setVisibility(i10);
    }

    public final int t(float f10) {
        return (int) (f10 * 255.0f);
    }

    public final int u(int i10) {
        return Color.rgb(Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    @SuppressLint({"NewApi"})
    public final void v(Drawable drawable) {
        setBackground(drawable);
    }

    public void w(int i10) {
        if (this.f150466c != i10) {
            this.f150466c = i10;
            H();
        }
    }

    public void x(@InterfaceC4339m int i10) {
        w(g(i10));
    }

    public void y(int i10) {
        if (this.f150464a != i10) {
            this.f150464a = i10;
            H();
        }
    }

    public void z(@InterfaceC4339m int i10) {
        y(g(i10));
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q(context, attributeSet);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q(context, attributeSet);
    }
}
