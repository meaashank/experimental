package G0;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@e.T(28)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class Z extends Y {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f40087B = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f40088C = -1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f40089D = "sans-serif";

    @Override // G0.Y
    public Method C(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // G0.Y, G0.W, G0.b0
    @NonNull
    public Typeface h(@NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) {
        return Typeface.create(typeface, i10, z10);
    }

    @Override // G0.Y
    public Typeface q(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f40080m, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f40086s.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }
}
