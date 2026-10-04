package r3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.resource.bitmap.E;
import g3.C4447e;
import y3.m;

/* JADX INFO: loaded from: classes2.dex */
public class b implements e<Bitmap, BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f227161a;

    public b(@NonNull Context context) {
        this(context.getResources());
    }

    @Override // r3.e
    @Nullable
    public s<BitmapDrawable> a(@NonNull s<Bitmap> sVar, @NonNull C4447e c4447e) {
        return E.d(this.f227161a, sVar);
    }

    @Deprecated
    public b(@NonNull Resources resources, com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this(resources);
    }

    public b(@NonNull Resources resources) {
        m.f(resources, "Argument must not be null");
        this.f227161a = resources;
    }
}
