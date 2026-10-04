package b7;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.prism.gaia.naked.metadata.com.android.internal.ResCAG;

/* JADX INFO: renamed from: b7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C2837a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f125926a = "asdf-".concat(C2837a.class.getSimpleName());

    public static void a(Activity activity) {
        Context baseContext = activity.getBaseContext();
        try {
            TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(ResCAG.f165977G.styleable.Window().get());
            if (typedArrayObtainStyledAttributes != null) {
                if (typedArrayObtainStyledAttributes.getBoolean(ResCAG.f165977G.styleable.Window_windowShowWallpaper().get(), false)) {
                    activity.getWindow().setBackgroundDrawable(WallpaperManager.getInstance(activity).getDrawable());
                }
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable unused) {
        }
        Intent intent = activity.getIntent();
        ApplicationInfo applicationInfo = baseContext.getApplicationInfo();
        PackageManager packageManager = activity.getPackageManager();
        if (intent == null || !activity.isTaskRoot()) {
            return;
        }
        try {
            String str = ((Object) applicationInfo.loadLabel(packageManager)) + "";
            Drawable drawableLoadIcon = applicationInfo.loadIcon(packageManager);
            activity.setTaskDescription(new ActivityManager.TaskDescription(str, drawableLoadIcon instanceof BitmapDrawable ? ((BitmapDrawable) drawableLoadIcon).getBitmap() : null));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
