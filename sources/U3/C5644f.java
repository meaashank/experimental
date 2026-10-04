package u3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import g3.InterfaceC4449g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: u3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5644f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a<?>> f239368a = new ArrayList();

    /* JADX INFO: renamed from: u3.f$a */
    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f239369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC4449g<T> f239370b;

        public a(@NonNull Class<T> cls, @NonNull InterfaceC4449g<T> interfaceC4449g) {
            this.f239369a = cls;
            this.f239370b = interfaceC4449g;
        }

        public boolean a(@NonNull Class<?> cls) {
            return this.f239369a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(@NonNull Class<Z> cls, @NonNull InterfaceC4449g<Z> interfaceC4449g) {
        this.f239368a.add(new a<>(cls, interfaceC4449g));
    }

    @Nullable
    public synchronized <Z> InterfaceC4449g<Z> b(@NonNull Class<Z> cls) {
        int size = this.f239368a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a<?> aVar = this.f239368a.get(i10);
            if (aVar.f239369a.isAssignableFrom(cls)) {
                return (InterfaceC4449g<Z>) aVar.f239370b;
            }
        }
        return null;
    }

    public synchronized <Z> void c(@NonNull Class<Z> cls, @NonNull InterfaceC4449g<Z> interfaceC4449g) {
        this.f239368a.add(0, new a<>(cls, interfaceC4449g));
    }
}
