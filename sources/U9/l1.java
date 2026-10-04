package U9;

import android.content.ComponentName;
import android.content.Intent;
import com.android.launcher3.AppInfo;
import com.android.launcher3.PromiseAppInfo;
import com.android.launcher3.ShortcutInfo;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class l1 extends PromiseAppInfo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f74091b = com.prism.commons.utils.l0.b(l1.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74092a;

    public l1(AppInfo appInfo) {
        super(appInfo);
        this.f74092a = UUID.randomUUID().toString();
        this.packageName = com.prism.hider.utils.c.f(appInfo.packageName);
        this.componentName = new ComponentName(com.prism.hider.utils.c.f(this.componentName.getPackageName()), this.componentName.getClassName());
        this.intent = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setComponent(this.componentName).setFlags(270532608);
    }

    @Override // com.android.launcher3.PromiseAppInfo, com.android.launcher3.AppInfo
    public ShortcutInfo makeShortcut() {
        ShortcutInfo shortcutInfo = new ShortcutInfo(this);
        shortcutInfo.setInstallProgress(this.level);
        shortcutInfo.status |= 10;
        return shortcutInfo;
    }
}
