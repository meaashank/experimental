package com.android.launcher3;

import android.content.Context;
import com.android.launcher3.graphics.IconShapeOverride;
import com.android.launcher3.logging.FileLog;

/* JADX INFO: loaded from: classes2.dex */
public class MainProcessInitializer {
    public static void initialize(Context context) {
        ((MainProcessInitializer) Utilities.getOverrideObject(MainProcessInitializer.class, context, com.app.hider.master.promax.R.string.main_process_initializer_class)).init(context);
    }

    public void init(Context context) {
        FileLog.setDir(context.getApplicationContext().getFilesDir());
        IconShapeOverride.apply(context);
        SessionCommitReceiver.applyDefaultUserPrefs(context);
    }
}
