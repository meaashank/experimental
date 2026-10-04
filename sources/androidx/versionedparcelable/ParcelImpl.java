package androidx.versionedparcelable;

import C2.e;
import C2.f;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();
    private final f mParcel;

    public static class a implements Parcelable.Creator<ParcelImpl> {
        public ParcelImpl c(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public ParcelImpl[] d(int i10) {
            return new ParcelImpl[i10];
        }

        @Override // android.os.Parcelable.Creator
        public ParcelImpl[] newArray(int i10) {
            return new ParcelImpl[i10];
        }
    }

    public ParcelImpl(f fVar) {
        this.mParcel = fVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public <T extends f> T getVersionedParcel() {
        return (T) this.mParcel;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        new e(parcel).l1(this.mParcel);
    }

    public ParcelImpl(Parcel parcel) {
        this.mParcel = new e(parcel).g0();
    }
}
