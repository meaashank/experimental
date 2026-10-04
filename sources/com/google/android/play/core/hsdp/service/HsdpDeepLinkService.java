package com.google.android.play.core.hsdp.service;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface HsdpDeepLinkService {

    @NonNull
    public static final String SDK_VERSION = "2.0.0";

    public interface AffordanceListener {
        void onError(@NonNull String str);

        void onStop();
    }

    public interface HsdpDeepLinkServiceListener {
        void onAffordanceEnded();

        void onAffordanceStarted();

        void onDeepLinkStarted();

        void onDismissed(@NonNull Bundle bundle);

        void onError(@NonNull Bundle bundle);

        void onShown(@NonNull Bundle bundle);
    }

    public interface HsdpPrewarmListener {
        void onCompleted(@NonNull Bundle bundle);

        void onError(@NonNull Bundle bundle);
    }

    void detach();

    void dismiss(@NonNull String str);

    void endSession(@NonNull String str);

    void open(@NonNull String str, @NonNull String str2, @NonNull HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener);

    void open(@NonNull String str, @NonNull String str2, @NonNull HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener, @Nullable Map<String, String> map);

    void open(@NonNull String str, @NonNull String str2, @NonNull HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener, @Nullable Map<String, String> map, boolean z10);

    void prewarm(@NonNull List<HsdpPrewarmRequest> list, @NonNull HsdpPrewarmListener hsdpPrewarmListener);

    void stopAffordance(@NonNull String str, @NonNull AffordanceListener affordanceListener);
}
