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
import androidx.preference.w;

/* JADX INFO: loaded from: classes2.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final a f115429Y;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (CheckBoxPreference.this.b(Boolean.valueOf(z10))) {
                CheckBoxPreference.this.r1(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public CheckBoxPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public final void A1(@NonNull View view) {
        if (((AccessibilityManager) i().getSystemService("accessibility")).isEnabled()) {
            z1(view.findViewById(R.id.checkbox));
            x1(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void d0(@NonNull v vVar) {
        super.d0(vVar);
        z1(vVar.d(R.id.checkbox));
        y1(vVar);
    }

    @Override // androidx.preference.Preference
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void r0(@NonNull View view) {
        q0();
        A1(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z1(View view) {
        boolean z10 = view instanceof CompoundButton;
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f115537T);
        }
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f115429Y);
        }
    }

    public CheckBoxPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f115429Y = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.k.f115944d, i10, i11);
        w1(D0.n.o(typedArrayObtainStyledAttributes, w.k.f115962j, w.k.f115947e));
        int i12 = w.k.f115959i;
        int i13 = w.k.f115950f;
        String string = typedArrayObtainStyledAttributes.getString(i12);
        u1(string == null ? typedArrayObtainStyledAttributes.getString(i13) : string);
        s1(typedArrayObtainStyledAttributes.getBoolean(w.k.f115956h, typedArrayObtainStyledAttributes.getBoolean(w.k.f115953g, false)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, D0.n.a(context, w.a.f115766e, R.attr.checkBoxPreferenceStyle), 0);
    }

    public CheckBoxPreference(@NonNull Context context) {
        this(context, null);
    }
}
