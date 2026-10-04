package com.android.launcher3.touch;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements View.OnLongClickListener {
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return ItemLongClickListener.onAllAppsItemLongClick(view);
    }
}
