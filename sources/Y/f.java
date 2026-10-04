package Y;

import android.os.Bundle;
import android.view.ViewStructure;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.InterfaceC4345t;
import e.T;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f79097a;

    @T(23)
    public static class a {
        @InterfaceC4345t
        public static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }

        @InterfaceC4345t
        public static void b(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        @InterfaceC4345t
        public static void c(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        @InterfaceC4345t
        public static void d(ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
            viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
        }

        public static void e(ViewStructure viewStructure, int i10, String str, String str2, String str3) {
            viewStructure.setId(i10, str, str2, str3);
        }

        @InterfaceC4345t
        public static void f(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        @InterfaceC4345t
        public static void g(ViewStructure viewStructure, float f10, int i10, int i11, int i12) {
            viewStructure.setTextStyle(f10, i10, i11, i12);
        }
    }

    public f(@NonNull ViewStructure viewStructure) {
        this.f79097a = viewStructure;
    }

    @NonNull
    @T(23)
    public static f i(@NonNull ViewStructure viewStructure) {
        return new f(viewStructure);
    }

    @Nullable
    public Bundle a() {
        return a.a((ViewStructure) this.f79097a);
    }

    public void b(@NonNull String str) {
        a.b((ViewStructure) this.f79097a, str);
    }

    public void c(@NonNull CharSequence charSequence) {
        a.c((ViewStructure) this.f79097a, charSequence);
    }

    public void d(int i10, int i11, int i12, int i13, int i14, int i15) {
        a.d((ViewStructure) this.f79097a, i10, i11, i12, i13, i14, i15);
    }

    public void e(int i10, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        ((ViewStructure) this.f79097a).setId(i10, str, str2, str3);
    }

    public void f(@NonNull CharSequence charSequence) {
        a.f((ViewStructure) this.f79097a, charSequence);
    }

    public void g(float f10, int i10, int i11, int i12) {
        a.g((ViewStructure) this.f79097a, f10, i10, i11, i12);
    }

    @NonNull
    @T(23)
    public ViewStructure h() {
        return (ViewStructure) this.f79097a;
    }
}
