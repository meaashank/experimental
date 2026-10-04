package j8;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import c7.m;
import com.prism.gaia.naked.metadata.android.net.ITetheringConnectorCAG;
import e.T;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: j8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@T(30)
public class C4793a extends E {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f214200f = "tethering";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f214201g = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f214199e = "asdf-".concat(C4793a.class.getSimpleName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f214202h = {"isTetheringSupported", "setPreferTestNetworks", "setUsbTethering", "tether", "untether"};

    /* JADX INFO: renamed from: j8.a$a, reason: collision with other inner class name */
    public static class C0811a extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f214203d;

        public C0811a(String str) {
            this.f214203d = str;
        }

        @Override // c7.m
        public String A() {
            return this.f214203d;
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Object obj2 = (objArr == null || objArr.length <= 0) ? null : objArr[objArr.length - 1];
            if (obj2 instanceof IInterface) {
                try {
                    obj2.getClass().getMethod("onResult", Integer.TYPE).invoke(obj2, 3);
                    String unused = C4793a.f214199e;
                    return null;
                } catch (Throwable unused2) {
                    String unused3 = C4793a.f214199e;
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @Override // c7.E
    public void d(@NonNull C2953e<IInterface> c2953e) {
        for (String str : f214202h) {
            c2953e.f(new C0811a(str));
        }
    }

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return ITetheringConnectorCAG.R30.Stub.asInterface().call(iBinder);
    }

    @Override // c7.E
    public String l() {
        return f214200f;
    }
}
