package com.prism.gaia.naked.compat.android.compat;

import com.prism.commons.utils.C3841e;
import com.prism.gaia.naked.metadata.android.compat.CompatibilityCAG;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes6.dex */
public class CompatibilityCompat2 {

    public interface SCallbackProxy {
        boolean isChangeEnabled(Object obj, long j10);

        void reportChange(Object obj, long j10);
    }

    public static class Util {
        public static boolean isChangeEnabled(Object obj, long j10) {
            if (!C3841e.z()) {
                return false;
            }
            Boolean boolCall = CompatibilityCAG.S31.BehaviorChangeDelegate.isChangeEnabled().call(obj, Long.valueOf(j10));
            return boolCall == null || boolCall.booleanValue();
        }

        public static void proxySCallback(final SCallbackProxy sCallbackProxy) {
            if (C3841e.z()) {
                Class clsORG_CLASS = CompatibilityCAG.S31.BehaviorChangeDelegate.ORG_CLASS();
                final Object obj = CompatibilityCAG.S31.sCallbacks().get();
                Object objNewProxyInstance = Proxy.newProxyInstance(clsORG_CLASS.getClassLoader(), new Class[]{clsORG_CLASS}, new InvocationHandler() { // from class: com.prism.gaia.naked.compat.android.compat.CompatibilityCompat2.Util.1
                    @Override // java.lang.reflect.InvocationHandler
                    public Object invoke(Object obj2, Method method, Object[] objArr) throws Throwable {
                        if (!method.getName().equals("onChangeReported")) {
                            return method.getName().equals("isChangeEnabled") ? Boolean.valueOf(sCallbackProxy.isChangeEnabled(obj, ((Long) objArr[0]).longValue())) : method.invoke(obj, objArr);
                        }
                        sCallbackProxy.reportChange(obj, ((Long) objArr[0]).longValue());
                        return null;
                    }
                });
                CompatibilityCAG.S31.sCallbacks().set(objNewProxyInstance);
                CompatibilityCAG.S31.DEFAULT_CALLBACKS().set(objNewProxyInstance);
            }
        }

        public static void reportChange(Object obj, long j10) {
            if (C3841e.z()) {
                CompatibilityCAG.S31.BehaviorChangeDelegate.onChangeReported().call(obj, Long.valueOf(j10));
            }
        }
    }
}
