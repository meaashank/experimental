package com.google.android.exoplayer2.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultTrackNameProvider implements TrackNameProvider {
    private final Resources resources;

    public DefaultTrackNameProvider(Resources resources) {
        this.resources = (Resources) Assertions.checkNotNull(resources);
    }

    private String buildAudioChannelString(Format format) {
        int i10 = format.channelCount;
        return (i10 == -1 || i10 < 1) ? "" : i10 != 1 ? i10 != 2 ? (i10 == 6 || i10 == 7) ? this.resources.getString(R.string.exo_track_surround_5_point_1) : i10 != 8 ? this.resources.getString(R.string.exo_track_surround) : this.resources.getString(R.string.exo_track_surround_7_point_1) : this.resources.getString(R.string.exo_track_stereo) : this.resources.getString(R.string.exo_track_mono);
    }

    private String buildBitrateString(Format format) {
        int i10 = format.bitrate;
        return i10 == -1 ? "" : this.resources.getString(R.string.exo_track_bitrate, Float.valueOf(i10 / 1000000.0f));
    }

    private String buildLanguageString(Format format) {
        String str = format.language;
        return (TextUtils.isEmpty(str) || "und".equals(str)) ? "" : buildLanguageString(str);
    }

    private String buildResolutionString(Format format) {
        int i10 = format.width;
        int i11 = format.height;
        return (i10 == -1 || i11 == -1) ? "" : this.resources.getString(R.string.exo_track_resolution, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private static int inferPrimaryTrackType(Format format) {
        int trackType = MimeTypes.getTrackType(format.sampleMimeType);
        if (trackType != -1) {
            return trackType;
        }
        if (MimeTypes.getVideoMediaMimeType(format.codecs) != null) {
            return 2;
        }
        if (MimeTypes.getAudioMediaMimeType(format.codecs) != null) {
            return 1;
        }
        if (format.width == -1 && format.height == -1) {
            return (format.channelCount == -1 && format.sampleRate == -1) ? -1 : 1;
        }
        return 2;
    }

    private String joinWithSeparator(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.resources.getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    @Override // com.google.android.exoplayer2.ui.TrackNameProvider
    public String getTrackName(Format format) {
        int iInferPrimaryTrackType = inferPrimaryTrackType(format);
        String strJoinWithSeparator = iInferPrimaryTrackType == 2 ? joinWithSeparator(buildResolutionString(format), buildBitrateString(format)) : iInferPrimaryTrackType == 1 ? joinWithSeparator(buildLanguageString(format), buildAudioChannelString(format), buildBitrateString(format)) : buildLanguageString(format);
        return strJoinWithSeparator.length() == 0 ? this.resources.getString(R.string.exo_track_unknown) : strJoinWithSeparator;
    }

    private String buildLanguageString(String str) {
        return (Util.SDK_INT >= 21 ? Locale.forLanguageTag(str) : new Locale(str)).getDisplayLanguage();
    }
}
