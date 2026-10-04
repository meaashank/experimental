package com.android.launcher3.allapps;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes2.dex */
public interface SearchUiManager {
    void initialize(AllAppsContainerView allAppsContainerView);

    void preDispatchKeyEvent(KeyEvent keyEvent);

    void resetSearch();
}
