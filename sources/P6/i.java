package p6;

import android.content.Context;
import com.prism.commons.utils.Y;

/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f226368a;

    public static String a() {
        return f226368a;
    }

    public static boolean b(Context context) {
        String str = f226368a;
        return str == null ? context.getPackageName().equals(Y.a(context)) : str.equals(Y.a(context));
    }

    public static void c(String str) {
        f226368a = str;
    }
}
