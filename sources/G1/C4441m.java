package g1;

import android.widget.DatePicker;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC2511d;
import i1.C4543a;

/* JADX INFO: renamed from: g1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.p({@androidx.databinding.o(attribute = "android:year", type = DatePicker.class), @androidx.databinding.o(attribute = "android:month", type = DatePicker.class), @androidx.databinding.o(attribute = "android:day", method = "getDayOfMonth", type = DatePicker.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C4441m {

    /* JADX INFO: renamed from: g1.m$b */
    public static class b implements DatePicker.OnDateChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DatePicker.OnDateChangedListener f202204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.databinding.n f202205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.databinding.n f202206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.databinding.n f202207d;

        public b() {
        }

        public void a(DatePicker.OnDateChangedListener onDateChangedListener, androidx.databinding.n nVar, androidx.databinding.n nVar2, androidx.databinding.n nVar3) {
            this.f202204a = onDateChangedListener;
            this.f202205b = nVar;
            this.f202206c = nVar2;
            this.f202207d = nVar3;
        }

        @Override // android.widget.DatePicker.OnDateChangedListener
        public void onDateChanged(DatePicker datePicker, int i10, int i11, int i12) {
            DatePicker.OnDateChangedListener onDateChangedListener = this.f202204a;
            if (onDateChangedListener != null) {
                onDateChangedListener.onDateChanged(datePicker, i10, i11, i12);
            }
            androidx.databinding.n nVar = this.f202205b;
            if (nVar != null) {
                nVar.a();
            }
            androidx.databinding.n nVar2 = this.f202206c;
            if (nVar2 != null) {
                nVar2.a();
            }
            androidx.databinding.n nVar3 = this.f202207d;
            if (nVar3 != null) {
                nVar3.a();
            }
        }

        public b(a aVar) {
        }
    }

    @InterfaceC2511d(requireAll = false, value = {"android:year", "android:month", "android:day", "android:onDateChanged", "android:yearAttrChanged", "android:monthAttrChanged", "android:dayAttrChanged"})
    public static void a(DatePicker datePicker, int i10, int i11, int i12, DatePicker.OnDateChangedListener onDateChangedListener, androidx.databinding.n nVar, androidx.databinding.n nVar2, androidx.databinding.n nVar3) {
        if (i10 == 0) {
            i10 = datePicker.getYear();
        }
        if (i12 == 0) {
            i12 = datePicker.getDayOfMonth();
        }
        if (nVar == null && nVar2 == null && nVar3 == null) {
            datePicker.init(i10, i11, i12, onDateChangedListener);
            return;
        }
        int i13 = C4543a.C0748a.f202776b;
        b bVar = (b) r.a(datePicker, i13);
        if (bVar == null) {
            bVar = new b();
            datePicker.getTag(i13);
            datePicker.setTag(i13, bVar);
        }
        bVar.a(onDateChangedListener, nVar, nVar2, nVar3);
        datePicker.init(i10, i11, i12, bVar);
    }
}
