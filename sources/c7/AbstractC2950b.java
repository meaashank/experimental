package c7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: c7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2950b<T> extends C2953e<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f131249h = "asdf-".concat(AbstractC2950b.class.getSimpleName());

    public AbstractC2950b(T t10) {
        super(null, t10, null);
        InterfaceC2949a interfaceC2949a = (InterfaceC2949a) getClass().getAnnotation(InterfaceC2949a.class);
        if (interfaceC2949a != null) {
            Class<?> clsValue = interfaceC2949a.value();
            InterfaceC2951c interfaceC2951c = (InterfaceC2951c) clsValue.getAnnotation(InterfaceC2951c.class);
            for (Class<?> cls : clsValue.getDeclaredClasses()) {
                if (!Modifier.isAbstract(cls.getModifiers()) && m.class.isAssignableFrom(cls) && cls.getAnnotation(K.class) == null) {
                    q(cls, interfaceC2951c);
                }
            }
        }
        r();
    }

    public final void q(Class<?> cls, InterfaceC2951c interfaceC2951c) {
        try {
            Constructor<?> constructor = cls.getDeclaredConstructors()[0];
            if (!constructor.isAccessible()) {
                constructor.setAccessible(true);
            }
            m mVar = (m) constructor.newInstance(null);
            if (interfaceC2951c != null && mVar.z() == null) {
                mVar.t0(interfaceC2951c.value());
            }
            f(mVar);
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("Unable to instance Hook: ");
            sb2.append(cls);
            sb2.append(" : ");
            throw new RuntimeException(com.bykv.vk.openvk.preload.geckox.d.j.a(th, sb2));
        }
    }

    public abstract void r();
}
