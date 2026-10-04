package S1;

import androidx.lifecycle.k0;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f68112a = new d();

    @NotNull
    public final <T extends k0> T a(@NotNull Class<T> modelClass) throws InvocationTargetException {
        G.p(modelClass, "modelClass");
        try {
            T tNewInstance = modelClass.getDeclaredConstructor(null).newInstance(null);
            G.o(tNewInstance, "{\n            modelClass…).newInstance()\n        }");
            return tNewInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e12);
        }
    }
}
