package U9;

import android.view.View;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.extension.SecondaryDropTargetExtension;

/* JADX INFO: loaded from: classes6.dex */
public class m1 implements SecondaryDropTargetExtension {
    @Override // com.android.launcher3.extension.SecondaryDropTargetExtension
    public B<Boolean> supportsAccessibilityDrop(ItemInfo itemInfo, View view) {
        return new B<>(true, Boolean.FALSE);
    }
}
