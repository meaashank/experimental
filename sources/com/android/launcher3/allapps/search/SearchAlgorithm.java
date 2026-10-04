package com.android.launcher3.allapps.search;

import com.android.launcher3.allapps.search.AllAppsSearchBarController;

/* JADX INFO: loaded from: classes2.dex */
public interface SearchAlgorithm {
    void cancel(boolean z10);

    void doSearch(String str, AllAppsSearchBarController.Callbacks callbacks);
}
