package R7;

import android.os.storage.StorageVolume;
import c7.m;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.client.natives.NativeMirror;
import com.prism.gaia.naked.metadata.android.os.storage.StorageVolumeCAG;
import java.io.File;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: R7.a$a, reason: collision with other inner class name */
    public static class C0104a extends m {
        @Override // c7.m
        public String A() {
            return "getCacheQuotaBytes";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            objArr[1] = Integer.valueOf(m.F());
            return method.invoke(obj, objArr);
        }
    }

    public static class b extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f67743d = "asdf-".concat(b.class.getSimpleName());

        @Override // c7.m
        public String A() {
            return "getVolumeList";
        }

        @Override // c7.m
        public boolean b(Object obj, Method method, Object... objArr) {
            if (objArr != null && objArr.length != 0) {
                if (objArr[0] instanceof Integer) {
                    if (C3841e.D()) {
                        objArr[0] = Integer.valueOf(m.G());
                    } else {
                        objArr[0] = Integer.valueOf(m.F());
                    }
                }
                t8.b.e(objArr);
            }
            return true;
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Object objInvoke = method.invoke(obj, objArr);
            StorageVolume[] storageVolumeArr = (StorageVolume[]) objInvoke;
            if (storageVolumeArr == null || storageVolumeArr.length < 1) {
                return objInvoke;
            }
            try {
                StorageVolumeCAG.f165926G.mPath().set(storageVolumeArr[0], D9.d.H(m.q()));
                if (C3841e.v()) {
                    StorageVolumeCAG.P28.mInternalPath().set(storageVolumeArr[0], D9.d.H(m.q()));
                }
                StorageVolumeCAG.f165926G.mState().set(storageVolumeArr[0], "mounted");
            } catch (Exception unused) {
            }
            return storageVolumeArr;
        }
    }

    public static class c extends m {
        @Override // c7.m
        public String A() {
            return "getVolumeState";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return D9.d.H(m.q()).getPath().equals((String) objArr[0]) ? "mounted" : method.invoke(obj, objArr);
        }
    }

    public static class d extends m {
        @Override // c7.m
        public String A() {
            return "mkdirs";
        }

        @Override // c7.m
        public boolean b(Object obj, Method method, Object... objArr) {
            t8.b.e(objArr);
            return true;
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            File file = new File(NativeMirror.tempRedirectPath(objArr.length == 1 ? (String) objArr[0] : (String) objArr[1]));
            return (file.exists() || file.mkdirs()) ? 0 : -1;
        }
    }
}
