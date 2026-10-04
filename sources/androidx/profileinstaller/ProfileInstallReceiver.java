package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.profileinstaller.i;

/* JADX INFO: loaded from: classes2.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public static final String f116140a = "androidx.profileinstaller.action.INSTALL_PROFILE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public static final String f116141b = "androidx.profileinstaller.action.SAVE_PROFILE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public static final String f116142c = "androidx.profileinstaller.action.SKIP_FILE";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public static final String f116143d = "androidx.profileinstaller.action.BENCHMARK_OPERATION";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public static final String f116144e = "EXTRA_SKIP_FILE_OPERATION";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public static final String f116145f = "WRITE_SKIP_FILE";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public static final String f116146g = "DELETE_SKIP_FILE";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public static final String f116147h = "EXTRA_BENCHMARK_OPERATION";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public static final String f116148i = "DROP_SHADER_CACHE";

    public class a implements i.d {
        public a() {
        }

        @Override // androidx.profileinstaller.i.d
        public void a(int i10, @Nullable Object obj) {
            i.f116194h.a(i10, obj);
            ProfileInstallReceiver.this.setResultCode(i10);
        }

        @Override // androidx.profileinstaller.i.d
        public void b(int i10, @Nullable Object obj) {
            i.f116194h.b(i10, obj);
        }
    }

    public static void a(@NonNull i.d dVar) {
        if (Build.VERSION.SDK_INT < 24) {
            dVar.a(13, null);
        } else {
            Process.sendSignal(Process.myPid(), 10);
            dVar.a(12, null);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @Nullable Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (f116140a.equals(action)) {
            i.l(context, new androidx.privacysandbox.ads.adservices.adid.h(), new a(), true);
            return;
        }
        if (f116142c.equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString(f116144e);
                if (f116145f.equals(string)) {
                    i.m(context, new androidx.privacysandbox.ads.adservices.adid.h(), new a());
                    return;
                } else {
                    if (f116146g.equals(string)) {
                        i.d(context, new androidx.privacysandbox.ads.adservices.adid.h(), new a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (f116141b.equals(action)) {
            a(new a());
            return;
        }
        if (!f116143d.equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString(f116147h);
        a aVar = new a();
        if (f116148i.equals(string2)) {
            androidx.profileinstaller.a.b(context, aVar);
        } else {
            aVar.a(16, null);
        }
    }
}
