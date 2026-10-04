package com.inmobi.media;

import androidx.room.C2650a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class X7 extends C3653n7 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f152592l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte f152593m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f152594n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f152595o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X7(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String borderStrokeStyle, String borderCornerStyle, String borderColor, String backgroundColor, int i18, byte b10, String textColor, List textStyles, C3472a8 c3472a8) {
        super(i10, i11, i12, i13, i14, i15, i16, i17, "fill", borderStrokeStyle, borderCornerStyle, borderColor, backgroundColor, c3472a8);
        kotlin.jvm.internal.G.p(borderStrokeStyle, "borderStrokeStyle");
        kotlin.jvm.internal.G.p(borderCornerStyle, "borderCornerStyle");
        kotlin.jvm.internal.G.p(borderColor, "borderColor");
        kotlin.jvm.internal.G.p(backgroundColor, "backgroundColor");
        kotlin.jvm.internal.G.p(textColor, "textColor");
        kotlin.jvm.internal.G.p(textStyles, "textStyles");
        this.f152592l = i18;
        this.f152593m = b10;
        this.f152594n = textColor.length() == 0 ? "#ff000000" : textColor;
        int iMin = Math.min(textStyles.size(), 4);
        this.f152595o = new ArrayList();
        for (int i19 = 0; i19 < iMin; i19++) {
            this.f152595o.add(textStyles.get(i19));
        }
    }

    @Override // com.inmobi.media.C3653n7
    public final String a() {
        String str = this.f153199j;
        Locale locale = Locale.US;
        return C2650a.a(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
    }
}
