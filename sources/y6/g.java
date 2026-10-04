package Y6;

import android.app.Notification;
import com.prism.gaia.remote.BadgerInfo;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f79329a = "g";

    public BadgerInfo a(String str, Notification notification) {
        try {
            Field declaredField = notification.getClass().getDeclaredField("extraNotification");
            if (declaredField != null) {
                Object obj = declaredField.get(notification);
                int iIntValue = ((Integer) obj.getClass().getDeclaredMethod("getMessageCount", null).invoke(obj, null)).intValue();
                BadgerInfo badgerInfo = new BadgerInfo();
                badgerInfo.badgerCount = iIntValue;
                badgerInfo.packageName = str;
                badgerInfo.className = "";
                return badgerInfo;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
