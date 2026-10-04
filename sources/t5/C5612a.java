package t5;

import android.util.TypedValue;
import android.view.View;

/* JADX INFO: renamed from: t5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5612a {
    public static int a(View view, int i10) {
        return (int) TypedValue.applyDimension(1, i10, view.getResources().getDisplayMetrics());
    }

    public static int b(String str) {
        str.getClass();
        if (str.equals("SORT_BY_NAME")) {
            return 1;
        }
        return !str.equals("SORT_BY_SIZE") ? 3 : 2;
    }
}
