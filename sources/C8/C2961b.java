package c8;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import c7.I;
import c7.m;
import com.prism.gaia.naked.metadata.android.safetycenter.ISafetyCenterManagerCAG;
import e.T;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: c8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@T(33)
public class C2961b extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f131283e = "safety_center";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f131284f = {"setSafetySourceData", "reportSafetySourceError", "refreshSafetySources", "refreshSpecificSafetySources", "dismissSafetyCenterIssue", "executeSafetyCenterIssueAction", "executeSafetyCenterIssueActionWithTaskId", "addOnSafetyCenterDataChangedListener", "removeOnSafetyCenterDataChangedListener", "clearAllSafetySourceDataForTests", "clearSafetyCenterConfigForTests", "setSafetyCenterConfigForTests"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f131285g = {"getSafetyCenterData", "getSafetySourceData", "getSafetyCenterConfig"};

    /* JADX INFO: renamed from: c8.b$a */
    public static class a extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f131286d;

        public a(String str) {
            this.f131286d = str;
        }

        @Override // c7.m
        public String A() {
            return this.f131286d;
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            try {
                return method.invoke(obj, objArr);
            } catch (Throwable th) {
                th = th;
                if ((th instanceof InvocationTargetException) && th.getCause() != null) {
                    th = th.getCause();
                }
                if (th instanceof SecurityException) {
                    return null;
                }
                throw th;
            }
        }
    }

    @Override // c7.E
    public void d(@NonNull C2953e<IInterface> c2953e) {
        c2953e.f(new I("isSafetyCenterEnabled", Boolean.FALSE));
        for (String str : f131284f) {
            c2953e.f(new I(str, null));
        }
        for (String str2 : f131285g) {
            c2953e.f(new a(str2));
        }
    }

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        return ISafetyCenterManagerCAG.T33.Stub.asInterface().call(iBinder);
    }

    @Override // c7.E
    public String l() {
        return f131283e;
    }
}
