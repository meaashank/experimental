package androidx.media;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.media.k;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
@T(21)
public class l extends t {
    public l(Context context) {
        super(context);
        this.f114664a = context;
    }

    @Override // androidx.media.t, androidx.media.k.a
    public boolean a(@NonNull k.c cVar) {
        return d(cVar) || super.a(cVar);
    }

    public final boolean d(@NonNull k.c cVar) {
        return getContext().checkPermission(t.f114662f, cVar.c(), cVar.d()) == 0;
    }
}
