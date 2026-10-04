package com.google.android.exoplayer2.source.smoothstreaming.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.offline.DownloadHelper;
import com.google.android.exoplayer2.offline.TrackKey;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.StreamKey;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SsDownloadHelper extends DownloadHelper {

    @MonotonicNonNull
    private SsManifest manifest;
    private final DataSource.Factory manifestDataSourceFactory;
    private final Uri uri;

    public SsDownloadHelper(Uri uri, DataSource.Factory factory) {
        this.uri = uri;
        this.manifestDataSourceFactory = factory;
    }

    private static List<StreamKey> toStreamKeys(List<TrackKey> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            TrackKey trackKey = list.get(i10);
            arrayList.add(new StreamKey(trackKey.groupIndex, trackKey.trackIndex));
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    public /* bridge */ /* synthetic */ DownloadAction getDownloadAction(@Nullable byte[] bArr, List list) {
        return getDownloadAction(bArr, (List<TrackKey>) list);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    public int getPeriodCount() {
        Assertions.checkNotNull(this.manifest);
        return 1;
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    public TrackGroupArray getTrackGroups(int i10) {
        Assertions.checkNotNull(this.manifest);
        SsManifest.StreamElement[] streamElementArr = this.manifest.streamElements;
        TrackGroup[] trackGroupArr = new TrackGroup[streamElementArr.length];
        for (int i11 = 0; i11 < streamElementArr.length; i11++) {
            trackGroupArr[i11] = new TrackGroup(streamElementArr[i11].formats);
        }
        return new TrackGroupArray(trackGroupArr);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    public void prepareInternal() throws IOException {
        this.manifest = (SsManifest) ParsingLoadable.load(this.manifestDataSourceFactory.createDataSource(), new SsManifestParser(), this.uri);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    public SsDownloadAction getDownloadAction(@Nullable byte[] bArr, List<TrackKey> list) {
        return new SsDownloadAction(this.uri, false, bArr, toStreamKeys(list));
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    public SsDownloadAction getRemoveAction(@Nullable byte[] bArr) {
        return new SsDownloadAction(this.uri, true, bArr, Collections.EMPTY_LIST);
    }
}
