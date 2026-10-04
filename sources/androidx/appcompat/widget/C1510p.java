package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.Nullable;
import androidx.core.view.C2507z0;
import g.C4426a;

/* JADX INFO: renamed from: androidx.appcompat.widget.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1510p extends C1508n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SeekBar f86406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f86407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f86408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f86409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f86410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f86411i;

    public C1510p(SeekBar seekBar) {
        super(seekBar);
        this.f86408f = null;
        this.f86409g = null;
        this.f86410h = false;
        this.f86411i = false;
        this.f86406d = seekBar;
    }

    @Override // androidx.appcompat.widget.C1508n
    public void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f86406d.getContext();
        int[] iArr = C4426a.m.f202023i0;
        W wG = W.G(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f86406d;
        C2507z0.E1(seekBar, seekBar.getContext(), iArr, attributeSet, wG.f86249b, i10, 0);
        Drawable drawableI = wG.i(C4426a.m.f202032j0);
        if (drawableI != null) {
            this.f86406d.setThumb(drawableI);
        }
        m(wG.h(C4426a.m.f202041k0));
        int i11 = C4426a.m.f202057m0;
        if (wG.f86249b.hasValue(i11)) {
            this.f86409g = B.e(wG.f86249b.getInt(i11, -1), this.f86409g);
            this.f86411i = true;
        }
        int i12 = C4426a.m.f202049l0;
        if (wG.f86249b.hasValue(i12)) {
            this.f86408f = wG.d(i12);
            this.f86410h = true;
        }
        wG.I();
        f();
    }

    public final void f() {
        Drawable drawable = this.f86407e;
        if (drawable != null) {
            if (this.f86410h || this.f86411i) {
                Drawable drawableMutate = drawable.mutate();
                this.f86407e = drawableMutate;
                if (this.f86410h) {
                    drawableMutate.setTintList(this.f86408f);
                }
                if (this.f86411i) {
                    this.f86407e.setTintMode(this.f86409g);
                }
                if (this.f86407e.isStateful()) {
                    this.f86407e.setState(this.f86406d.getDrawableState());
                }
            }
        }
    }

    public void g(Canvas canvas) {
        if (this.f86407e != null) {
            int max = this.f86406d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f86407e.getIntrinsicWidth();
                int intrinsicHeight = this.f86407e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f86407e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f86406d.getWidth() - this.f86406d.getPaddingLeft()) - this.f86406d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f86406d.getPaddingLeft(), this.f86406d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f86407e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void h() {
        Drawable drawable = this.f86407e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f86406d.getDrawableState())) {
            this.f86406d.invalidateDrawable(drawable);
        }
    }

    @Nullable
    public Drawable i() {
        return this.f86407e;
    }

    @Nullable
    public ColorStateList j() {
        return this.f86408f;
    }

    @Nullable
    public PorterDuff.Mode k() {
        return this.f86409g;
    }

    public void l() {
        Drawable drawable = this.f86407e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void m(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f86407e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f86407e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f86406d);
            drawable.setLayoutDirection(C2507z0.c0(this.f86406d));
            if (drawable.isStateful()) {
                drawable.setState(this.f86406d.getDrawableState());
            }
            f();
        }
        this.f86406d.invalidate();
    }

    public void n(@Nullable ColorStateList colorStateList) {
        this.f86408f = colorStateList;
        this.f86410h = true;
        f();
    }

    public void o(@Nullable PorterDuff.Mode mode) {
        this.f86409g = mode;
        this.f86411i = true;
        f();
    }
}
