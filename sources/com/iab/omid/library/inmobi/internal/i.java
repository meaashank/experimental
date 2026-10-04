package com.iab.omid.library.inmobi.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.inmobi.internal.d;
import com.iab.omid.library.inmobi.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class i implements d.a, com.iab.omid.library.inmobi.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f151451f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f151452a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.devicevolume.e f151453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.devicevolume.b f151454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.inmobi.devicevolume.d f151455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f151456e;

    public i(com.iab.omid.library.inmobi.devicevolume.e eVar, com.iab.omid.library.inmobi.devicevolume.b bVar) {
        this.f151453b = eVar;
        this.f151454c = bVar;
    }

    private c a() {
        if (this.f151456e == null) {
            this.f151456e = c.c();
        }
        return this.f151456e;
    }

    public static i c() {
        if (f151451f == null) {
            f151451f = new i(new com.iab.omid.library.inmobi.devicevolume.e(), new com.iab.omid.library.inmobi.devicevolume.b());
        }
        return f151451f;
    }

    public float b() {
        return this.f151452a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f151455d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f151455d.d();
    }

    @Override // com.iab.omid.library.inmobi.devicevolume.c
    public void a(float f10) {
        this.f151452a = f10;
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f151455d = this.f151453b.a(new Handler(), context, this.f151454c.a(), this);
    }

    @Override // com.iab.omid.library.inmobi.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
