package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.w;
import h.C4472a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DialogPreference extends Preference {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public CharSequence f115431T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public CharSequence f115432U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Drawable f115433V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public CharSequence f115434W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public CharSequence f115435X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f115436Y;

    public interface a {
        @Nullable
        <T extends Preference> T c(@NonNull CharSequence charSequence);
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.k.f115965k, i10, i11);
        String strO = D0.n.o(typedArrayObtainStyledAttributes, w.k.f115995u, w.k.f115968l);
        this.f115431T = strO;
        if (strO == null) {
            this.f115431T = K();
        }
        int i12 = w.k.f115992t;
        int i13 = w.k.f115971m;
        String string = typedArrayObtainStyledAttributes.getString(i12);
        this.f115432U = string == null ? typedArrayObtainStyledAttributes.getString(i13) : string;
        int i14 = w.k.f115986r;
        int i15 = w.k.f115974n;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(i14);
        this.f115433V = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(i15) : drawable;
        int i16 = w.k.f116001w;
        int i17 = w.k.f115977o;
        String string2 = typedArrayObtainStyledAttributes.getString(i16);
        this.f115434W = string2 == null ? typedArrayObtainStyledAttributes.getString(i17) : string2;
        int i18 = w.k.f115998v;
        int i19 = w.k.f115980p;
        String string3 = typedArrayObtainStyledAttributes.getString(i18);
        this.f115435X = string3 == null ? typedArrayObtainStyledAttributes.getString(i19) : string3;
        this.f115436Y = typedArrayObtainStyledAttributes.getResourceId(w.k.f115989s, typedArrayObtainStyledAttributes.getResourceId(w.k.f115983q, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void A1(int i10) {
        B1(i().getString(i10));
    }

    public void B1(@Nullable CharSequence charSequence) {
        this.f115435X = charSequence;
    }

    public void C1(int i10) {
        D1(i().getString(i10));
    }

    public void D1(@Nullable CharSequence charSequence) {
        this.f115434W = charSequence;
    }

    @Override // androidx.preference.Preference
    public void e0() {
        F().I(this);
    }

    @Nullable
    public Drawable n1() {
        return this.f115433V;
    }

    public int o1() {
        return this.f115436Y;
    }

    @Nullable
    public CharSequence p1() {
        return this.f115432U;
    }

    @Nullable
    public CharSequence q1() {
        return this.f115431T;
    }

    @Nullable
    public CharSequence r1() {
        return this.f115435X;
    }

    @Nullable
    public CharSequence s1() {
        return this.f115434W;
    }

    public void t1(int i10) {
        this.f115433V = C4472a.b(i(), i10);
    }

    public void u1(@Nullable Drawable drawable) {
        this.f115433V = drawable;
    }

    public void v1(int i10) {
        this.f115436Y = i10;
    }

    public void w1(int i10) {
        x1(i().getString(i10));
    }

    public void x1(@Nullable CharSequence charSequence) {
        this.f115432U = charSequence;
    }

    public void y1(int i10) {
        z1(i().getString(i10));
    }

    public void z1(@Nullable CharSequence charSequence) {
        this.f115431T = charSequence;
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, D0.n.a(context, w.a.f115778k, R.attr.dialogPreferenceStyle), 0);
    }

    public DialogPreference(@NonNull Context context) {
        this(context, null);
    }
}
