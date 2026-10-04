package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import e.T;
import g3.C4447e;
import g3.InterfaceC4448f;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@T(21)
public final class F implements InterfaceC4448f<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f139884b = 536870912;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f139885a;

    public F(v vVar) {
        this.f139885a = vVar;
    }

    @Override // g3.InterfaceC4448f
    @Nullable
    public com.bumptech.glide.load.engine.s<Bitmap> a(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, @NonNull C4447e c4447e) throws IOException {
        return this.f139885a.d(parcelFileDescriptor, i10, i11, c4447e);
    }

    @Nullable
    public com.bumptech.glide.load.engine.s<Bitmap> c(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, @NonNull C4447e c4447e) throws IOException {
        return this.f139885a.d(parcelFileDescriptor, i10, i11, c4447e);
    }

    @Override // g3.InterfaceC4448f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull C4447e c4447e) {
        if (!e(parcelFileDescriptor)) {
            return false;
        }
        this.f139885a.getClass();
        return ParcelFileDescriptorRewinder.c();
    }

    public final boolean e(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }
}
