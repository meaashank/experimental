package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.inmobi.media.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC3747u4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f153416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f153417c;

    public RunnableC3747u4(C3761v4 impressionTracker) {
        kotlin.jvm.internal.G.p(impressionTracker, "impressionTracker");
        this.f153415a = "u4";
        this.f153416b = new ArrayList();
        this.f153417c = new WeakReference(impressionTracker);
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.jvm.internal.G.m(this.f153415a);
        C3761v4 c3761v4 = (C3761v4) this.f153417c.get();
        if (c3761v4 != null) {
            for (Map.Entry entry : c3761v4.f153443b.entrySet()) {
                View view = (View) entry.getKey();
                C3733t4 c3733t4 = (C3733t4) entry.getValue();
                kotlin.jvm.internal.G.m(this.f153415a);
                Objects.toString(c3733t4);
                if (SystemClock.uptimeMillis() - c3733t4.f153399d >= c3733t4.f153398c) {
                    kotlin.jvm.internal.G.m(this.f153415a);
                    c3761v4.f153449h.a(view, c3733t4.f153396a);
                    this.f153416b.add(view);
                }
            }
            ArrayList arrayList = this.f153416b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                c3761v4.a((View) obj);
            }
            this.f153416b.clear();
            if (c3761v4.f153443b.isEmpty() || c3761v4.f153446e.hasMessages(0)) {
                return;
            }
            c3761v4.f153446e.postDelayed(c3761v4.f153447f, c3761v4.f153448g);
        }
    }
}
