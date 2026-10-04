package w3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import w3.InterfaceC5744e;

/* JADX INFO: renamed from: w3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5740a<R> implements InterfaceC5745f<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5745f<Drawable> f240077a;

    /* JADX INFO: renamed from: w3.a$a, reason: collision with other inner class name */
    public final class C0900a implements InterfaceC5744e<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5744e<Drawable> f240078a;

        public C0900a(InterfaceC5744e<Drawable> interfaceC5744e) {
            this.f240078a = interfaceC5744e;
        }

        @Override // w3.InterfaceC5744e
        public boolean a(R r10, InterfaceC5744e.a aVar) {
            return this.f240078a.a(new BitmapDrawable(aVar.getView().getResources(), AbstractC5740a.this.b(r10)), aVar);
        }
    }

    public AbstractC5740a(InterfaceC5745f<Drawable> interfaceC5745f) {
        this.f240077a = interfaceC5745f;
    }

    @Override // w3.InterfaceC5745f
    public InterfaceC5744e<R> a(DataSource dataSource, boolean z10) {
        return new C0900a(this.f240077a.a(dataSource, z10));
    }

    public abstract Bitmap b(R r10);
}
