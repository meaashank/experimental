package com.google.android.exoplayer2.source.dash;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.chunk.ChunkSource;
import com.google.android.exoplayer2.source.dash.PlayerEmsgHandler;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;

/* JADX INFO: loaded from: classes3.dex */
public interface DashChunkSource extends ChunkSource {

    public interface Factory {
        DashChunkSource createDashChunkSource(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, int i10, int[] iArr, TrackSelection trackSelection, int i11, long j10, boolean z10, boolean z11, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler);
    }

    void updateManifest(DashManifest dashManifest, int i10);
}
