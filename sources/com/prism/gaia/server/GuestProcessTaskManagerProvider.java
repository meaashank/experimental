package com.prism.gaia.server;

import android.app.ActivityManager;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.commons.provider.ProviderCall;
import com.prism.gaia.client.GaiaContext;

/* JADX INFO: loaded from: classes6.dex */
public class GuestProcessTaskManagerProvider extends ContentProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f166099b = "asdf-".concat("GuestProcessTaskManagerProvider");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f166100c = ".gaia.service.GuestProcessTaskManagerProvider";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f166101d = "com.app.hider.master.promax.gaia.service.GuestProcessTaskManagerProvider";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f166102e = ".kill_all_old_process";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f166103f = ".ensure_helper_run_1";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActivityManager f166104a;

    public static boolean a(String str) {
        return ProviderCall.b(GaiaContext.j().n(), b(str), f166103f, null, null) != null;
    }

    public static String b(String str) {
        return androidx.compose.runtime.changelist.j.a(str, f166100c);
    }

    public static void c(String str) {
        ProviderCall.b(GaiaContext.j().n(), b(str), f166102e, null, null);
    }

    public static void d() {
        ProviderCall.b(GaiaContext.j().n(), f166101d, f166102e, null, null);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (str.equals(f166102e)) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : this.f166104a.getRunningAppProcesses()) {
                try {
                    if (runningAppProcessInfo.processName.indexOf(U6.c.f68692Z) > 0) {
                        Process.killProcess(runningAppProcessInfo.pid);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f166104a = (ActivityManager) getContext().getSystemService("activity");
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
