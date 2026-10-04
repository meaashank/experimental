package C4;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public static final void a(@NotNull Context context) throws IllegalAccessException, InvocationTargetException {
        G.p(context, "context");
        Class.forName("androidx.multidex.b").getMethod("install", Context.class).invoke(null, context);
    }
}
