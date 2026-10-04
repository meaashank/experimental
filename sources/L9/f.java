package L9;

import android.os.Parcel;
import androidx.core.app.NotificationCompat;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f58753b = "android.content.pm.ActivityInfo$WindowLayout";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f58754c = "windowLayoutAffinity";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class<?>[] f58756e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f58752a = "asdf-".concat(f.class.getSimpleName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f58755d = {InMobiNetworkValues.WIDTH, "widthFraction", InMobiNetworkValues.HEIGHT, "heightFraction", NotificationCompat.w.f110901I, "minWidth", "minHeight"};

    static {
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Float.TYPE;
        f58756e = new Class[]{cls, cls2, cls, cls2, cls, cls, cls};
    }

    public static void a(Object obj, String str) {
        if (str == null) {
            return;
        }
        try {
            obj.getClass().getField(f58754c).set(obj, str);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static boolean b(Class<?> cls) {
        return cls != null && f58753b.equals(cls.getName());
    }

    public static Object c(Parcel parcel, Class<?> cls, String str) {
        int i10 = parcel.readInt();
        float f10 = parcel.readFloat();
        int i11 = parcel.readInt();
        float f11 = parcel.readFloat();
        int i12 = parcel.readInt();
        int i13 = parcel.readInt();
        int i14 = parcel.readInt();
        String string = parcel.readString();
        if (!b(cls)) {
            return null;
        }
        try {
            Constructor<?> constructor = cls.getConstructor(f58756e);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(Integer.valueOf(i10), Float.valueOf(f10), Integer.valueOf(i11), Float.valueOf(f11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
            a(objNewInstance, string);
            return objNewInstance;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static String d(Object obj) {
        try {
            return (String) obj.getClass().getField(f58754c).get(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void e(Parcel parcel, Object obj) {
        Class<?> cls = obj.getClass();
        for (String str : f58755d) {
            try {
                Field field = cls.getField(str);
                if (field.getType() == Float.TYPE) {
                    parcel.writeFloat(field.getFloat(obj));
                } else {
                    parcel.writeInt(field.getInt(obj));
                }
            } catch (Throwable th) {
                th.getMessage();
                parcel.writeInt(0);
            }
        }
        parcel.writeString(d(obj));
    }
}
