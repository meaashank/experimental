package com.google.firebase.sessions;

import android.util.Base64;
import com.prism.gaia.download.j;
import kotlin.text.F;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class SessionDataStoreConfigs {

    @NotNull
    public static final SessionDataStoreConfigs INSTANCE = new SessionDataStoreConfigs();
    private static final String PROCESS_NAME;

    @NotNull
    private static final String SESSIONS_CONFIG_NAME;

    @NotNull
    private static final String SETTINGS_CONFIG_NAME;

    static {
        String strEncodeToString = Base64.encodeToString(F.Z1(ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions()), 10);
        PROCESS_NAME = strEncodeToString;
        SESSIONS_CONFIG_NAME = android.support.v4.media.i.a("firebase_session_", strEncodeToString, j.b.f164768t);
        SETTINGS_CONFIG_NAME = android.support.v4.media.i.a("firebase_session_", strEncodeToString, "_settings");
    }

    private SessionDataStoreConfigs() {
    }

    @NotNull
    public final String getSESSIONS_CONFIG_NAME() {
        return SESSIONS_CONFIG_NAME;
    }

    @NotNull
    public final String getSETTINGS_CONFIG_NAME() {
        return SETTINGS_CONFIG_NAME;
    }
}
