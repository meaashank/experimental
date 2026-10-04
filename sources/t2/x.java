package T2;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.collection.N0;
import androidx.room.K0;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class x {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f68280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f68281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f68282d;

        static {
            int[] iArr = new int[OutOfQuotaPolicy.values().length];
            f68282d = iArr;
            try {
                iArr[OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68282d[OutOfQuotaPolicy.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[NetworkType.values().length];
            f68281c = iArr2;
            try {
                iArr2[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68281c[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68281c[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f68281c[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f68281c[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[BackoffPolicy.values().length];
            f68280b = iArr3;
            try {
                iArr3[BackoffPolicy.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f68280b[BackoffPolicy.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[WorkInfo.State.values().length];
            f68279a = iArr4;
            try {
                iArr4[WorkInfo.State.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f68279a[WorkInfo.State.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f68279a[WorkInfo.State.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f68279a[WorkInfo.State.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f68279a[WorkInfo.State.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f68279a[WorkInfo.State.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f68283a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f68284b = 1;
    }

    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f68285a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f68286b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f68287c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f68288d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f68289e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f68290f = 5;
    }

    public interface d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f68291a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f68292b = 1;
    }

    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f68293a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f68294b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f68295c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f68296d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f68297e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f68298f = 5;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f68299g = "(2, 3, 5)";
    }

    @K0
    public static int a(BackoffPolicy backoffPolicy) {
        int i10 = a.f68280b[backoffPolicy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + backoffPolicy + " to int");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.room.K0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.b b(byte[] r6) throws java.lang.Throwable {
        /*
            androidx.work.b r0 = new androidx.work.b
            r0.<init>()
            if (r6 != 0) goto L8
            goto L56
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            int r6 = r2.readInt()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
        L17:
            if (r6 <= 0) goto L2f
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            r0.a(r3, r4)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            int r6 = r6 + (-1)
            goto L17
        L2b:
            r6 = move-exception
            goto L57
        L2d:
            r6 = move-exception
            goto L48
        L2f:
            r2.close()     // Catch: java.io.IOException -> L33
            goto L37
        L33:
            r6 = move-exception
            r6.printStackTrace()
        L37:
            r1.close()     // Catch: java.io.IOException -> L3b
            goto L56
        L3b:
            r6 = move-exception
            r6.printStackTrace()
            goto L56
        L40:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L57
        L44:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L48:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L37
            r2.close()     // Catch: java.io.IOException -> L51
            goto L37
        L51:
            r6 = move-exception
            r6.printStackTrace()
            goto L37
        L56:
            return r0
        L57:
            if (r2 == 0) goto L61
            r2.close()     // Catch: java.io.IOException -> L5d
            goto L61
        L5d:
            r0 = move-exception
            r0.printStackTrace()
        L61:
            r1.close()     // Catch: java.io.IOException -> L65
            goto L69
        L65:
            r0 = move-exception
            r0.printStackTrace()
        L69:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.x.b(byte[]):androidx.work.b");
    }

    @K0
    public static byte[] c(androidx.work.b triggers) throws Throwable {
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        if (triggers.f120256a.size() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            objectOutputStream.writeInt(triggers.f120256a.size());
            for (b.a aVar : triggers.f120256a) {
                objectOutputStream.writeUTF(aVar.f120257a.toString());
                objectOutputStream.writeBoolean(aVar.f120258b);
            }
            try {
                objectOutputStream.close();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        } catch (IOException e12) {
            e = e12;
            objectOutputStream2 = objectOutputStream;
            e.printStackTrace();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e15) {
                e15.printStackTrace();
                throw th;
            }
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException e16) {
            e16.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    @K0
    public static BackoffPolicy d(int value) {
        if (value == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (value == 1) {
            return BackoffPolicy.LINEAR;
        }
        throw new IllegalArgumentException(N0.a("Could not convert ", value, " to BackoffPolicy"));
    }

    @K0
    public static NetworkType e(int value) {
        if (value == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (value == 1) {
            return NetworkType.CONNECTED;
        }
        if (value == 2) {
            return NetworkType.UNMETERED;
        }
        if (value == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (value == 4) {
            return NetworkType.METERED;
        }
        if (Build.VERSION.SDK_INT < 30 || value != 5) {
            throw new IllegalArgumentException(N0.a("Could not convert ", value, " to NetworkType"));
        }
        return NetworkType.TEMPORARILY_UNMETERED;
    }

    @NonNull
    @K0
    public static OutOfQuotaPolicy f(int value) {
        if (value == 0) {
            return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (value == 1) {
            return OutOfQuotaPolicy.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException(N0.a("Could not convert ", value, " to OutOfQuotaPolicy"));
    }

    @K0
    public static WorkInfo.State g(int value) {
        if (value == 0) {
            return WorkInfo.State.ENQUEUED;
        }
        if (value == 1) {
            return WorkInfo.State.RUNNING;
        }
        if (value == 2) {
            return WorkInfo.State.SUCCEEDED;
        }
        if (value == 3) {
            return WorkInfo.State.FAILED;
        }
        if (value == 4) {
            return WorkInfo.State.BLOCKED;
        }
        if (value == 5) {
            return WorkInfo.State.CANCELLED;
        }
        throw new IllegalArgumentException(N0.a("Could not convert ", value, " to State"));
    }

    @K0
    public static int h(NetworkType networkType) {
        int i10 = a.f68281c[networkType.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    @K0
    public static int i(@NonNull OutOfQuotaPolicy policy) {
        int i10 = a.f68282d[policy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + policy + " to int");
    }

    @K0
    public static int j(WorkInfo.State state) {
        switch (a.f68279a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + state + " to int");
        }
    }
}
