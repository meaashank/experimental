package com.prism.gaia.server.pm;

import android.os.Parcel;
import android.util.SparseArray;
import com.prism.gaia.helper.PersistenceHelper;

/* JADX INFO: loaded from: classes6.dex */
public class B extends PersistenceHelper<SparseArray<PackageUserStateG>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f167420e = "asdf-".concat(B.class.getSimpleName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f167421f = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f167422d;

    public B(String str) {
        super(D9.d.W(str));
        this.f167422d = 4;
    }

    @Override // com.prism.gaia.helper.PersistenceHelper
    public int b() {
        return 4;
    }

    @Override // com.prism.gaia.helper.PersistenceHelper
    public void e() {
        this.f164941a.deleteOnExit();
    }

    @Override // com.prism.gaia.helper.PersistenceHelper
    public boolean f(int i10, int i11) {
        if (i10 > i11) {
            return false;
        }
        this.f167422d = i10;
        return true;
    }

    public int m() {
        return this.f167422d;
    }

    @Override // com.prism.gaia.helper.PersistenceHelper
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public SparseArray<PackageUserStateG> h(Parcel parcel) {
        return C.g(parcel, PackageUserStateG.CREATOR, this.f167422d);
    }

    @Override // com.prism.gaia.helper.PersistenceHelper
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void k(SparseArray<PackageUserStateG> sparseArray, Parcel parcel) {
        C.m(parcel, sparseArray);
    }
}
