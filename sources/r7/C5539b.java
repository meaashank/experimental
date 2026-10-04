package r7;

import E8.d;
import android.content.AttributionSource;
import android.os.IBinder;
import android.os.IInterface;
import c7.AbstractC2950b;
import c7.C2953e;
import c7.m;
import c7.n;
import c7.o;
import c7.x;
import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.C3853q;
import com.prism.gaia.naked.compat.android.content.AttributionSourceCompat2;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: r7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5539b extends AbstractC2950b<IInterface> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f227262i = "asdf-".concat(C5539b.class.getSimpleName());

    /* JADX INFO: renamed from: r7.b$a */
    public static class a extends n {
        public a() {
            super("getAddress");
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return C3853q.f162131e;
        }
    }

    /* JADX INFO: renamed from: r7.b$b, reason: collision with other inner class name */
    public static class C0870b extends n {
        public C0870b() {
            super("registerAdapter");
        }

        public static Object w0(Object obj) throws IllegalAccessException {
            if (obj == null) {
                return null;
            }
            for (Field field : obj.getClass().getDeclaredFields()) {
                if (field.isSynthetic() && "android.bluetooth.BluetoothAdapter".equals(field.getType().getName())) {
                    field.setAccessible(true);
                    return field.get(obj);
                }
            }
            return null;
        }

        @Override // c7.m
        public Object a(Object obj, Method method, Object[] objArr, Object obj2) {
            IInterface iInterfaceT;
            if (C3841e.z() && m.Q()) {
                if (!(obj2 instanceof IBinder)) {
                    return (!(obj2 instanceof IInterface) || (iInterfaceT = C5539b.t((IInterface) obj2)) == null) ? obj2 : iInterfaceT;
                }
                IBinder iBinderS = C5539b.s((IBinder) obj2, true);
                return iBinderS == null ? obj2 : iBinderS;
            }
            return obj2;
        }

        @Override // c7.m
        public boolean b(Object obj, Method method, Object... objArr) {
            AttributionSource attributionSource;
            if (C3841e.z() && m.Q() && objArr != null && objArr.length != 0) {
                String strQ = m.q();
                String strW = m.w();
                if (strQ != null && strW != null && !strQ.equals(strW)) {
                    try {
                        Object objW0 = w0(objArr[0]);
                        if (objW0 == null) {
                            return true;
                        }
                        Field declaredField = objW0.getClass().getDeclaredField("mAttributionSource");
                        declaredField.setAccessible(true);
                        Object obj2 = declaredField.get(objW0);
                        if (!o.a(obj2) || !strQ.equals(b7.b.a(obj2).getPackageName())) {
                            return true;
                        }
                        try {
                            attributionSource = m.v().getAttributionSource();
                        } catch (Throwable unused) {
                            String unused2 = C5539b.f227262i;
                            attributionSource = null;
                        }
                        if (attributionSource == null || !strW.equals(attributionSource.getPackageName())) {
                            AttributionSource attributionSourceWithPackageName = AttributionSourceCompat2.Util.withPackageName(b7.b.a(obj2), strW);
                            if (attributionSourceWithPackageName != null) {
                                declaredField.set(objW0, attributionSourceWithPackageName);
                                String unused3 = C5539b.f227262i;
                            }
                        } else {
                            declaredField.set(objW0, attributionSource);
                            String unused4 = C5539b.f227262i;
                            attributionSource.getPackageName();
                        }
                    } catch (Throwable unused5) {
                        String unused6 = C5539b.f227262i;
                    }
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: r7.b$c */
    public static class c extends n {
        public c(String str) {
            super(str);
        }

        @Override // c7.m
        public Object a(Object obj, Method method, Object[] objArr, Object obj2) {
            IInterface iInterfaceT;
            if (!(obj2 instanceof IBinder)) {
                return (!(obj2 instanceof IInterface) || (iInterfaceT = C5539b.t((IInterface) obj2)) == null) ? obj2 : iInterfaceT;
            }
            IBinder iBinderS = C5539b.s((IBinder) obj2, false);
            return iBinderS == null ? obj2 : iBinderS;
        }
    }

    public C5539b(IInterface iInterface) {
        super(iInterface);
    }

    public static IBinder s(IBinder iBinder, boolean z10) {
        if (iBinder == null) {
            return null;
        }
        try {
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (interfaceDescriptor != null && !interfaceDescriptor.isEmpty()) {
                IInterface iInterface = (IInterface) Class.forName(interfaceDescriptor.concat("$Stub")).getMethod("asInterface", IBinder.class).invoke(null, iBinder);
                if (iInterface == null) {
                    return null;
                }
                C2953e c2953e = new C2953e(null, iInterface, null);
                c2953e.g(new x());
                if (z10) {
                    String[] strArr = {"getBluetoothGatt", "getBluetoothScan", "getProfile"};
                    for (int i10 = 0; i10 < 3; i10++) {
                        c2953e.f(new c(strArr[i10]));
                    }
                }
                return new d(iBinder, (IInterface) c2953e.f131257f);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static IInterface t(IInterface iInterface) {
        if (iInterface == null) {
            return null;
        }
        try {
            C2953e c2953e = new C2953e(null, iInterface, null);
            c2953e.g(new x());
            String[] strArr = {"getBluetoothGatt", "getBluetoothScan", "getProfile"};
            for (int i10 = 0; i10 < 3; i10++) {
                c2953e.f(new c(strArr[i10]));
            }
            return (IInterface) c2953e.f131257f;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // c7.AbstractC2950b
    public void r() {
        g(new x());
        f(new a());
        f(new C0870b());
        String[] strArr = {"getBluetoothGatt", "getBluetoothScan", "getProfile"};
        for (int i10 = 0; i10 < 3; i10++) {
            f(new c(strArr[i10]));
        }
    }
}
