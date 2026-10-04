package g3;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.s;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: g3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C4445c<T> implements InterfaceC4450h<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection<? extends InterfaceC4450h<T>> f202233c;

    @SafeVarargs
    public C4445c(@NonNull InterfaceC4450h<T>... interfaceC4450hArr) {
        if (interfaceC4450hArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f202233c = Arrays.asList(interfaceC4450hArr);
    }

    @Override // g3.InterfaceC4450h
    @NonNull
    public s<T> a(@NonNull Context context, @NonNull s<T> sVar, int i10, int i11) {
        Iterator<? extends InterfaceC4450h<T>> it = this.f202233c.iterator();
        s<T> sVar2 = sVar;
        while (it.hasNext()) {
            s<T> sVarA = it.next().a(context, sVar2, i10, i11);
            if (sVar2 != null && !sVar2.equals(sVar) && !sVar2.equals(sVarA)) {
                sVar2.a();
            }
            sVar2 = sVarA;
        }
        return sVar2;
    }

    @Override // g3.InterfaceC4444b
    public void b(@NonNull MessageDigest messageDigest) {
        Iterator<? extends InterfaceC4450h<T>> it = this.f202233c.iterator();
        while (it.hasNext()) {
            it.next().b(messageDigest);
        }
    }

    @Override // g3.InterfaceC4444b
    public boolean equals(Object obj) {
        if (obj instanceof C4445c) {
            return this.f202233c.equals(((C4445c) obj).f202233c);
        }
        return false;
    }

    @Override // g3.InterfaceC4444b
    public int hashCode() {
        return this.f202233c.hashCode();
    }

    public C4445c(@NonNull Collection<? extends InterfaceC4450h<T>> collection) {
        if (!collection.isEmpty()) {
            this.f202233c = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }
}
