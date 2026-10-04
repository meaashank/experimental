package g1;

import android.widget.NumberPicker;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC2511d;

/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:format", method = "setFormatter", type = NumberPicker.class), @androidx.databinding.g(attribute = "android:onScrollStateChange", method = "setOnScrollListener", type = NumberPicker.class)})
@androidx.databinding.p({@androidx.databinding.o(attribute = "android:value", type = NumberPicker.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class s {

    public class a implements NumberPicker.OnValueChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NumberPicker.OnValueChangeListener f202209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.databinding.n f202210b;

        public a(NumberPicker.OnValueChangeListener onValueChangeListener, androidx.databinding.n nVar) {
            this.f202209a = onValueChangeListener;
            this.f202210b = nVar;
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public void onValueChange(NumberPicker numberPicker, int i10, int i11) {
            NumberPicker.OnValueChangeListener onValueChangeListener = this.f202209a;
            if (onValueChangeListener != null) {
                onValueChangeListener.onValueChange(numberPicker, i10, i11);
            }
            this.f202210b.a();
        }
    }

    @InterfaceC2511d(requireAll = false, value = {"android:onValueChange", "android:valueAttrChanged"})
    public static void a(NumberPicker numberPicker, NumberPicker.OnValueChangeListener onValueChangeListener, androidx.databinding.n nVar) {
        if (nVar == null) {
            numberPicker.setOnValueChangedListener(onValueChangeListener);
        } else {
            numberPicker.setOnValueChangedListener(new a(onValueChangeListener, nVar));
        }
    }

    @InterfaceC2511d({"android:value"})
    public static void b(NumberPicker numberPicker, int i10) {
        if (numberPicker.getValue() != i10) {
            numberPicker.setValue(i10);
        }
    }
}
