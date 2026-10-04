package com.iab.omid.library.inmobi.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.inmobi.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f151426f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.inmobi.utils.f f151427a = new com.iab.omid.library.inmobi.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f151428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f151429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f151430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f151431e;

    private a(d dVar) {
        this.f151430d = dVar;
    }

    public static a a() {
        return f151426f;
    }

    private void c() {
        if (!this.f151429c || this.f151428b == null) {
            return;
        }
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f151428b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f151427a.a();
        Date date = this.f151428b;
        if (date == null || dateA.after(date)) {
            this.f151428b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f151429c) {
            return;
        }
        this.f151430d.a(context);
        this.f151430d.a(this);
        this.f151430d.e();
        this.f151431e = this.f151430d.c();
        this.f151429c = true;
    }

    @Override // com.iab.omid.library.inmobi.internal.d.a
    public void a(boolean z10) {
        if (!this.f151431e && z10) {
            d();
        }
        this.f151431e = z10;
    }
}
