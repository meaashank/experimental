package com.inmobi.media;

import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import java.lang.reflect.Method;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ScheduledExecutorService f151826a = Executors.newSingleThreadScheduledExecutor();

    public static final String a(Thread thread, Throwable error) {
        kotlin.jvm.internal.G.p(error, "error");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", error.getClass().getSimpleName());
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, error.getMessage());
            jSONObject.put("stack", Log.getStackTraceString(error));
            if (thread != null) {
                jSONObject.put("thread", thread.getName());
            }
            String string = jSONObject.toString();
            kotlin.jvm.internal.G.o(string, "toString(...)");
            return string;
        } catch (JSONException e10) {
            e10.toString();
            return "";
        }
    }

    public static final boolean b(StackTraceElement[] stackTraceElementArr) {
        kotlin.jvm.internal.G.p(stackTraceElementArr, "<this>");
        Regex regex = new Regex("com\\.inmobi\\.(media|ads|commons|unification|sdk|unifiedId|adquality|compliance)");
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (a(stackTraceElement, InMobiInterstitial.a.class.getSuperclass()) || a(stackTraceElement, InMobiInterstitial.a.class) || a(stackTraceElement, InMobiNative.NativeCallbacks.class) || a(stackTraceElement, InMobiBanner.a.class) || a(stackTraceElement, InMobiBanner.a.class.getSuperclass()) || (kotlin.jvm.internal.G.g(stackTraceElement.getClassName(), InMobiSdk.class.getName()) && kotlin.jvm.internal.G.g(stackTraceElement.getMethodName(), InMobiSdk.class.getDeclaredMethod("a", SdkInitializationListener.class, String.class).getName()))) {
                break;
            }
            String className = stackTraceElement.getClassName();
            kotlin.jvm.internal.G.o(className, "getClassName(...)");
            if (kotlin.text.M.p3(className, Q2.class.getName(), false, 2, null)) {
                break;
            }
            String className2 = stackTraceElement.getClassName();
            kotlin.jvm.internal.G.o(className2, "getClassName(...)");
            if (regex.c(className2)) {
                return true;
            }
        }
        return false;
    }

    public static final String a(StackTraceElement[] stackTraceElementArr) {
        kotlin.jvm.internal.G.p(stackTraceElementArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb2.append(stackTraceElement.toString());
            sb2.append('\n');
        }
        String string = sb2.toString();
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }

    public static final boolean a(C3525e5 c3525e5) {
        kotlin.jvm.internal.G.p(c3525e5, "<this>");
        if (c3525e5 instanceof R2) {
            StackTraceElement[] stackTraceElementArr = ((R2) c3525e5).f152406g;
            if (stackTraceElementArr != null) {
                return b(stackTraceElementArr);
            }
            kotlin.jvm.internal.G.S("stackTrace");
            throw null;
        }
        if (c3525e5 instanceof P0) {
            P0 p02 = (P0) c3525e5;
            if (p02.f152365g != 6) {
                return false;
            }
            return new Regex("com\\.inmobi\\.(media|ads|commons|unification|sdk|unifiedId|adquality|compliance)").c(p02.f152366h);
        }
        if (c3525e5 instanceof ed) {
            return b(((ed) c3525e5).f152891g);
        }
        return false;
    }

    public static final boolean a(StackTraceElement stackTraceElement, Class cls) {
        kotlin.jvm.internal.G.p(stackTraceElement, "<this>");
        if (cls != null && kotlin.jvm.internal.G.g(stackTraceElement.getClassName(), cls.getName())) {
            Method[] declaredMethods = PublisherCallbacks.class.getDeclaredMethods();
            kotlin.jvm.internal.G.o(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (kotlin.jvm.internal.G.g(stackTraceElement.getMethodName(), method.getName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
