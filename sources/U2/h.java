package U2;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f68427a = androidx.work.i.f("PackageManagerHelper");

    public static boolean a(Context context, Class<?> klazz) {
        return b(context, klazz.getName());
    }

    public static boolean b(Context context, String className) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, className)) == 1;
    }

    public static void c(@NonNull Context context, @NonNull Class<?> klazz, boolean enabled) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, klazz.getName()), enabled ? 1 : 2, 1);
            androidx.work.i.c().a(f68427a, String.format("%s %s", klazz.getName(), enabled ? com.prism.gaia.server.content.j.f167238E : "disabled"), new Throwable[0]);
        } catch (Exception e10) {
            androidx.work.i.c().a(f68427a, String.format("%s could not be %s", klazz.getName(), enabled ? com.prism.gaia.server.content.j.f167238E : "disabled"), e10);
        }
    }
}
