package v;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.FileProvider;
import e.g0;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f239755a = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f239756b = "android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA";

    public static boolean a(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        IntentFilter intentFilter;
        ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(new Intent().setAction(e.f239707c).setPackage(str), 64);
        if (resolveInfoResolveService == null || (intentFilter = resolveInfoResolveService.filter) == null) {
            return false;
        }
        return intentFilter.hasCategory(str2);
    }

    @Deprecated
    public static void b(@NonNull Context context, @NonNull CustomTabsIntent customTabsIntent, @NonNull Uri uri) {
        if (customTabsIntent.f86571a.getExtras().getBinder(CustomTabsIntent.f86525d) == null) {
            throw new IllegalArgumentException("Given CustomTabsIntent should be associated with a valid CustomTabsSession");
        }
        customTabsIntent.f86571a.putExtra(f239755a, true);
        customTabsIntent.t(context, uri);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void c(@NonNull Context context, @NonNull androidx.browser.customtabs.b bVar, @NonNull Uri uri) {
        Intent intent = new Intent(f239756b);
        intent.setPackage(bVar.f86619d.getPackageName());
        intent.setData(uri);
        Bundle bundle = new Bundle();
        bundle.putBinder(CustomTabsIntent.f86525d, bVar.f86618c.asBinder());
        intent.putExtras(bundle);
        PendingIntent pendingIntent = bVar.f86620e;
        if (pendingIntent != null) {
            intent.putExtra(CustomTabsIntent.f86527e, pendingIntent);
        }
        context.startActivity(intent);
    }

    @g0
    public static boolean d(@NonNull Context context, @NonNull File file, @NonNull String str, @NonNull String str2, @NonNull androidx.browser.customtabs.b bVar) {
        Uri uriForFile = FileProvider.getUriForFile(context, str, file);
        context.grantUriPermission(str2, uriForFile, 1);
        return bVar.m(uriForFile, 1, null);
    }
}
