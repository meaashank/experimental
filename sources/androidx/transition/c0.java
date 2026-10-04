package androidx.transition;

import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
public class c0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f117835a;

    public c0(IBinder iBinder) {
        this.f117835a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c0) && ((c0) obj).f117835a.equals(this.f117835a);
    }

    public int hashCode() {
        return this.f117835a.hashCode();
    }
}
