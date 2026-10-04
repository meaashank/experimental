package com.inmobi.media;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes5.dex */
public final class Q7 extends MediaPlayer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f152390d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Q7 f152391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f152392f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f152394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Q7 f152395c;

    public final void a() {
        if (3 == this.f152393a) {
            return;
        }
        synchronized (f152390d) {
            int i10 = f152392f;
            if (i10 < 5) {
                this.f152395c = f152391e;
                f152391e = this;
                f152392f = i10 + 1;
            }
        }
    }
}
