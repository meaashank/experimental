package com.prism.hider.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.ItemInfoWithIcon;
import com.prism.commons.utils.C3855t;
import com.prism.commons.utils.l0;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f168395a = l0.b(l.class.getSimpleName());

    public static <T extends ItemInfo> T a(BubbleTextView bubbleTextView, Class<T> cls) {
        Object tag = bubbleTextView.getTag();
        if (cls.isInstance(tag)) {
            return (T) tag;
        }
        return null;
    }

    public static void b(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return;
        }
        for (ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
            Log.d(f168395a, "context:" + context + " currentTask:" + appTask.getTaskInfo().affiliatedTaskId);
        }
    }

    public static void c(Bitmap bitmap, String str) {
        Log.d(f168395a, "saving Bitmap:" + bitmap + " to:" + str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e10) {
            Log.e(f168395a, "save icon failed ", e10);
        }
    }

    public static void d(Drawable drawable, String str) {
        Log.d(f168395a, "saving drawable:" + drawable + " to:" + str);
        c(C3855t.e(drawable), str);
    }

    public static void e(ItemInfoWithIcon itemInfoWithIcon) {
        c(itemInfoWithIcon.iconBitmap, android.support.v4.media.i.a("/sdcard/temp/", itemInfoWithIcon.getTargetComponent().getPackageName(), u.e.f239314f));
    }
}
