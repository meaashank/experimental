package com.prism.commons.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.Nullable;
import com.prism.commons.utils.C3858w;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f162024a = l0.b(A.class.getSimpleName());

    public static Intent a(Context context, String str, @Nullable File file) {
        if (file == null) {
            return null;
        }
        try {
            return b(C3858w.w(context, str, file));
        } catch (Throwable th) {
            Log.w(f162024a, "failed to get uri of file: " + file.getAbsolutePath(), th);
            return null;
        }
    }

    public static Intent b(@Nullable Uri uri) {
        if (uri == null) {
            Log.w(f162024a, "srcFileUri is null");
            return null;
        }
        Log.d(f162024a, "startInstall: " + uri);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.addFlags(3);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setDataAndType(uri, C3858w.c.f162163a);
        return intent;
    }

    public static void c(Context context, @Nullable Uri uri) {
        Intent intentB = b(uri);
        if (intentB == null) {
            return;
        }
        context.startActivity(intentB);
    }

    public static void d(Context context, String str, @Nullable File file) {
        Intent intentA = a(context, str, file);
        if (intentA == null) {
            return;
        }
        context.startActivity(intentA);
    }

    public static void e(Context context, String str) {
        context.startActivity(new Intent("android.intent.action.DELETE", Uri.fromParts("package", str, null)));
    }
}
