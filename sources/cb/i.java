package cb;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes7.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f136267a = "i";

    public static boolean a(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            return true;
        }
        return i10 < 30 ? C2968d.d(context) : h.d(context);
    }
}
