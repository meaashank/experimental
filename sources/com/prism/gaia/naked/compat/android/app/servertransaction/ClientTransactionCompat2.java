package com.prism.gaia.naked.compat.android.app.servertransaction;

import W6.c;
import android.os.Bundle;
import android.os.IBinder;
import com.prism.gaia.naked.core.ClassAccessorUtils;
import com.prism.gaia.naked.metadata.android.app.servertransaction.ClientTransactionCAG;
import com.prism.gaia.server.accounts.b;
import java.lang.reflect.Field;
import java.util.List;
import v8.C5705o;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ClientTransactionCompat2 {

    public static class Util {
        public static List<Object> getActivityCallbacks(Object obj) {
            if (obj == null) {
                return null;
            }
            return ClientTransactionCAG.P28.mActivityCallbacks().get(obj);
        }

        public static IBinder getActivityTokenP28(Object obj) {
            if (obj == null) {
                return null;
            }
            try {
                return ClientTransactionCAG.P28.mActivityToken().get(obj);
            } catch (Throwable th) {
                Bundle bundle = new Bundle();
                StringBuilder sb2 = new StringBuilder();
                Class<?> clsClassForName = ClassAccessorUtils.classForName("android.app.servertransaction.ClientTransaction");
                if (clsClassForName != null) {
                    Field[] declaredFields = clsClassForName.getDeclaredFields();
                    if (declaredFields != null && declaredFields.length > 0) {
                        sb2.append("ClientTransaction.count=");
                        sb2.append(declaredFields.length);
                        sb2.append(b.f166434b0);
                        for (Field field : declaredFields) {
                            sb2.append(field.getName());
                        }
                    }
                } else {
                    sb2.append("Class.forName(android.app.servertransaction.ClientTransaction) return null");
                }
                bundle.putString("info", sb2.toString());
                C5705o.c().a(th, "getActivityTokenP28", bundle);
                throw th;
            }
        }
    }
}
