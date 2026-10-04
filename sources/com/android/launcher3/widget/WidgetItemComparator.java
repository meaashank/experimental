package com.android.launcher3.widget;

import android.os.Process;
import android.os.UserHandle;
import com.android.launcher3.model.WidgetItem;
import java.text.Collator;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public class WidgetItemComparator implements Comparator<WidgetItem> {
    private final UserHandle mMyUserHandle = Process.myUserHandle();
    private final Collator mCollator = Collator.getInstance();

    @Override // java.util.Comparator
    public int compare(WidgetItem widgetItem, WidgetItem widgetItem2) {
        boolean zEquals = this.mMyUserHandle.equals(widgetItem.user);
        if ((!zEquals) ^ (!this.mMyUserHandle.equals(widgetItem2.user))) {
            return !zEquals ? 1 : -1;
        }
        int iCompare = this.mCollator.compare(widgetItem.label, widgetItem2.label);
        if (iCompare != 0) {
            return iCompare;
        }
        int i10 = widgetItem.spanX;
        int i11 = widgetItem.spanY;
        int i12 = i10 * i11;
        int i13 = widgetItem2.spanX;
        int i14 = widgetItem2.spanY;
        int i15 = i13 * i14;
        return i12 == i15 ? Integer.compare(i11, i14) : Integer.compare(i12, i15);
    }
}
