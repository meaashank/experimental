package com.prism.gaia.naked.compat.android.app;

import U6.j;
import W6.c;
import android.content.Intent;
import androidx.compose.runtime.changelist.a;
import com.prism.gaia.naked.metadata.android.app.ResultInfoCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ResultInfoCompat2 {

    public static class Util {
        public static Intent getMData(Object obj) {
            return ResultInfoCAG.f165378C.mData() == null ? new Intent() : ResultInfoCAG.f165378C.mData().get(obj);
        }

        public static int getMResultCode(Object obj) {
            if (ResultInfoCAG.f165378C.mResultCode() == null) {
                return -1;
            }
            return ResultInfoCAG.f165378C.mResultCode().get(obj);
        }

        public static boolean isInstance(Object obj) {
            return (obj == null || ResultInfoCAG.f165378C.ORG_CLASS() == null || !ResultInfoCAG.f165378C.ORG_CLASS().isInstance(obj)) ? false : true;
        }

        public static String toString(Object obj) {
            StringBuilder sbA = a.a("(_class:android.app.ResultInfo, ");
            if (ResultInfoCAG.f165378C.mResultWho() != null) {
                sbA.append("mResultWho:");
                sbA.append(ResultInfoCAG.f165378C.mResultWho().get(obj));
                sbA.append(j.f68738d);
            }
            if (ResultInfoCAG.f165378C.mRequestCode() != null) {
                sbA.append("mRequestCode:");
                sbA.append(ResultInfoCAG.f165378C.mRequestCode().get(obj));
                sbA.append(j.f68738d);
            }
            if (ResultInfoCAG.f165378C.mResultCode() != null) {
                sbA.append("mResultCode:");
                sbA.append(ResultInfoCAG.f165378C.mResultCode().get(obj));
                sbA.append(j.f68738d);
            }
            if (ResultInfoCAG.f165378C.mData() != null) {
                sbA.append("mData:");
                sbA.append(j.I(ResultInfoCAG.f165378C.mData().get(obj)));
                sbA.append(j.f68738d);
            }
            if (sbA.length() > 2 && sbA.substring(sbA.length() - 2).equals(j.f68738d)) {
                sbA.delete(sbA.length() - 2, sbA.length());
            }
            sbA.append(")");
            return sbA.toString();
        }
    }
}
