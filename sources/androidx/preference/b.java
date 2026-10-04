package androidx.preference;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class b extends k {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f115546r = "EditTextPreferenceDialogFragment.text";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public EditText f115547p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f115548q;

    @Deprecated
    public b() {
    }

    @NonNull
    @Deprecated
    public static b i(String str) {
        b bVar = new b();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        bVar.setArguments(bundle);
        return bVar;
    }

    @Override // androidx.preference.k
    public void c(@NonNull View view) {
        super.c(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f115547p = editText;
        editText.requestFocus();
        EditText editText2 = this.f115547p;
        if (editText2 == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText2.setText(this.f115548q);
        EditText editText3 = this.f115547p;
        editText3.setSelection(editText3.getText().length());
    }

    @Override // androidx.preference.k
    @Deprecated
    public void e(boolean z10) {
        if (z10) {
            String string = this.f115547p.getText().toString();
            if (((EditTextPreference) a()).b(string)) {
                ((EditTextPreference) a()).H1(string);
            }
        }
    }

    public final EditTextPreference h() {
        return (EditTextPreference) a();
    }

    @Override // androidx.preference.k, android.app.DialogFragment, android.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f115548q = ((EditTextPreference) a()).F1();
        } else {
            this.f115548q = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.k, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f115548q);
    }
}
