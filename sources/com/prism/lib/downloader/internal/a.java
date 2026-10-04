package com.prism.lib.downloader.internal;

import androidx.annotation.NonNull;
import com.prism.commons.async.Priority;
import g6.q;
import xa.C5800b;

/* JADX INFO: loaded from: classes6.dex */
public class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Priority f178681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f178682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5800b f178683c;

    public a(C5800b c5800b) {
        this.f178683c = c5800b;
        this.f178681a = c5800b.y();
        this.f178682b = c5800b.D();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull q qVar) {
        if (!(qVar instanceof a)) {
            return -1;
        }
        a aVar = (a) qVar;
        Priority priority = this.f178681a;
        Priority priority2 = aVar.f178681a;
        return priority == priority2 ? this.f178682b - aVar.f178682b : priority2.ordinal() - this.f178681a.ordinal();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f178683c.W();
        d dVarE = d.e(this.f178683c);
        dVarE.o();
        DownloadResponse downloadResponse = dVarE.f178691b;
        if (downloadResponse.e()) {
            this.f178683c.O();
            return;
        }
        if (downloadResponse.a() != null) {
            this.f178683c.V(downloadResponse.a());
        } else if (downloadResponse.d()) {
            this.f178683c.L();
        } else {
            downloadResponse.c();
        }
    }
}
