package androidx.appcompat.widget;

import B0.C0920d;
import D0.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.InterfaceC4345t;
import h.C4472a;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f86248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypedArray f86249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f86250c;

    @e.T(21)
    public static class a {
        @InterfaceC4345t
        public static int a(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @InterfaceC4345t
        public static int b(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    public W(Context context, TypedArray typedArray) {
        this.f86248a = context;
        this.f86249b = typedArray;
    }

    public static W E(Context context, int i10, int[] iArr) {
        return new W(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static W F(Context context, AttributeSet attributeSet, int[] iArr) {
        return new W(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static W G(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new W(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean A(int i10, TypedValue typedValue) {
        return this.f86249b.getValue(i10, typedValue);
    }

    public TypedArray B() {
        return this.f86249b;
    }

    public boolean C(int i10) {
        return this.f86249b.hasValue(i10);
    }

    public int D() {
        return this.f86249b.length();
    }

    public TypedValue H(int i10) {
        return this.f86249b.peekValue(i10);
    }

    public void I() {
        this.f86249b.recycle();
    }

    public boolean a(int i10, boolean z10) {
        return this.f86249b.getBoolean(i10, z10);
    }

    @e.T(21)
    public int b() {
        return a.a(this.f86249b);
    }

    public int c(int i10, int i11) {
        return this.f86249b.getColor(i10, i11);
    }

    public ColorStateList d(int i10) {
        int resourceId;
        ColorStateList colorStateList;
        return (!this.f86249b.hasValue(i10) || (resourceId = this.f86249b.getResourceId(i10, 0)) == 0 || (colorStateList = C0920d.getColorStateList(this.f86248a, resourceId)) == null) ? this.f86249b.getColorStateList(i10) : colorStateList;
    }

    public float e(int i10, float f10) {
        return this.f86249b.getDimension(i10, f10);
    }

    public int f(int i10, int i11) {
        return this.f86249b.getDimensionPixelOffset(i10, i11);
    }

    public int g(int i10, int i11) {
        return this.f86249b.getDimensionPixelSize(i10, i11);
    }

    public Drawable h(int i10) {
        int resourceId;
        return (!this.f86249b.hasValue(i10) || (resourceId = this.f86249b.getResourceId(i10, 0)) == 0) ? this.f86249b.getDrawable(i10) : C4472a.b(this.f86248a, resourceId);
    }

    public Drawable i(int i10) {
        int resourceId;
        if (!this.f86249b.hasValue(i10) || (resourceId = this.f86249b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return C1502h.b().d(this.f86248a, resourceId, true);
    }

    public float j(int i10, float f10) {
        return this.f86249b.getFloat(i10, f10);
    }

    @Nullable
    public Typeface k(@e.b0 int i10, int i11, @Nullable i.f fVar) {
        int resourceId = this.f86249b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f86250c == null) {
            this.f86250c = new TypedValue();
        }
        return D0.i.k(this.f86248a, resourceId, this.f86250c, i11, fVar);
    }

    public float l(int i10, int i11, int i12, float f10) {
        return this.f86249b.getFraction(i10, i11, i12, f10);
    }

    public int m(int i10) {
        return this.f86249b.getIndex(i10);
    }

    public int n() {
        return this.f86249b.getIndexCount();
    }

    public int o(int i10, int i11) {
        return this.f86249b.getInt(i10, i11);
    }

    public int p(int i10, int i11) {
        return this.f86249b.getInteger(i10, i11);
    }

    public int q(int i10, int i11) {
        return this.f86249b.getLayoutDimension(i10, i11);
    }

    public int r(int i10, String str) {
        return this.f86249b.getLayoutDimension(i10, str);
    }

    public String s(int i10) {
        return this.f86249b.getNonResourceString(i10);
    }

    public String t() {
        return this.f86249b.getPositionDescription();
    }

    public int u(int i10, int i11) {
        return this.f86249b.getResourceId(i10, i11);
    }

    public Resources v() {
        return this.f86249b.getResources();
    }

    public String w(int i10) {
        return this.f86249b.getString(i10);
    }

    public CharSequence x(int i10) {
        return this.f86249b.getText(i10);
    }

    public CharSequence[] y(int i10) {
        return this.f86249b.getTextArray(i10);
    }

    public int z(int i10) {
        return a.b(this.f86249b, i10);
    }
}
