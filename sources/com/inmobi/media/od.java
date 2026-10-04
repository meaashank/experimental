package com.inmobi.media;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public abstract class od {
    public static boolean a(WebView view, RenderProcessGoneDetail renderProcessGoneDetail, String source) {
        kotlin.jvm.internal.G.p(view, "view");
        kotlin.jvm.internal.G.p(source, "source");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Map mapJ0 = kotlin.collections.n0.j0(new Pair("source", source), new Pair("isCrashed", Boolean.valueOf(renderProcessGoneDetail != null ? renderProcessGoneDetail.didCrash() : false)));
        Lb lb2 = Lb.f152196a;
        Lb.b("WebViewRenderProcessGoneEvent", mapJ0, Qb.f152402a);
        view.destroy();
        return true;
    }
}
