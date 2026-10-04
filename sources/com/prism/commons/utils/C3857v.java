package com.prism.commons.utils;

import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.commons.exception.UnknownException;

/* JADX INFO: renamed from: com.prism.commons.utils.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3857v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f162157a = l0.b(C3857v.class.getSimpleName());

    /* JADX INFO: renamed from: com.prism.commons.utils.v$a */
    public interface a {
        void a(Throwable th);
    }

    /* JADX INFO: renamed from: com.prism.commons.utils.v$b */
    public interface b<T> {
        T a();
    }

    public static <T> T a(@NonNull b<T> bVar) {
        return (T) b(bVar, null);
    }

    public static <T> T b(@NonNull b<T> bVar, @Nullable a aVar) {
        try {
            return bVar.a();
        } catch (Throwable th) {
            I.d(f162157a, "doFunctionSafe with exp: " + th.getMessage(), th);
            if (aVar == null) {
                return null;
            }
            aVar.a(th);
            return null;
        }
    }

    public static Throwable c(Parcel parcel) {
        String string = parcel.readString();
        String string2 = parcel.readString();
        int i10 = parcel.readInt();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            stackTraceElementArr[i11] = e(parcel);
        }
        Throwable thC = parcel.readInt() == 1 ? c(parcel) : null;
        try {
            Class<?> cls = Class.forName(string);
            try {
                if (string2 != null) {
                    if (thC != null) {
                        Throwable th = (Throwable) cls.getDeclaredConstructor(String.class, Throwable.class).newInstance(string2, thC);
                        th.setStackTrace(stackTraceElementArr);
                        return th;
                    }
                    Throwable th2 = (Throwable) cls.getDeclaredConstructor(String.class).newInstance(string2);
                    th2.setStackTrace(stackTraceElementArr);
                    return th2;
                }
                if (thC != null) {
                    Throwable th3 = (Throwable) cls.getDeclaredConstructor(Throwable.class).newInstance(thC);
                    th3.setStackTrace(stackTraceElementArr);
                    return th3;
                }
                Throwable th4 = (Throwable) cls.getDeclaredConstructor(null).newInstance(null);
                th4.setStackTrace(stackTraceElementArr);
                return th4;
            } catch (Throwable unused) {
                UnknownException unknownException = new UnknownException(string2, thC);
                unknownException.setStackTrace(stackTraceElementArr);
                return unknownException;
            }
        } catch (ClassNotFoundException unused2) {
            UnknownException unknownException2 = new UnknownException(string2, thC);
            unknownException2.setStackTrace(stackTraceElementArr);
            return unknownException2;
        }
    }

    public static void d(Parcel parcel, Throwable th) {
        parcel.writeString(th.getClass().getCanonicalName());
        parcel.writeString(th.getMessage());
        StackTraceElement[] stackTrace = th.getStackTrace();
        parcel.writeInt(stackTrace.length);
        for (StackTraceElement stackTraceElement : stackTrace) {
            f(parcel, stackTraceElement);
        }
        Throwable cause = th.getCause();
        if (cause == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            d(parcel, cause);
        }
    }

    public static StackTraceElement e(Parcel parcel) {
        return new StackTraceElement(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
    }

    public static void f(Parcel parcel, StackTraceElement stackTraceElement) {
        parcel.writeString(stackTraceElement.getClassName());
        parcel.writeString(stackTraceElement.getMethodName());
        parcel.writeString(stackTraceElement.getFileName());
        parcel.writeInt(stackTraceElement.getLineNumber());
    }
}
