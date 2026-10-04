package com.tonyodev.fetch2;

import android.net.Uri;
import android.os.Parcelable;
import com.tonyodev.fetch2core.Extras;
import java.io.Serializable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface Download extends Parcelable, Serializable {
    @NotNull
    Download copy();

    int getAutoRetryAttempts();

    int getAutoRetryMaxAttempts();

    long getCreated();

    boolean getDownloadOnEnqueue();

    long getDownloaded();

    long getDownloadedBytesPerSecond();

    @NotNull
    EnqueueAction getEnqueueAction();

    @NotNull
    Error getError();

    long getEtaInMilliSeconds();

    @NotNull
    Extras getExtras();

    @NotNull
    String getFile();

    @NotNull
    Uri getFileUri();

    int getGroup();

    @NotNull
    Map<String, String> getHeaders();

    int getId();

    long getIdentifier();

    @NotNull
    String getNamespace();

    @NotNull
    NetworkType getNetworkType();

    @NotNull
    Priority getPriority();

    int getProgress();

    @NotNull
    Request getRequest();

    @NotNull
    Status getStatus();

    @Nullable
    String getTag();

    long getTotal();

    @NotNull
    String getUrl();
}
