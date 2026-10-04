package U9;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.util.Log;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.extension.LoaderTaskExtension;
import com.android.launcher3.model.LoaderCursor;

/* JADX INFO: loaded from: classes6.dex */
public class V0 implements LoaderTaskExtension {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f73989a = com.prism.commons.utils.l0.b(V0.class.getSimpleName());

    @Override // com.android.launcher3.extension.LoaderTaskExtension
    public ShortcutInfo createExtensionShortcut(LoaderCursor loaderCursor, Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            Log.d(f73989a, "Missing component found in getShortcutInfo");
            return null;
        }
        Intent intent2 = new Intent("android.intent.action.MAIN", (Uri) null);
        intent2.addCategory("android.intent.category.LAUNCHER");
        intent2.setComponent(component);
        ShortcutInfo shortcutInfo = new ShortcutInfo();
        shortcutInfo.itemType = 0;
        shortcutInfo.user = Process.myUserHandle();
        shortcutInfo.intent = intent2;
        loaderCursor.loadIcon(shortcutInfo);
        String title = loaderCursor.getTitle();
        shortcutInfo.title = title;
        if (title == null) {
            shortcutInfo.title = component.getClassName();
        }
        return shortcutInfo;
    }

    @Override // com.android.launcher3.extension.LoaderTaskExtension
    public boolean isValidExtensionPkg(String str) {
        return com.prism.hider.utils.c.k(str);
    }
}
