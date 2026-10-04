package com.google.android.material.search;

import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchBarAnimationHelper;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements SearchBarAnimationHelper.OnLoadAnimationInvocation {
    @Override // com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation
    public final void invoke(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        onLoadAnimationCallback.onAnimationEnd();
    }
}
