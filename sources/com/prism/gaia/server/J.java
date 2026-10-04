package com.prism.gaia.server;

import android.os.Parcel;

/* JADX INFO: loaded from: classes6.dex */
public class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f166111a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f166112b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f166113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f166114d;

    public J() {
        U6.c.c0();
        this.f166113c = 1;
        this.f166114d = false;
    }

    public void a() {
        this.f166111a.f();
    }

    public void b() {
        this.f166111a.h();
    }

    public void c(Parcel parcel, int i10) {
        this.f166112b = parcel.readInt();
        this.f166113c = parcel.readInt();
        if (i10 >= 2) {
            this.f166114d = parcel.readByte() != 0;
        }
    }

    public void d(Parcel parcel) {
        parcel.writeInt(this.f166112b);
        parcel.writeInt(this.f166113c);
        parcel.writeByte(this.f166114d ? (byte) 1 : (byte) 0);
    }
}
