package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.prism.gaia.helper.utils.l;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class GaplessInfoHolder {
    private static final String GAPLESS_COMMENT_ID = "iTunSMPB";
    public int encoderDelay = -1;
    public int encoderPadding = -1;
    public static final Id3Decoder.FramePredicate GAPLESS_INFO_ID3_FRAME_PREDICATE = new Id3Decoder.FramePredicate() { // from class: com.google.android.exoplayer2.extractor.GaplessInfoHolder.1
        @Override // com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate
        public boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
            if (i11 == 67 && i12 == 79 && i13 == 77) {
                return i14 == 77 || i10 == 2;
            }
            return false;
        }
    };
    private static final Pattern GAPLESS_COMMENT_PATTERN = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    private boolean setFromComment(String str, String str2) {
        if (!GAPLESS_COMMENT_ID.equals(str)) {
            return false;
        }
        Matcher matcher = GAPLESS_COMMENT_PATTERN.matcher(str2);
        if (matcher.find()) {
            try {
                int i10 = Integer.parseInt(matcher.group(1), 16);
                int i11 = Integer.parseInt(matcher.group(2), 16);
                if (i10 > 0 || i11 > 0) {
                    this.encoderDelay = i10;
                    this.encoderPadding = i11;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public boolean hasGaplessInfo() {
        return (this.encoderDelay == -1 || this.encoderPadding == -1) ? false : true;
    }

    public boolean setFromMetadata(Metadata metadata) {
        for (int i10 = 0; i10 < metadata.length(); i10++) {
            Metadata.Entry entry = metadata.get(i10);
            if (entry instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entry;
                if (setFromComment(commentFrame.description, commentFrame.text)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean setFromXingHeaderValue(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & l.b.f165167a;
        if (i11 <= 0 && i12 <= 0) {
            return false;
        }
        this.encoderDelay = i11;
        this.encoderPadding = i12;
        return true;
    }
}
