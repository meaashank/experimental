package androidx.core.app;

import B0.C0924h;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.core.app.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class C2386i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f111042a = "android.support.AppLaunchChecker";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f111043b = "startedFromLauncher";

    @Deprecated
    public C2386i() {
    }

    public static boolean a(@NonNull Context context) {
        return context.getSharedPreferences(f111042a, 0).getBoolean(f111043b, false);
    }

    public static void b(@NonNull Activity activity) {
        Intent intent;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(f111042a, 0);
        if (sharedPreferences.getBoolean(f111043b, false) || (intent = activity.getIntent()) == null || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return;
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(C0924h.f12279e)) {
            sharedPreferences.edit().putBoolean(f111043b, true).apply();
        }
    }
}
