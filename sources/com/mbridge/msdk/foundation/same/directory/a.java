package com.mbridge.msdk.foundation.same.directory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<a> f156363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f156364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f156365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f156366d;

    public void a(c cVar, String str) {
        a aVar = new a();
        aVar.a(cVar);
        aVar.a(str);
        a(aVar);
    }

    public String b() {
        return this.f156364b;
    }

    public a c() {
        return this.f156365c;
    }

    public c d() {
        return this.f156366d;
    }

    public void b(a aVar) {
        this.f156365c = aVar;
    }

    public void a(a aVar) {
        if (this.f156363a == null) {
            this.f156363a = new ArrayList();
        }
        aVar.b(this);
        this.f156363a.add(aVar);
    }

    public void a(List<a> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<a> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public List<a> a() {
        return this.f156363a;
    }

    public void a(String str) {
        this.f156364b = str;
    }

    public void a(c cVar) {
        this.f156366d = cVar;
    }
}
