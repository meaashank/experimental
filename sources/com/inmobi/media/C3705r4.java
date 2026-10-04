package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: com.inmobi.media.r4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3705r4 implements Zc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3761v4 f153309a;

    public C3705r4(C3761v4 c3761v4) {
        this.f153309a = c3761v4;
    }

    @Override // com.inmobi.media.Zc
    public final void a(ArrayList visibleViews, ArrayList invisibleViews) {
        kotlin.jvm.internal.G.p(visibleViews, "visibleViews");
        kotlin.jvm.internal.G.p(invisibleViews, "invisibleViews");
        kotlin.jvm.internal.G.o(this.f153309a.f153445d, "access$getTAG$p(...)");
        Objects.toString(visibleViews);
        Objects.toString(invisibleViews);
        int size = visibleViews.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = visibleViews.get(i10);
            i10++;
            View view = (View) obj;
            C3733t4 c3733t4 = (C3733t4) this.f153309a.f153442a.get(view);
            if (c3733t4 == null) {
                this.f153309a.a(view);
            } else {
                C3733t4 c3733t42 = (C3733t4) this.f153309a.f153443b.get(view);
                if (!kotlin.jvm.internal.G.g(c3733t4.f153396a, c3733t42 != null ? c3733t42.f153396a : null)) {
                    c3733t4.f153399d = SystemClock.uptimeMillis();
                    this.f153309a.f153443b.put(view, c3733t4);
                }
            }
        }
        int size2 = invisibleViews.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = invisibleViews.get(i11);
            i11++;
            this.f153309a.f153443b.remove((View) obj2);
        }
        C3761v4 c3761v4 = this.f153309a;
        if (c3761v4.f153446e.hasMessages(0)) {
            return;
        }
        c3761v4.f153446e.postDelayed(c3761v4.f153447f, c3761v4.f153448g);
    }
}
