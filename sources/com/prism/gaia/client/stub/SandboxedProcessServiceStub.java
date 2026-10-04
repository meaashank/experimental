package com.prism.gaia.client.stub;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.prism.gaia.client.GProcessClient;

/* JADX INFO: loaded from: classes6.dex */
public class SandboxedProcessServiceStub extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f164422a = "asdf-".concat(SandboxedProcessServiceStub.class.getSimpleName());

    public static class Sandbox500 extends SandboxedProcessServiceStub {
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        E9.d dVarC = E9.c.c(intent);
        if (dVarC == null) {
            return new Binder();
        }
        GProcessClient.c6().r6(dVarC.f33338f);
        GProcessClient.f164187n.W5();
        return dVarC.f33337e;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return false;
    }
}
