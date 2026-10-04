package androidx.preference;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.w;

/* JADX INFO: loaded from: classes2.dex */
public class DropDownPreference extends ListPreference {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final Context f115437f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final ArrayAdapter f115438g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Spinner f115439h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f115440i0;

    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (i10 >= 0) {
                String string = DropDownPreference.this.H1()[i10].toString();
                if (string.equals(DropDownPreference.this.I1()) || !DropDownPreference.this.b(string)) {
                    return;
                }
                DropDownPreference.this.O1(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(@NonNull Context context) {
        this(context, null);
    }

    @Override // androidx.preference.ListPreference
    public void L1(@NonNull CharSequence[] charSequenceArr) {
        this.f115446Z = charSequenceArr;
        S1();
    }

    @Override // androidx.preference.ListPreference
    public void P1(int i10) {
        O1(H1()[i10].toString());
    }

    @NonNull
    public ArrayAdapter Q1() {
        return new ArrayAdapter(this.f115437f0, R.layout.simple_spinner_dropdown_item);
    }

    public final int R1(String str) {
        CharSequence[] charSequenceArrH1 = H1();
        if (str == null || charSequenceArrH1 == null) {
            return -1;
        }
        for (int length = charSequenceArrH1.length - 1; length >= 0; length--) {
            if (TextUtils.equals(charSequenceArrH1[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public final void S1() {
        this.f115438g0.clear();
        if (F1() != null) {
            for (CharSequence charSequence : F1()) {
                this.f115438g0.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public void X() {
        super.X();
        ArrayAdapter arrayAdapter = this.f115438g0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public void d0(@NonNull v vVar) {
        Spinner spinner = (Spinner) vVar.itemView.findViewById(w.f.f115812h);
        this.f115439h0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f115438g0);
        this.f115439h0.setOnItemSelectedListener(this.f115440i0);
        this.f115439h0.setSelection(R1(I1()));
        super.d0(vVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void e0() {
        this.f115439h0.performClick();
    }

    public DropDownPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, w.a.f115781n, 0);
    }

    public DropDownPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DropDownPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f115440i0 = new a();
        this.f115437f0 = context;
        this.f115438g0 = Q1();
        S1();
    }
}
