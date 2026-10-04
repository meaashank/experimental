package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.v;
import g3.C4447e;
import g3.InterfaceC4448f;
import java.io.IOException;
import java.io.InputStream;
import y3.C5816e;

/* JADX INFO: loaded from: classes2.dex */
public class J implements InterfaceC4448f<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f139894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.b f139895b;

    public static class a implements v.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecyclableBufferedInputStream f139896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C5816e f139897b;

        public a(RecyclableBufferedInputStream recyclableBufferedInputStream, C5816e c5816e) {
            this.f139896a = recyclableBufferedInputStream;
            this.f139897b = c5816e;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v.b
        public void a() {
            this.f139896a.d();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v.b
        public void b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) throws IOException {
            IOException iOException = this.f139897b.f241063b;
            if (iOException != null) {
                if (bitmap == null) {
                    throw iOException;
                }
                eVar.d(bitmap);
                throw iOException;
            }
        }
    }

    public J(v vVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f139894a = vVar;
        this.f139895b = bVar;
    }

    @Override // g3.InterfaceC4448f
    public /* bridge */ /* synthetic */ boolean b(@NonNull InputStream inputStream, @NonNull C4447e c4447e) throws IOException {
        d(inputStream, c4447e);
        return true;
    }

    @Override // g3.InterfaceC4448f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.s<Bitmap> a(@NonNull InputStream inputStream, int i10, int i11, @NonNull C4447e c4447e) throws IOException {
        boolean z10;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z10 = false;
        } else {
            z10 = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.f139895b);
        }
        C5816e c5816eL = C5816e.l(recyclableBufferedInputStream);
        try {
            com.bumptech.glide.load.engine.s<Bitmap> sVarG = this.f139894a.g(new y3.k(c5816eL), i10, i11, c4447e, new a(recyclableBufferedInputStream, c5816eL));
            c5816eL.release();
            if (z10) {
                recyclableBufferedInputStream.release();
            }
            return sVarG;
        } finally {
        }
    }

    public boolean d(@NonNull InputStream inputStream, @NonNull C4447e c4447e) {
        this.f139894a.getClass();
        return true;
    }
}
