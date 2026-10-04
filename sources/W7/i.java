package w7;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.XmlResourceParser;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.ArraySet;
import android.util.Log;
import androidx.compose.runtime.C1979x1;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.naked.compat.android.app.PendingIntentCompat2;
import i7.g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import v8.C5691a;
import v8.C5703m;
import v8.C5714x;

/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f240136a = "GAIA-Cred";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f240137b = "com.google.android.gms";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f240138c = "android.service.credentials.CredentialProviderService";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f240139d = "android.service.credentials.system.CredentialProviderService";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f240140e = "android.credentials.provider";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f240141f = "http://schemas.android.com/apk/res/android";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f240142g = "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f240143h = "android.credentials.GetCredentialException.TYPE_USER_CANCELED";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f240144i = "android.credentials.GetCredentialException.TYPE_UNKNOWN";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f240145j = "android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f240146k = "android.credentials.CreateCredentialException.TYPE_USER_CANCELED";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f240147l = "android.credentials.CreateCredentialException.TYPE_UNKNOWN";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f240148m = "android.credentials.ClearCredentialStateException.TYPE_UNKNOWN";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f240149n = "android.service.credentials.extra.GET_CREDENTIAL_REQUEST";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f240150o = "android.service.credentials.extra.GET_CREDENTIAL_RESPONSE";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f240151p = "android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f240152q = "android.service.credentials.extra.CREATE_CREDENTIAL_REQUEST";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f240153r = "android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f240154s = "android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f240155t = "gaia_cred_transport_holder";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f240156u = "binder";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f240157v = "kind";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f240158w = "get";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f240159x = "create";

    public class b extends Binder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f240162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f240163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ BlockingQueue f240164c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Parcelable.Creator f240165d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f240166e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f240167f;

        public b(int i10, String str, BlockingQueue blockingQueue, Parcelable.Creator creator, int i11, int i12) {
            this.f240162a = i10;
            this.f240163b = str;
            this.f240164c = blockingQueue;
            this.f240165d = creator;
            this.f240166e = i11;
            this.f240167f = i12;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == this.f240162a) {
                parcel.enforceInterface(this.f240163b);
                BlockingQueue blockingQueue = this.f240164c;
                Parcelable.Creator creator = this.f240165d;
                blockingQueue.offer(new Object[]{"ok", creator == null ? Boolean.TRUE : parcel.readTypedObject(creator)});
                if (parcel2 != null) {
                    parcel2.writeNoException();
                }
                return true;
            }
            if (i10 == this.f240166e) {
                parcel.enforceInterface(this.f240163b);
                if (parcel2 != null) {
                    parcel2.writeNoException();
                }
                return true;
            }
            if (i10 != this.f240167f) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel.enforceInterface(this.f240163b);
            this.f240164c.offer(new Object[]{"fail", parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel)});
            if (parcel2 != null) {
                parcel2.writeNoException();
            }
            return true;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PendingIntent f240168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f240169b;

        public c(PendingIntent pendingIntent, String str) {
            this.f240168a = pendingIntent;
            this.f240169b = str;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f240170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f240171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set<String> f240172c;

        public d(String str, String str2, Set<String> set) {
            this.f240170a = str;
            this.f240171b = str2;
            this.f240172c = set;
        }

        public ComponentName a() {
            return new ComponentName(this.f240170a, this.f240171b);
        }

        public boolean b(String str) {
            return this.f240172c.isEmpty() || str == null || this.f240172c.contains(str);
        }
    }

    public static boolean a(Object obj) {
        try {
            return Boolean.TRUE.equals(o(obj, "alwaysSendAppInfoToProvider"));
        } catch (Throwable unused) {
            return true;
        }
    }

    public static Object[] b(Context context, Object obj) {
        ArrayList arrayList = (ArrayList) v(context);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            Context context2 = context;
            Object obj3 = obj;
            Object objF = f(context2, ((d) obj2).a(), "onBeginGetCredential", "android.service.credentials.BeginGetCredentialRequest", "android.service.credentials.IBeginGetCredentialCallback", "android.service.credentials.BeginGetCredentialResponse", obj3);
            c cVarM = m(objF, "getCredentialEntries");
            if (cVarM != null) {
                return new Object[]{objF, cVarM};
            }
            context = context2;
            obj = obj3;
        }
        return null;
    }

    public static Object c(Class<?> cls, Object obj, List<?> list, Map<String, Object> map) throws Throwable {
        Constructor<?> constructor = Class.forName("android.service.credentials.BeginGetCredentialOption").getConstructor(String.class, String.class, Bundle.class);
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int i10 = 0;
            for (Object obj2 : list) {
                String str = (String) o(obj2, "getType");
                Bundle bundle = (Bundle) o(obj2, "getCandidateQueryData");
                StringBuilder sb2 = new StringBuilder("gaia-");
                int i11 = i10 + 1;
                sb2.append(i10);
                String string = sb2.toString();
                map.put(string, obj2);
                if (bundle == null) {
                    bundle = new Bundle();
                }
                arrayList.add(constructor.newInstance(string, str, bundle));
                i10 = i11;
            }
        }
        Constructor<?> declaredConstructor = Class.forName("android.service.credentials.BeginGetCredentialRequest").getDeclaredConstructor(cls, List.class);
        declaredConstructor.setAccessible(true);
        return declaredConstructor.newInstance(obj, arrayList);
    }

    public static Object d(Context context, String str) {
        try {
            return Class.forName("android.service.credentials.CallingAppInfo").getConstructor(String.class, Class.forName("android.content.pm.SigningInfo")).newInstance(str, context.getPackageManager().getPackageInfo(str, C1979x1.f100279m).signingInfo);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object e(String str, String str2, BlockingQueue<Object[]> blockingQueue) throws Throwable {
        int iN;
        Class<?> cls = Class.forName(str + "$Stub");
        int iN2 = n(cls, "TRANSACTION_onSuccess");
        int iN3 = n(cls, "TRANSACTION_onFailure");
        try {
            iN = n(cls, "TRANSACTION_onCancellable");
        } catch (Throwable unused) {
            iN = -1;
        }
        b bVar = new b(iN2, str, blockingQueue, str2 == null ? null : (Parcelable.Creator) Class.forName(str2).getField("CREATOR").get(null), iN, iN3);
        bVar.attachInterface(null, str);
        return cls.getMethod("asInterface", IBinder.class).invoke(null, bVar);
    }

    public static Object f(Context context, ComponentName componentName, String str, String str2, String str3, String str4, Object obj) {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        a aVar = new a(arrayBlockingQueue, new Object());
        boolean z10 = false;
        try {
            boolean zBindService = context.bindService(new Intent(f240138c).setComponent(componentName), aVar, 1);
            if (!zBindService) {
                if (zBindService) {
                    try {
                        context.unbindService(aVar);
                    } catch (Throwable unused) {
                    }
                }
                return null;
            }
            try {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Object objPoll = arrayBlockingQueue.poll(8L, timeUnit);
                if (!(objPoll instanceof IBinder)) {
                    if (zBindService) {
                        try {
                            context.unbindService(aVar);
                        } catch (Throwable unused2) {
                        }
                    }
                    return null;
                }
                Object objInvoke = Class.forName("android.service.credentials.ICredentialProviderService$Stub").getMethod("asInterface", IBinder.class).invoke(null, objPoll);
                ArrayBlockingQueue arrayBlockingQueue2 = new ArrayBlockingQueue(1);
                objInvoke.getClass().getMethod(str, Class.forName(str2), Class.forName(str3)).invoke(objInvoke, obj, e(str3, str4, arrayBlockingQueue2));
                Object[] objArr = (Object[]) arrayBlockingQueue2.poll(10L, timeUnit);
                if (objArr == null) {
                    componentName.getShortClassName();
                    if (zBindService) {
                        try {
                            context.unbindService(aVar);
                        } catch (Throwable unused3) {
                        }
                    }
                    return null;
                }
                if (!"fail".equals(objArr[0])) {
                    Object obj2 = objArr[1];
                    if (zBindService) {
                        try {
                            context.unbindService(aVar);
                        } catch (Throwable unused4) {
                        }
                    }
                    return obj2;
                }
                componentName.getShortClassName();
                Object obj3 = objArr[1];
                if (objArr.length > 2) {
                    Object obj4 = objArr[2];
                }
                if (zBindService) {
                    try {
                        context.unbindService(aVar);
                    } catch (Throwable unused5) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                z10 = zBindService;
                try {
                    componentName.getShortClassName();
                    Log.getStackTraceString(th);
                    if (z10) {
                        try {
                            context.unbindService(aVar);
                        } catch (Throwable unused6) {
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    if (z10) {
                        try {
                            context.unbindService(aVar);
                        } catch (Throwable unused7) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static Set<String> g(Object obj) {
        ArraySet arraySet = new ArraySet();
        if (obj != null) {
            try {
                List list = (List) o(obj, "getCredentialEntries");
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Object objO = o(it.next(), "getType");
                        if (objO instanceof String) {
                            arraySet.add((String) objO);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return arraySet;
    }

    public static void h(Object obj, Object obj2, String str, int i10) {
        Context contextN = GaiaContext.j().n();
        try {
            Bundle bundle = (Bundle) o(obj, "getData");
            Object objD = d(contextN, str);
            Constructor<?> constructor = Class.forName("android.service.credentials.ClearCredentialStateRequest").getConstructor(Class.forName("android.service.credentials.CallingAppInfo"), Bundle.class);
            if (bundle == null) {
                bundle = new Bundle();
            }
            Object objNewInstance = constructor.newInstance(objD, bundle);
            ArrayList arrayList = (ArrayList) v(contextN);
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                f(contextN, ((d) arrayList.get(i11)).a(), "onClearCredentialState", "android.service.credentials.ClearCredentialStateRequest", "android.service.credentials.IClearCredentialStateCallback", null, objNewInstance);
            }
            obj2.getClass().getMethod("onSuccess", null).invoke(obj2, null);
        } catch (Throwable th) {
            Log.getStackTraceString(th);
            q(obj2, f240148m, "gaia clear dispatch failed");
        }
    }

    public static void i(Object obj, Object obj2, String str, int i10) {
        Context contextN = GaiaContext.j().n();
        try {
            String str2 = (String) o(obj, "getType");
            Bundle bundle = (Bundle) o(obj, "getCredentialData");
            Bundle bundle2 = (Bundle) o(obj, "getCandidateQueryData");
            Object objD = d(contextN, str);
            Class<?> cls = Class.forName("android.service.credentials.CallingAppInfo");
            Class<?> cls2 = Class.forName("android.service.credentials.BeginCreateCredentialRequest");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            Object objNewInstance = a(obj) ? cls2.getConstructor(String.class, Bundle.class, cls).newInstance(str2, bundle2, objD) : cls2.getConstructor(String.class, Bundle.class).newInstance(str2, bundle2);
            ArrayList arrayList = (ArrayList) u(contextN, str2);
            int size = arrayList.size();
            int i11 = 0;
            PendingIntent pendingIntent = null;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                int i12 = i11 + 1;
                ComponentName componentNameA = ((d) arrayList.get(i11)).a();
                int i13 = size;
                c cVarM = m(f(contextN, componentNameA, "onBeginCreateCredential", "android.service.credentials.BeginCreateCredentialRequest", "android.service.credentials.IBeginCreateCredentialCallback", "android.service.credentials.BeginCreateCredentialResponse", objNewInstance), "getCreateEntries");
                pendingIntent = cVarM == null ? null : cVarM.f240168a;
                if (pendingIntent != null) {
                    pendingIntent.getCreatorPackage();
                    break;
                } else {
                    i11 = i12;
                    size = i13;
                }
            }
            if (pendingIntent == null) {
                q(obj2, f240145j, "no container provider offers to create this credential");
                return;
            }
            Constructor<?> constructor = Class.forName("android.service.credentials.CreateCredentialRequest").getConstructor(cls, String.class, Bundle.class);
            if (bundle == null) {
                bundle = new Bundle();
            }
            x(pendingIntent, obj2, f240159x, f240152q, (Parcelable) constructor.newInstance(objD, str2, bundle));
            obj2.getClass().getMethod("onPendingIntent", PendingIntent.class).invoke(obj2, pendingIntent);
            pendingIntent.getCreatorPackage();
        } catch (Throwable th) {
            Log.getStackTraceString(th);
            q(obj2, f240147l, "gaia create dispatch failed");
        }
    }

    public static void j(Object obj, Object obj2, String str, int i10) {
        Context contextN = GaiaContext.j().n();
        try {
            List list = (List) o(obj, "getCredentialOptions");
            if (list != null) {
                list.size();
            }
            if (list != null && !list.isEmpty()) {
                Object objD = d(contextN, str);
                Class<?> cls = Class.forName("android.service.credentials.CallingAppInfo");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Object[] objArrB = b(contextN, c(cls, objD, list, linkedHashMap));
                if (objArrB == null) {
                    q(obj2, f240142g, "no container credential");
                    return;
                }
                c cVar = (c) objArrB[1];
                PendingIntent pendingIntent = cVar.f240168a;
                x(pendingIntent, obj2, f240158w, f240149n, (Parcelable) Class.forName("android.service.credentials.GetCredentialRequest").getConstructor(cls, List.class).newInstance(objD, s(linkedHashMap, cVar, list)));
                obj2.getClass().getMethod("onPendingIntent", PendingIntent.class).invoke(obj2, pendingIntent);
                pendingIntent.getCreatorPackage();
                return;
            }
            q(obj2, f240142g, "no options");
        } catch (Throwable th) {
            Log.getStackTraceString(th);
            q(obj2, f240144i, "gaia dispatch failed");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void k(Object obj, Object obj2, Object obj3, String str, int i10) {
        char c10;
        PendingIntent pendingIntent;
        Context contextN = GaiaContext.j().n();
        try {
            List list = (List) o(obj, "getCredentialOptions");
            if (list != null) {
                list.size();
            }
            Class<?> cls = Class.forName("android.credentials.PrepareGetCredentialResponseInternal");
            Class<?> cls2 = Boolean.TYPE;
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(cls2, Set.class, cls2, cls2, PendingIntent.class);
            declaredConstructor.setAccessible(true);
            Object objD = d(contextN, str);
            Class<?> cls3 = Class.forName("android.service.credentials.CallingAppInfo");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Object[] objArrB = b(contextN, c(cls3, objD, list, linkedHashMap));
            Object obj4 = objArrB == null ? null : objArrB[0];
            c cVar = objArrB == null ? null : (c) objArrB[1];
            if (cVar == null) {
                c10 = 0;
                pendingIntent = null;
            } else {
                c10 = 0;
                pendingIntent = cVar.f240168a;
            }
            Set<String> setG = g(obj4);
            boolean z10 = contextN.getPackageManager().checkPermission("android.permission.CREDENTIAL_MANAGER_QUERY_CANDIDATE_CREDENTIALS", str) == 0 ? 1 : c10;
            if (pendingIntent != null) {
                Class<?> cls4 = Class.forName("android.service.credentials.GetCredentialRequest");
                Class<?>[] clsArr = new Class[2];
                clsArr[c10] = cls3;
                clsArr[1] = List.class;
                Constructor<?> constructor = cls4.getConstructor(clsArr);
                List<Object> listS = s(linkedHashMap, cVar, list);
                Object[] objArr = new Object[2];
                objArr[c10] = objD;
                objArr[1] = listS;
                x(pendingIntent, obj3, f240158w, f240149n, (Parcelable) constructor.newInstance(objArr));
            }
            Object[] objArr2 = new Object[5];
            objArr2[c10] = Boolean.valueOf(z10);
            objArr2[1] = setG;
            Boolean bool = Boolean.FALSE;
            objArr2[2] = bool;
            objArr2[3] = bool;
            objArr2[4] = pendingIntent;
            Object objNewInstance = declaredConstructor.newInstance(objArr2);
            Class<?> cls5 = obj2.getClass();
            Class<?>[] clsArr2 = new Class[1];
            clsArr2[c10] = cls;
            Method method = cls5.getMethod("onResponse", clsArr2);
            Object[] objArr3 = new Object[1];
            objArr3[c10] = objNewInstance;
            method.invoke(obj2, objArr3);
        } catch (Throwable th) {
            Log.getStackTraceString(th);
            q(obj2, f240144i, "gaia prepareGet dispatch failed");
        }
    }

    public static PendingIntent l(Object obj) {
        List list;
        PendingIntent pendingIntentL;
        if (obj == null) {
            return null;
        }
        try {
            list = (List) obj.getClass().getMethod("getItems", null).invoke(obj, null);
        } catch (Throwable unused) {
        }
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if ("action".equals((String) obj2.getClass().getMethod("getFormat", null).invoke(obj2, null))) {
                Object objInvoke = obj2.getClass().getMethod("getAction", null).invoke(obj2, null);
                if (objInvoke instanceof PendingIntent) {
                    return (PendingIntent) objInvoke;
                }
            }
        }
        for (Object obj3 : list) {
            if ("slice".equals((String) obj3.getClass().getMethod("getFormat", null).invoke(obj3, null)) && (pendingIntentL = l(obj3.getClass().getMethod("getSlice", null).invoke(obj3, null))) != null) {
                return pendingIntentL;
            }
        }
        return null;
    }

    public static c m(Object obj, String str) {
        Object objO;
        if (obj == null) {
            return null;
        }
        try {
            List list = (List) o(obj, str);
            if (list != null) {
                for (Object obj2 : list) {
                    PendingIntent pendingIntentL = l(o(obj2, "getSlice"));
                    if (pendingIntentL != null) {
                        try {
                            objO = o(obj2, "getBeginGetCredentialOptionId");
                        } catch (Throwable unused) {
                        }
                        String str2 = objO instanceof String ? (String) objO : null;
                        return new c(pendingIntentL, str2);
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    public static int n(Class<?> cls, String str) throws Throwable {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.getInt(null);
    }

    public static Object o(Object obj, String str) throws Throwable {
        Method method = obj.getClass().getMethod(str, null);
        method.setAccessible(true);
        return method.invoke(obj, null);
    }

    public static boolean p(ComponentName componentName) {
        try {
            ArrayList arrayList = (ArrayList) v(GaiaContext.j().n());
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d dVar = (d) obj;
                if (dVar.f240170a.equals(componentName.getPackageName()) && dVar.f240171b.equals(componentName.getClassName())) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void q(Object obj, String str, String str2) {
        try {
            obj.getClass().getMethod("onError", String.class, String.class).invoke(obj, str, str2);
        } catch (Throwable unused) {
        }
    }

    public static void r(IBinder iBinder, int i10, Intent intent) {
        Activity activity;
        boolean zHasExtra;
        boolean zHasExtra2;
        if (iBinder == null) {
            return;
        }
        try {
            C5691a c5691aY = C5703m.o().y(iBinder);
            if (c5691aY != null && (activity = c5691aY.f239861a) != null) {
                Intent intent2 = activity.getIntent();
                Bundle bundleExtra = intent2 == null ? null : intent2.getBundleExtra(f240155t);
                if (bundleExtra == null) {
                    return;
                }
                boolean zEquals = f240159x.equals(bundleExtra.getString(f240157v));
                String str = zEquals ? f240153r : f240150o;
                String str2 = zEquals ? f240154s : f240151p;
                String str3 = zEquals ? "android.credentials.CreateCredentialException" : "android.credentials.GetCredentialException";
                String str4 = f240149n;
                y(intent2, zEquals ? f240152q : f240149n, zEquals ? "android.service.credentials.CreateCredentialRequest" : "android.service.credentials.GetCredentialRequest");
                if (intent != null) {
                    try {
                        zHasExtra = intent.hasExtra(str);
                        try {
                            zHasExtra2 = intent.hasExtra(str2);
                        } catch (Throwable unused) {
                            zHasExtra2 = false;
                        }
                    } catch (Throwable unused2) {
                        zHasExtra = false;
                    }
                } else {
                    zHasExtra = false;
                    zHasExtra2 = false;
                }
                IBinder binder = bundleExtra.getBinder(f240156u);
                if (binder == null) {
                    return;
                }
                Object objInvoke = Class.forName(zEquals ? "android.credentials.ICreateCredentialCallback$Stub" : "android.credentials.IGetCredentialCallback$Stub").getMethod("asInterface", IBinder.class).invoke(null, binder);
                if (zHasExtra) {
                    objInvoke.getClass().getMethod("onResponse", Class.forName(zEquals ? "android.credentials.CreateCredentialResponse" : "android.credentials.GetCredentialResponse")).invoke(objInvoke, intent.getParcelableExtra(str));
                    return;
                }
                boolean z10 = i10 == 0;
                String str5 = z10 ? zEquals ? f240146k : f240143h : zEquals ? f240147l : f240144i;
                String strValueOf = z10 ? "activity is cancelled by the user." : "provider error";
                Object objW = w(intent, str2, str3);
                if (objW != null) {
                    try {
                        Object objInvoke2 = objW.getClass().getMethod("getType", null).invoke(objW, null);
                        if (objInvoke2 instanceof String) {
                            str5 = (String) objInvoke2;
                        }
                        Object objInvoke3 = objW.getClass().getMethod("getMessage", null).invoke(objW, null);
                        if (objInvoke3 != null) {
                            strValueOf = String.valueOf(objInvoke3);
                        }
                    } catch (Throwable unused3) {
                    }
                } else if (!zHasExtra2) {
                    if (intent != null) {
                        try {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                extras.keySet().toString();
                            }
                        } catch (Throwable th) {
                            StringBuilder sb2 = new StringBuilder("unreadable(");
                            sb2.append(th);
                            sb2.append(")");
                        }
                    }
                    if (intent2 != null) {
                        if (zEquals) {
                            str4 = f240152q;
                        }
                        try {
                            intent2.hasExtra(str4);
                        } catch (Throwable unused4) {
                        }
                    }
                    c5691aY.f239861a.getClass();
                }
                q(objInvoke, str5, strValueOf);
            }
        } catch (Throwable th2) {
            Log.getStackTraceString(th2);
        }
    }

    public static List<Object> s(Map<String, Object> map, c cVar, List<?> list) {
        String str = cVar.f240169b;
        Object obj = str == null ? null : map.get(str);
        if (obj != null) {
            return Collections.singletonList(obj);
        }
        if (list != null) {
            list.size();
        }
        return list == null ? new ArrayList() : new ArrayList(list);
    }

    public static Set<String> t(Context context, ServiceInfo serviceInfo) {
        XmlResourceParser xmlResourceParserLoadXmlMetaData;
        HashSet hashSet = new HashSet();
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                xmlResourceParserLoadXmlMetaData = serviceInfo.loadXmlMetaData(context.getPackageManager(), f240140e);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
        }
        if (xmlResourceParserLoadXmlMetaData == null) {
            if (xmlResourceParserLoadXmlMetaData != null) {
                try {
                    xmlResourceParserLoadXmlMetaData.close();
                } catch (Throwable unused3) {
                }
                return hashSet;
            }
            return hashSet;
        }
        while (true) {
            try {
                int next = xmlResourceParserLoadXmlMetaData.next();
                if (next == 1) {
                    xmlResourceParserLoadXmlMetaData.close();
                    return hashSet;
                }
                if (next == 2 && "capability".equals(xmlResourceParserLoadXmlMetaData.getName())) {
                    String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue("http://schemas.android.com/apk/res/android", "name");
                    if (attributeValue == null) {
                        attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
                    }
                    if (attributeValue != null) {
                        hashSet.add(attributeValue);
                    }
                }
            } catch (Throwable unused4) {
                xmlResourceParser = xmlResourceParserLoadXmlMetaData;
                try {
                    String str = serviceInfo.name;
                    if (xmlResourceParser != null) {
                        xmlResourceParser.close();
                    }
                    return hashSet;
                } catch (Throwable th) {
                    if (xmlResourceParser != null) {
                        try {
                            xmlResourceParser.close();
                        } catch (Throwable unused5) {
                        }
                    }
                    throw th;
                }
            }
        }
    }

    public static List<d> u(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) v(context);
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            d dVar = (d) obj;
            if (dVar.b(str)) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public static List<d> v(Context context) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        String[] strArr = {f240138c, f240139d};
        for (int i10 = 0; i10 < 2; i10++) {
            List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent(strArr[i10]), 128);
            if (listQueryIntentServices != null) {
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    if (serviceInfo != null) {
                        String str = serviceInfo.packageName;
                        String str2 = serviceInfo.name;
                        if (hashSet.add(str + RemoteSettings.FORWARD_SLASH_STRING + str2) && C5714x.j().Q(str)) {
                            ("com.google.android.gms".equals(str) ? arrayList : arrayList2).add(new d(str, str2, t(context, resolveInfo.serviceInfo)));
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public static Object w(Intent intent, String str, String str2) {
        Class<?> cls;
        if (intent == null) {
            return null;
        }
        try {
            intent.setExtrasClassLoader(i.class.getClassLoader());
        } catch (Throwable unused) {
        }
        try {
            cls = Class.forName(str2);
        } catch (Throwable unused2) {
            cls = null;
        }
        if (cls != null) {
            try {
                Object objInvoke = Intent.class.getMethod("getSerializableExtra", String.class, Class.class).invoke(intent, str, cls);
                if (objInvoke != null) {
                    return objInvoke;
                }
            } catch (Throwable unused3) {
            }
        }
        try {
            return intent.getSerializableExtra(str);
        } catch (Throwable unused4) {
            return null;
        }
    }

    public static void x(PendingIntent pendingIntent, Object obj, String str, String str2, Parcelable parcelable) {
        try {
            Intent intent = new Intent();
            intent.putExtra(str2, parcelable);
            Bundle bundle = new Bundle();
            bundle.putBinder(f240156u, ((IInterface) obj).asBinder());
            bundle.putString(f240157v, str);
            intent.putExtra(f240155t, bundle);
            IBinder iIntentSenderBinder = PendingIntentCompat2.Util.getIIntentSenderBinder(PendingIntentCompat2.Util.getMTarget(pendingIntent));
            if (iIntentSenderBinder != null) {
                g.s0.f202897d.put(iIntentSenderBinder, intent);
            }
            z(intent, str2, parcelable);
        } catch (Throwable th) {
            Log.getStackTraceString(th);
        }
    }

    public static void y(Intent intent, String str, String str2) {
        if (intent == null) {
            return;
        }
        try {
            Class<?> cls = Class.forName(str2);
            intent.setExtrasClassLoader(cls.getClassLoader());
            try {
                Intent.class.getMethod("getParcelableExtra", String.class, Class.class).invoke(intent, str, cls);
            } catch (NoSuchMethodException unused) {
                intent.getParcelableExtra(str);
            }
            intent.hasExtra(str);
        } catch (Throwable unused2) {
        }
    }

    public static void z(Intent intent, String str, Parcelable parcelable) {
        Parcel parcelObtain;
        try {
            parcelObtain = Parcel.obtain();
            try {
                intent.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                Intent intent2 = (Intent) Intent.CREATOR.createFromParcel(parcelObtain);
                intent2.setExtrasClassLoader(parcelable.getClass().getClassLoader());
                try {
                    Intent.class.getMethod("getParcelableExtra", String.class, Class.class).invoke(intent2, str, parcelable.getClass());
                } catch (NoSuchMethodException unused) {
                    intent2.getParcelableExtra(str);
                }
            } catch (Throwable th) {
                th = th;
                try {
                    Log.getStackTraceString(th);
                } finally {
                    if (parcelObtain != null) {
                        parcelObtain.recycle();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            parcelObtain = null;
        }
    }

    public class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BlockingQueue f240160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f240161b;

        public a(BlockingQueue blockingQueue, Object obj) {
            this.f240160a = blockingQueue;
            this.f240161b = obj;
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            this.f240160a.offer(this.f240161b);
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            this.f240160a.offer(this.f240161b);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f240160a.offer(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
