package androidx.core.view;

import android.view.ViewStructure;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f111560a;

    @e.T(23)
    public static class a {
        public static void a(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        public static void b(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        public static void c(ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
            viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
        }

        public static void d(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }
    }

    public M0(@NonNull ViewStructure viewStructure) {
        this.f111560a = viewStructure;
    }

    @NonNull
    @e.T(23)
    public static M0 f(@NonNull ViewStructure viewStructure) {
        return new M0(viewStructure);
    }

    public void a(@NonNull String str) {
        ((ViewStructure) this.f111560a).setClassName(str);
    }

    public void b(@NonNull CharSequence charSequence) {
        ((ViewStructure) this.f111560a).setContentDescription(charSequence);
    }

    public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
        ((ViewStructure) this.f111560a).setDimens(i10, i11, i12, i13, i14, i15);
    }

    public void d(@NonNull CharSequence charSequence) {
        ((ViewStructure) this.f111560a).setText(charSequence);
    }

    @NonNull
    @e.T(23)
    public ViewStructure e() {
        return (ViewStructure) this.f111560a;
    }
}
