package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.persistence.FileStore;

/* JADX INFO: loaded from: classes3.dex */
class FirebaseCrashlyticsNdk implements CrashlyticsNativeComponent {
    private static FirebaseCrashlyticsNdk instance;
    private final CrashpadController controller;
    private String currentSessionId;
    private boolean installHandlerDuringPrepareSession;
    private SignalHandlerInstaller signalHandlerInstaller;

    public interface SignalHandlerInstaller {
        void installHandler();
    }

    public FirebaseCrashlyticsNdk(@NonNull CrashpadController crashpadController, boolean z10) {
        this.controller = crashpadController;
        this.installHandlerDuringPrepareSession = z10;
    }

    public static /* synthetic */ void a(FirebaseCrashlyticsNdk firebaseCrashlyticsNdk, String str, String str2, long j10, StaticSessionData staticSessionData) {
        firebaseCrashlyticsNdk.getClass();
        Logger.getLogger().d("Initializing native session: " + str);
        if (firebaseCrashlyticsNdk.controller.initialize(str, str2, j10, staticSessionData)) {
            return;
        }
        Logger.getLogger().w("Failed to initialize Crashlytics NDK for session " + str);
    }

    public static FirebaseCrashlyticsNdk create(@NonNull Context context, boolean z10) {
        FirebaseCrashlyticsNdk firebaseCrashlyticsNdk = new FirebaseCrashlyticsNdk(new CrashpadController(context, new JniNativeApi(context), new FileStore(context)), z10);
        instance = firebaseCrashlyticsNdk;
        return firebaseCrashlyticsNdk;
    }

    @NonNull
    public static FirebaseCrashlyticsNdk getInstance() {
        FirebaseCrashlyticsNdk firebaseCrashlyticsNdk = instance;
        if (firebaseCrashlyticsNdk != null) {
            return firebaseCrashlyticsNdk;
        }
        throw new NullPointerException("FirebaseCrashlyticsNdk component is not present.");
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    @NonNull
    public NativeSessionFileProvider getSessionFileProvider(@NonNull String str) {
        return new SessionFilesProvider(this.controller.getFilesForSession(str));
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForCurrentSession() {
        String str = this.currentSessionId;
        return str != null && hasCrashDataForSession(str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForSession(@NonNull String str) {
        return this.controller.hasCrashDataForSession(str);
    }

    public synchronized void installSignalHandler() {
        SignalHandlerInstaller signalHandlerInstaller = this.signalHandlerInstaller;
        if (signalHandlerInstaller != null) {
            signalHandlerInstaller.installHandler();
            return;
        }
        if (this.installHandlerDuringPrepareSession) {
            Logger.getLogger().w("Native signal handler already installed; skipping re-install.");
        } else {
            Logger.getLogger().d("Deferring signal handler installation until the FirebaseCrashlyticsNdk session has been prepared");
            this.installHandlerDuringPrepareSession = true;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public synchronized void prepareNativeSession(@NonNull final String str, @NonNull final String str2, final long j10, @NonNull final StaticSessionData staticSessionData) throws Throwable {
        try {
            try {
                this.currentSessionId = str;
                SignalHandlerInstaller signalHandlerInstaller = new SignalHandlerInstaller() { // from class: com.google.firebase.crashlytics.ndk.d
                    @Override // com.google.firebase.crashlytics.ndk.FirebaseCrashlyticsNdk.SignalHandlerInstaller
                    public final void installHandler() {
                        FirebaseCrashlyticsNdk.a(this.f151191a, str, str2, j10, staticSessionData);
                    }
                };
                this.signalHandlerInstaller = signalHandlerInstaller;
                if (this.installHandlerDuringPrepareSession) {
                    signalHandlerInstaller.installHandler();
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
