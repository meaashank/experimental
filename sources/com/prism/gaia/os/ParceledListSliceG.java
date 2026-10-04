package com.prism.gaia.os;

import C4.q;
import Z3.f;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes6.dex */
public class ParceledListSliceG<T extends Parcelable> implements Parcelable {
    public static final Parcelable.ClassLoaderCreator<ParceledListSliceG> CREATOR = new a();
    private static boolean DEBUG = false;
    private static final int LARGE_ELEMENT_BYTES = 131072;
    private static final int MAX_FIRST_IPC_SIZE = 131072;
    private static final int MAX_IPC_SIZE = 262144;
    private static final String TAG = "ParceledListSlice";
    private final List<T> mList;

    public class a implements Parcelable.ClassLoaderCreator<ParceledListSliceG> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ParceledListSliceG createFromParcel(Parcel parcel) {
            return new ParceledListSliceG(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ParceledListSliceG createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ParceledListSliceG(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ParceledListSliceG[] newArray(int i10) {
            return new ParceledListSliceG[i10];
        }
    }

    public class b extends Binder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f166020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f166021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f166022c;

        public b(int i10, Class cls, int i11) {
            this.f166020a = i10;
            this.f166021b = cls;
            this.f166022c = i11;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            int i12 = parcel.readInt();
            while (i12 < this.f166020a && parcel2.dataSize() < 262144) {
                parcel2.writeInt(1);
                Parcelable parcelable = (Parcelable) ParceledListSliceG.this.mList.get(i12);
                ParceledListSliceG.verifySameType(this.f166021b, parcelable.getClass());
                int iDataSize = parcel2.dataSize();
                parcel2.writeParcelable(parcelable, this.f166022c);
                ParceledListSliceG.reportIfOversized(i12, this.f166020a, parcel2.dataSize() - iDataSize, parcelable, "retriever");
                if (ParceledListSliceG.DEBUG) {
                    Objects.toString(ParceledListSliceG.this.mList.get(i12));
                }
                i12++;
            }
            if (i12 < this.f166020a) {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    private static String breakdown(Object obj) {
        String[] strArr = {"activities", "services", "receivers", "providers", f.f79420q, "requestedPermissions", "signatures", "configPreferences", "reqFeatures"};
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 9; i10++) {
            String str = strArr[i10];
            try {
                Object obj2 = obj.getClass().getField(str).get(obj);
                int length = obj2 == null ? 0 : Array.getLength(obj2);
                if (length > 0) {
                    sb2.append(sb2.length() == 0 ? " [" : q.f17581a);
                    sb2.append(str);
                    sb2.append(SignatureVisitor.INSTANCEOF);
                    sb2.append(length);
                }
            } catch (Throwable unused) {
            }
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.append(']');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reportIfOversized(int i10, int i11, int i12, Object obj, String str) {
        if (i12 <= 131072 || obj == null) {
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        try {
            Object obj2 = obj.getClass().getField("packageName").get(obj);
            if (obj2 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(simpleName);
                sb2.append("(");
                sb2.append(obj2);
                sb2.append(")");
            }
        } catch (Throwable unused) {
        }
        breakdown(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void verifySameType(Class<?> cls, Class<?> cls2) {
        if (cls2.equals(cls)) {
            return;
        }
        throw new IllegalArgumentException("Can't unparcel type " + cls2.getName() + " in list of type " + cls.getName());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        int iDescribeContents = 0;
        for (int i10 = 0; i10 < this.mList.size(); i10++) {
            iDescribeContents |= this.mList.get(i10).describeContents();
        }
        return iDescribeContents;
    }

    public List<T> getList() {
        return this.mList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.mList.size();
        parcel.writeInt(size);
        if (size > 0) {
            Class<?> cls = this.mList.get(0).getClass();
            int i11 = 0;
            while (i11 < size && parcel.dataSize() < 131072) {
                parcel.writeInt(1);
                T t10 = this.mList.get(i11);
                verifySameType(cls, t10.getClass());
                int iDataSize = parcel.dataSize();
                parcel.writeParcelable(t10, i10);
                reportIfOversized(i11, size, parcel.dataSize() - iDataSize, t10, "first chunk");
                if (DEBUG) {
                    Objects.toString(this.mList.get(i11));
                }
                i11++;
            }
            if (parcel.dataSize() > 262144) {
                parcel.dataSize();
                parcel.dataSize();
            }
            if (i11 < size) {
                parcel.writeInt(0);
                parcel.writeStrongBinder(new b(size, cls, i10));
            }
        }
    }

    public ParceledListSliceG(List<T> list) {
        this.mList = list;
    }

    private ParceledListSliceG(Parcel parcel, ClassLoader classLoader) {
        int i10 = parcel.readInt();
        this.mList = new ArrayList(i10);
        if (i10 <= 0) {
            return;
        }
        Class<?> cls = null;
        int i11 = 0;
        while (i11 < i10 && parcel.readInt() != 0) {
            Parcelable parcelable = parcel.readParcelable(classLoader);
            if (cls == null) {
                cls = parcelable.getClass();
            } else {
                verifySameType(cls, parcelable.getClass());
            }
            this.mList.add((T) parcelable);
            if (DEBUG) {
                List<T> list = this.mList;
                Objects.toString(list.get(list.size() - 1));
            }
            i11++;
        }
        if (i11 >= i10) {
            return;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        while (i11 < i10) {
            if (DEBUG) {
                Objects.toString(strongBinder);
            }
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            parcelObtain.writeInt(i11);
            try {
                strongBinder.transact(1, parcelObtain, parcelObtain2, 0);
                while (i11 < i10 && parcelObtain2.readInt() != 0) {
                    Parcelable parcelable2 = parcelObtain2.readParcelable(classLoader);
                    verifySameType(cls, parcelable2.getClass());
                    this.mList.add((T) parcelable2);
                    if (DEBUG) {
                        List<T> list2 = this.mList;
                        Objects.toString(list2.get(list2.size() - 1));
                    }
                    i11++;
                }
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException unused) {
                return;
            }
        }
    }
}
