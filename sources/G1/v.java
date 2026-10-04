package g1;

import android.widget.RadioGroup;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC2511d;

/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.p({@androidx.databinding.o(attribute = "android:checkedButton", method = "getCheckedRadioButtonId", type = RadioGroup.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class v {

    public class a implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RadioGroup.OnCheckedChangeListener f202219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.databinding.n f202220b;

        public a(RadioGroup.OnCheckedChangeListener onCheckedChangeListener, androidx.databinding.n nVar) {
            this.f202219a = onCheckedChangeListener;
            this.f202220b = nVar;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            RadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.f202219a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(radioGroup, i10);
            }
            this.f202220b.a();
        }
    }

    @InterfaceC2511d({"android:checkedButton"})
    public static void a(RadioGroup radioGroup, int i10) {
        if (i10 != radioGroup.getCheckedRadioButtonId()) {
            radioGroup.check(i10);
        }
    }

    @InterfaceC2511d(requireAll = false, value = {"android:onCheckedChanged", "android:checkedButtonAttrChanged"})
    public static void b(RadioGroup radioGroup, RadioGroup.OnCheckedChangeListener onCheckedChangeListener, androidx.databinding.n nVar) {
        if (nVar == null) {
            radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            radioGroup.setOnCheckedChangeListener(new a(onCheckedChangeListener, nVar));
        }
    }
}
