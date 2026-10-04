package r3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.resource.bitmap.C3096h;
import g3.C4447e;
import q3.C5424c;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements e<Drawable, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.e f227162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e<Bitmap, byte[]> f227163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e<C5424c, byte[]> f227164c;

    public c(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull e<Bitmap, byte[]> eVar2, @NonNull e<C5424c, byte[]> eVar3) {
        this.f227162a = eVar;
        this.f227163b = eVar2;
        this.f227164c = eVar3;
    }

    @Override // r3.e
    @Nullable
    public s<byte[]> a(@NonNull s<Drawable> sVar, @NonNull C4447e c4447e) {
        Drawable drawable = sVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f227163b.a(C3096h.d(((BitmapDrawable) drawable).getBitmap(), this.f227162a), c4447e);
        }
        if (drawable instanceof C5424c) {
            return this.f227164c.a(sVar, c4447e);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static s<C5424c> b(@NonNull s<Drawable> sVar) {
        return sVar;
    }
}
