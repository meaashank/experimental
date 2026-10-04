package com.prism.hider.modules;

import U9.D;
import U9.d1;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.util.Log;
import ca.f;
import com.android.launcher3.AllAppsList;
import com.android.launcher3.AppInfo;
import com.android.launcher3.Launcher;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.LauncherModel;
import com.android.launcher3.ShortcutInfo;
import com.prism.commons.utils.C3861z;
import com.prism.commons.utils.l0;
import com.prism.commons.utils.t0;
import com.prism.commons.utils.w0;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.hider.modules.SeduceImportModule;
import com.prism.hider.ui.I;
import com.prism.hider.utils.c;
import com.prism.hider.utils.m;
import da.j;
import java.util.ArrayList;
import r6.InterfaceC5536d;
import w.y;

/* JADX INFO: loaded from: classes6.dex */
public class SeduceImportModule extends f {
    public static final String MODULE_IMPORT_APP_PREFIX = "seduce_import.";
    private static final String TAG = l0.b("SeduceImportModule");
    private static C3861z<Void, Context> registerCallbackOnce = new C3861z<>(new da.f());
    private t0<AppInfo, Context> appInfoCache;
    private Context context;
    private InitOnce<String> pkgNameIO;

    public SeduceImportModule(Context context) {
        this.pkgNameIO = new InitOnce<>(new InitOnce.Init() { // from class: da.g
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f194907a.lambda$new$2();
            }
        });
        this.appInfoCache = new t0<>(new w0() { // from class: da.h
            @Override // com.prism.commons.utils.w0
            public final Object b(Object obj) {
                return this.f194908a.lambda$new$3((Context) obj);
            }
        });
        this.context = context;
        registerCallbackOnce.a(context);
    }

    public static /* synthetic */ Void c(final Context context) {
        D.g().b().s(new InterfaceC5536d() { // from class: da.k
            @Override // r6.InterfaceC5536d
            public final void a(Object obj) {
                SeduceImportModule.d(context, (String) obj);
            }
        });
        return null;
    }

    public static /* synthetic */ void d(Context context, String str) {
        LauncherModel model = LauncherAppState.getInstance(context).getModel();
        String strH = c.h(str);
        Log.d(TAG, "delete module:" + strH);
        d1.o(model, c.g(strH));
    }

    public static /* synthetic */ ArrayList i(ShortcutInfo shortcutInfo, ArrayList arrayList) {
        Log.d(TAG, "found:" + arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ShortcutInfo shortcutInfo2 = (ShortcutInfo) obj;
            shortcutInfo2.title = shortcutInfo.title;
            shortcutInfo2.iconColor = shortcutInfo.iconColor;
            shortcutInfo2.itemType = shortcutInfo.itemType;
            shortcutInfo2.iconBitmap = shortcutInfo.iconBitmap;
            shortcutInfo2.iconResource = shortcutInfo.iconResource;
            shortcutInfo2.contentDescription = shortcutInfo.contentDescription;
            shortcutInfo2.intent = shortcutInfo.intent;
            shortcutInfo2.status = shortcutInfo.status;
            shortcutInfo2.runtimeStatusFlags = shortcutInfo.runtimeStatusFlags;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$new$2() throws Exception {
        String moduleId = getModuleId();
        if (c.l(moduleId)) {
            return c.d(moduleId);
        }
        throw new IllegalStateException(y.a("not a import app module: ", moduleId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AppInfo lambda$new$3(Context context) {
        AllAppsList allAppsList = LauncherAppState.getInstance(context).getModel().getAllAppsList();
        Log.d(TAG, "getAppInfo for: " + this.pkgNameIO.get() + " info:" + allAppsList.findAppInfo(this.pkgNameIO.get(), Process.myUserHandle()));
        return allAppsList.findAppInfo(this.pkgNameIO.get(), Process.myUserHandle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLaunch$4(AppInfo appInfo, Launcher launcher, DialogInterface dialogInterface, int i10) {
        onClickAppInfoConfirmImport(appInfo, launcher, dialogInterface);
    }

    private void onClickAppInfoConfirmImport(final AppInfo appInfo, Launcher launcher, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        final ShortcutInfo shortcutInfoJ = m.j(launcher, appInfo);
        d1.E(launcher.getModel(), c.g(getModuleId()), new d1.f() { // from class: da.d
            @Override // U9.d1.f
            public final ArrayList a(ArrayList arrayList) {
                SeduceImportModule.i(shortcutInfoJ, arrayList);
                return arrayList;
            }
        }, new d1.d() { // from class: da.e
            @Override // U9.d1.d
            public final void a(ArrayList arrayList) {
                D.g().b().K(appInfo);
            }
        });
    }

    private static String pkg2ModuleId(String str) {
        return c.h(str);
    }

    @Override // ca.c
    public Drawable getIcon() {
        return new BitmapDrawable(this.context.getResources(), this.appInfoCache.a(this.context).iconBitmap);
    }

    @Override // ca.c
    public String getName() {
        return String.valueOf(this.appInfoCache.a(this.context).title);
    }

    public String getPackageName() {
        return this.pkgNameIO.get();
    }

    @Override // ca.d
    public void onLaunch(Activity activity) {
        final Launcher launcherG = D.g().b().G();
        final AppInfo appInfoA = this.appInfoCache.a(activity);
        I i10 = new I(activity);
        i10.w(appInfoA);
        i10.f168290k = new DialogInterface.OnClickListener() { // from class: da.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.f194909a.lambda$onLaunch$4(appInfoA, launcherG, dialogInterface, i11);
            }
        };
        i10.f168291l = new j();
        i10.E(activity);
    }

    public SeduceImportModule(Context context, String str) {
        this(context);
        setModuleId(pkg2ModuleId(str));
    }
}
