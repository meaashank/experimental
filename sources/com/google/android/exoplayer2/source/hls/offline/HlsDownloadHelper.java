package com.google.android.exoplayer2.source.hls.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.offline.DownloadHelper;
import com.google.android.exoplayer2.offline.TrackKey;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.source.hls.playlist.RenditionKey;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsDownloadHelper extends DownloadHelper {
    private final DataSource.Factory manifestDataSourceFactory;

    @MonotonicNonNull
    private HlsPlaylist playlist;
    private int[] renditionTypes;
    private final Uri uri;

    public HlsDownloadHelper(Uri uri, DataSource.Factory factory) {
        this.uri = uri;
        this.manifestDataSourceFactory = factory;
    }

    private static Format[] toFormats(List<HlsMasterPlaylist.HlsUrl> list) {
        Format[] formatArr = new Format[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            formatArr[i10] = list.get(i10).format;
        }
        return formatArr;
    }

    private static List<RenditionKey> toRenditionKeys(List<TrackKey> list, int[] iArr) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            TrackKey trackKey = list.get(i10);
            arrayList.add(new RenditionKey(iArr[trackKey.groupIndex], trackKey.trackIndex));
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    public /* bridge */ /* synthetic */ DownloadAction getDownloadAction(@Nullable byte[] bArr, List list) {
        return getDownloadAction(bArr, (List<TrackKey>) list);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    public int getPeriodCount() {
        Assertions.checkNotNull(this.playlist);
        return 1;
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    public TrackGroupArray getTrackGroups(int i10) {
        Assertions.checkNotNull(this.playlist);
        HlsPlaylist hlsPlaylist = this.playlist;
        if (hlsPlaylist instanceof HlsMediaPlaylist) {
            return TrackGroupArray.EMPTY;
        }
        HlsMasterPlaylist hlsMasterPlaylist = (HlsMasterPlaylist) hlsPlaylist;
        TrackGroup[] trackGroupArr = new TrackGroup[3];
        this.renditionTypes = new int[3];
        int i11 = 0;
        if (!hlsMasterPlaylist.variants.isEmpty()) {
            this.renditionTypes[0] = 0;
            trackGroupArr[0] = new TrackGroup(toFormats(hlsMasterPlaylist.variants));
            i11 = 1;
        }
        if (!hlsMasterPlaylist.audios.isEmpty()) {
            this.renditionTypes[i11] = 1;
            trackGroupArr[i11] = new TrackGroup(toFormats(hlsMasterPlaylist.audios));
            i11++;
        }
        if (!hlsMasterPlaylist.subtitles.isEmpty()) {
            this.renditionTypes[i11] = 2;
            trackGroupArr[i11] = new TrackGroup(toFormats(hlsMasterPlaylist.subtitles));
            i11++;
        }
        return new TrackGroupArray((TrackGroup[]) Arrays.copyOf(trackGroupArr, i11));
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    public void prepareInternal() throws IOException {
        this.playlist = (HlsPlaylist) ParsingLoadable.load(this.manifestDataSourceFactory.createDataSource(), new HlsPlaylistParser(), this.uri);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    public HlsDownloadAction getDownloadAction(@Nullable byte[] bArr, List<TrackKey> list) {
        Assertions.checkNotNull(this.renditionTypes);
        return new HlsDownloadAction(this.uri, false, bArr, toRenditionKeys(list, this.renditionTypes));
    }

    @Override // com.google.android.exoplayer2.offline.DownloadHelper
    public HlsDownloadAction getRemoveAction(@Nullable byte[] bArr) {
        return new HlsDownloadAction(this.uri, true, bArr, Collections.EMPTY_LIST);
    }
}
