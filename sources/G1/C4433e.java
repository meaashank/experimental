package g1;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC2511d;

/* JADX INFO: renamed from: g1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AdapterView.class), @androidx.databinding.g(attribute = "android:onItemLongClick", method = "setOnItemLongClickListener", type = AdapterView.class)})
@androidx.databinding.p({@androidx.databinding.o(attribute = "android:selectedItemPosition", type = AdapterView.class), @androidx.databinding.o(attribute = "android:selection", event = "android:selectedItemPositionAttrChanged", method = "getSelectedItemPosition", type = AdapterView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C4433e {

    /* JADX INFO: renamed from: g1.e$a */
    public interface a {
        void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10);
    }

    /* JADX INFO: renamed from: g1.e$b */
    public static class b implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f202195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f202196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.databinding.n f202197c;

        public b(a aVar, c cVar, androidx.databinding.n nVar) {
            this.f202195a = aVar;
            this.f202196b = cVar;
            this.f202197c = nVar;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            a aVar = this.f202195a;
            if (aVar != null) {
                aVar.onItemSelected(adapterView, view, i10, j10);
            }
            androidx.databinding.n nVar = this.f202197c;
            if (nVar != null) {
                nVar.a();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            c cVar = this.f202196b;
            if (cVar != null) {
                cVar.onNothingSelected(adapterView);
            }
            androidx.databinding.n nVar = this.f202197c;
            if (nVar != null) {
                nVar.a();
            }
        }
    }

    /* JADX INFO: renamed from: g1.e$c */
    public interface c {
        void onNothingSelected(AdapterView<?> adapterView);
    }

    @InterfaceC2511d(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected", "android:selectedItemPositionAttrChanged"})
    public static void a(AdapterView adapterView, a aVar, c cVar, androidx.databinding.n nVar) {
        if (aVar == null && cVar == null && nVar == null) {
            adapterView.setOnItemSelectedListener(null);
        } else {
            adapterView.setOnItemSelectedListener(new b(aVar, cVar, nVar));
        }
    }

    @InterfaceC2511d({"android:selectedItemPosition"})
    public static void b(AdapterView adapterView, int i10) {
        if (adapterView.getSelectedItemPosition() != i10) {
            adapterView.setSelection(i10);
        }
    }

    @InterfaceC2511d({"android:selectedItemPosition", "android:adapter"})
    public static void c(AdapterView adapterView, int i10, Adapter adapter) {
        if (adapter != adapterView.getAdapter()) {
            adapterView.setAdapter(adapter);
            adapterView.setSelection(i10);
        } else if (adapterView.getSelectedItemPosition() != i10) {
            adapterView.setSelection(i10);
        }
    }

    @InterfaceC2511d({"android:selection"})
    public static void d(AdapterView adapterView, int i10) {
        b(adapterView, i10);
    }

    @InterfaceC2511d({"android:selection", "android:adapter"})
    public static void e(AdapterView adapterView, int i10, Adapter adapter) {
        c(adapterView, i10, adapter);
    }
}
