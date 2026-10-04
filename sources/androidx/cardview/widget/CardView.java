package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.InterfaceC4337k;
import e.P;
import z.C5849a;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {R.attr.colorBackground};
    private static final e IMPL = new b();
    private final d mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    public class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f86635a;

        public a() {
        }

        @Override // androidx.cardview.widget.d
        public boolean a() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.d
        public void b(int i10, int i11) {
            CardView cardView = CardView.this;
            if (i10 > cardView.mUserSetMinWidth) {
                CardView.super.setMinimumWidth(i10);
            }
            CardView cardView2 = CardView.this;
            if (i11 > cardView2.mUserSetMinHeight) {
                CardView.super.setMinimumHeight(i11);
            }
        }

        @Override // androidx.cardview.widget.d
        public void c(Drawable drawable) {
            this.f86635a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.d
        public Drawable d() {
            return this.f86635a;
        }

        @Override // androidx.cardview.widget.d
        public boolean e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.d
        public View f() {
            return CardView.this;
        }

        @Override // androidx.cardview.widget.d
        public void setShadowPadding(int i10, int i11, int i12, int i13) {
            CardView.this.mShadowBounds.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.mContentPadding;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }
    }

    public CardView(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return IMPL.j(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.d(this.mCardViewDelegate);
    }

    @P
    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    @P
    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    @P
    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    @P
    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return IMPL.b(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.a(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (IMPL instanceof b) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.f(this.mCardViewDelegate)), View.MeasureSpec.getSize(i10)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.c(this.mCardViewDelegate)), View.MeasureSpec.getSize(i11)), mode2);
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(@InterfaceC4337k int i10) {
        IMPL.o(this.mCardViewDelegate, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        IMPL.i(this.mCardViewDelegate, f10);
    }

    public void setContentPadding(@P int i10, @P int i11, @P int i12, @P int i13) {
        this.mContentPadding.set(i10, i11, i12, i13);
        IMPL.e(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f10) {
        IMPL.g(this.mCardViewDelegate, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.mUserSetMinHeight = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.mUserSetMinWidth = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z10;
            IMPL.k(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f10) {
        IMPL.h(this.mCardViewDelegate, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.mCompatPadding != z10) {
            this.mCompatPadding = z10;
            IMPL.m(this.mCardViewDelegate);
        }
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C5849a.C0912a.f241158g);
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        IMPL.o(this.mCardViewDelegate, colorStateList);
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i10);
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        a aVar = new a();
        this.mCardViewDelegate = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5849a.e.f241175a, i10, C5849a.d.f241172b);
        int i11 = C5849a.e.f241178d;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i11);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(C5849a.b.f241165b);
            } else {
                color = getResources().getColor(C5849a.b.f241164a);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(C5849a.e.f241179e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(C5849a.e.f241180f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(C5849a.e.f241181g, 0.0f);
        this.mCompatPadding = typedArrayObtainStyledAttributes.getBoolean(C5849a.e.f241183i, false);
        this.mPreventCornerOverlap = typedArrayObtainStyledAttributes.getBoolean(C5849a.e.f241182h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C5849a.e.f241184j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(C5849a.e.f241186l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(C5849a.e.f241188n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(C5849a.e.f241187m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(C5849a.e.f241185k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C5849a.e.f241176b, 0);
        this.mUserSetMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C5849a.e.f241177c, 0);
        typedArrayObtainStyledAttributes.recycle();
        IMPL.l(aVar, context, colorStateList, dimension, dimension2, f10);
    }
}
