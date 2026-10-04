package s3;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f238510d = "RequestTracker";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<com.bumptech.glide.request.e> f238511a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<com.bumptech.glide.request.e> f238512b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f238513c;

    @f0
    public void a(com.bumptech.glide.request.e eVar) {
        this.f238511a.add(eVar);
    }

    public boolean b(@Nullable com.bumptech.glide.request.e eVar) {
        boolean z10 = true;
        if (eVar == null) {
            return true;
        }
        boolean zRemove = this.f238511a.remove(eVar);
        if (!this.f238512b.remove(eVar) && !zRemove) {
            z10 = false;
        }
        if (z10) {
            eVar.clear();
        }
        return z10;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) y3.o.l(this.f238511a);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b((com.bumptech.glide.request.e) obj);
        }
        this.f238512b.clear();
    }

    public boolean d() {
        return this.f238513c;
    }

    public void e() {
        this.f238513c = true;
        ArrayList arrayList = (ArrayList) y3.o.l(this.f238511a);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            com.bumptech.glide.request.e eVar = (com.bumptech.glide.request.e) obj;
            if (eVar.isRunning() || eVar.f()) {
                eVar.clear();
                this.f238512b.add(eVar);
            }
        }
    }

    public void f() {
        this.f238513c = true;
        ArrayList arrayList = (ArrayList) y3.o.l(this.f238511a);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            com.bumptech.glide.request.e eVar = (com.bumptech.glide.request.e) obj;
            if (eVar.isRunning()) {
                eVar.pause();
                this.f238512b.add(eVar);
            }
        }
    }

    public void g() {
        ArrayList arrayList = (ArrayList) y3.o.l(this.f238511a);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            com.bumptech.glide.request.e eVar = (com.bumptech.glide.request.e) obj;
            if (!eVar.f() && !eVar.e()) {
                eVar.clear();
                if (this.f238513c) {
                    this.f238512b.add(eVar);
                } else {
                    eVar.i();
                }
            }
        }
    }

    public void h() {
        int i10 = 0;
        this.f238513c = false;
        ArrayList arrayList = (ArrayList) y3.o.l(this.f238511a);
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            com.bumptech.glide.request.e eVar = (com.bumptech.glide.request.e) obj;
            if (!eVar.f() && !eVar.isRunning()) {
                eVar.i();
            }
        }
        this.f238512b.clear();
    }

    public void i(@NonNull com.bumptech.glide.request.e eVar) {
        this.f238511a.add(eVar);
        if (!this.f238513c) {
            eVar.i();
            return;
        }
        eVar.clear();
        if (Log.isLoggable(f238510d, 2)) {
            Log.v(f238510d, "Paused, delaying request");
        }
        this.f238512b.add(eVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f238511a.size() + ", isPaused=" + this.f238513c + "}";
    }
}
