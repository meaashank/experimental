package com.prism.gaia.server.am;

import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes6.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f166655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent.FilterComparison f166656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B8.a<ProcessRecordG, C4146e> f166657c = new B8.a<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IBinder f166658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f166659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f166660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f166661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f166662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f166663i;

    public B(G g10, Intent.FilterComparison filterComparison) {
        this.f166655a = g10;
        this.f166656b = filterComparison;
    }

    public int a() {
        int i10 = 0;
        for (int size = this.f166657c.size() - 1; size >= 0; size--) {
            B8.b<C4150i> bVar = this.f166657c.p(size).f166830d;
            for (int i11 = bVar.f17404c - 1; i11 >= 0; i11--) {
                i10 |= ((C4150i) bVar.f17403b[i11]).f166909d;
            }
        }
        return i10;
    }
}
