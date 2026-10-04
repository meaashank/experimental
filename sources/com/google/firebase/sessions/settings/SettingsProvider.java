package com.google.firebase.sessions.settings;

import kotlin.L0;
import kotlin.coroutines.e;
import kotlin.time.C5041h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface SettingsProvider {

    public static final class DefaultImpls {
        public static boolean isSettingsStale(@NotNull SettingsProvider settingsProvider) {
            return false;
        }

        @Nullable
        public static Object updateSettings(@NotNull SettingsProvider settingsProvider, @NotNull e<? super L0> eVar) {
            return L0.f217464a;
        }
    }

    @Nullable
    Double getSamplingRate();

    @Nullable
    Boolean getSessionEnabled();

    @Nullable
    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774 */
    C5041h mo14getSessionRestartTimeoutFghU774();

    boolean isSettingsStale();

    @Nullable
    Object updateSettings(@NotNull e<? super L0> eVar);
}
