package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.EncodeStrategy;
import g3.C4446d;
import g3.C4447e;
import g3.InterfaceC4449g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C3093e implements InterfaceC4449g<Bitmap> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C4446d<Integer> f139939b = C4446d.g("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C4446d<Bitmap.CompressFormat> f139940c = C4446d.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f139941d = "BitmapEncoder";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final com.bumptech.glide.load.engine.bitmap_recycle.b f139942a;

    public C3093e(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f139942a = bVar;
    }

    @Override // g3.InterfaceC4449g
    @NonNull
    public EncodeStrategy a(@NonNull C4447e c4447e) {
        return EncodeStrategy.TRANSFORMED;
    }

    @Override // g3.InterfaceC4443a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull com.bumptech.glide.load.engine.s<Bitmap> sVar, @NonNull File file, @NonNull C4447e c4447e) throws Throwable {
        boolean z10;
        FileOutputStream fileOutputStream;
        Bitmap bitmap = sVar.get();
        Bitmap.CompressFormat compressFormatD = d(bitmap, c4447e);
        bitmap.getWidth();
        bitmap.getHeight();
        long jB = y3.i.b();
        int iIntValue = ((Integer) c4447e.c(f139939b)).intValue();
        OutputStream cVar = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            cVar = this.f139942a != null ? new com.bumptech.glide.load.data.c(fileOutputStream, this.f139942a) : fileOutputStream;
            bitmap.compress(compressFormatD, iIntValue, cVar);
            cVar.close();
            try {
                cVar.close();
            } catch (IOException unused) {
            }
            z10 = true;
        } catch (IOException e11) {
            e = e11;
            cVar = fileOutputStream;
            if (Log.isLoggable(f139941d, 3)) {
                Log.d(f139941d, "Failed to encode Bitmap", e);
            }
            if (cVar != null) {
                try {
                    cVar.close();
                } catch (IOException unused2) {
                }
            }
            z10 = false;
        } catch (Throwable th2) {
            th = th2;
            cVar = fileOutputStream;
            if (cVar != null) {
                try {
                    cVar.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
        if (Log.isLoggable(f139941d, 2)) {
            Log.v(f139941d, "Compressed with type: " + compressFormatD + " of size " + y3.o.i(bitmap) + " in " + y3.i.a(jB) + ", options format: " + c4447e.c(f139940c) + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return z10;
    }

    public final Bitmap.CompressFormat d(Bitmap bitmap, C4447e c4447e) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c4447e.c(f139940c);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Deprecated
    public C3093e() {
        this.f139942a = null;
    }
}
