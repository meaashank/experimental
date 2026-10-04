package com.iab.omid.library.mmadbridge.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.mmadbridge.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f151555f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.mmadbridge.utils.f f151556a = new com.iab.omid.library.mmadbridge.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f151557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f151558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f151559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f151560e;

    private a(d dVar) {
        this.f151559d = dVar;
    }

    public static a a() {
        return f151555f;
    }

    private void c() {
        if (!this.f151558c || this.f151557b == null) {
            return;
        }
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f151557b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f151556a.a();
        Date date = this.f151557b;
        if (date == null || dateA.after(date)) {
            this.f151557b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f151558c) {
            return;
        }
        this.f151559d.a(context);
        this.f151559d.a(this);
        this.f151559d.e();
        this.f151560e = this.f151559d.c();
        this.f151558c = true;
    }

    @Override // com.iab.omid.library.mmadbridge.internal.d.a
    public void a(boolean z10) {
        if (!this.f151560e && z10) {
            d();
        }
        this.f151560e = z10;
    }
}
