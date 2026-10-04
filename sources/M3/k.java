package m3;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.s;
import g3.InterfaceC4450h;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class k<T> implements InterfaceC4450h<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC4450h<?> f221099c = new k();

    @NonNull
    public static <T> k<T> c() {
        return (k) f221099c;
    }

    @Override // g3.InterfaceC4444b
    public void b(@NonNull MessageDigest messageDigest) {
    }

    @Override // g3.InterfaceC4450h
    @NonNull
    public s<T> a(@NonNull Context context, @NonNull s<T> sVar, int i10, int i11) {
        return sVar;
    }
}
