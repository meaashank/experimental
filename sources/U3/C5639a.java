package u3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import g3.InterfaceC4443a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: u3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5639a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<C0892a<?>> f239354a = new ArrayList();

    /* JADX INFO: renamed from: u3.a$a, reason: collision with other inner class name */
    public static final class C0892a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f239355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC4443a<T> f239356b;

        public C0892a(@NonNull Class<T> cls, @NonNull InterfaceC4443a<T> interfaceC4443a) {
            this.f239355a = cls;
            this.f239356b = interfaceC4443a;
        }

        public boolean a(@NonNull Class<?> cls) {
            return this.f239355a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(@NonNull Class<T> cls, @NonNull InterfaceC4443a<T> interfaceC4443a) {
        this.f239354a.add(new C0892a<>(cls, interfaceC4443a));
    }

    @Nullable
    public synchronized <T> InterfaceC4443a<T> b(@NonNull Class<T> cls) {
        for (C0892a<?> c0892a : this.f239354a) {
            if (c0892a.f239355a.isAssignableFrom(cls)) {
                return (InterfaceC4443a<T>) c0892a.f239356b;
            }
        }
        return null;
    }

    public synchronized <T> void c(@NonNull Class<T> cls, @NonNull InterfaceC4443a<T> interfaceC4443a) {
        this.f239354a.add(0, new C0892a<>(cls, interfaceC4443a));
    }
}
