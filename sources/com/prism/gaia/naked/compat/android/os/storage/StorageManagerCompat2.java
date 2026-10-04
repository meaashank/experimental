package com.prism.gaia.naked.compat.android.os.storage;

import android.os.IInterface;
import android.os.storage.StorageManager;
import com.prism.gaia.naked.metadata.android.os.storage.StorageManagerCAG;

/* JADX INFO: loaded from: classes6.dex */
public class StorageManagerCompat2 {

    public static class Util {
        public static void setMStorageManager(StorageManager storageManager, IInterface iInterface) {
            if (StorageManagerCAG.f165925C.mStorageManager() == null || storageManager == null) {
                return;
            }
            StorageManagerCAG.f165925C.mStorageManager().set(storageManager, iInterface);
        }

        public static void setSStorageManager(IInterface iInterface) {
            if (StorageManagerCAG.f165925C.sStorageManager() != null) {
                StorageManagerCAG.f165925C.sStorageManager().set(iInterface);
            }
        }
    }
}
