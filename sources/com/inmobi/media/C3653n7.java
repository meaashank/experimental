package com.inmobi.media;

import android.graphics.Point;
import androidx.room.C2650a;
import java.util.Locale;

/* JADX INFO: renamed from: com.inmobi.media.n7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3653n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Point f153190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Point f153191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Point f153192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Point f153193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f153194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f153195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f153196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f153197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f153198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f153199j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3472a8 f153200k;

    public C3653n7() {
        this.f153190a = new Point(0, 0);
        this.f153192c = new Point(0, 0);
        this.f153191b = new Point(0, 0);
        this.f153193d = new Point(0, 0);
        this.f153194e = "none";
        this.f153195f = "straight";
        this.f153197h = 10.0f;
        this.f153198i = "#ff000000";
        this.f153199j = "#00000000";
        this.f153196g = "fill";
        this.f153200k = null;
    }

    public String a() {
        String str = this.f153199j;
        Locale locale = Locale.US;
        return C2650a.a(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
    }

    public C3653n7(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String contentMode, String borderStrokeStyle, String borderCornerStyle, String borderColor, String backgroundColor, C3472a8 c3472a8) {
        kotlin.jvm.internal.G.p(contentMode, "contentMode");
        kotlin.jvm.internal.G.p(borderStrokeStyle, "borderStrokeStyle");
        kotlin.jvm.internal.G.p(borderCornerStyle, "borderCornerStyle");
        kotlin.jvm.internal.G.p(borderColor, "borderColor");
        kotlin.jvm.internal.G.p(backgroundColor, "backgroundColor");
        this.f153190a = new Point(i12, i13);
        this.f153191b = new Point(i16, i17);
        this.f153192c = new Point(i10, i11);
        this.f153193d = new Point(i14, i15);
        this.f153194e = borderStrokeStyle;
        this.f153195f = borderCornerStyle;
        this.f153197h = 10.0f;
        this.f153196g = contentMode;
        this.f153198i = borderColor.length() == 0 ? "#ff000000" : borderColor;
        this.f153199j = backgroundColor.length() == 0 ? "#00000000" : backgroundColor;
        this.f153200k = c3472a8;
    }
}
