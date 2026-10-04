package com.prism.commons.provider;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.prism.commons.utils.l0;
import java.io.Serializable;
import t6.C5616a;

/* JADX INFO: loaded from: classes5.dex */
public class ProviderCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f161982a = l0.b(ProviderCall.class.getSimpleName());

    public static final class Builder {
        private String arg;
        private String auth;
        private Bundle bundle = new Bundle();
        private Context context;
        private String method;

        public Builder(Context context, String str) {
            this.context = context;
            this.auth = str;
        }

        public Builder addArg(String str, Object obj) {
            if (obj == null) {
                return this;
            }
            if (obj instanceof Boolean) {
                this.bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                return this;
            }
            if (obj instanceof Integer) {
                this.bundle.putInt(str, ((Integer) obj).intValue());
                return this;
            }
            if (obj instanceof String) {
                this.bundle.putString(str, (String) obj);
                return this;
            }
            if (obj instanceof Serializable) {
                this.bundle.putSerializable(str, (Serializable) obj);
                return this;
            }
            if (obj instanceof Bundle) {
                this.bundle.putBundle(str, (Bundle) obj);
                return this;
            }
            if (obj instanceof Parcelable) {
                this.bundle.putParcelable(str, (Parcelable) obj);
                return this;
            }
            throw new IllegalArgumentException("Unknown type " + obj.getClass() + " in Bundle.");
        }

        public Builder arg(String str) {
            this.arg = str;
            return this;
        }

        public Bundle call() {
            return ProviderCall.a(this.context, this.auth, this.method, this.arg, this.bundle);
        }

        public Bundle callQuietly() {
            return ProviderCall.b(this.context, this.auth, this.method, this.arg, this.bundle);
        }

        public Builder methodName(String str) {
            this.method = str;
            return this;
        }
    }

    public static Bundle a(Context context, String str, String str2, String str3, Bundle bundle) {
        Log.d(f161982a, "call authority: " + str);
        return C5616a.c(context, Uri.parse("content://" + str), str2, str3, bundle);
    }

    public static Bundle b(Context context, String str, String str2, String str3, Bundle bundle) {
        Log.d(f161982a, "call authority: " + str);
        return C5616a.d(context, Uri.parse("content://" + str), str2, str3, bundle);
    }
}
