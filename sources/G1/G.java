package g1;

import android.widget.TimePicker;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC2511d;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class G {

    public class a implements TimePicker.OnTimeChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TimePicker.OnTimeChangedListener f202180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.databinding.n f202181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.databinding.n f202182c;

        public a(TimePicker.OnTimeChangedListener onTimeChangedListener, androidx.databinding.n nVar, androidx.databinding.n nVar2) {
            this.f202180a = onTimeChangedListener;
            this.f202181b = nVar;
            this.f202182c = nVar2;
        }

        @Override // android.widget.TimePicker.OnTimeChangedListener
        public void onTimeChanged(TimePicker timePicker, int i10, int i11) {
            TimePicker.OnTimeChangedListener onTimeChangedListener = this.f202180a;
            if (onTimeChangedListener != null) {
                onTimeChangedListener.onTimeChanged(timePicker, i10, i11);
            }
            androidx.databinding.n nVar = this.f202181b;
            if (nVar != null) {
                nVar.a();
            }
            androidx.databinding.n nVar2 = this.f202182c;
            if (nVar2 != null) {
                nVar2.a();
            }
        }
    }

    @androidx.databinding.m(attribute = "android:hour")
    public static int a(TimePicker timePicker) {
        return timePicker.getHour();
    }

    @androidx.databinding.m(attribute = "android:minute")
    public static int b(TimePicker timePicker) {
        return timePicker.getMinute();
    }

    @InterfaceC2511d({"android:hour"})
    public static void c(TimePicker timePicker, int i10) {
        if (timePicker.getHour() != i10) {
            timePicker.setHour(i10);
        }
    }

    @InterfaceC2511d(requireAll = false, value = {"android:onTimeChanged", "android:hourAttrChanged", "android:minuteAttrChanged"})
    public static void d(TimePicker timePicker, TimePicker.OnTimeChangedListener onTimeChangedListener, androidx.databinding.n nVar, androidx.databinding.n nVar2) {
        if (nVar == null && nVar2 == null) {
            timePicker.setOnTimeChangedListener(onTimeChangedListener);
        } else {
            timePicker.setOnTimeChangedListener(new a(onTimeChangedListener, nVar, nVar2));
        }
    }

    @InterfaceC2511d({"android:minute"})
    public static void e(TimePicker timePicker, int i10) {
        if (timePicker.getMinute() != i10) {
            timePicker.setMinute(i10);
        }
    }
}
