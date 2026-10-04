package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.preference.w;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends Preference {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public long f115556T;

    public d(@NonNull Context context, List<Preference> list, long j10) {
        super(context);
        n1();
        o1(list);
        this.f115556T = j10 + 1000000;
    }

    @Override // androidx.preference.Preference
    public void d0(@NonNull v vVar) {
        super.d0(vVar);
        vVar.h(false);
    }

    public final void n1() {
        this.f115464H = w.h.f115816a;
        J0(w.e.f115803a);
        c1(w.i.f115835b);
        S0(999);
    }

    public final void o1(List<Preference> list) {
        ArrayList arrayList = new ArrayList();
        CharSequence string = null;
        for (Preference preference : list) {
            CharSequence charSequenceK = preference.K();
            boolean z10 = preference instanceof PreferenceGroup;
            if (z10 && !TextUtils.isEmpty(charSequenceK)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.x())) {
                if (z10) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequenceK)) {
                string = string == null ? charSequenceK : this.f115474a.getString(w.i.f115838e, string, charSequenceK);
            }
        }
        a1(string);
    }

    @Override // androidx.preference.Preference
    public long p() {
        return this.f115556T;
    }
}
