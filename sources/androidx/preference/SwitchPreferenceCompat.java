package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.SwitchCompat;
import androidx.preference.w;

/* JADX INFO: loaded from: classes2.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final a f115533Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public CharSequence f115534Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public CharSequence f115535a0;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (SwitchPreferenceCompat.this.b(Boolean.valueOf(z10))) {
                SwitchPreferenceCompat.this.r1(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public SwitchPreferenceCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f115533Y = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.k.f116012z1, i10, i11);
        w1(D0.n.o(typedArrayObtainStyledAttributes, w.k.f115896H1, w.k.f115875A1));
        int i12 = w.k.f115893G1;
        int i13 = w.k.f115878B1;
        String string = typedArrayObtainStyledAttributes.getString(i12);
        u1(string == null ? typedArrayObtainStyledAttributes.getString(i13) : string);
        int i14 = w.k.f115902J1;
        int i15 = w.k.f115884D1;
        String string2 = typedArrayObtainStyledAttributes.getString(i14);
        E1(string2 == null ? typedArrayObtainStyledAttributes.getString(i15) : string2);
        int i16 = w.k.f115899I1;
        int i17 = w.k.f115887E1;
        String string3 = typedArrayObtainStyledAttributes.getString(i16);
        C1(string3 == null ? typedArrayObtainStyledAttributes.getString(i17) : string3);
        s1(typedArrayObtainStyledAttributes.getBoolean(w.k.f115890F1, typedArrayObtainStyledAttributes.getBoolean(w.k.f115881C1, false)));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void F1(View view) {
        boolean z10 = view instanceof SwitchCompat;
        if (z10) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f115537T);
        }
        if (z10) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f115534Z);
            switchCompat.setTextOff(this.f115535a0);
            switchCompat.setOnCheckedChangeListener(this.f115533Y);
        }
    }

    private void G1(View view) {
        if (((AccessibilityManager) i().getSystemService("accessibility")).isEnabled()) {
            F1(view.findViewById(w.f.f115813i));
            x1(view.findViewById(R.id.summary));
        }
    }

    @Nullable
    public CharSequence A1() {
        return this.f115534Z;
    }

    public void B1(int i10) {
        C1(i().getString(i10));
    }

    public void C1(@Nullable CharSequence charSequence) {
        this.f115535a0 = charSequence;
        X();
    }

    public void D1(int i10) {
        E1(i().getString(i10));
    }

    public void E1(@Nullable CharSequence charSequence) {
        this.f115534Z = charSequence;
        X();
    }

    @Override // androidx.preference.Preference
    public void d0(@NonNull v vVar) {
        super.d0(vVar);
        F1(vVar.d(w.f.f115813i));
        y1(vVar);
    }

    @Override // androidx.preference.Preference
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void r0(@NonNull View view) {
        q0();
        G1(view);
    }

    @Nullable
    public CharSequence z1() {
        return this.f115535a0;
    }

    public SwitchPreferenceCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreferenceCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, w.a.f115763c0, 0);
    }

    public SwitchPreferenceCompat(@NonNull Context context) {
        this(context, null);
    }
}
