package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class g extends k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f115571t = "MultiSelectListPreferenceDialogFragment.values";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f115572u = "MultiSelectListPreferenceDialogFragment.changed";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f115573v = "MultiSelectListPreferenceDialogFragment.entries";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f115574w = "MultiSelectListPreferenceDialogFragment.entryValues";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Set<String> f115575p = new HashSet();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f115576q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence[] f115577r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence[] f115578s;

    public class a implements DialogInterface.OnMultiChoiceClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i10, boolean z10) {
            if (z10) {
                g gVar = g.this;
                gVar.f115576q = gVar.f115575p.add(gVar.f115578s[i10].toString()) | gVar.f115576q;
            } else {
                g gVar2 = g.this;
                gVar2.f115576q = gVar2.f115575p.remove(gVar2.f115578s[i10].toString()) | gVar2.f115576q;
            }
        }
    }

    @Deprecated
    public g() {
    }

    @NonNull
    @Deprecated
    public static g i(String str) {
        g gVar = new g();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        gVar.setArguments(bundle);
        return gVar;
    }

    @Override // androidx.preference.k
    @Deprecated
    public void e(boolean z10) {
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) a();
        if (z10 && this.f115576q) {
            Set<String> set = this.f115575p;
            if (multiSelectListPreference.b(set)) {
                multiSelectListPreference.N1(set);
            }
        }
        this.f115576q = false;
    }

    @Override // androidx.preference.k
    public void f(@NonNull AlertDialog.Builder builder) {
        int length = this.f115578s.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = this.f115575p.contains(this.f115578s[i10].toString());
        }
        builder.setMultiChoiceItems(this.f115577r, zArr, new a());
    }

    public final MultiSelectListPreference h() {
        return (MultiSelectListPreference) a();
    }

    @Override // androidx.preference.k, android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f115575p.clear();
            this.f115575p.addAll(bundle.getStringArrayList(f115571t));
            this.f115576q = bundle.getBoolean(f115572u, false);
            this.f115577r = bundle.getCharSequenceArray(f115573v);
            this.f115578s = bundle.getCharSequenceArray(f115574w);
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) a();
        if (multiSelectListPreference.F1() == null || multiSelectListPreference.G1() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.f115575p.clear();
        this.f115575p.addAll(multiSelectListPreference.I1());
        this.f115576q = false;
        this.f115577r = multiSelectListPreference.F1();
        this.f115578s = multiSelectListPreference.G1();
    }

    @Override // androidx.preference.k, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList(f115571t, new ArrayList<>(this.f115575p));
        bundle.putBoolean(f115572u, this.f115576q);
        bundle.putCharSequenceArray(f115573v, this.f115577r);
        bundle.putCharSequenceArray(f115574w, this.f115578s);
    }
}
