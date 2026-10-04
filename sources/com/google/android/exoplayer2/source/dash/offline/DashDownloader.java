package com.google.android.exoplayer2.source.dash.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.DashUtil;
import com.google.android.exoplayer2.source.dash.DashWrappingSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.source.dash.manifest.RepresentationKey;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class DashDownloader extends SegmentDownloader<DashManifest, RepresentationKey> {
    public DashDownloader(Uri uri, List<RepresentationKey> list, DownloaderConstructorHelper downloaderConstructorHelper) {
        super(uri, list, downloaderConstructorHelper);
    }

    private static void addSegment(long j10, String str, RangedUri rangedUri, ArrayList<SegmentDownloader.Segment> arrayList) {
        arrayList.add(new SegmentDownloader.Segment(j10, new DataSpec(rangedUri.resolveUri(str), rangedUri.start, rangedUri.length, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void addSegmentsForAdaptationSet(com.google.android.exoplayer2.upstream.DataSource r20, com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r21, long r22, long r24, boolean r26, java.util.ArrayList<com.google.android.exoplayer2.offline.SegmentDownloader.Segment> r27) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r1 = r21
            r2 = r22
            r4 = r27
            r0 = 0
            r5 = r0
        L8:
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> r0 = r1.representations
            int r0 = r0.size()
            if (r5 >= r0) goto L83
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> r0 = r1.representations
            java.lang.Object r0 = r0.get(r5)
            com.google.android.exoplayer2.source.dash.manifest.Representation r0 = (com.google.android.exoplayer2.source.dash.manifest.Representation) r0
            int r6 = r1.type     // Catch: java.io.IOException -> L77
            r7 = r20
            com.google.android.exoplayer2.source.dash.DashSegmentIndex r6 = getSegmentIndex(r7, r6, r0)     // Catch: java.io.IOException -> L73
            if (r6 == 0) goto L67
            r8 = r24
            int r10 = r6.getSegmentCount(r8)
            r11 = -1
            if (r10 == r11) goto L5f
            java.lang.String r11 = r0.baseUrl
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r12 = r0.getInitializationUri()
            if (r12 == 0) goto L36
            addSegment(r2, r11, r12, r4)
        L36:
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r0 = r0.getIndexUri()
            if (r0 == 0) goto L3f
            addSegment(r2, r11, r0, r4)
        L3f:
            long r12 = r6.getFirstSegmentNum()
            long r14 = (long) r10
            long r14 = r14 + r12
            r16 = 1
            long r14 = r14 - r16
        L49:
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 > 0) goto L7d
            long r18 = r6.getTimeUs(r12)
            long r0 = r18 + r2
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r10 = r6.getSegmentUrl(r12)
            addSegment(r0, r11, r10, r4)
            long r12 = r12 + r16
            r1 = r21
            goto L49
        L5f:
            com.google.android.exoplayer2.offline.DownloadException r0 = new com.google.android.exoplayer2.offline.DownloadException
            java.lang.String r1 = "Unbounded segment index"
            r0.<init>(r1)
            throw r0
        L67:
            r8 = r24
            com.google.android.exoplayer2.offline.DownloadException r0 = new com.google.android.exoplayer2.offline.DownloadException     // Catch: java.io.IOException -> L71
            java.lang.String r1 = "Missing segment index"
            r0.<init>(r1)     // Catch: java.io.IOException -> L71
            throw r0     // Catch: java.io.IOException -> L71
        L71:
            r0 = move-exception
            goto L7b
        L73:
            r0 = move-exception
        L74:
            r8 = r24
            goto L7b
        L77:
            r0 = move-exception
            r7 = r20
            goto L74
        L7b:
            if (r26 == 0) goto L82
        L7d:
            int r5 = r5 + 1
            r1 = r21
            goto L8
        L82:
            throw r0
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.offline.DashDownloader.addSegmentsForAdaptationSet(com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.source.dash.manifest.AdaptationSet, long, long, boolean, java.util.ArrayList):void");
    }

    @Nullable
    private static DashSegmentIndex getSegmentIndex(DataSource dataSource, int i10, Representation representation) throws InterruptedException, IOException {
        DashSegmentIndex index = representation.getIndex();
        if (index != null) {
            return index;
        }
        ChunkIndex chunkIndexLoadChunkIndex = DashUtil.loadChunkIndex(dataSource, i10, representation);
        if (chunkIndexLoadChunkIndex == null) {
            return null;
        }
        return new DashWrappingSegmentIndex(chunkIndexLoadChunkIndex);
    }

    @Override // com.google.android.exoplayer2.offline.SegmentDownloader
    public DashManifest getManifest(DataSource dataSource, Uri uri) throws IOException {
        return DashUtil.loadManifest(dataSource, uri);
    }

    @Override // com.google.android.exoplayer2.offline.SegmentDownloader
    public List<SegmentDownloader.Segment> getSegments(DataSource dataSource, DashManifest dashManifest, boolean z10) throws InterruptedException, IOException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < dashManifest.getPeriodCount(); i10++) {
            Period period = dashManifest.getPeriod(i10);
            long jMsToUs = C.msToUs(period.startMs);
            long periodDurationUs = dashManifest.getPeriodDurationUs(i10);
            List<AdaptationSet> list = period.adaptationSets;
            for (int i11 = 0; i11 < list.size(); i11++) {
                addSegmentsForAdaptationSet(dataSource, list.get(i11), jMsToUs, periodDurationUs, z10, arrayList);
            }
        }
        return arrayList;
    }
}
