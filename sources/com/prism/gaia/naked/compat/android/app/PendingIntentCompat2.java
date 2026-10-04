package com.prism.gaia.naked.compat.android.app;

import W6.c;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.prism.commons.exception.GaiaRuntimeException;
import com.prism.gaia.naked.compat.android.content.IIntentSenderCompat2;
import com.prism.gaia.naked.compat.android.content.IntentSenderCompat2;
import com.prism.gaia.naked.metadata.android.app.PendingIntentCAG;
import java.lang.reflect.Field;
import v8.C5705o;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class PendingIntentCompat2 {

    public static class Util {
        public static IBinder getIIntentSenderBinder(Object obj) {
            if (obj == null) {
                return null;
            }
            if (IIntentSenderCompat2.Util.isInstanceOf(obj)) {
                return ((IInterface) obj).asBinder();
            }
            if (obj instanceof IntentSender) {
                return IntentSenderCompat2.Util.getTargetAsBinder((IntentSender) obj);
            }
            C5705o.c().a(new GaiaRuntimeException("reflect IntentSender failed"), "REFLECT_FAILED", null);
            return null;
        }

        public static IInterface getMTarget(PendingIntent pendingIntent) {
            try {
                return PendingIntentCAG.f165369G.mTarget().get(pendingIntent);
            } catch (Throwable th) {
                Field[] declaredFields = pendingIntent.getClass().getDeclaredFields();
                Bundle bundle = new Bundle();
                StringBuilder sb2 = new StringBuilder();
                if (declaredFields == null || declaredFields.length <= 0) {
                    sb2.append("fieldcount=0");
                } else {
                    sb2.append("field count:");
                    sb2.append(declaredFields.length);
                    for (Field field : declaredFields) {
                        sb2.append("f-> ");
                        sb2.append(field.getName());
                        sb2.append(",");
                    }
                }
                bundle.putString("info", sb2.toString());
                C5705o.c().a(th, "getMTarget", bundle);
                return null;
            }
        }
    }
}
