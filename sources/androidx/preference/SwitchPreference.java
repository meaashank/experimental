package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.preference.w;

/* JADX INFO: loaded from: classes2.dex */
public class SwitchPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final a f115529Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public CharSequence f115530Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public CharSequence f115531a0;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (SwitchPreference.this.b(Boolean.valueOf(z10))) {
                SwitchPreference.this.r1(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public SwitchPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f115529Y = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.k.f115979o1, i10, i11);
        w1(D0.n.o(typedArrayObtainStyledAttributes, w.k.f116003w1, w.k.f115982p1));
        int i12 = w.k.f116000v1;
        int i13 = w.k.f115985q1;
        String string = typedArrayObtainStyledAttributes.getString(i12);
        u1(string == null ? typedArrayObtainStyledAttributes.getString(i13) : string);
        int i14 = w.k.f116009y1;
        int i15 = w.k.f115991s1;
        String string2 = typedArrayObtainStyledAttributes.getString(i14);
        E1(string2 == null ? typedArrayObtainStyledAttributes.getString(i15) : string2);
        int i16 = w.k.f116006x1;
        int i17 = w.k.f115994t1;
        String string3 = typedArrayObtainStyledAttributes.getString(i16);
        C1(string3 == null ? typedArrayObtainStyledAttributes.getString(i17) : string3);
        s1(typedArrayObtainStyledAttributes.getBoolean(w.k.f115997u1, typedArrayObtainStyledAttributes.getBoolean(w.k.f115988r1, false)));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void G1(View view) {
        if (((AccessibilityManager) i().getSystemService("accessibility")).isEnabled()) {
            F1(view.findViewById(16908352));
            x1(view.findViewById(R.id.summary));
        }
    }

    @Nullable
    public CharSequence A1() {
        return this.f115530Z;
    }

    public void B1(int i10) {
        C1(i().getString(i10));
    }

    public void C1(@Nullable CharSequence charSequence) {
        this.f115531a0 = charSequence;
        X();
    }

    public void D1(int i10) {
        E1(i().getString(i10));
    }

    public void E1(@Nullable CharSequence charSequence) {
        this.f115530Z = charSequence;
        X();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F1(View view) {
        boolean z10 = view instanceof Switch;
        if (z10) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f115537T);
        }
        if (z10) {
            Switch r42 = (Switch) view;
            r42.setTextOn(this.f115530Z);
            r42.setTextOff(this.f115531a0);
            r42.setOnCheckedChangeListener(this.f115529Y);
        }
    }

    @Override // androidx.preference.Preference
    public void d0(@NonNull v vVar) {
        super.d0(vVar);
        F1(vVar.d(16908352));
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
        return this.f115531a0;
    }

    public SwitchPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, D0.n.a(context, w.a.f115765d0, R.attr.switchPreferenceStyle), 0);
    }

    public SwitchPreference(@NonNull Context context) {
        this(context, null);
    }
}
