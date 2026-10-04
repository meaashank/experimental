package com.android.launcher3.model;

import com.android.launcher3.ItemInfoWithIcon;

/* JADX INFO: loaded from: classes2.dex */
public class PackageItemInfo extends ItemInfoWithIcon {
    public String packageName;

    public PackageItemInfo(String str) {
        this.packageName = str;
    }

    @Override // com.android.launcher3.ItemInfo
    public String dumpProperties() {
        return super.dumpProperties() + " packageName=" + this.packageName;
    }
}
