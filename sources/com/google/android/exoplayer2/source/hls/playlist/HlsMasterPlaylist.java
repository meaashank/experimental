package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.Format;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMasterPlaylist extends HlsPlaylist {
    public final List<HlsUrl> audios;
    public final Format muxedAudioFormat;
    public final List<Format> muxedCaptionFormats;
    public final List<HlsUrl> subtitles;
    public final List<HlsUrl> variants;

    public static final class HlsUrl {
        public final Format format;
        public final String url;

        public HlsUrl(String str, Format format) {
            this.url = str;
            this.format = format;
        }

        public static HlsUrl createMediaPlaylistHlsUrl(String str) {
            return new HlsUrl(str, Format.createContainerFormat(MBridgeConstans.ENDCARD_URL_TYPE_PL, "application/x-mpegURL", null, null, -1, 0, null));
        }
    }

    public HlsMasterPlaylist(String str, List<String> list, List<HlsUrl> list2, List<HlsUrl> list3, List<HlsUrl> list4, Format format, List<Format> list5) {
        super(str, list);
        this.variants = Collections.unmodifiableList(list2);
        this.audios = Collections.unmodifiableList(list3);
        this.subtitles = Collections.unmodifiableList(list4);
        this.muxedAudioFormat = format;
        this.muxedCaptionFormats = list5 != null ? Collections.unmodifiableList(list5) : null;
    }

    private static List<HlsUrl> copyRenditionsList(List<HlsUrl> list, int i10, List<RenditionKey> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            HlsUrl hlsUrl = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    RenditionKey renditionKey = list2.get(i12);
                    if (renditionKey.type == i10 && renditionKey.trackIndex == i11) {
                        arrayList.add(hlsUrl);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    public static HlsMasterPlaylist createSingleVariantMasterPlaylist(String str) {
        List listSingletonList = Collections.singletonList(HlsUrl.createMediaPlaylistHlsUrl(str));
        List list = Collections.EMPTY_LIST;
        return new HlsMasterPlaylist(null, list, listSingletonList, list, list, null, null);
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    /* JADX INFO: renamed from: copy, reason: merged with bridge method [inline-methods] */
    public HlsPlaylist copy2(List<RenditionKey> list) {
        return new HlsMasterPlaylist(this.baseUri, this.tags, copyRenditionsList(this.variants, 0, list), copyRenditionsList(this.audios, 1, list), copyRenditionsList(this.subtitles, 2, list), this.muxedAudioFormat, this.muxedCaptionFormats);
    }
}
