package androidx.core.app;

import android.app.Dialog;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.core.app.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2391n {

    /* JADX INFO: renamed from: androidx.core.app.n$a */
    @e.T(28)
    public static class a {
        public static <T> T a(Dialog dialog, int i10) {
            return (T) dialog.requireViewById(i10);
        }
    }

    @NonNull
    public static View a(@NonNull Dialog dialog, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) a.a(dialog, i10);
        }
        View viewFindViewById = dialog.findViewById(i10);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}
