package B0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.os.W;
import com.google.common.util.concurrent.ListenableFuture;
import e.T;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f12251a = "PackageManagerCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f12252b = "android.intent.action.AUTO_REVOKE_PERMISSIONS";

    @T(30)
    public static class a {
        public static boolean a(@NonNull Context context) {
            return !context.getPackageManager().isAutoRevokeWhitelisted();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface b {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean a(@NonNull PackageManager packageManager) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 >= 30) || ((i10 < 30) && (b(packageManager) != null));
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static String b(@NonNull PackageManager packageManager) {
        String str = null;
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(new Intent(f12252b).setData(Uri.fromParts("package", "com.example", null)), 0).iterator();
        while (it.hasNext()) {
            String str2 = it.next().activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    @NonNull
    public static ListenableFuture<Integer> c(@NonNull Context context) {
        androidx.concurrent.futures.d<Integer> dVarI = androidx.concurrent.futures.d.i();
        if (!W.a(context)) {
            dVarI.set(0);
            Log.e(f12251a, "User is in locked direct boot mode");
            return dVarI;
        }
        if (!a(context.getPackageManager())) {
            dVarI.set(1);
            return dVarI;
        }
        int i10 = context.getApplicationInfo().targetSdkVersion;
        if (i10 < 30) {
            dVarI.set(0);
            Log.e(f12251a, "Target SDK version below API 30");
            return dVarI;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            if (a.a(context)) {
                dVarI.set(Integer.valueOf(i10 >= 31 ? 5 : 4));
                return dVarI;
            }
            dVarI.set(2);
            return dVarI;
        }
        if (i11 == 30) {
            dVarI.set(Integer.valueOf(a.a(context) ? 4 : 2));
            return dVarI;
        }
        final L l10 = new L(context);
        dVarI.addListener(new Runnable() { // from class: B0.E
            @Override // java.lang.Runnable
            public final void run() {
                l10.b();
            }
        }, Executors.newSingleThreadExecutor());
        l10.a(dVarI);
        return dVarI;
    }
}
