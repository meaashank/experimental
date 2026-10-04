package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f110651a = "NotificationCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f110652b = "android.support.dataRemoteInputs";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f110653c = "android.support.allowGeneratedReplies";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f110654d = "icon";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f110655e = "title";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f110656f = "actionIntent";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f110657g = "extras";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f110658h = "remoteInputs";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f110659i = "dataOnlyRemoteInputs";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f110660j = "resultKey";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f110661k = "label";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f110662l = "choices";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f110663m = "allowFreeFormInput";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f110664n = "allowedDataTypes";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f110665o = "semanticAction";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f110666p = "showsUserInterface";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static Field f110668r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f110669s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static Field f110671u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static Field f110672v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static Field f110673w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static Field f110674x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static boolean f110675y;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f110667q = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f110670t = new Object();

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            Bundle bundle = list.get(i10);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i10, bundle);
            }
        }
        return sparseArray;
    }

    public static boolean b() {
        if (f110675y) {
            return false;
        }
        try {
            if (f110671u == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                f110672v = cls.getDeclaredField("icon");
                f110673w = cls.getDeclaredField("title");
                f110674x = cls.getDeclaredField(f110656f);
                Field declaredField = Notification.class.getDeclaredField(NotificationCompat.w.f110925y);
                f110671u = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException e10) {
            Log.e(f110651a, "Unable to access notification actions", e10);
            f110675y = true;
        } catch (NoSuchFieldException e11) {
            Log.e(f110651a, "Unable to access notification actions", e11);
            f110675y = true;
        }
        return !f110675y;
    }

    public static RemoteInput c(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f110664n);
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            int size = stringArrayList.size();
            int i10 = 0;
            while (i10 < size) {
                String str = stringArrayList.get(i10);
                i10++;
                hashSet.add(str);
            }
        }
        return new RemoteInput(bundle.getString(f110660j), bundle.getCharSequence("label"), bundle.getCharSequenceArray(f110662l), bundle.getBoolean(f110663m), 0, bundle.getBundle("extras"), hashSet);
    }

    public static RemoteInput[] d(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[bundleArr.length];
        for (int i10 = 0; i10 < bundleArr.length; i10++) {
            remoteInputArr[i10] = c(bundleArr[i10]);
        }
        return remoteInputArr;
    }

    public static NotificationCompat.Action e(Notification notification, int i10) {
        SparseArray sparseParcelableArray;
        synchronized (f110670t) {
            try {
                try {
                    Object[] objArrH = h(notification);
                    if (objArrH != null) {
                        Object obj = objArrH[i10];
                        Bundle bundleK = k(notification);
                        return l(f110672v.getInt(obj), (CharSequence) f110673w.get(obj), (PendingIntent) f110674x.get(obj), (bundleK == null || (sparseParcelableArray = bundleK.getSparseParcelableArray(I.f110649e)) == null) ? null : (Bundle) sparseParcelableArray.get(i10));
                    }
                } catch (IllegalAccessException e10) {
                    Log.e(f110651a, "Unable to access notification actions", e10);
                    f110675y = true;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int f(Notification notification) {
        int length;
        synchronized (f110670t) {
            try {
                Object[] objArrH = h(notification);
                length = objArrH != null ? objArrH.length : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return length;
    }

    public static NotificationCompat.Action g(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        return new NotificationCompat.Action(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent) bundle.getParcelable(f110656f), bundle.getBundle("extras"), d(i(bundle, f110658h)), d(i(bundle, f110659i)), bundle2 != null ? bundle2.getBoolean(f110653c, false) : false, bundle.getInt(f110665o), bundle.getBoolean(f110666p), false, false);
    }

    public static Object[] h(Notification notification) {
        synchronized (f110670t) {
            if (!b()) {
                return null;
            }
            try {
                return (Object[]) f110671u.get(notification);
            } catch (IllegalAccessException e10) {
                Log.e(f110651a, "Unable to access notification actions", e10);
                f110675y = true;
                return null;
            }
        }
    }

    public static Bundle[] i(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    public static Bundle j(NotificationCompat.Action action) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatF = action.f();
        bundle.putInt("icon", iconCompatF != null ? iconCompatF.y() : 0);
        bundle.putCharSequence("title", action.j());
        bundle.putParcelable(f110656f, action.a());
        Bundle bundle2 = action.d() != null ? new Bundle(action.d()) : new Bundle();
        bundle2.putBoolean(f110653c, action.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray(f110658h, n(action.g()));
        bundle.putBoolean(f110666p, action.i());
        bundle.putInt(f110665o, action.h());
        return bundle;
    }

    public static Bundle k(Notification notification) {
        synchronized (f110667q) {
            if (f110669s) {
                return null;
            }
            try {
                if (f110668r == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e(f110651a, "Notification.extras field is not of type Bundle");
                        f110669s = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f110668r = declaredField;
                }
                Bundle bundle = (Bundle) f110668r.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f110668r.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e10) {
                Log.e(f110651a, "Unable to access notification extras", e10);
                f110669s = true;
                return null;
            } catch (NoSuchFieldException e11) {
                Log.e(f110651a, "Unable to access notification extras", e11);
                f110669s = true;
                return null;
            }
        }
    }

    public static NotificationCompat.Action l(int i10, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        boolean z10;
        RemoteInput[] remoteInputArr;
        RemoteInput[] remoteInputArr2;
        if (bundle != null) {
            RemoteInput[] remoteInputArrD = d(i(bundle, I.f110650f));
            RemoteInput[] remoteInputArrD2 = d(i(bundle, f110652b));
            z10 = bundle.getBoolean(f110653c);
            remoteInputArr = remoteInputArrD;
            remoteInputArr2 = remoteInputArrD2;
        } else {
            z10 = false;
            remoteInputArr = null;
            remoteInputArr2 = null;
        }
        return new NotificationCompat.Action(i10, charSequence, pendingIntent, bundle, remoteInputArr, remoteInputArr2, z10, 0, true, false, false);
    }

    public static Bundle m(RemoteInput remoteInput) {
        Bundle bundle = new Bundle();
        bundle.putString(f110660j, remoteInput.f110968a);
        bundle.putCharSequence("label", remoteInput.f110969b);
        bundle.putCharSequenceArray(f110662l, remoteInput.f110970c);
        bundle.putBoolean(f110663m, remoteInput.f110971d);
        bundle.putBundle("extras", remoteInput.f110973f);
        Set<String> set = remoteInput.f110974g;
        if (set != null && !set.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList(f110664n, arrayList);
        }
        return bundle;
    }

    public static Bundle[] n(RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[remoteInputArr.length];
        for (int i10 = 0; i10 < remoteInputArr.length; i10++) {
            bundleArr[i10] = m(remoteInputArr[i10]);
        }
        return bundleArr;
    }

    public static Bundle o(Notification.Builder builder, NotificationCompat.Action action) {
        IconCompat iconCompatF = action.f();
        builder.addAction(iconCompatF != null ? iconCompatF.y() : 0, action.j(), action.a());
        Bundle bundle = new Bundle(action.d());
        if (action.g() != null) {
            bundle.putParcelableArray(I.f110650f, n(action.g()));
        }
        if (action.c() != null) {
            bundle.putParcelableArray(f110652b, n(action.c()));
        }
        bundle.putBoolean(f110653c, action.b());
        return bundle;
    }
}
