package s3;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<v3.p<?>> f238542a = Collections.newSetFromMap(new WeakHashMap());

    public void a() {
        this.f238542a.clear();
    }

    @NonNull
    public List<v3.p<?>> b() {
        return y3.o.l(this.f238542a);
    }

    public void c(@NonNull v3.p<?> pVar) {
        this.f238542a.add(pVar);
    }

    public void e(@NonNull v3.p<?> pVar) {
        this.f238542a.remove(pVar);
    }

    @Override // s3.l
    public void onDestroy() {
        ArrayList arrayList = (ArrayList) y3.o.l(this.f238542a);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((v3.p) obj).onDestroy();
        }
    }

    @Override // s3.l
    public void onStart() {
        ArrayList arrayList = (ArrayList) y3.o.l(this.f238542a);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((v3.p) obj).onStart();
        }
    }

    @Override // s3.l
    public void onStop() {
        ArrayList arrayList = (ArrayList) y3.o.l(this.f238542a);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((v3.p) obj).onStop();
        }
    }
}
