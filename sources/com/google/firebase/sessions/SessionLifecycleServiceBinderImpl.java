package com.google.firebase.sessions;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class SessionLifecycleServiceBinderImpl implements SessionLifecycleServiceBinder {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String TAG = "LifecycleServiceBinder";

    @NotNull
    private final FirebaseApp firebaseApp;

    public static final class Companion {
        public /* synthetic */ Companion(C4969v c4969v) {
            this();
        }

        private Companion() {
        }
    }

    public SessionLifecycleServiceBinderImpl(@NotNull FirebaseApp firebaseApp) {
        G.p(firebaseApp, "firebaseApp");
        this.firebaseApp = firebaseApp;
    }

    private final Object unbindServiceSafely(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
            return L0.f217464a;
        } catch (IllegalArgumentException e10) {
            return Integer.valueOf(Log.w(TAG, "Session lifecycle service binding failed.", e10));
        }
    }

    @Override // com.google.firebase.sessions.SessionLifecycleServiceBinder
    public void bindToService(@NotNull Messenger callback, @NotNull ServiceConnection serviceConnection) {
        boolean zBindService;
        G.p(callback, "callback");
        G.p(serviceConnection, "serviceConnection");
        Context applicationContext = this.firebaseApp.getApplicationContext().getApplicationContext();
        G.o(applicationContext, "firebaseApp.applicationContext.applicationContext");
        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
        Log.d(TAG, "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra(SessionLifecycleService.CLIENT_CALLBACK_MESSENGER, callback);
        intent.setPackage(applicationContext.getPackageName());
        try {
            zBindService = applicationContext.bindService(intent, serviceConnection, 65);
        } catch (SecurityException e10) {
            Log.w(TAG, "Failed to bind session lifecycle service to application.", e10);
            zBindService = false;
        }
        if (zBindService) {
            return;
        }
        unbindServiceSafely(applicationContext, serviceConnection);
        Log.i(TAG, "Session lifecycle service binding failed.");
    }
}
