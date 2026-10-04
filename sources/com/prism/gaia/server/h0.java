package com.prism.gaia.server;

import android.os.Parcel;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class h0 extends com.prism.gaia.helper.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f167380d = {'g', androidx.compose.ui.graphics.vector.f.f101681m, 'e', androidx.compose.ui.graphics.vector.f.f101685q};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f167381e = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f167382c;

    public h0() {
        super(D9.d.Y());
        this.f167382c = 2;
    }

    @Override // com.prism.gaia.helper.f
    public int b() {
        return 2;
    }

    @Override // com.prism.gaia.helper.f
    public void d() {
        this.f165042a.delete();
    }

    @Override // com.prism.gaia.helper.f
    public boolean e(int i10, int i11) {
        this.f167382c = i10;
        return true;
    }

    @Override // com.prism.gaia.helper.f
    public void g(Parcel parcel) {
        J j10 = L.f166117h;
        synchronized (j10) {
            j10.c(parcel, this.f167382c);
        }
    }

    @Override // com.prism.gaia.helper.f
    public boolean i(Parcel parcel) {
        return Arrays.equals(parcel.createCharArray(), f167380d);
    }

    @Override // com.prism.gaia.helper.f
    public void j(Parcel parcel) {
        J j10 = L.f166117h;
        synchronized (j10) {
            j10.d(parcel);
        }
    }

    @Override // com.prism.gaia.helper.f
    public void k(Parcel parcel) {
        parcel.writeCharArray(f167380d);
    }
}
