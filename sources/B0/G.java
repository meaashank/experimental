package B0;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.C2388k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12253a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12254b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12255c = -2;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    public static int a(@NonNull Context context, @NonNull String str) {
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int b(@NonNull Context context, @NonNull String str, @Nullable String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static int c(@NonNull Context context, @NonNull String str, int i10, int i11, @Nullable String str2) {
        if (context.checkPermission(str, i10, i11) == -1) {
            return -1;
        }
        String strPermissionToOp = AppOpsManager.permissionToOp(str);
        if (strPermissionToOp == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i11 || !Objects.equals(context.getPackageName(), str2)) ? C2388k.e(context, strPermissionToOp, str2) : C2388k.a(context, i11, strPermissionToOp, str2)) == 0 ? 0 : -2;
    }

    public static int d(@NonNull Context context, @NonNull String str) {
        return c(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
