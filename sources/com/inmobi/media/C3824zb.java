package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

/* JADX INFO: renamed from: com.inmobi.media.zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3824zb implements InterfaceC3478b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f153696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153697b;

    public C3824zb(String location, byte[] imageBytes) {
        kotlin.jvm.internal.G.p(imageBytes, "imageBytes");
        kotlin.jvm.internal.G.p(location, "location");
        this.f153696a = imageBytes;
        this.f153697b = location;
    }

    @Override // com.inmobi.media.InterfaceC3478b0
    public final Object a() {
        byte[] bArr = this.f153696a;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        kotlin.jvm.internal.G.m(bitmapDecodeByteArray);
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.G.o(string, "toString(...)");
        String strConcat = string.concat(".jpg");
        File file = new File(this.f153697b);
        if (!file.exists()) {
            file.mkdirs();
        }
        bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(new File(this.f153697b + '/' + strConcat)));
        Log.i("StoreProcess", "screenshot file saved");
        return this.f153697b + '/' + strConcat;
    }
}
