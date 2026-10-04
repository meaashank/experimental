package q3;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.resource.bitmap.C3096h;
import g3.InterfaceC4450h;
import java.security.MessageDigest;
import y3.m;

/* JADX INFO: renamed from: q3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5427f implements InterfaceC4450h<C5424c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4450h<Bitmap> f226769c;

    public C5427f(InterfaceC4450h<Bitmap> interfaceC4450h) {
        m.f(interfaceC4450h, "Argument must not be null");
        this.f226769c = interfaceC4450h;
    }

    @Override // g3.InterfaceC4450h
    @NonNull
    public s<C5424c> a(@NonNull Context context, @NonNull s<C5424c> sVar, int i10, int i11) {
        C5424c c5424c = sVar.get();
        s<Bitmap> c3096h = new C3096h(c5424c.e(), com.bumptech.glide.c.e(context).h());
        s<Bitmap> sVarA = this.f226769c.a(context, c3096h, i10, i11);
        if (!c3096h.equals(sVarA)) {
            c3096h.a();
        }
        c5424c.o(this.f226769c, sVarA.get());
        return sVar;
    }

    @Override // g3.InterfaceC4444b
    public void b(@NonNull MessageDigest messageDigest) {
        this.f226769c.b(messageDigest);
    }

    @Override // g3.InterfaceC4444b
    public boolean equals(Object obj) {
        if (obj instanceof C5427f) {
            return this.f226769c.equals(((C5427f) obj).f226769c);
        }
        return false;
    }

    @Override // g3.InterfaceC4444b
    public int hashCode() {
        return this.f226769c.hashCode();
    }
}
