package com.android.launcher3.extension;

import com.android.launcher3.Launcher;

/* JADX INFO: loaded from: classes2.dex */
public interface NegativeScreenExtension {
    void addNegativeScreen(Launcher launcher);

    boolean existsNegativeScreen();

    boolean handleBack();

    boolean hide(boolean z10);

    void onDestroy();

    void onHostResume();

    void onHostStop();
}
