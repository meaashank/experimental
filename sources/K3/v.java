package k3;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import g3.C4447e;
import k3.m;
import x3.C5785e;

/* JADX INFO: loaded from: classes2.dex */
public class v<Model> implements m<Model, Model> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v<?> f214446a = new v<>();

    @Deprecated
    public v() {
    }

    public static <T> v<T> c() {
        return (v<T>) f214446a;
    }

    @Override // k3.m
    public m.a<Model> a(@NonNull Model model, int i10, int i11, @NonNull C4447e c4447e) {
        return new m.a<>(new C5785e(model), new b(model));
    }

    @Override // k3.m
    public boolean b(@NonNull Model model) {
        return true;
    }

    public static class a<Model> implements n<Model, Model> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a<?> f214447a = new a<>();

        @Deprecated
        public a() {
        }

        public static <T> a<T> a() {
            return (a<T>) f214447a;
        }

        @Override // k3.n
        @NonNull
        public m<Model, Model> e(q qVar) {
            return v.f214446a;
        }

        @Override // k3.n
        public void d() {
        }
    }

    public static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Model f214448a;

        public b(Model model) {
            this.f214448a = model;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Model> a() {
            return (Class<Model>) this.f214448a.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource c() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void d(@NonNull Priority priority, @NonNull d.a<? super Model> aVar) {
            aVar.e(this.f214448a);
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
