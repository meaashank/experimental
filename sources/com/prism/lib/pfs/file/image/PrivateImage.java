package com.prism.lib.pfs.file.image;

import android.os.Parcel;
import android.os.Parcelable;
import com.prism.lib.pfs.file.PrivateFile;
import com.prism.lib.pfs.file.PrivatePath;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class PrivateImage extends PrivateFile {
    public static final Parcelable.Creator<PrivateImage> CREATOR = new a();

    public class a implements Parcelable.Creator<PrivateImage> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public PrivateImage createFromParcel(Parcel parcel) {
            return PrivateImage.readFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public PrivateImage[] newArray(int i10) {
            return new PrivateImage[i10];
        }
    }

    public PrivateImage(PrivatePath privatePath) {
        super(privatePath);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PrivateImage readFromParcel(Parcel parcel) {
        return new PrivateImage((PrivatePath) parcel.readParcelable(PrivatePath.class.getClassLoader()));
    }

    @Override // com.prism.lib.pfs.file.PrivateFile, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.prism.lib.pfs.file.PrivateFile, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.privatePath, i10);
    }
}
