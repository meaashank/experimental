package com.mbridge.msdk.dycreator.error;

import com.android.launcher3.LauncherSettings;

/* JADX INFO: loaded from: classes5.dex */
public enum b {
    NOT_FOUND_VIEWOPTION(LauncherSettings.Favorites.CONTAINER_HOTSEAT, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-102, "context is null"),
    FILE_CREATE_VIEW_FILE(-103, "file create view is null"),
    CAMPAIGNEX_IS_NULL(-104, "Campaign size only one"),
    NOT_FOUND_CAMPAIGN(-105, "campaign is null"),
    NOT_FOUND_DYNAMIC_FILE(-106, "dynamic file is not exits"),
    BIND_DATA_FILE_OR_DIR(-107, "data file or file dir is not exits "),
    NOT_FOUND_DYNAMIC_OPTION(-108, "dynamic_option is not exits");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f155826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f155827b;

    b(int i10, String str) {
        this.f155826a = i10;
        this.f155827b = str;
    }

    public int g() {
        return this.f155826a;
    }

    public String h() {
        return this.f155827b;
    }
}
