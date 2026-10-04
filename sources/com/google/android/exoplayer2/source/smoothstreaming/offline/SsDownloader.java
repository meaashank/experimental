package com.google.android.exoplayer2.source.smoothstreaming.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsUtil;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.StreamKey;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SsDownloader extends SegmentDownloader<SsManifest, StreamKey> {
    public SsDownloader(Uri uri, List<StreamKey> list, DownloaderConstructorHelper downloaderConstructorHelper) {
        super(SsUtil.fixManifestUri(uri), list, downloaderConstructorHelper);
    }

    @Override // com.google.android.exoplayer2.offline.SegmentDownloader
    public SsManifest getManifest(DataSource dataSource, Uri uri) throws IOException {
        ParsingLoadable parsingLoadable = new ParsingLoadable(dataSource, uri, 4, new SsManifestParser());
        parsingLoadable.load();
        return (SsManifest) parsingLoadable.getResult();
    }

    @Override // com.google.android.exoplayer2.offline.SegmentDownloader
    public List<SegmentDownloader.Segment> getSegments(DataSource dataSource, SsManifest ssManifest, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (SsManifest.StreamElement streamElement : ssManifest.streamElements) {
            for (int i10 = 0; i10 < streamElement.formats.length; i10++) {
                for (int i11 = 0; i11 < streamElement.chunkCount; i11++) {
                    arrayList.add(new SegmentDownloader.Segment(streamElement.getStartTimeUs(i11), new DataSpec(streamElement.buildRequestUri(i10, i11))));
                }
            }
        }
        return arrayList;
    }
}
