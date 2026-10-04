package ma;

import U9.D;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Environment;
import com.android.launcher3.BuildConfig;
import com.gaia.ngallery.GalleryConfig;

/* JADX INFO: renamed from: ma.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5217g {
    public static void a(Application application) {
        D.g().i(new ea.d());
        D.g().i(new ea.h());
        N4.d.t(application, GalleryConfig.i(application).setRoot(Environment.getExternalStorageDirectory().getPath() + BuildConfig.GALLERY_STORAGE_PATH_ON_SDCARD).withEventLoggerFactory(com.prism.hider.variant.a.b().a()).withBugReporter(Y5.a.a(application)).withProVersionPkg(BuildConfig.GALLERY_PROVERSION_PKG).standAlone(false).build());
        i.f(application);
        com.cookiegames.smartcookie.i.f141335i.getClass();
        com.cookiegames.smartcookie.i.f141338l.s(application, N4.d.f59079i, com.prism.hider.variant.a.b());
    }

    public static void b(Activity activity) {
        Intent intent = new Intent();
        intent.setClassName(activity.getPackageName(), "com.prism.lib_google_billing.BillingGoogleActivity");
        activity.startActivity(intent);
    }
}
