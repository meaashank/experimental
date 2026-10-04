package T7;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.service.notification.StatusBarNotification;
import com.prism.commons.notification.NotificationBundle;
import com.prism.commons.utils.C3838b;
import com.prism.commons.utils.C3841e;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import v8.C5710t;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    public static class A extends c7.m {
        @Override // c7.m
        public String A() {
            return "getNotificationChannelsForPackage";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            if (!c7.m.q().equals(objArr[0])) {
                return null;
            }
            List<NotificationChannel> listR = C5710t.k().r(c7.m.q(), c7.m.M());
            return com.prism.gaia.helper.compat.f.c(method) ? com.prism.gaia.helper.compat.f.a(listR) : listR;
        }
    }

    public static class B extends c7.m {
        @Override // c7.m
        public String A() {
            return "getNumNotificationChannelsForPackage";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            if (c7.m.q().equals(objArr[0])) {
                return Integer.valueOf(C5710t.k().t(c7.m.q(), c7.m.M()));
            }
            return 0;
        }
    }

    public static class C extends c7.m {
        @Override // c7.m
        public String A() {
            return "onlyHasDefaultChannel";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return Boolean.valueOf(C5710t.k().t(c7.m.q(), c7.m.M()) == 0);
        }
    }

    public static class D extends c7.m {
        @Override // c7.m
        public String A() {
            return "updateNotificationChannelForPackage";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            if (!C3841e.s()) {
                return 0;
            }
            C5710t.k().v(c7.m.q(), androidx.core.app.B.a(objArr[2]), c7.m.M());
            return 0;
        }
    }

    /* JADX INFO: renamed from: T7.a$a, reason: collision with other inner class name */
    public static class C0113a extends c7.m {
        @Override // c7.m
        public String A() {
            return "areBubblesAllowed";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            c7.m.i0(objArr, 0);
            return method.invoke(obj, objArr);
        }
    }

    /* JADX INFO: renamed from: T7.a$b, reason: case insensitive filesystem */
    public static class C1275b extends c7.m {
        @Override // c7.m
        public String A() {
            return "cancelAllNotifications";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Y6.a.d(c7.m.q(), null);
            C5710t.k().a(c7.m.q(), c7.m.M());
            return 0;
        }
    }

    /* JADX INFO: renamed from: T7.a$c, reason: case insensitive filesystem */
    public static class C1276c extends c7.m {
        @Override // c7.m
        public String A() {
            return "cancelNotificationWithTag";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Y6.a.d(c7.m.q(), null);
            int iU0 = u0();
            String str = (String) objArr[iU0];
            C5710t.k().b(c7.m.q(), ((Integer) objArr[iU0 + 1]).intValue(), str, c7.m.M());
            return 0;
        }

        public final int u0() {
            return C3841e.x() ? 2 : 1;
        }
    }

    /* JADX INFO: renamed from: T7.a$d, reason: case insensitive filesystem */
    public static class C1277d extends c7.m {
        @Override // c7.m
        public String A() {
            return "createNotificationChannelGroups";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            C5710t.k().c(c7.m.q(), com.prism.gaia.helper.compat.f.b(objArr[1]), c7.m.M());
            return 0;
        }
    }

    public static class e extends c7.m {
        @Override // c7.m
        public String A() {
            return "createNotificationChannels";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            C5710t.k().d(c7.m.q(), com.prism.gaia.helper.compat.f.b(objArr[1]), c7.m.M());
            return 0;
        }
    }

    public static class f extends c7.m {
        @Override // c7.m
        public String A() {
            return "createNotificationChannelsForPackage";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            C5710t.k().d(c7.m.q(), com.prism.gaia.helper.compat.f.b(objArr[2]), c7.m.M());
            return 0;
        }
    }

    public static class g extends c7.m {
        @Override // c7.m
        public String A() {
            return "deleteNotificationChannel";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            C5710t.k().e(c7.m.q(), (String) objArr[1], c7.m.M());
            return 0;
        }
    }

    public static class h extends c7.m {
        @Override // c7.m
        public String A() {
            return "deleteNotificationChannelGroup";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            C5710t.k().f(c7.m.q(), (String) objArr[1], c7.m.M());
            return 0;
        }
    }

    public static class i extends c7.m {
        @Override // c7.m
        public String A() {
            return "enqueueNotification";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            String str = (String) objArr[0];
            if (c7.m.w().equals(str)) {
                return method.invoke(obj, objArr);
            }
            int iJ = C3838b.j(objArr, Notification.class);
            int iJ2 = C3838b.j(objArr, Integer.class);
            int iK = C3838b.k(objArr, String.class, 2);
            int iIntValue = ((Integer) objArr[iJ2]).intValue();
            String str2 = iK >= 0 ? (String) objArr[iK] : null;
            Notification notification = (Notification) objArr[iJ];
            Y6.a.d(str, notification);
            NotificationBundle notificationBundleH = C5710t.k().h(c7.m.q(), str, iIntValue, str2, notification, c7.m.M());
            if (notificationBundleH != null) {
                C5710t.f239903d.g(notificationBundleH.f161981id, notificationBundleH.tag, notificationBundleH.notification);
            }
            return 0;
        }
    }

    public static class j extends c7.m {
        @Override // c7.m
        public String A() {
            return "enqueueNotificationWithTag";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            String str = (String) objArr[0];
            if (c7.m.w().equals(str)) {
                return method.invoke(obj, objArr);
            }
            int iJ = C3838b.j(objArr, Notification.class);
            int iIntValue = ((Integer) objArr[C3838b.j(objArr, Integer.class)]).intValue();
            String str2 = (String) objArr[2];
            Notification notification = (Notification) objArr[iJ];
            Y6.a.d(str, notification);
            NotificationBundle notificationBundleH = C5710t.k().h(c7.m.q(), str, iIntValue, str2, notification, c7.m.M());
            if (notificationBundleH != null) {
                C5710t.f239903d.g(notificationBundleH.f161981id, notificationBundleH.tag, notificationBundleH.notification);
            }
            return 0;
        }
    }

    public static class k extends j {
        @Override // T7.a.j, c7.m
        public String A() {
            return "enqueueNotificationWithTagPriority";
        }
    }

    public static class l extends c7.m {
        @Override // c7.m
        public String A() {
            return "enqueueTextToast";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            c7.m.i0(objArr, 0);
            return method.invoke(obj, objArr);
        }
    }

    public static class m extends c7.m {
        @Override // c7.m
        public String A() {
            return "enqueueToast";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            c7.m.i0(objArr, 0);
            return method.invoke(obj, objArr);
        }
    }

    public static class n extends c7.m {
        @Override // c7.m
        public String A() {
            return "enqueueToastEx";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            c7.m.i0(objArr, 0);
            return method.invoke(obj, objArr);
        }
    }

    public static class o extends c7.m {
        @Override // c7.m
        public String A() {
            return "enqueueToastWithType";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            c7.m.i0(objArr, 0);
            return method.invoke(obj, objArr);
        }
    }

    public static class p extends c7.m {
        @Override // c7.m
        public String A() {
            return "getAppActiveNotifications";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            List<StatusBarNotification> listL = C5710t.k().l(c7.m.q(), c7.m.M());
            return com.prism.gaia.helper.compat.f.c(method) ? com.prism.gaia.helper.compat.f.a(listL) : listL;
        }
    }

    public static class q extends c7.m {
        @Override // c7.m
        public String A() {
            return "getConversationNotificationChannel";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            int iL = C3838b.l(objArr, Boolean.TYPE);
            if (iL < 0) {
                return null;
            }
            return C5710t.k().m(c7.m.q(), (String) objArr[iL + 1], (String) objArr[iL - 1], ((Boolean) objArr[iL]).booleanValue(), c7.m.M());
        }
    }

    public static class r extends c7.m {
        @Override // c7.m
        public String A() {
            return "getDeletedChannelCount";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return 0;
        }
    }

    public static class s extends c7.m {
        @Override // c7.m
        public String A() {
            return "getNotificationChannel";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return C5710t.k().o(c7.m.q(), (String) objArr[u0()], c7.m.M());
        }

        public final int u0() {
            return C3841e.w() ? 3 : 1;
        }
    }

    public static class t extends c7.m {
        @Override // c7.m
        public String A() {
            return "getNotificationChannelForPackage";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            if (!c7.m.q().equals(objArr[0])) {
                return null;
            }
            return C5710t.k().o(c7.m.q(), (String) objArr[2], c7.m.M());
        }
    }

    public static class u extends c7.m {
        @Override // c7.m
        public String A() {
            return "getNotificationChannelGroup";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return C5710t.k().p(c7.m.q(), (String) objArr[1], c7.m.M());
        }
    }

    public static class v extends c7.m {
        @Override // c7.m
        public String A() {
            return "getNotificationChannelGroupForPackage";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            if (!c7.m.q().equals(objArr[1])) {
                return null;
            }
            return C5710t.k().p(c7.m.q(), (String) objArr[0], c7.m.M());
        }
    }

    public static class w extends c7.m {
        @Override // c7.m
        public String A() {
            return "getNotificationChannelGroups";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            List<NotificationChannelGroup> listQ = C5710t.k().q(c7.m.q(), c7.m.M());
            return com.prism.gaia.helper.compat.f.c(method) ? com.prism.gaia.helper.compat.f.a(listQ) : listQ;
        }
    }

    public static class x extends c7.m {
        @Override // c7.m
        public String A() {
            return "getNotificationChannelGroupsForPackage";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            List<NotificationChannelGroup> arrayList = !c7.m.q().equals(objArr[0]) ? new ArrayList<>() : C5710t.k().q(c7.m.q(), c7.m.M());
            return com.prism.gaia.helper.compat.f.c(method) ? com.prism.gaia.helper.compat.f.a(arrayList) : arrayList;
        }
    }

    public static class y extends x {
        @Override // T7.a.x, c7.m
        public String A() {
            return "getNotificationChannelGroupsWithoutChannels";
        }
    }

    public static class z extends c7.m {
        @Override // c7.m
        public String A() {
            return "getNotificationChannels";
        }

        @Override // c7.m
        public boolean P() {
            return c7.m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            List<NotificationChannel> listR = C5710t.k().r(c7.m.q(), c7.m.M());
            return com.prism.gaia.helper.compat.f.c(method) ? com.prism.gaia.helper.compat.f.a(listR) : listR;
        }
    }
}
