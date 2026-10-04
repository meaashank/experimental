package s8;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: s8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5581a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f238598a = "asdf-".concat(C5581a.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Map<String, InterfaceC0886a> f238599b = new HashMap();

    /* JADX INFO: renamed from: s8.a$a, reason: collision with other inner class name */
    public interface InterfaceC0886a {
        IBinder a(Context context, ClassLoader classLoader, IBinder iBinder);
    }

    public static IBinder a(Context context, ComponentName componentName, IBinder iBinder) {
        if (context != null && iBinder != null) {
            try {
                InterfaceC0886a interfaceC0886a = f238599b.get(iBinder.getInterfaceDescriptor());
                if (interfaceC0886a != null) {
                    IBinder iBinderA = interfaceC0886a.a(context, context.getClassLoader(), iBinder);
                    if (iBinderA != null) {
                        return iBinderA;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }
}
