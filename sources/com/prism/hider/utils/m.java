package com.prism.hider.utils;

import U9.l1;
import U9.n1;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import android.os.Process;
import androidx.annotation.Nullable;
import com.android.launcher3.AppInfo;
import com.android.launcher3.CellLayout;
import com.android.launcher3.Launcher;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.graphics.LauncherIcons;
import com.prism.commons.utils.I;
import com.prism.commons.utils.l0;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.remote.ApkInfo;
import com.prism.gaia.remote.GuestAppInfo;
import com.prism.hider.modules.config.ModuleLoaderId;
import com.prism.hider.modules.config.model.ModuleInfo;
import com.prism.hider.ui.LoadingActivity;

/* JADX INFO: loaded from: classes6.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f168396a = l0.b(m.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f168397b = "EXTRA_UUID";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f168398c = "EXTRA_MODULE_LOADER_ID";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f168399d = "EXTRA_DATA_VERSION";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f168400e = "EXTRA_BADGE_DRAWER";

    public static void a(Launcher launcher, ShortcutInfo shortcutInfo, int i10) {
        if (launcher == null) {
            I.u(f168396a, "no launcher hold, no op");
            return;
        }
        int[] iArr = new int[2];
        n1 n1Var = new n1(launcher);
        if (n1Var.o(iArr, 1, 1)) {
            long j10 = n1Var.f74101c;
            n1.b bVar = n1Var.f74106h;
            long j11 = bVar.f74110c;
            CellLayout cellLayout = bVar.f74112e;
            shortcutInfo.getPackageNameInComponent();
            if (i10 >= 0) {
                u(shortcutInfo, i10);
            }
            launcher.getModelWriter().addOrMoveItemInDatabase(shortcutInfo, j10, j11, iArr[0], iArr[1]);
            shortcutInfo.container = j10;
            shortcutInfo.cellX = iArr[0];
            shortcutInfo.cellY = iArr[1];
            launcher.getWorkspace().addInScreen(launcher.createShortcut(cellLayout, shortcutInfo), shortcutInfo);
        }
    }

    public static String b(ShortcutInfo shortcutInfo) {
        return shortcutInfo.intent.getStringExtra(f168400e);
    }

    public static int c(ShortcutInfo shortcutInfo) {
        return shortcutInfo.intent.getIntExtra(f168399d, 0);
    }

    public static int d(ShortcutInfo shortcutInfo, String str, int i10) {
        return shortcutInfo.intent.getIntExtra(str, i10);
    }

    public static String e(ShortcutInfo shortcutInfo) {
        String stringExtra = shortcutInfo.intent.getStringExtra(f168398c);
        return stringExtra == null ? ModuleLoaderId.BUILD_IN.toString() : stringExtra;
    }

    public static String f(ShortcutInfo shortcutInfo, String str) {
        return shortcutInfo.intent.getStringExtra(str);
    }

    @Nullable
    public static String g(Intent intent) {
        return intent.getStringExtra(f168397b);
    }

    @Nullable
    public static String h(ShortcutInfo shortcutInfo) {
        return shortcutInfo.intent.getStringExtra(f168397b);
    }

    public static ShortcutInfo i(Context context, ApkInfo apkInfo, int i10) {
        ShortcutInfo shortcutInfo = new ShortcutInfo();
        LauncherIcons launcherIconsObtain = LauncherIcons.obtain(context);
        launcherIconsObtain.createBadgedIconBitmap(apkInfo.getIconDrawable(context), Process.myUserHandle(), 24).applyTo(shortcutInfo);
        launcherIconsObtain.recycle();
        shortcutInfo.title = apkInfo.getName();
        ComponentName componentName = new ComponentName(c.f(apkInfo.pkgName), LoadingActivity.class.getCanonicalName());
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(componentName);
        shortcutInfo.intent = intent;
        shortcutInfo.setVuserId(i10);
        return shortcutInfo;
    }

    public static ShortcutInfo j(Context context, AppInfo appInfo) {
        l1 l1Var = new l1(appInfo);
        ShortcutInfo shortcutInfoMakeShortcut = l1Var.makeShortcut();
        w(shortcutInfoMakeShortcut.intent, l1Var.f74092a);
        return shortcutInfoMakeShortcut;
    }

    public static ShortcutInfo k(Context context, GuestAppInfo guestAppInfo) {
        ApkInfo apkInfo = new ApkInfo(guestAppInfo.packageName, guestAppInfo.apkPath, guestAppInfo.splitCodePaths);
        int iX = GaiaContext.j().x();
        ApplicationInfo applicationInfo = guestAppInfo.getApplicationInfo(0);
        if (applicationInfo != null) {
            iX = applicationInfo.targetSdkVersion;
        }
        ShortcutInfo shortcutInfo = new ShortcutInfo();
        LauncherIcons launcherIconsObtain = LauncherIcons.obtain(context);
        launcherIconsObtain.createBadgedIconBitmap(Drawable.createFromPath(guestAppInfo.getIconFile().getAbsolutePath()), Process.myUserHandle(), iX).applyTo(shortcutInfo);
        launcherIconsObtain.recycle();
        shortcutInfo.title = apkInfo.getName();
        ComponentName componentName = new ComponentName(c.f(apkInfo.pkgName), LoadingActivity.class.getCanonicalName());
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(componentName);
        shortcutInfo.intent = intent;
        return shortcutInfo;
    }

    public static ShortcutInfo l(Context context, ca.c cVar, String str) {
        ShortcutInfo shortcutInfo = new ShortcutInfo();
        LauncherIcons launcherIconsObtain = LauncherIcons.obtain(context);
        launcherIconsObtain.createBadgedIconBitmap(cVar.getIcon(), Process.myUserHandle(), 24).applyTo(shortcutInfo);
        launcherIconsObtain.recycle();
        shortcutInfo.title = cVar.getName();
        ComponentName componentName = new ComponentName(c.g(cVar.getModuleId()), cVar.getClass().getCanonicalName());
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(componentName);
        shortcutInfo.intent = intent;
        intent.putExtra(f168398c, str);
        return shortcutInfo;
    }

    public static ShortcutInfo m(Context context, ModuleInfo moduleInfo, String str) {
        ShortcutInfo shortcutInfoL = l(context, moduleInfo.getModule(), str);
        n(shortcutInfoL, f168399d, moduleInfo.getDataVersion());
        return shortcutInfoL;
    }

    public static void n(ShortcutInfo shortcutInfo, String str, int i10) {
        shortcutInfo.intent.putExtra(str, i10);
    }

    public static void o(ShortcutInfo shortcutInfo, String str, String str2) {
        shortcutInfo.intent.putExtra(str, str2);
    }

    public static void p(ShortcutInfo shortcutInfo) {
        q(shortcutInfo, f168400e);
    }

    public static void q(ShortcutInfo shortcutInfo, String str) {
        shortcutInfo.intent.removeExtra(str);
    }

    public static void r(ShortcutInfo shortcutInfo, String str) {
        o(shortcutInfo, f168400e, str);
    }

    public static void s(ModuleInfo moduleInfo, ShortcutInfo shortcutInfo) {
        n(shortcutInfo, f168399d, moduleInfo.getDataVersion());
    }

    public static void t(ShortcutInfo shortcutInfo, String str) {
        o(shortcutInfo, f168398c, str);
    }

    public static void u(ShortcutInfo shortcutInfo, int i10) {
        if (i10 < 100) {
            shortcutInfo.status |= 10;
        }
        shortcutInfo.setInstallProgress(i10);
    }

    public static void v(ShortcutInfo shortcutInfo, boolean z10) {
        if (z10) {
            shortcutInfo.status |= 10;
        } else {
            shortcutInfo.status &= -11;
        }
    }

    public static void w(Intent intent, String str) {
        intent.putExtra(f168397b, str);
    }

    public static void x(ShortcutInfo shortcutInfo, String str) {
        w(shortcutInfo.intent, str);
    }

    public static void y(Context context, ShortcutInfo shortcutInfo, Drawable drawable) {
        LauncherIcons launcherIconsObtain = LauncherIcons.obtain(context);
        launcherIconsObtain.createBadgedIconBitmap(drawable, Process.myUserHandle(), 24).applyTo(shortcutInfo);
        launcherIconsObtain.recycle();
    }
}
