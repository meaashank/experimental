package com.prism.gaia.utils;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.prism.commons.utils.V;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable;
import com.prism.gaia.server.Gaia32bit64bitProvider;
import r6.i;
import r6.k;

/* JADX INFO: loaded from: classes6.dex */
public class GaiaPreferenceUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f167733a = "preferences_gaia";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static V f167734b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f167735c = "UPLOAD_INSTALLED_APP_TIME";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static i<Long> f167736d = new i<>(b(), f167735c, 0L, Long.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f167737e = "data_mode_33b";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static i<Integer> f167738f = new i<>(b(), f167737e, 0, Integer.class);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f167739g = "data_mode_33s";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static i<Integer> f167740h = new i<>(b(), f167739g, 0, Integer.class);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f167741i = "version_last_running";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static i<Integer> f167742j = new i<>(b(), f167741i, -1, Integer.class);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f167743a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f167744b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f167745c = 2;
    }

    public static int a(Context context) {
        return p6.i.b(context) ? ((Integer) ((k) f167738f.a(context)).o()).intValue() : new RemoteDataMode33b().start(Gaia32bit64bitProvider.g());
    }

    public static V b() {
        V v10 = f167734b;
        if (v10 != null) {
            return v10;
        }
        synchronized (GaiaPreferenceUtils.class) {
            try {
                V v11 = f167734b;
                if (v11 != null) {
                    return v11;
                }
                V v12 = new V("preferences_gaia");
                f167734b = v12;
                return v12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static class RemoteDataMode33b extends RemoteRunnable {
        public static final Parcelable.Creator<RemoteDataMode33b> CREATOR = new a();

        public class a implements Parcelable.Creator<RemoteDataMode33b> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public RemoteDataMode33b createFromParcel(Parcel parcel) {
                return new RemoteDataMode33b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public RemoteDataMode33b[] newArray(int i10) {
                return new RemoteDataMode33b[i10];
            }
        }

        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable
        public void onRemoteRun() throws Exception {
            setResultCode(((Integer) ((k) GaiaPreferenceUtils.f167738f.a(GaiaContext.j().n())).o()).intValue());
        }

        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
        }

        private RemoteDataMode33b() {
        }

        private RemoteDataMode33b(Parcel parcel) {
            super(parcel);
        }
    }
}
