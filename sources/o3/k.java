package o3;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory;
import w3.InterfaceC5745f;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends com.bumptech.glide.l<k, Drawable> {
    @NonNull
    public static k m(@NonNull InterfaceC5745f<Drawable> interfaceC5745f) {
        k kVar = new k();
        kVar.g(interfaceC5745f);
        return kVar;
    }

    @NonNull
    public static k n() {
        k kVar = new k();
        kVar.i();
        return kVar;
    }

    @NonNull
    public static k p(int i10) {
        k kVar = new k();
        kVar.j(i10);
        return kVar;
    }

    @NonNull
    public static k q(@NonNull DrawableCrossFadeFactory.Builder builder) {
        k kVar = new k();
        kVar.k(builder);
        return kVar;
    }

    @NonNull
    public static k r(@NonNull DrawableCrossFadeFactory drawableCrossFadeFactory) {
        k kVar = new k();
        kVar.g(drawableCrossFadeFactory);
        return kVar;
    }

    @Override // com.bumptech.glide.l
    public boolean equals(Object obj) {
        return (obj instanceof k) && super.equals(obj);
    }

    @Override // com.bumptech.glide.l
    public int hashCode() {
        return super.hashCode();
    }

    @NonNull
    public k i() {
        g(new DrawableCrossFadeFactory.Builder().build());
        return this;
    }

    @NonNull
    public k j(int i10) {
        g(new DrawableCrossFadeFactory.Builder(i10).build());
        return this;
    }

    @NonNull
    public k k(@NonNull DrawableCrossFadeFactory.Builder builder) {
        g(builder.build());
        return this;
    }

    @NonNull
    public k l(@NonNull DrawableCrossFadeFactory drawableCrossFadeFactory) {
        g(drawableCrossFadeFactory);
        return this;
    }
}
