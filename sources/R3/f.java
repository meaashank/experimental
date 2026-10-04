package r3;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a<?, ?>> f227165a = new ArrayList();

    public static final class a<Z, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<Z> f227166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<R> f227167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e<Z, R> f227168c;

        public a(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull e<Z, R> eVar) {
            this.f227166a = cls;
            this.f227167b = cls2;
            this.f227168c = eVar;
        }

        public boolean a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f227166a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f227167b);
        }
    }

    @NonNull
    public synchronized <Z, R> e<Z, R> a(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.f227169a;
        }
        for (a<?, ?> aVar : this.f227165a) {
            if (aVar.a(cls, cls2)) {
                return (e<Z, R>) aVar.f227168c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @NonNull
    public synchronized <Z, R> List<Class<R>> b(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.f227165a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f227167b)) {
                arrayList.add(aVar.f227167b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull e<Z, R> eVar) {
        this.f227165a.add(new a<>(cls, cls2, eVar));
    }
}
