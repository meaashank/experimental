package com.prism.gaia.helper;

import android.os.Parcel;
import com.prism.gaia.helper.utils.l;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f165041b = "asdf-".concat(f.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f165042a;

    public f(File file) {
        this.f165042a = file;
    }

    public boolean a() {
        File file = this.f165042a;
        if (!file.exists()) {
            return true;
        }
        try {
            return file.delete();
        } catch (Throwable unused) {
            return false;
        }
    }

    public abstract int b();

    public final File c() {
        return this.f165042a;
    }

    public void d() {
    }

    public boolean e(int i10, int i11) {
        return false;
    }

    public void f() {
        File file = this.f165042a;
        if (file.exists()) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                l.P(parcelObtain, file);
                if (!i(parcelObtain)) {
                    d();
                    throw new IOException("invalid persistence file.");
                }
                int i10 = parcelObtain.readInt();
                if (i10 != 2 && !e(i10, 2)) {
                    throw new IOException("unable to process the bad version persistence file.");
                }
                g(parcelObtain);
                parcelObtain.recycle();
            } catch (Exception unused) {
                parcelObtain.recycle();
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
    }

    public abstract void g(Parcel parcel);

    public void h() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            k(parcelObtain);
            parcelObtain.writeInt(2);
            j(parcelObtain);
            l.Q(parcelObtain, this.f165042a);
        } catch (Exception unused) {
        } finally {
            parcelObtain.recycle();
        }
    }

    public boolean i(Parcel parcel) {
        return true;
    }

    public abstract void j(Parcel parcel);

    public void k(Parcel parcel) {
    }
}
