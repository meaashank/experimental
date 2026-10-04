package g1;

import android.widget.AutoCompleteTextView;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC2511d;
import g1.C4433e;

/* JADX INFO: renamed from: g1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:completionThreshold", method = "setThreshold", type = AutoCompleteTextView.class), @androidx.databinding.g(attribute = "android:popupBackground", method = "setDropDownBackgroundDrawable", type = AutoCompleteTextView.class), @androidx.databinding.g(attribute = "android:onDismiss", method = "setOnDismissListener", type = AutoCompleteTextView.class), @androidx.databinding.g(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AutoCompleteTextView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C4434f {

    /* JADX INFO: renamed from: g1.f$a */
    public class a implements AutoCompleteTextView.Validator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f202198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f202199b;

        public a(c cVar, b bVar) {
            this.f202198a = cVar;
            this.f202199b = bVar;
        }

        @Override // android.widget.AutoCompleteTextView.Validator
        public CharSequence fixText(CharSequence charSequence) {
            b bVar = this.f202199b;
            return bVar != null ? bVar.fixText(charSequence) : charSequence;
        }

        @Override // android.widget.AutoCompleteTextView.Validator
        public boolean isValid(CharSequence charSequence) {
            c cVar = this.f202198a;
            if (cVar != null) {
                return cVar.isValid(charSequence);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: g1.f$b */
    public interface b {
        CharSequence fixText(CharSequence charSequence);
    }

    /* JADX INFO: renamed from: g1.f$c */
    public interface c {
        boolean isValid(CharSequence charSequence);
    }

    @InterfaceC2511d(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected"})
    public static void a(AutoCompleteTextView autoCompleteTextView, C4433e.a aVar, C4433e.c cVar) {
        if (aVar == null && cVar == null) {
            autoCompleteTextView.setOnItemSelectedListener(null);
        } else {
            autoCompleteTextView.setOnItemSelectedListener(new C4433e.b(aVar, cVar, null));
        }
    }

    @InterfaceC2511d(requireAll = false, value = {"android:fixText", "android:isValid"})
    public static void b(AutoCompleteTextView autoCompleteTextView, b bVar, c cVar) {
        if (bVar == null && cVar == null) {
            autoCompleteTextView.setValidator(null);
        } else {
            autoCompleteTextView.setValidator(new a(cVar, bVar));
        }
    }
}
