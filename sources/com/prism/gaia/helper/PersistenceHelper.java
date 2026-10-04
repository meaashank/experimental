package com.prism.gaia.helper;

import android.os.Parcel;
import com.prism.gaia.helper.utils.l;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class PersistenceHelper<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f164940c = "asdf-".concat(PersistenceHelper.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f164941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile ReadStatus f164942b = ReadStatus.ABSENT;

    public enum ReadStatus {
        ABSENT,
        OK,
        DAMAGED
    }

    public PersistenceHelper(File file) {
        this.f164941a = file;
    }

    public boolean a() {
        File file = this.f164941a;
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

    public final ReadStatus c() {
        return this.f164942b;
    }

    public final File d() {
        return this.f164941a;
    }

    public void e() {
    }

    public boolean f(int i10, int i11) {
        return false;
    }

    public T g() {
        File file = this.f164941a;
        if (!file.exists()) {
            this.f164942b = ReadStatus.ABSENT;
            return null;
        }
        this.f164942b = ReadStatus.DAMAGED;
        Parcel parcelObtain = Parcel.obtain();
        try {
            l.P(parcelObtain, file);
            if (!j(parcelObtain)) {
                e();
                throw new IOException("invalid persistence file.");
            }
            int i10 = parcelObtain.readInt();
            int iB = b();
            if (i10 != b() && !f(i10, iB)) {
                throw new IOException("unable to process the bad version persistence file.");
            }
            T tH = h(parcelObtain);
            this.f164942b = ReadStatus.OK;
            parcelObtain.recycle();
            return tH;
        } catch (Exception unused) {
            parcelObtain.recycle();
            return null;
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    public abstract T h(Parcel parcel);

    public void i(T t10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            l(parcelObtain);
            parcelObtain.writeInt(b());
            k(t10, parcelObtain);
            l.Q(parcelObtain, this.f164941a);
        } catch (Exception unused) {
        } finally {
            parcelObtain.recycle();
        }
    }

    public boolean j(Parcel parcel) {
        return true;
    }

    public abstract void k(T t10, Parcel parcel);

    public void l(Parcel parcel) {
    }
}
