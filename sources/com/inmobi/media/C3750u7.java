package com.inmobi.media;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.u7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3750u7 extends X7 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3750u7(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String borderStrokeStyle, String borderCornerStyle, String borderColor, String backgroundColor, int i18, String textColor, ArrayList textStyles, C3472a8 nativeAnimationTimer) {
        super(i10, i11, i12, i13, i14, i15, i16, i17, borderStrokeStyle, borderCornerStyle, borderColor, backgroundColor, 12, (byte) 0, "#ff000000", kotlin.collections.I.U("none"), nativeAnimationTimer);
        kotlin.jvm.internal.G.p(borderStrokeStyle, "borderStrokeStyle");
        kotlin.jvm.internal.G.p(borderCornerStyle, "borderCornerStyle");
        kotlin.jvm.internal.G.p(borderColor, "borderColor");
        kotlin.jvm.internal.G.p(backgroundColor, "backgroundColor");
        kotlin.jvm.internal.G.p(textColor, "textColor");
        kotlin.jvm.internal.G.p(textStyles, "textStyles");
        kotlin.jvm.internal.G.p(nativeAnimationTimer, "nativeAnimationTimer");
        this.f152592l = i18;
        this.f152594n = textColor.length() == 0 ? "#ff000000" : textColor;
        int iMin = Math.min(textStyles.size(), 1);
        this.f152595o = new ArrayList();
        if (iMin < 0) {
            return;
        }
        int i19 = 0;
        while (true) {
            this.f152595o.add(textStyles.get(i19));
            if (i19 == iMin) {
                return;
            } else {
                i19++;
            }
        }
    }
}
