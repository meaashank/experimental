package com.github.appintro;

/* JADX INFO: loaded from: classes3.dex */
public interface AppIntroViewPagerListener {
    boolean onCanRequestNextPage();

    void onIllegallyRequestedNextPage();

    void onUserRequestedPermissionsDialog();
}
