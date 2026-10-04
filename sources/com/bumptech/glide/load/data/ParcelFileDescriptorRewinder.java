package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.e;
import e.T;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ParcelFileDescriptorRewinder implements e<ParcelFileDescriptor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InternalRewinder f139393a;

    @T(21)
    public static final class InternalRewinder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParcelFileDescriptor f139394a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f139394a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f139394a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f139394a;
            } catch (ErrnoException e10) {
                throw new IOException(e10);
            }
        }
    }

    @T(21)
    public static final class a implements e.a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public e<ParcelFileDescriptor> b(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @NonNull
        public e<ParcelFileDescriptor> c(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    @T(21)
    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f139393a = new InternalRewinder(parcelFileDescriptor);
    }

    public static boolean c() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.data.e
    @NonNull
    @T(21)
    public ParcelFileDescriptor a() throws IOException {
        return this.f139393a.rewind();
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }

    @NonNull
    @T(21)
    public ParcelFileDescriptor d() throws IOException {
        return this.f139393a.rewind();
    }
}
