package com.mbridge.msdk.config.dynamic;

import Y6.d;
import android.content.Context;
import android.graphics.Color;
import android.support.v4.media.f;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.dycreator.utils.e;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.q0;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import u4.g;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile c f155125d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SoftReference<HashMap<String, com.mbridge.msdk.config.dynamic.utils.c>> f155126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f155127b = com.mbridge.msdk.foundation.controller.c.n().d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, com.mbridge.msdk.config.dynamic.utils.c> f155128c;

    private c() {
        d();
    }

    public static c a() {
        if (f155125d == null) {
            synchronized (c.class) {
                try {
                    if (f155125d == null) {
                        f155125d = new c();
                    }
                } finally {
                }
            }
        }
        return f155125d;
    }

    public HashMap b() {
        SoftReference<HashMap<String, com.mbridge.msdk.config.dynamic.utils.c>> softReference = this.f155126a;
        if (softReference == null || softReference.get() == null) {
            HashMap map = new HashMap(45);
            map.put("layout_width", com.mbridge.msdk.config.dynamic.utils.c.layout_width);
            map.put("layout_height", com.mbridge.msdk.config.dynamic.utils.c.layout_height);
            map.put("orientation", com.mbridge.msdk.config.dynamic.utils.c.orientation);
            map.put("layout_centerHorizontal", com.mbridge.msdk.config.dynamic.utils.c.layout_centerHorizontal);
            map.put("layout_centerVertical", com.mbridge.msdk.config.dynamic.utils.c.layout_centerVertical);
            map.put("layout_marginLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_marginLeft);
            map.put("layout_marginRight", com.mbridge.msdk.config.dynamic.utils.c.layout_marginRight);
            map.put("layout_margin", com.mbridge.msdk.config.dynamic.utils.c.layout_margin);
            map.put("layout_gravity", com.mbridge.msdk.config.dynamic.utils.c.layout_gravity);
            map.put("layout_alignParentRight", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentRight);
            map.put("layout_weight", com.mbridge.msdk.config.dynamic.utils.c.layout_weight);
            map.put("contentDescription", com.mbridge.msdk.config.dynamic.utils.c.contentDescription);
            map.put(NotificationCompat.w.f110901I, com.mbridge.msdk.config.dynamic.utils.c.gravity);
            map.put("id", com.mbridge.msdk.config.dynamic.utils.c.id);
            map.put("layout_below", com.mbridge.msdk.config.dynamic.utils.c.layout_below);
            map.put("layout_above", com.mbridge.msdk.config.dynamic.utils.c.layout_above);
            map.put("layout_toLeftOf", com.mbridge.msdk.config.dynamic.utils.c.layout_toLeftOf);
            map.put("layout_toRightOf", com.mbridge.msdk.config.dynamic.utils.c.layout_toRightOf);
            map.put("layout_toEndOf", com.mbridge.msdk.config.dynamic.utils.c.layout_toEndOf);
            map.put(NotificationCompat.w.f110895C, com.mbridge.msdk.config.dynamic.utils.c.background);
            map.put("layout_marginTop", com.mbridge.msdk.config.dynamic.utils.c.layout_marginTop);
            map.put("layout_marginBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_marginBottom);
            map.put("layout_marginStart", com.mbridge.msdk.config.dynamic.utils.c.layout_marginStart);
            map.put("layout_marginEnd", com.mbridge.msdk.config.dynamic.utils.c.layout_marginEnd);
            map.put("layout_alignParentBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentBottom);
            map.put("layout_alignParentTop", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentTop);
            map.put("layout_alignParentLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentLeft);
            map.put("layout_alignWithParentIfMissing", com.mbridge.msdk.config.dynamic.utils.c.layout_alignWithParentIfMissing);
            map.put("layout_alignTop", com.mbridge.msdk.config.dynamic.utils.c.layout_alignTop);
            map.put("layout_alignBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_alignBottom);
            map.put("layout_alignLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_alignLeft);
            map.put("layout_alignRight", com.mbridge.msdk.config.dynamic.utils.c.layout_alignRight);
            map.put("layout_centerInParent", com.mbridge.msdk.config.dynamic.utils.c.layout_centerInParent);
            map.put("layout_alignParentEnd", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentEnd);
            this.f155126a = new SoftReference<>(map);
        }
        return this.f155126a.get();
    }

    public HashMap<String, com.mbridge.msdk.config.dynamic.utils.c> c() {
        return this.f155128c;
    }

    public int d(String str) {
        if (this.f155127b == null) {
            return 0;
        }
        String strI = com.mbridge.msdk.foundation.controller.c.n().i();
        if (TextUtils.isEmpty(strI)) {
            strI = this.f155127b.getPackageName();
        }
        StringBuilder sbA = f.a(strI, ".R$");
        String[] strArrSplit = str.split("\\.");
        sbA.append(strArrSplit[1]);
        try {
            Class<?> cls = Class.forName(sbA.toString());
            Object objNewInstance = cls.newInstance();
            Field declaredField = cls.getDeclaredField(strArrSplit[2]);
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(objNewInstance)).intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public int e(String str) {
        try {
            if (!TextUtils.isEmpty(str) && str.startsWith("#")) {
                return Color.parseColor(str);
            }
            return 0;
        } catch (Exception e10) {
            q0.b("ComponentResource", e10.getMessage());
            return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cc A[PHI: r6
      0x00cc: PHI (r6v1 int) = 
      (r6v0 int)
      (r6v2 int)
      (r6v3 int)
      (r6v4 int)
      (r6v5 int)
      (r6v6 int)
      (r6v7 int)
      (r6v8 int)
      (r6v9 int)
      (r6v10 int)
      (r6v11 int)
      (r6v12 int)
     binds: [B:50:0x00a9, B:62:0x00ca, B:61:0x00c7, B:60:0x00c5, B:59:0x00c2, B:58:0x00c0, B:57:0x00bd, B:56:0x00b9, B:55:0x00b5, B:54:0x00b2, B:53:0x00b0, B:52:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1091)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int c(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.dynamic.c.c(java.lang.String):int");
    }

    public int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            int iIndexOf = str.indexOf(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D);
            int iIndexOf2 = str.indexOf("s");
            if (iIndexOf == -1) {
                iIndexOf = iIndexOf2;
            }
            int i10 = Integer.parseInt(str.substring(0, iIndexOf));
            if (str.contains(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D)) {
                return e.a(this.f155127b, i10);
            }
            str.contains("s");
            return i10;
        }
    }

    public int a(String str, String str2) {
        if (this.f155127b == null) {
            return 0;
        }
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            String strI = com.mbridge.msdk.foundation.controller.c.n().i();
            if (TextUtils.isEmpty(strI)) {
                strI = this.f155127b.getPackageName();
            }
            return contextD.getResources().getIdentifier(str2, str, strI);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private void d() {
        HashMap<String, com.mbridge.msdk.config.dynamic.utils.c> map = new HashMap<>();
        this.f155128c = map;
        map.put("id", com.mbridge.msdk.config.dynamic.utils.c.id);
        this.f155128c.put(NotificationCompat.w.f110895C, com.mbridge.msdk.config.dynamic.utils.c.background);
        this.f155128c.put("visibility", com.mbridge.msdk.config.dynamic.utils.c.visibility);
        this.f155128c.put("contentDescription", com.mbridge.msdk.config.dynamic.utils.c.contentDescription);
        this.f155128c.put("padding", com.mbridge.msdk.config.dynamic.utils.c.padding);
        this.f155128c.put("paddingTop", com.mbridge.msdk.config.dynamic.utils.c.paddingTop);
        this.f155128c.put("paddingBottom", com.mbridge.msdk.config.dynamic.utils.c.paddingBottom);
        this.f155128c.put("paddingLeft", com.mbridge.msdk.config.dynamic.utils.c.paddingLeft);
        this.f155128c.put("paddingRight", com.mbridge.msdk.config.dynamic.utils.c.paddingRight);
        this.f155128c.put("paddingStart", com.mbridge.msdk.config.dynamic.utils.c.paddingStart);
        this.f155128c.put("paddingEnd", com.mbridge.msdk.config.dynamic.utils.c.paddingEnd);
        this.f155128c.put("layout_margin", com.mbridge.msdk.config.dynamic.utils.c.layout_margin);
        this.f155128c.put("layout_marginTop", com.mbridge.msdk.config.dynamic.utils.c.layout_marginTop);
        this.f155128c.put("layout_marginBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_marginBottom);
        this.f155128c.put("layout_marginLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_marginLeft);
        this.f155128c.put("layout_marginRight", com.mbridge.msdk.config.dynamic.utils.c.layout_marginRight);
        this.f155128c.put("layout_marginStart", com.mbridge.msdk.config.dynamic.utils.c.layout_marginStart);
        this.f155128c.put("layout_marginEnd", com.mbridge.msdk.config.dynamic.utils.c.layout_marginEnd);
        this.f155128c.put("alpha", com.mbridge.msdk.config.dynamic.utils.c.alpha);
        this.f155128c.put(androidx.constraintlayout.motion.widget.f.f106849i, com.mbridge.msdk.config.dynamic.utils.c.rotation);
        this.f155128c.put("scaleX", com.mbridge.msdk.config.dynamic.utils.c.scaleX);
        this.f155128c.put("scaleY", com.mbridge.msdk.config.dynamic.utils.c.scaleY);
        this.f155128c.put("translationX", com.mbridge.msdk.config.dynamic.utils.c.translationX);
        this.f155128c.put("translationY", com.mbridge.msdk.config.dynamic.utils.c.translationY);
        this.f155128c.put(d.C0152d.f79310d, com.mbridge.msdk.config.dynamic.utils.c.tag);
        this.f155128c.put("text", com.mbridge.msdk.config.dynamic.utils.c.text);
        this.f155128c.put("textColor", com.mbridge.msdk.config.dynamic.utils.c.textColor);
        this.f155128c.put("textSize", com.mbridge.msdk.config.dynamic.utils.c.textSize);
        this.f155128c.put("textStyle", com.mbridge.msdk.config.dynamic.utils.c.textStyle);
        this.f155128c.put("maxLines", com.mbridge.msdk.config.dynamic.utils.c.maxLines);
        this.f155128c.put("minLines", com.mbridge.msdk.config.dynamic.utils.c.minLines);
        this.f155128c.put(g.f239602z0, com.mbridge.msdk.config.dynamic.utils.c.lines);
        this.f155128c.put("ellipsize", com.mbridge.msdk.config.dynamic.utils.c.ellipsize);
        this.f155128c.put(NotificationCompat.w.f110901I, com.mbridge.msdk.config.dynamic.utils.c.gravity);
        this.f155128c.put("drawablePadding", com.mbridge.msdk.config.dynamic.utils.c.drawablePadding);
        this.f155128c.put("drawableStart", com.mbridge.msdk.config.dynamic.utils.c.drawableStart);
        this.f155128c.put("drawableEnd", com.mbridge.msdk.config.dynamic.utils.c.drawableEnd);
        this.f155128c.put("drawableTop", com.mbridge.msdk.config.dynamic.utils.c.drawableTop);
        this.f155128c.put("drawableBottom", com.mbridge.msdk.config.dynamic.utils.c.drawableBottom);
        this.f155128c.put("singleLine", com.mbridge.msdk.config.dynamic.utils.c.singleLine);
        this.f155128c.put("marqueeRepeatLimit", com.mbridge.msdk.config.dynamic.utils.c.marqueeRepeatLimit);
        this.f155128c.put("includeFontPadding", com.mbridge.msdk.config.dynamic.utils.c.includeFontPadding);
        this.f155128c.put("lineSpacingExtra", com.mbridge.msdk.config.dynamic.utils.c.lineSpacingExtra);
        this.f155128c.put("lineSpacingMultiplier", com.mbridge.msdk.config.dynamic.utils.c.lineSpacingMultiplier);
        this.f155128c.put("hint", com.mbridge.msdk.config.dynamic.utils.c.hint);
        this.f155128c.put("inputType", com.mbridge.msdk.config.dynamic.utils.c.inputType);
        this.f155128c.put("maxLength", com.mbridge.msdk.config.dynamic.utils.c.maxLength);
        this.f155128c.put("textIsSelectable", com.mbridge.msdk.config.dynamic.utils.c.textIsSelectable);
        this.f155128c.put("cursorVisible", com.mbridge.msdk.config.dynamic.utils.c.cursorVisible);
        this.f155128c.put("backgroundTint", com.mbridge.msdk.config.dynamic.utils.c.backgroundTint);
        this.f155128c.put("allCaps", com.mbridge.msdk.config.dynamic.utils.c.allCaps);
        this.f155128c.put("src", com.mbridge.msdk.config.dynamic.utils.c.src);
        this.f155128c.put("scaleType", com.mbridge.msdk.config.dynamic.utils.c.scaleType);
        this.f155128c.put("adjustViewBounds", com.mbridge.msdk.config.dynamic.utils.c.adjustViewBounds);
        this.f155128c.put("maxWidth", com.mbridge.msdk.config.dynamic.utils.c.maxWidth);
        this.f155128c.put("maxHeight", com.mbridge.msdk.config.dynamic.utils.c.maxHeight);
        this.f155128c.put("tint", com.mbridge.msdk.config.dynamic.utils.c.tint);
        this.f155128c.put("divider", com.mbridge.msdk.config.dynamic.utils.c.divider);
        this.f155128c.put("dividerHeight", com.mbridge.msdk.config.dynamic.utils.c.dividerHeight);
        this.f155128c.put("scrollbars", com.mbridge.msdk.config.dynamic.utils.c.scrollbars);
        this.f155128c.put("listSelector", com.mbridge.msdk.config.dynamic.utils.c.listSelector);
        this.f155128c.put(g.f239557d1, com.mbridge.msdk.config.dynamic.utils.c.stackFromBottom);
        this.f155128c.put("transcriptMode", com.mbridge.msdk.config.dynamic.utils.c.transcriptMode);
        this.f155128c.put("numColumns", com.mbridge.msdk.config.dynamic.utils.c.numColumns);
        this.f155128c.put("verticalSpacing", com.mbridge.msdk.config.dynamic.utils.c.verticalSpacing);
        this.f155128c.put("horizontalSpacing", com.mbridge.msdk.config.dynamic.utils.c.horizontalSpacing);
        this.f155128c.put("stretchMode", com.mbridge.msdk.config.dynamic.utils.c.stretchMode);
        this.f155128c.put("columnWidth", com.mbridge.msdk.config.dynamic.utils.c.columnWidth);
        this.f155128c.put("fillViewport", com.mbridge.msdk.config.dynamic.utils.c.fillViewport);
        this.f155128c.put("scrollbarStyle", com.mbridge.msdk.config.dynamic.utils.c.scrollbarStyle);
        this.f155128c.put("orientation", com.mbridge.msdk.config.dynamic.utils.c.orientation);
        this.f155128c.put("weightSum", com.mbridge.msdk.config.dynamic.utils.c.weightSum);
        this.f155128c.put("baselineAligned", com.mbridge.msdk.config.dynamic.utils.c.baselineAligned);
        this.f155128c.put("measureWithLargestChild", com.mbridge.msdk.config.dynamic.utils.c.measureWithLargestChild);
        this.f155128c.put("ignoreGravity", com.mbridge.msdk.config.dynamic.utils.c.ignoreGravity);
        this.f155128c.put("foreground", com.mbridge.msdk.config.dynamic.utils.c.foreground);
        this.f155128c.put("foregroundGravity", com.mbridge.msdk.config.dynamic.utils.c.foregroundGravity);
        this.f155128c.put("measureAllChildren", com.mbridge.msdk.config.dynamic.utils.c.measureAllChildren);
        this.f155128c.put("style", com.mbridge.msdk.config.dynamic.utils.c.style);
        this.f155128c.put("progress", com.mbridge.msdk.config.dynamic.utils.c.progress);
        this.f155128c.put("max", com.mbridge.msdk.config.dynamic.utils.c.max);
        this.f155128c.put("progressDrawable", com.mbridge.msdk.config.dynamic.utils.c.progressDrawable);
    }

    public View a(String str, ViewGroup viewGroup, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (this.f155127b != null) {
            try {
                return new b(this.f155127b, aVar).a(str, viewGroup);
            } catch (Exception e10) {
                q0.b("ComponentResource", e10.getMessage());
            }
        }
        return null;
    }

    public int b(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("@color/")) {
            return 0;
        }
        return this.f155127b.getResources().getColor(a("color", str.substring(7)));
    }
}
