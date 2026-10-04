package com.android.launcher3.widget;

import com.android.launcher3.model.PackageItemInfo;
import com.android.launcher3.model.WidgetItem;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class WidgetListRowEntry {
    public final PackageItemInfo pkgItem;
    public String titleSectionName;
    public final ArrayList<WidgetItem> widgets;

    public WidgetListRowEntry(PackageItemInfo packageItemInfo, ArrayList<WidgetItem> arrayList) {
        this.pkgItem = packageItemInfo;
        this.widgets = arrayList;
    }

    public String toString() {
        return this.pkgItem.packageName + com.prism.gaia.server.accounts.b.f166434b0 + this.widgets.size();
    }
}
