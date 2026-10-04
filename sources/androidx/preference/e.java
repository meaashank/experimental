package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class e extends k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f115557s = "ListPreferenceDialogFragment.index";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f115558t = "ListPreferenceDialogFragment.entries";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f115559u = "ListPreferenceDialogFragment.entryValues";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f115560p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence[] f115561q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence[] f115562r;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            e eVar = e.this;
            eVar.f115560p = i10;
            eVar.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    @Deprecated
    public e() {
    }

    @NonNull
    @Deprecated
    public static e i(String str) {
        e eVar = new e();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        eVar.setArguments(bundle);
        return eVar;
    }

    @Override // androidx.preference.k
    @Deprecated
    public void e(boolean z10) {
        int i10;
        ListPreference listPreference = (ListPreference) a();
        if (!z10 || (i10 = this.f115560p) < 0) {
            return;
        }
        String string = this.f115562r[i10].toString();
        if (listPreference.b(string)) {
            listPreference.O1(string);
        }
    }

    @Override // androidx.preference.k
    public void f(@NonNull AlertDialog.Builder builder) {
        builder.setSingleChoiceItems(this.f115561q, this.f115560p, new a());
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    public final ListPreference h() {
        return (ListPreference) a();
    }

    @Override // androidx.preference.k, android.app.DialogFragment, android.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f115560p = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f115561q = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f115562r = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) a();
        if (listPreference.F1() == null || listPreference.H1() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f115560p = listPreference.E1(listPreference.I1());
        this.f115561q = listPreference.F1();
        this.f115562r = listPreference.H1();
    }

    @Override // androidx.preference.k, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f115560p);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f115561q);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f115562r);
    }
}
