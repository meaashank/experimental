package com.github.appintro;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class AppIntroBaseKt {
    private static final boolean isVisible(View view) {
        return view.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setVisible(View view, boolean z10) {
        view.setVisibility(z10 ? 0 : 4);
    }
}
