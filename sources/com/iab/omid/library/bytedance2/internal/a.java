package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.internal.d;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f151297f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.bytedance2.utils.f f151298a = new com.iab.omid.library.bytedance2.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f151299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f151300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f151301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f151302e;

    private a(d dVar) {
        this.f151301d = dVar;
    }

    public static a a() {
        return f151297f;
    }

    private void c() {
        if (!this.f151300c || this.f151299b == null) {
            return;
        }
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f151299b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f151298a.a();
        Date date = this.f151299b;
        if (date == null || dateA.after(date)) {
            this.f151299b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f151300c) {
            return;
        }
        this.f151301d.a(context);
        this.f151301d.a(this);
        this.f151301d.e();
        this.f151302e = this.f151301d.c();
        this.f151300c = true;
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z10) {
        if (!this.f151302e && z10) {
            d();
        }
        this.f151302e = z10;
    }
}
