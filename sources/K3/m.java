package k3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import g3.C4447e;
import g3.InterfaceC4444b;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface m<Model, Data> {

    public static class a<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC4444b f214405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<InterfaceC4444b> f214406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f214407c;

        public a(@NonNull InterfaceC4444b interfaceC4444b, @NonNull com.bumptech.glide.load.data.d<Data> dVar) {
            this(interfaceC4444b, Collections.EMPTY_LIST, dVar);
        }

        public a(@NonNull InterfaceC4444b interfaceC4444b, @NonNull List<InterfaceC4444b> list, @NonNull com.bumptech.glide.load.data.d<Data> dVar) {
            y3.m.f(interfaceC4444b, "Argument must not be null");
            this.f214405a = interfaceC4444b;
            y3.m.f(list, "Argument must not be null");
            this.f214406b = list;
            y3.m.f(dVar, "Argument must not be null");
            this.f214407c = dVar;
        }
    }

    @Nullable
    a<Data> a(@NonNull Model model, int i10, int i11, @NonNull C4447e c4447e);

    boolean b(@NonNull Model model);
}
