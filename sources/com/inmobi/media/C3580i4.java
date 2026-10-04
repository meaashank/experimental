package com.inmobi.media;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3580i4 implements Zc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3594j4 f153000a;

    public C3580i4(C3594j4 c3594j4) {
        this.f153000a = c3594j4;
    }

    @Override // com.inmobi.media.Zc
    public final void a(ArrayList visibleViews, ArrayList invisibleViews) {
        kotlin.jvm.internal.G.p(visibleViews, "visibleViews");
        kotlin.jvm.internal.G.p(invisibleViews, "invisibleViews");
        int size = visibleViews.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = visibleViews.get(i10);
            i10++;
            View view = (View) obj;
            Wc wc2 = (Wc) this.f153000a.f153045i.get(view);
            if (wc2 != null) {
                wc2.a(view, true);
            }
        }
        int size2 = invisibleViews.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = invisibleViews.get(i11);
            i11++;
            View view2 = (View) obj2;
            Wc wc3 = (Wc) this.f153000a.f153045i.get(view2);
            if (wc3 != null) {
                wc3.a(view2, false);
            }
        }
    }
}
