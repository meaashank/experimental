package com.bytedance.sdk.component.Ht.ZRu;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface Ht extends IInterface {
    int ZRu(Uri uri, ContentValues contentValues, String str, String[] strArr) throws RemoteException;

    int ZRu(Uri uri, String str, String[] strArr) throws RemoteException;

    String ZRu(Uri uri) throws RemoteException;

    String ZRu(Uri uri, ContentValues contentValues) throws RemoteException;

    Map ZRu(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws RemoteException;

    public static abstract class ZRu extends Binder implements Ht {
        public ZRu() {
            attachInterface(this, "com.bytedance.sdk.component.log.impl.IListenerEventManager");
        }

        public static Ht ZRu(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof Ht)) ? new C0403ZRu(iBinder) : (Ht) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                Map mapZRu = ZRu(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray(), parcel.readString(), parcel.createStringArray(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeMap(mapZRu);
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                String strZRu = ZRu(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeString(strZRu);
                return true;
            }
            if (i10 == 3) {
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                String strZRu2 = ZRu(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ContentValues) ContentValues.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeString(strZRu2);
                return true;
            }
            if (i10 == 4) {
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                int iZRu = ZRu(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                parcel2.writeInt(iZRu);
                return true;
            }
            if (i10 != 5) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                return true;
            }
            parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
            int iZRu2 = ZRu(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ContentValues) ContentValues.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.createStringArray());
            parcel2.writeNoException();
            parcel2.writeInt(iZRu2);
            return true;
        }

        public static Ht ZRu() {
            return C0403ZRu.ZRu;
        }

        /* JADX INFO: renamed from: com.bytedance.sdk.component.Ht.ZRu.Ht$ZRu$ZRu, reason: collision with other inner class name */
        public static class C0403ZRu implements Ht {
            public static Ht ZRu;
            private IBinder NOt;

            public C0403ZRu(IBinder iBinder) {
                this.NOt = iBinder;
            }

            @Override // com.bytedance.sdk.component.Ht.ZRu.Ht
            public Map ZRu(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws RemoteException {
                Map hashMap;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringArray(strArr2);
                    parcelObtain.writeString(str2);
                    if (this.NOt.transact(1, parcelObtain, parcelObtain2, 0) || ZRu.ZRu() == null) {
                        parcelObtain2.readException();
                        hashMap = parcelObtain2.readHashMap(getClass().getClassLoader());
                    } else {
                        hashMap = ZRu.ZRu().ZRu(uri, strArr, str, strArr2, str2);
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return hashMap;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.NOt;
            }

            @Override // com.bytedance.sdk.component.Ht.ZRu.Ht
            public String ZRu(Uri uri) throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.NOt.transact(2, parcelObtain, parcelObtain2, 0) && ZRu.ZRu() != null) {
                        string = ZRu.ZRu().ZRu(uri);
                    } else {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return string;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.sdk.component.Ht.ZRu.Ht
            public String ZRu(Uri uri, ContentValues contentValues) throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (contentValues != null) {
                        parcelObtain.writeInt(1);
                        contentValues.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.NOt.transact(3, parcelObtain, parcelObtain2, 0) && ZRu.ZRu() != null) {
                        string = ZRu.ZRu().ZRu(uri, contentValues);
                    } else {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return string;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.sdk.component.Ht.ZRu.Ht
            public int ZRu(Uri uri, String str, String[] strArr) throws RemoteException {
                int iZRu;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringArray(strArr);
                    if (!this.NOt.transact(4, parcelObtain, parcelObtain2, 0) && ZRu.ZRu() != null) {
                        iZRu = ZRu.ZRu().ZRu(uri, str, strArr);
                    } else {
                        parcelObtain2.readException();
                        iZRu = parcelObtain2.readInt();
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return iZRu;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.sdk.component.Ht.ZRu.Ht
            public int ZRu(Uri uri, ContentValues contentValues, String str, String[] strArr) throws RemoteException {
                int iZRu;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (contentValues != null) {
                        parcelObtain.writeInt(1);
                        contentValues.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringArray(strArr);
                    if (!this.NOt.transact(5, parcelObtain, parcelObtain2, 0) && ZRu.ZRu() != null) {
                        iZRu = ZRu.ZRu().ZRu(uri, contentValues, str, strArr);
                    } else {
                        parcelObtain2.readException();
                        iZRu = parcelObtain2.readInt();
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return iZRu;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }
    }
}
