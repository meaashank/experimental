package pa;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.prism.commons.utils.l0;
import com.prism.hider.vault.commons.InterfaceC4278n;
import com.prism.hider.vault.commons.N;

/* JADX INFO: renamed from: pa.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5400a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f226380a = l0.b(AbstractC5400a.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f226381b = "is_vault_activity";

    public abstract InterfaceC4278n a(Activity activity);

    public boolean b(Activity activity) {
        return false;
    }

    public boolean c(Activity activity) {
        return false;
    }

    public boolean d(Activity activity) {
        if (!N.e(activity)) {
            return false;
        }
        a(activity).g(activity);
        return false;
    }

    public boolean e(Activity activity) {
        if (a(activity).e(activity)) {
            try {
                Bundle bundle = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 128).metaData;
                if (bundle == null || !bundle.getBoolean(f226381b, false)) {
                    return !r0.h(activity);
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e(f226380a, "onActivityResumed", e10);
            }
        }
        return false;
    }
}
