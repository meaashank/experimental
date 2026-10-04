package U9;

import android.view.View;
import com.android.launcher3.AppInfo;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.extension.ItemLongClickListenerExtension;
import y8.C5842a;

/* JADX INFO: loaded from: classes6.dex */
public class K0 implements ItemLongClickListenerExtension {
    @Override // com.android.launcher3.extension.ItemLongClickListenerExtension
    public boolean onAllAppsItemLongClick(View view) {
        Object tag = view.getTag();
        return (view instanceof BubbleTextView) && (tag instanceof AppInfo) && C5842a.m().e(((AppInfo) tag).getDecodedPkgName()) != null;
    }
}
