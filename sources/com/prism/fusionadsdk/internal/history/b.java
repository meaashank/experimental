package com.prism.fusionadsdk.internal.history;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.prism.fusionadsdk.internal.history.a;

/* JADX INFO: loaded from: classes6.dex */
public class b extends CursorWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f162326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f162327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f162328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f162329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f162330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f162331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f162332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f162333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f162334i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f162335j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f162336k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f162337l;

    public b(Cursor cursor) {
        super(cursor);
        this.f162332g = getColumnIndexOrThrow("_id");
        this.f162333h = getColumnIndexOrThrow(a.C0665a.f162321b);
        this.f162334i = getColumnIndexOrThrow(a.C0665a.f162324e);
        this.f162335j = getColumnIndexOrThrow(a.C0665a.f162322c);
        this.f162336k = getColumnIndexOrThrow(a.C0665a.f162323d);
        this.f162337l = getColumnIndexOrThrow(a.C0665a.f162325f);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public boolean moveToNext() {
        boolean zMoveToNext = super.moveToNext();
        if (zMoveToNext) {
            this.f162326a = getInt(this.f162332g);
            this.f162327b = getString(this.f162333h);
            this.f162331f = getLong(this.f162337l);
            this.f162328c = getLong(this.f162334i);
            this.f162329d = getLong(this.f162335j);
            this.f162330e = getLong(this.f162336k);
        }
        return zMoveToNext;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("id:");
        sb2.append(this.f162326a);
        sb2.append("; adid:");
        String str = this.f162327b;
        if (str == null) {
            str = "null";
        }
        sb2.append(str);
        sb2.append("lastReqTime:");
        sb2.append(this.f162331f);
        sb2.append(";lastShowTime:");
        sb2.append(this.f162328c);
        sb2.append(";requestCount:");
        sb2.append(this.f162329d);
        sb2.append(";showCount:");
        sb2.append(this.f162330e);
        return sb2.toString();
    }
}
