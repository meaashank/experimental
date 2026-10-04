package com.iab.omid.library.bytedance2.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f151292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f151293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f151294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f151295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f151296e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f151292a = context;
        this.f151293b = (AudioManager) context.getSystemService("audio");
        this.f151294c = aVar;
        this.f151295d = cVar;
    }

    private float a() {
        return this.f151294c.a(this.f151293b.getStreamVolume(3), this.f151293b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f151295d.a(this.f151296e);
    }

    public void c() {
        this.f151296e = a();
        b();
        this.f151292a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f151292a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f151296e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f151296e;
    }
}
