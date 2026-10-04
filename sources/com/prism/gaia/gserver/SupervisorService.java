package com.prism.gaia.gserver;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class SupervisorService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f164882b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f164883a;

    public static class a extends Binder {
        public String a(String str) {
            StringBuilder sbA = android.support.v4.media.f.a(str, ": ");
            sbA.append(SupervisorService.f164882b);
            return sbA.toString();
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return this.f164883a;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f164883a = new a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f164883a = null;
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        f164882b = i11;
        return 2;
    }
}
