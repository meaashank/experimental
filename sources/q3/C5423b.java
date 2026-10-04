package q3;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import f3.InterfaceC4386a;

/* JADX INFO: renamed from: q3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5423b implements InterfaceC4386a.InterfaceC0731a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.e f226751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final com.bumptech.glide.load.engine.bitmap_recycle.b f226752b;

    public C5423b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this(eVar, null);
    }

    @Override // f3.InterfaceC4386a.InterfaceC0731a
    @NonNull
    public byte[] a(int i10) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f226752b;
        return bVar == null ? new byte[i10] : (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // f3.InterfaceC4386a.InterfaceC0731a
    @NonNull
    public Bitmap b(int i10, int i11, @NonNull Bitmap.Config config) {
        return this.f226751a.g(i10, i11, config);
    }

    @Override // f3.InterfaceC4386a.InterfaceC0731a
    public void c(@NonNull Bitmap bitmap) {
        this.f226751a.d(bitmap);
    }

    @Override // f3.InterfaceC4386a.InterfaceC0731a
    @NonNull
    public int[] d(int i10) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f226752b;
        return bVar == null ? new int[i10] : (int[]) bVar.c(i10, int[].class);
    }

    @Override // f3.InterfaceC4386a.InterfaceC0731a
    public void e(@NonNull byte[] bArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f226752b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // f3.InterfaceC4386a.InterfaceC0731a
    public void f(@NonNull int[] iArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f226752b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }

    public C5423b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @Nullable com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f226751a = eVar;
        this.f226752b = bVar;
    }
}
