package d8;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.e;
import com.prism.gaia.naked.compat.android.os.ServiceManagerCompat2;

/* JADX INFO: renamed from: d8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C4304b implements u8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f194896a = "asdf-".concat(C4304b.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[][] f194897b = {new String[]{"statsmanager", "android.os.IStatsManagerService"}};

    /* JADX INFO: renamed from: d8.b$a */
    public static final class a extends Binder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f194898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f194899b;

        public a(String str, String str2) {
            this.f194898a = str;
            this.f194899b = str2;
        }

        @Override // android.os.Binder, android.os.IBinder
        public String getInterfaceDescriptor() {
            return this.f194899b;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1598968902 && i10 != 1599098439) {
                if (parcel2 != null) {
                    parcel2.writeException(new SecurityException(e.a(new StringBuilder(), this.f194898a, " is not available to this app")));
                }
                return true;
            }
            if (parcel2 != null && i10 == 1598968902) {
                parcel2.writeString(this.f194899b);
            }
            return true;
        }
    }

    @Override // u8.b
    public boolean a(String str) {
        return false;
    }

    @Override // u8.b
    public void b() throws Throwable {
        IBinder service;
        for (String[] strArr : f194897b) {
            try {
                service = ServiceManagerCompat2.Util.getService(strArr[0]);
            } catch (Throwable unused) {
                service = null;
            }
            if (service == null) {
                ServiceManagerCompat2.Util.putService(strArr[0], new a(strArr[0], strArr[1]));
                String str = strArr[0];
            }
        }
    }

    @Override // u8.b
    public Object c() {
        return getClass();
    }
}
