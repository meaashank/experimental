package com.tonyodev.fetch2core;

import android.os.Parcelable;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface DownloadBlock extends Parcelable, Serializable {
    @NotNull
    DownloadBlock copy();

    int getBlockPosition();

    int getDownloadId();

    long getDownloadedBytes();

    long getEndByte();

    int getProgress();

    long getStartByte();
}
