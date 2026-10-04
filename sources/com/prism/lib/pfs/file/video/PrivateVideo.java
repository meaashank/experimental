package com.prism.lib.pfs.file.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.prism.commons.utils.l0;
import com.prism.lib.pfs.file.PrivateFile;
import com.prism.lib.pfs.file.PrivatePath;

/* JADX INFO: loaded from: classes7.dex */
public class PrivateVideo extends PrivateFile {
    private static final String TAG = l0.b("PrivateVideo");
    public static final Parcelable.Creator<PrivateVideo> CREATOR = new a();

    public class a implements Parcelable.Creator<PrivateVideo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public PrivateVideo createFromParcel(Parcel parcel) {
            return PrivateVideo.readFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public PrivateVideo[] newArray(int i10) {
            return new PrivateVideo[i10];
        }
    }

    public PrivateVideo(PrivatePath privatePath) {
        super(privatePath);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PrivateVideo readFromParcel(Parcel parcel) {
        return new PrivateVideo((PrivatePath) parcel.readParcelable(PrivatePath.class.getClassLoader()));
    }

    @Override // com.prism.lib.pfs.file.PrivateFile, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap getThumbnail() throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r1 = "getThumbnail error: "
            r2 = 0
            com.prism.lib.pfs.file.a r3 = r10.getFileDescriptorProxy()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            java.io.FileDescriptor r5 = r3.a()     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
            long r6 = r3.getOffset()     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
            long r8 = r10.length()     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
            long r8 = r8 - r6
            android.media.MediaMetadataRetriever r4 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
            r4.<init>()     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
            r4.setDataSource(r5, r6, r8)     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
            android.graphics.Bitmap r0 = r4.getFrameAtTime()     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L27
            r3.close()
            return r0
        L24:
            r0 = move-exception
            r2 = r3
            goto L48
        L27:
            r0 = move-exception
            goto L2d
        L29:
            r0 = move-exception
            goto L48
        L2b:
            r0 = move-exception
            r3 = r2
        L2d:
            java.lang.String r4 = com.prism.lib.pfs.file.video.PrivateVideo.TAG     // Catch: java.lang.Throwable -> L24
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = r0.getMessage()     // Catch: java.lang.Throwable -> L24
            r5.append(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L24
            android.util.Log.e(r4, r1, r0)     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L47
            r3.close()
        L47:
            return r2
        L48:
            if (r2 == 0) goto L4d
            r2.close()
        L4d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.lib.pfs.file.video.PrivateVideo.getThumbnail():android.graphics.Bitmap");
    }

    @Override // com.prism.lib.pfs.file.PrivateFile, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.privatePath, i10);
    }
}
