package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.preference.t;
import androidx.preference.w;

/* JADX INFO: loaded from: classes2.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f115513d0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PreferenceScreen(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, D0.n.a(context, w.a.f115747P, R.attr.preferenceScreenStyle), 0);
        this.f115513d0 = true;
    }

    public void G1(boolean z10) {
        if (this.f115508Y) {
            throw new IllegalStateException("Cannot change the usage of generated IDs while attached to the preference hierarchy");
        }
        this.f115513d0 = z10;
    }

    public boolean H1() {
        return this.f115513d0;
    }

    @Override // androidx.preference.Preference
    public void e0() {
        t.b bVarJ;
        if (this.f115488o != null || this.f115489p != null || this.f115505V.size() == 0 || (bVarJ = this.f115475b.j()) == null) {
            return;
        }
        bVarJ.h(this);
    }
}
