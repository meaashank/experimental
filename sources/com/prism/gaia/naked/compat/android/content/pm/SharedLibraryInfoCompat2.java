package com.prism.gaia.naked.compat.android.content.pm;

import android.content.pm.SharedLibraryInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.naked.metadata.android.content.pm.SharedLibraryInfoCAG;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class SharedLibraryInfoCompat2 {

    public static class Util {
        @NonNull
        public static List<String> getAllCodePaths(@Nullable SharedLibraryInfo sharedLibraryInfo) {
            ArrayList arrayList = new ArrayList();
            if (sharedLibraryInfo != null) {
                String str = SharedLibraryInfoCAG.O26.mPath().get(sharedLibraryInfo);
                if (str != null) {
                    arrayList.add(str);
                    return arrayList;
                }
                List<String> list = SharedLibraryInfoCAG.O26.mCodePaths().get(sharedLibraryInfo);
                if (list != null) {
                    arrayList.addAll(list);
                    return arrayList;
                }
            }
            return arrayList;
        }

        public static String getKey(@Nullable SharedLibraryInfo sharedLibraryInfo) {
            if (!C3841e.s() || sharedLibraryInfo == null) {
                return null;
            }
            Long lValueOf = C3841e.v() ? Long.valueOf(sharedLibraryInfo.getLongVersion()) : null;
            if (lValueOf == null) {
                lValueOf = Long.valueOf(sharedLibraryInfo.getVersion());
            }
            return sharedLibraryInfo.getName() + "#" + sharedLibraryInfo.getType() + "#" + lValueOf + "#" + sharedLibraryInfo.getDeclaringPackage();
        }
    }
}
