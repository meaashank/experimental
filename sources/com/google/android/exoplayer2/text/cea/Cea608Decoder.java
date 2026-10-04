package com.google.android.exoplayer2.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.base.Ascii;
import com.prism.gaia.download.j;
import f3.d;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpStatus;
import org.objectweb.asm.Opcodes;
import t1.b;

/* JADX INFO: loaded from: classes3.dex */
public final class Cea608Decoder extends CeaDecoder {
    private static final int CC_FIELD_FLAG = 1;
    private static final byte CC_IMPLICIT_DATA_HEADER = -4;
    private static final int CC_MODE_PAINT_ON = 3;
    private static final int CC_MODE_POP_ON = 2;
    private static final int CC_MODE_ROLL_UP = 1;
    private static final int CC_MODE_UNKNOWN = 0;
    private static final int CC_TYPE_FLAG = 2;
    private static final int CC_VALID_608_ID = 4;
    private static final int CC_VALID_FLAG = 4;
    private static final byte CTRL_BACKSPACE = 33;
    private static final byte CTRL_CARRIAGE_RETURN = 45;
    private static final byte CTRL_DELETE_TO_END_OF_ROW = 36;
    private static final byte CTRL_END_OF_CAPTION = 47;
    private static final byte CTRL_ERASE_DISPLAYED_MEMORY = 44;
    private static final byte CTRL_ERASE_NON_DISPLAYED_MEMORY = 46;
    private static final byte CTRL_RESUME_CAPTION_LOADING = 32;
    private static final byte CTRL_RESUME_DIRECT_CAPTIONING = 41;
    private static final byte CTRL_ROLL_UP_CAPTIONS_2_ROWS = 37;
    private static final byte CTRL_ROLL_UP_CAPTIONS_3_ROWS = 38;
    private static final byte CTRL_ROLL_UP_CAPTIONS_4_ROWS = 39;
    private static final int DEFAULT_CAPTIONS_ROW_COUNT = 4;
    private static final int NTSC_CC_FIELD_1 = 0;
    private static final int NTSC_CC_FIELD_2 = 1;
    private int captionMode;
    private int captionRowCount;
    private List<Cue> cues;
    private List<Cue> lastCues;
    private final int packetLength;
    private byte repeatableControlCc1;
    private byte repeatableControlCc2;
    private boolean repeatableControlSet;
    private final int selectedField;
    private static final int[] ROW_INDICES = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] COLUMN_INDICES = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] COLORS = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] BASIC_CHARACTER_SET = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] SPECIAL_CHARACTER_SET = {Opcodes.FRETURN, Opcodes.ARETURN, 189, Opcodes.ATHROW, 8482, Opcodes.IF_ICMPGE, Opcodes.IF_ICMPGT, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] SPECIAL_ES_FR_CHARACTER_SET = {193, 201, 211, DefaultImageHeaderParser.f139853j, 220, 252, 8216, Opcodes.IF_ICMPLT, 42, 39, 8212, Opcodes.RET, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, DefaultImageHeaderParser.f139854k, d.f200561j, 219, Opcodes.LOOKUPSWITCH, Opcodes.NEW};
    private static final int[] SPECIAL_PT_DE_CHARACTER_SET = {195, 227, HttpStatus.SC_RESET_CONTENT, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, j.b.f164765r0, 228, 214, 246, 223, 165, Opcodes.IF_ICMPLE, 9474, Opcodes.MULTIANEWARRAY, 229, 216, 248, 9484, 9488, 9492, 9496};
    private final ParsableByteArray ccData = new ParsableByteArray();
    private final ArrayList<CueBuilder> cueBuilders = new ArrayList<>();
    private CueBuilder currentCueBuilder = new CueBuilder(0, 4);

    public static class CueBuilder {
        private static final int BASE_ROW = 15;
        private static final int POSITION_UNSET = -1;
        private static final int SCREEN_CHARWIDTH = 32;
        private int captionMode;
        private int captionRowCount;
        private int indent;
        private int row;
        private int tabOffset;
        private int underlineStartPosition;
        private final List<CharacterStyle> preambleStyles = new ArrayList();
        private final List<CueStyle> midrowStyles = new ArrayList();
        private final List<SpannableString> rolledUpCaptions = new ArrayList();
        private final SpannableStringBuilder captionStringBuilder = new SpannableStringBuilder();

        public static class CueStyle {
            public final int nextStyleIncrement;
            public final int start;
            public final CharacterStyle style;

            public CueStyle(CharacterStyle characterStyle, int i10, int i11) {
                this.style = characterStyle;
                this.start = i10;
                this.nextStyleIncrement = i11;
            }
        }

        public CueBuilder(int i10, int i11) {
            reset(i10);
            setCaptionRowCount(i11);
        }

        public void append(char c10) {
            this.captionStringBuilder.append(c10);
        }

        public void backspace() {
            int length = this.captionStringBuilder.length();
            if (length > 0) {
                this.captionStringBuilder.delete(length - 1, length);
            }
        }

        public Cue build() {
            float f10;
            int i10;
            int i11;
            int i12;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.rolledUpCaptions.size(); i13++) {
                spannableStringBuilder.append((CharSequence) this.rolledUpCaptions.get(i13));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) buildSpannableString());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i14 = this.indent + this.tabOffset;
            int length = (32 - i14) - spannableStringBuilder.length();
            int i15 = i14 - length;
            int i16 = 2;
            if (this.captionMode == 2 && (Math.abs(i15) < 3 || length < 0)) {
                f10 = 0.5f;
                i10 = 2;
                i16 = 1;
            } else if (this.captionMode != 2 || i15 <= 0) {
                f10 = ((i14 / 32.0f) * 0.8f) + 0.1f;
                i10 = 2;
                i16 = 0;
            } else {
                f10 = (((32 - length) / 32.0f) * 0.8f) + 0.1f;
                i10 = 2;
            }
            if (this.captionMode == 1 || (i11 = this.row) > 7) {
                i11 = this.row - 17;
                i12 = i10;
            } else {
                i12 = 0;
            }
            return new Cue(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, i11, 1, i12, f10, i16, Float.MIN_VALUE);
        }

        public SpannableString buildSpannableString() {
            int length = this.captionStringBuilder.length();
            int i10 = 0;
            for (int i11 = 0; i11 < this.preambleStyles.size(); i11++) {
                this.captionStringBuilder.setSpan(this.preambleStyles.get(i11), 0, length, 33);
            }
            while (i10 < this.midrowStyles.size()) {
                CueStyle cueStyle = this.midrowStyles.get(i10);
                int size = this.midrowStyles.size();
                int i12 = cueStyle.nextStyleIncrement;
                this.captionStringBuilder.setSpan(cueStyle.style, cueStyle.start, i10 < size - i12 ? this.midrowStyles.get(i12 + i10).start : length, 33);
                i10++;
            }
            if (this.underlineStartPosition != -1) {
                this.captionStringBuilder.setSpan(new UnderlineSpan(), this.underlineStartPosition, length, 33);
            }
            return new SpannableString(this.captionStringBuilder);
        }

        public int getRow() {
            return this.row;
        }

        public boolean isEmpty() {
            return this.preambleStyles.isEmpty() && this.midrowStyles.isEmpty() && this.rolledUpCaptions.isEmpty() && this.captionStringBuilder.length() == 0;
        }

        public void reset(int i10) {
            this.captionMode = i10;
            this.preambleStyles.clear();
            this.midrowStyles.clear();
            this.rolledUpCaptions.clear();
            this.captionStringBuilder.clear();
            this.row = 15;
            this.indent = 0;
            this.tabOffset = 0;
            this.underlineStartPosition = -1;
        }

        public void rollUp() {
            this.rolledUpCaptions.add(buildSpannableString());
            this.captionStringBuilder.clear();
            this.preambleStyles.clear();
            this.midrowStyles.clear();
            this.underlineStartPosition = -1;
            int iMin = Math.min(this.captionRowCount, this.row);
            while (this.rolledUpCaptions.size() >= iMin) {
                this.rolledUpCaptions.remove(0);
            }
        }

        public void setCaptionRowCount(int i10) {
            this.captionRowCount = i10;
        }

        public void setIndent(int i10) {
            this.indent = i10;
        }

        public void setMidrowStyle(CharacterStyle characterStyle, int i10) {
            this.midrowStyles.add(new CueStyle(characterStyle, this.captionStringBuilder.length(), i10));
        }

        public void setPreambleStyle(CharacterStyle characterStyle) {
            this.preambleStyles.add(characterStyle);
        }

        public void setRow(int i10) {
            this.row = i10;
        }

        public void setTab(int i10) {
            this.tabOffset = i10;
        }

        public void setUnderline(boolean z10) {
            if (z10) {
                this.underlineStartPosition = this.captionStringBuilder.length();
            } else if (this.underlineStartPosition != -1) {
                this.captionStringBuilder.setSpan(new UnderlineSpan(), this.underlineStartPosition, this.captionStringBuilder.length(), 33);
                this.underlineStartPosition = -1;
            }
        }

        public String toString() {
            return this.captionStringBuilder.toString();
        }
    }

    public Cea608Decoder(String str, int i10) {
        this.packetLength = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 3 || i10 == 4) {
            this.selectedField = 2;
        } else {
            this.selectedField = 1;
        }
        setCaptionMode(0);
        resetCueBuilders();
    }

    private static char getChar(byte b10) {
        return (char) BASIC_CHARACTER_SET[(b10 & 127) - 32];
    }

    private List<Cue> getDisplayCues() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.cueBuilders.size(); i10++) {
            Cue cueBuild = this.cueBuilders.get(i10).build();
            if (cueBuild != null) {
                arrayList.add(cueBuild);
            }
        }
        return arrayList;
    }

    private static char getExtendedEsFrChar(byte b10) {
        return (char) SPECIAL_ES_FR_CHARACTER_SET[b10 & Ascii.US];
    }

    private static char getExtendedPtDeChar(byte b10) {
        return (char) SPECIAL_PT_DE_CHARACTER_SET[b10 & Ascii.US];
    }

    private static char getSpecialChar(byte b10) {
        return (char) SPECIAL_CHARACTER_SET[b10 & Ascii.SI];
    }

    private boolean handleCtrl(byte b10, byte b11) {
        boolean zIsRepeatable = isRepeatable(b10);
        if (zIsRepeatable) {
            if (this.repeatableControlSet && this.repeatableControlCc1 == b10 && this.repeatableControlCc2 == b11) {
                this.repeatableControlSet = false;
                return true;
            }
            this.repeatableControlSet = true;
            this.repeatableControlCc1 = b10;
            this.repeatableControlCc2 = b11;
        }
        if (isMidrowCtrlCode(b10, b11)) {
            handleMidrowCtrl(b11);
            return zIsRepeatable;
        }
        if (isPreambleAddressCode(b10, b11)) {
            handlePreambleAddressCode(b10, b11);
            return zIsRepeatable;
        }
        if (isTabCtrlCode(b10, b11)) {
            this.currentCueBuilder.setTab(b11 - 32);
            return zIsRepeatable;
        }
        if (isMiscCode(b10, b11)) {
            handleMiscCode(b11);
        }
        return zIsRepeatable;
    }

    private void handleMidrowCtrl(byte b10) {
        this.currentCueBuilder.setUnderline((b10 & 1) == 1);
        int i10 = (b10 >> 1) & 15;
        if (i10 != 7) {
            this.currentCueBuilder.setMidrowStyle(new ForegroundColorSpan(COLORS[i10]), 1);
        } else {
            this.currentCueBuilder.setMidrowStyle(new StyleSpan(2), 2);
            this.currentCueBuilder.setMidrowStyle(new ForegroundColorSpan(-1), 1);
        }
    }

    private void handleMiscCode(byte b10) {
        if (b10 == 32) {
            setCaptionMode(2);
            return;
        }
        if (b10 == 41) {
            setCaptionMode(3);
            return;
        }
        switch (b10) {
            case 37:
                setCaptionMode(1);
                setCaptionRowCount(2);
                break;
            case 38:
                setCaptionMode(1);
                setCaptionRowCount(3);
                break;
            case 39:
                setCaptionMode(1);
                setCaptionRowCount(4);
                break;
            default:
                int i10 = this.captionMode;
                if (i10 != 0) {
                    if (b10 != 33) {
                        switch (b10) {
                            case 44:
                                this.cues = null;
                                if (i10 == 1 || i10 == 3) {
                                    resetCueBuilders();
                                }
                                break;
                            case 45:
                                if (i10 == 1 && !this.currentCueBuilder.isEmpty()) {
                                    this.currentCueBuilder.rollUp();
                                    break;
                                }
                                break;
                            case 46:
                                resetCueBuilders();
                                break;
                            case 47:
                                this.cues = getDisplayCues();
                                resetCueBuilders();
                                break;
                        }
                    } else {
                        this.currentCueBuilder.backspace();
                        break;
                    }
                }
                break;
        }
    }

    private void handlePreambleAddressCode(byte b10, byte b11) {
        int i10 = ROW_INDICES[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.currentCueBuilder.getRow()) {
            if (this.captionMode != 1 && !this.currentCueBuilder.isEmpty()) {
                CueBuilder cueBuilder = new CueBuilder(this.captionMode, this.captionRowCount);
                this.currentCueBuilder = cueBuilder;
                this.cueBuilders.add(cueBuilder);
            }
            this.currentCueBuilder.setRow(i10);
        }
        if ((b11 & 1) == 1) {
            this.currentCueBuilder.setPreambleStyle(new UnderlineSpan());
        }
        int i11 = b11 >> 1;
        int i12 = i11 & 15;
        if (i12 > 7) {
            this.currentCueBuilder.setIndent(COLUMN_INDICES[i11 & 7]);
        } else if (i12 != 7) {
            this.currentCueBuilder.setPreambleStyle(new ForegroundColorSpan(COLORS[i12]));
        } else {
            this.currentCueBuilder.setPreambleStyle(new StyleSpan(2));
            this.currentCueBuilder.setPreambleStyle(new ForegroundColorSpan(-1));
        }
    }

    private static boolean isMidrowCtrlCode(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    private static boolean isMiscCode(byte b10, byte b11) {
        return (b10 & 247) == 20 && (b11 & 240) == 32;
    }

    private static boolean isPreambleAddressCode(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & b.f239010o7) == 64;
    }

    private static boolean isRepeatable(byte b10) {
        return (b10 & 240) == 16;
    }

    private static boolean isTabCtrlCode(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    private void resetCueBuilders() {
        this.currentCueBuilder.reset(this.captionMode);
        this.cueBuilders.clear();
        this.cueBuilders.add(this.currentCueBuilder);
    }

    private void setCaptionMode(int i10) {
        int i11 = this.captionMode;
        if (i11 == i10) {
            return;
        }
        this.captionMode = i10;
        resetCueBuilders();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.cues = null;
        }
    }

    private void setCaptionRowCount(int i10) {
        this.captionRowCount = i10;
        this.currentCueBuilder.setCaptionRowCount(i10);
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public Subtitle createSubtitle() {
        List<Cue> list = this.cues;
        this.lastCues = list;
        return new CeaSubtitle(list);
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public void decode(SubtitleInputBuffer subtitleInputBuffer) {
        int i10;
        this.ccData.reset(subtitleInputBuffer.data.array(), subtitleInputBuffer.data.limit());
        boolean z10 = false;
        boolean zHandleCtrl = false;
        while (true) {
            int iBytesLeft = this.ccData.bytesLeft();
            int i11 = this.packetLength;
            if (iBytesLeft < i11) {
                break;
            }
            byte unsignedByte = i11 == 2 ? CC_IMPLICIT_DATA_HEADER : (byte) this.ccData.readUnsignedByte();
            byte unsignedByte2 = (byte) (this.ccData.readUnsignedByte() & 127);
            byte unsignedByte3 = (byte) (this.ccData.readUnsignedByte() & 127);
            if ((unsignedByte & 6) == 4 && ((i10 = this.selectedField) != 1 || (unsignedByte & 1) == 0)) {
                if (i10 != 2 || (unsignedByte & 1) == 1) {
                    if (unsignedByte2 != 0 || unsignedByte3 != 0) {
                        if ((unsignedByte2 & 247) == 17 && (unsignedByte3 & 240) == 48) {
                            this.currentCueBuilder.append(getSpecialChar(unsignedByte3));
                        } else if ((unsignedByte2 & 246) == 18 && (unsignedByte3 & 224) == 32) {
                            this.currentCueBuilder.backspace();
                            if ((unsignedByte2 & 1) == 0) {
                                this.currentCueBuilder.append(getExtendedEsFrChar(unsignedByte3));
                            } else {
                                this.currentCueBuilder.append(getExtendedPtDeChar(unsignedByte3));
                            }
                        } else if ((unsignedByte2 & 224) == 0) {
                            zHandleCtrl = handleCtrl(unsignedByte2, unsignedByte3);
                        } else {
                            this.currentCueBuilder.append(getChar(unsignedByte2));
                            if ((unsignedByte3 & 224) != 0) {
                                this.currentCueBuilder.append(getChar(unsignedByte3));
                            }
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            if (!zHandleCtrl) {
                this.repeatableControlSet = false;
            }
            int i12 = this.captionMode;
            if (i12 == 1 || i12 == 3) {
                this.cues = getDisplayCues();
            }
        }
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
        return super.dequeueInputBuffer();
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
        return super.dequeueOutputBuffer();
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
        super.flush();
        this.cues = null;
        this.lastCues = null;
        setCaptionMode(0);
        setCaptionRowCount(4);
        resetCueBuilders();
        this.repeatableControlSet = false;
        this.repeatableControlCc1 = (byte) 0;
        this.repeatableControlCc2 = (byte) 0;
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public String getName() {
        return "Cea608Decoder";
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public boolean isNewSubtitleDataAvailable() {
        return this.cues != this.lastCues;
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public /* bridge */ /* synthetic */ void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) throws SubtitleDecoderException {
        super.queueInputBuffer(subtitleInputBuffer);
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public void release() {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.text.SubtitleDecoder
    public /* bridge */ /* synthetic */ void setPositionUs(long j10) {
        super.setPositionUs(j10);
    }
}
