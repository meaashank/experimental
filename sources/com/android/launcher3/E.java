package com.android.launcher3;

import android.view.View;
import com.android.launcher3.PagedView;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class E implements PagedView.ComputePageScrollsLogic {
    @Override // com.android.launcher3.PagedView.ComputePageScrollsLogic
    public final boolean shouldIncludeView(View view) {
        return PagedView.a(view);
    }
}
