package com.bytedance.adsdk.ugeno.FA;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZRu implements Parcelable {
    private final Parcelable NOt;
    public static final ZRu ZRu = new ZRu() { // from class: com.bytedance.adsdk.ugeno.FA.ZRu.1
    };
    public static final Parcelable.Creator<ZRu> CREATOR = new Parcelable.ClassLoaderCreator<ZRu>() { // from class: com.bytedance.adsdk.ugeno.FA.ZRu.2
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public ZRu createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public ZRu createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return ZRu.ZRu;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public ZRu[] newArray(int i10) {
            return new ZRu[i10];
        }
    };

    public final Parcelable ZRu() {
        return this.NOt;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.NOt, i10);
    }

    private ZRu() {
        this.NOt = null;
    }

    public ZRu(Parcelable parcelable) {
        if (parcelable != null) {
            this.NOt = parcelable == ZRu ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public ZRu(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.NOt = parcelable == null ? ZRu : parcelable;
    }
}
