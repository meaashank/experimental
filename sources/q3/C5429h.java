package q3;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.resource.bitmap.C3096h;
import f3.InterfaceC4386a;
import g3.C4447e;
import g3.InterfaceC4448f;
import java.io.IOException;

/* JADX INFO: renamed from: q3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5429h implements InterfaceC4448f<InterfaceC4386a, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.e f226796a;

    public C5429h(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this.f226796a = eVar;
    }

    @Override // g3.InterfaceC4448f
    public /* bridge */ /* synthetic */ boolean b(@NonNull InterfaceC4386a interfaceC4386a, @NonNull C4447e c4447e) throws IOException {
        return true;
    }

    @Override // g3.InterfaceC4448f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public s<Bitmap> a(@NonNull InterfaceC4386a interfaceC4386a, int i10, int i11, @NonNull C4447e c4447e) {
        return C3096h.d(interfaceC4386a.h(), this.f226796a);
    }

    public boolean d(@NonNull InterfaceC4386a interfaceC4386a, @NonNull C4447e c4447e) {
        return true;
    }
}
