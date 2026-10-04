package com.google.android.play.core.hsdp.service;

import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class HsdpPrewarmRequest {

    public static abstract class Builder {
        @NonNull
        public abstract HsdpPrewarmRequest build();

        @NonNull
        public abstract Builder setExtraQueryParams(@NonNull Map<String, String> map);

        @NonNull
        public abstract Builder setReferrer(@NonNull String str);

        @NonNull
        public abstract Builder setTargetAppPackageName(@NonNull String str);

        @NonNull
        public abstract Builder setWindowToken(@NonNull IBinder iBinder);
    }

    @NonNull
    public static Builder builder() {
        zzb zzbVar = new zzb();
        zzbVar.setExtraQueryParams(Collections.EMPTY_MAP);
        return zzbVar;
    }

    @NonNull
    public abstract Map<String, String> extraQueryParams();

    @NonNull
    public abstract String referrer();

    @NonNull
    public abstract String targetAppPackageName();

    @Nullable
    public abstract IBinder windowToken();
}
